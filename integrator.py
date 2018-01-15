import numpy as np

from time import time
from random import randrange
from scipy.special import expit
from scipy.sparse import csr_matrix
from sklearn.preprocessing import LabelBinarizer, binarize
from sklearn.linear_model import LogisticRegression, SGDClassifier
from sklearn.metrics import accuracy_score
from data_utils import read_X, read_Y, graph_bug, graph_method
from evaluation import mean_avg_prec, hit_rate

# from fast_integrator import NetworkIntegrator

EPSILON = 1e-8


def logit(x):
    if np.isscalar(x) or len(x.shape) == 1:  # binary case: if scalar or column vector
        return expit(x)  # sigmoid function

    e_x = np.exp(x - np.max(x))  # multi-class case
    return e_x / np.sum(e_x)  # softmax function


class Integrator(object):
    def __init__(self, niters=100, alpha=0.01, verbose=False):
        self.niters = niters
        self.alpha = alpha
        self.verbose = verbose

    def coef(self):
        raise NotImplementedError()

    def fit(self, X, y):
        raise NotImplementedError()

    def predict_proba(self, X):
        raise NotImplementedError()

    def predict(self, X):
        raise NotImplementedError()

    def fit_predict(self, X):
        return self.fit(X, y).predict(X)

    def loss(self, y_pred, y_true, w=None):
        if w is None:
            w = np.ones(y_true.shape) / np.prod(y_true.shape)
        return -np.sum(w * (y_true * np.log(y_pred) + (1.0 - y_true) * np.log(1.0 - y_pred)))


class SGDIntegrator(Integrator):
    def __init__(self, niters=100, eta=0.01, alpha=0.01, verbose=False):
        super(SGDIntegrator, self).__init__(niters=niters, alpha=alpha, verbose=verbose)
        self.eta = eta
        self.w = None
        self.lb = LabelBinarizer()

    def coef(self):
        return self.w

    def fit(self, X, y):
        y_bin = self.lb.fit_transform(y)
        groups = [(X[y == c], y_bin[y == c]) for c in self.lb.classes_]
        ninstances, nfeatures = X.shape
        nclasses = len(self.lb.classes_)
        self.w = np.zeros(nfeatures) if nclasses <= 2 else np.zeros((nfeatures, nclasses))
        t0 = time()

        for e in xrange(1, self.niters + 1):
            for i in xrange(ninstances):
                X_c, y_c = groups[i % nclasses]  # balanced sampling
                idx = randrange(X_c.shape[0])
                x_i, y_i = X_c[idx], y_c[idx]
                delta = logit(x_i.dot(self.w)) - y_i  # SGD update
                if nclasses <= 2:
                    self.w -= self.eta * (x_i * delta + self.alpha * self.w)
                else:
                    self.w -= self.eta * (x_i.T.dot(delta) + self.alpha * self.w)

            if self.verbose:
                print "Epoch %d: Loss=%.6f, Time=%.6f" % (e, self.loss(X, y), time() - t0)

        return self

    def predict_proba(self, X):
        return logit(X.dot(self.w))

    def predict(self, X):
        return self.lb.inverse_transform(self.predict_proba(X), threshold=0.5)


class ScikitIntegrator(Integrator):
    def __init__(self, solver="lbfgs", eta=0.01, niters=100, alpha=0.01, verbose=False):
        super(ScikitIntegrator, self).__init__(niters=niters, alpha=alpha, verbose=verbose)
        self.model = None

        if solver == "sgd":
            self.model = SGDClassifier(loss='log', fit_intercept=False, n_iter=niters, learning_rate='constant',
                                       eta0=eta, class_weight="balanced", random_state=0, verbose=verbose)
        elif solver == "lbfgs":
            self.model = LogisticRegression(C=1.0 / self.alpha, class_weight="balanced", max_iter=niters,
                                            solver='lbfgs', fit_intercept=False, random_state=0, verbose=verbose)

    def coef(self):
        return self.model.coef_.T

    def fit(self, X, y):
        self.model = self.model.fit(X, y)
        return self

    def predict_proba(self, X):
        return self.model.predict_proba(X)

    def predict(self, X):
        return self.model.predict(X)

    def loss(self, y_pred, y_true, w=None):
        return super(ScikitIntegrator, self).loss(y_pred[:, 1], y_true, w=w)


class NLIntegrator(Integrator):
    def __init__(self, alpha=0.01, beta=0.01, niters=30, nonnegative=False, class_weight="balanced", verbose=False):
        super(NLIntegrator, self).__init__(niters=niters, alpha=alpha, verbose=verbose)
        self.beta = beta
        self.nonnegative = nonnegative
        self.class_weight = class_weight
        self.U = None
        self.V = None
        self.trace = []
        self.iters_trace = []

    def coef(self):
        return self.U, self.V

    def sample_weight(self, y):
        nbugs, nmethods = y.shape

        if self.class_weight == "balanced":
            npos = np.sum(y)
            wpos, wneg = (1.0 / npos), (1.0 / (nbugs * nmethods - npos))
            return np.array([[(wpos if y[b, m] != 0 else wneg) for m in xrange(nmethods)] for b in xrange(nbugs)])

        return np.ones((nbugs, nmethods)) / float(nbugs * nmethods)

    def fit(self, X, y, B, M):
        nbugs, nmethods, nfeatures = X.shape
        self.U = np.zeros((nbugs, nfeatures), dtype=np.float64)  # initialize parameters
        self.V = np.zeros((nmethods, nfeatures), dtype=np.float64)

        B_sum = B.sum(axis=1)  # Precompute constant terms
        M_sum = M.sum(axis=1)
        w = self.sample_weight(y)  # Compute sample weight given class distribution
        eta = 1.0
        t0 = time()

        for n in xrange(1, self.niters + 1):
            sigma = self.predict_proba(X)  # Step 1: compute all prediction
            grad = w * (sigma - y)
            hess = w * sigma * (1.0 - sigma)
            prev_loss = self.loss(sigma, y, w=w)

            for j in xrange(nfeatures):
                X_j, U_j, V_j = X[:, :, j], self.U[:, j], self.V[:, j]
                G = grad * X_j
                H = hess * X_j * X_j

                # Step 2a: Update U
                numer = np.sum(G, axis=1) + self.beta * (U_j * B_sum - B.dot(U_j)) + self.alpha * U_j
                denom = np.sum(H, axis=1) + self.beta * B_sum + self.alpha
                self.U[:, j] = U_j - eta * (numer / denom)

                # Step 2b: Update V
                numer = np.sum(G, axis=0) + self.beta * (V_j * M_sum - M.dot(V_j)) + self.alpha * V_j
                denom = np.sum(H, axis=0) + self.beta * M_sum + self.alpha
                self.V[:, j] = V_j - eta * (numer / denom)

            if self.nonnegative:
                self.U = self.U.clip(min=0.0)
                self.V = self.V.clip(min=0.0)

            curr_loss = self.loss(self.predict_proba(X), y, w=w)

            if abs(curr_loss - prev_loss) < EPSILON:
                break

            # Adaptive learning rate: Half (double) the rate if the loss increases (decreases)
            eta = (0.5 * eta) if curr_loss > prev_loss else min(1.0, 2 * eta)

            if self.verbose:
                print "- Iteration %d: Loss=%.6f Eta=%.4f Time=%.6f" % (n, curr_loss, eta, time() - t0)
        return self

    def fit_advanced(self, X, y, B, M, test_folds, qidx, top_k):
        nbugs, nmethods, nfeatures = X.shape

        self.U = np.zeros((nbugs, nfeatures), dtype=np.float64)  # initialize parameters
        self.V = np.zeros((nmethods, nfeatures), dtype=np.float64)

        # self.U = np.random.random((nbugs, nfeatures))
        # self.V = np.random.random((nmethods, nfeatures))

        B_sum = B.sum(axis=1)  # Precompute constant terms
        M_sum = M.sum(axis=1)

        w = self.sample_weight(y)  # Compute sample weight given class distribution

        eta = 1.0
        t0 = time()

        for n in xrange(1, self.niters + 1):
            sigma = self.predict_proba(X)  # Step 1: compute all prediction
            grad = w * (sigma - y)
            hess = w * sigma * (1.0 - sigma)
            prev_loss = self.loss(sigma, y, w=w)

            for j in xrange(nfeatures):
                X_j, U_j, V_j = X[:, :, j], self.U[:, j], self.V[:, j]
                G = grad * X_j
                H = hess * X_j * X_j

                # Step 2a: Update U
                numer = np.sum(G, axis=1) + self.beta * (U_j * B_sum - B.dot(U_j)) + self.alpha * U_j
                denom = np.sum(H, axis=1) + self.beta * B_sum + self.alpha
                self.U[:, j] = U_j - eta * (numer / denom)

                # Step 2b: Update V
                numer = np.sum(G, axis=0) + self.beta * (V_j * M_sum - M.dot(V_j)) + self.alpha * V_j
                denom = np.sum(H, axis=0) + self.beta * M_sum + self.alpha
                self.V[:, j] = V_j - eta * (numer / denom)

            if self.nonnegative:
                self.U = self.U.clip(min=0.0)
                self.V = self.V.clip(min=0.0)

            curr_loss = self.loss(self.predict_proba(X), y, w=w)
            self.trace.append(curr_loss)

            if abs(curr_loss - prev_loss) < EPSILON:
                break

            # Adaptive learning rate: Half (double) the rate if the loss increases (decreases)
            eta = (0.5 * eta) if curr_loss > prev_loss else min(1.0, 2 * eta)

            if self.verbose:
                y_pred = self.predict_proba(X)
                y_test_pred, y_test_true = y_pred[test_folds], y[test_folds]
                map_score = mean_avg_prec(y_test_true, y_test_pred, qidx, top_k)
                hit1 = hit_rate(y_test_true, y_test_pred, qidx, top_k=1)
                hit5 = hit_rate(y_test_true, y_test_pred, qidx, top_k=5)
                hit10 = hit_rate(y_test_true, y_test_pred, qidx, top_k=10)

                self.iters_trace.append(
                    "- Iteration %d: Loss=%.6f Eta=%.4f Time=%.6f MAP=%.3f Hit1=%i Hit5=%i Hit10=%i" %
                    (n, curr_loss, eta, time() - t0, map_score, hit1, hit5, hit10))
        return self

    def fit_transductive(self, X, y, B, M, train_folds, test_folds, qidx, top_k):
        nbugs, nmethods, nfeatures = X.shape

        self.U = np.zeros((nbugs, nfeatures), dtype=np.float64)  # initialize parameters
        self.V = np.zeros((nmethods, nfeatures), dtype=np.float64)

        # self.U = np.random.random((nbugs, nfeatures))
        # self.V = np.random.random((nmethods, nfeatures))

        B_sum = B.sum(axis=1)  # Precompute constant terms
        M_sum = M.sum(axis=1)

        w = self.sample_weight(y[train_folds])  # Compute sample weight given class distribution

        eta = 1.0
        t0 = time()

        for n in xrange(1, self.niters + 1):
            sigma = self.predict_proba(X[train_folds])  # Step 1: compute all prediction
            grad = w * (sigma - y[train_folds])
            hess = w * sigma * (1.0 - sigma)
            prev_loss = self.loss(sigma, y[train_folds], w=w)

            for j in xrange(nfeatures):
                X_j, U_j, V_j = X[:, :, j], self.U[:, j], self.V[:, j]
                G = grad * X_j[train_folds]
                H = hess * X_j[train_folds] * X_j[train_folds]

                G, H = list(np.sum(G, axis=1)), list(np.sum(H, axis=1))
                for idx in test_folds:
                    G.insert(idx, 0)
                    H.insert(idx, 0)
                G, H = np.array(G), np.array(H)

                # Step 2a: Update U
                numer = G + self.beta * (U_j * B_sum - B.dot(U_j)) + self.alpha * U_j
                denom = H + self.beta * B_sum + self.alpha
                self.U[:, j] = U_j - eta * (numer / denom)

                # Step 2b: Update V
                numer = np.sum(G, axis=0) + self.beta * (V_j * M_sum - M.dot(V_j)) + self.alpha * V_j
                denom = np.sum(H, axis=0) + self.beta * M_sum + self.alpha
                self.V[:, j] = V_j - eta * (numer / denom)

            if self.nonnegative:
                self.U = self.U.clip(min=0.0)
                self.V = self.V.clip(min=0.0)

            curr_loss = self.loss(self.predict_proba(X[train_folds]), y[train_folds], w=w)
            self.trace.append(curr_loss)

            if abs(curr_loss - prev_loss) < EPSILON:
                break

            # Adaptive learning rate: Half (double) the rate if the loss increases (decreases)
            eta = (0.5 * eta) if curr_loss > prev_loss else min(1.0, 2 * eta)

            if self.verbose:
                y_pred = self.predict_proba(X)
                y_test_pred, y_test_true = y_pred[test_folds], y[test_folds]
                map_score = mean_avg_prec(y_test_true, y_test_pred, qidx, top_k)
                hit1 = hit_rate(y_test_true, y_test_pred, qidx, top_k=1)
                hit5 = hit_rate(y_test_true, y_test_pred, qidx, top_k=5)
                hit10 = hit_rate(y_test_true, y_test_pred, qidx, top_k=10)
                # if len(stopping_perf) == 0:
                #     stopping_perf.append(map_score)
                # elif map_score >= stopping_perf[-1]:
                #     stopping_perf.append(map_score)
                # else:
                #     break
                print "- Iteration %d: Loss=%.6f Eta=%.4f Time=%.6f MAP=%.3f Hit1=%i Hit5=%i Hit10=%i" % \
                      (n, curr_loss, eta, time() - t0, map_score, hit1, hit5, hit10)
                self.iters_trace.append(
                    "- Iteration %d: Loss=%.6f Eta=%.4f Time=%.6f MAP=%.3f Hit1=%i Hit5=%i Hit10=%i" %
                    (n, curr_loss, eta, time() - t0, map_score, hit1, hit5, hit10))
        return self

    def predict_proba(self, X):
        nbugs, nmethods, nfeatures = X.shape

        for m in xrange(nmethods):
            for b in xrange(nbugs):
                b_ = self.U[b, :]
                m_ = self.V[m, :]
                value = (self.U[b, :] + self.V[m, :]).dot(X[b, m, :])

        f = [[(self.U[b, :] + self.V[m, :]).dot(X[b, m, :]) for m in xrange(nmethods)] for b in xrange(nbugs)]
        return expit(np.array(f))

    def predict(self, X):
        return binarize(self.predict_proba(X), threshold=0.5)


if __name__ == '__main__':
    # Example code for Integrator components
    # X = csr_matrix([[1, 2, 3, 4], [2, 3, 4, 5], [-4, -3, -2, -1], [1, 2, 3, 4], [2, 3, 4, 5]])
    # y = np.array(["richard", "thong", "duy", "richard", "thong"])
    # y_bin = LabelBinarizer().fit_transform(y)
    #
    # m = SGDIntegrator(niters=1000)
    # t0 = time()
    # print m.fit(X, y).coef()
    # print "SGDIntegrator: Loss=%.6f Time=%.6f  Accuracy=%.4f" % (m.loss(m.predict_proba(X), y_bin), time() - t0,
    #     accuracy_score(m.predict(X), y))
    #
    # m = ScikitIntegrator(solver="sgd", niters=1000)
    # t0 = time()
    # print m.fit(X, y).coef()
    # print "ScikitSGDIntegrator: Loss=%.6f Time=%.6f  Accuracy=%.4f" % (m.loss(m.predict_proba(X), y_bin), time() - t0,
    #     accuracy_score(m.predict(X), y))
    #
    # m = ScikitIntegrator(solver="lbfgs", niters=1000)
    # t0 = time()
    # print m.fit(X, y).coef()
    # print "ScikitLBFGSIntegrator: Loss=%.6f Time=%.6f  Accuracy=%.4f" % (m.loss(m.predict_proba(X), y_bin), time() - t0,
    #     accuracy_score(m.predict(X), y))

    # m = NetworkIntegrator(niters=1000, verbose=False)
    # t0 = time()
    # U, V = m.fit(X, y, B, M)
    # w = m.sample_weight(y)
    # print U, V
    # print "NetworkIntegrator: Loss=%.6f Time=%.6f  Accuracy=%.4f" % (m.loss(m.predict_proba(X, U, V), y, w=w), time() - t0,
    #     accuracy_score(m.predict(X, U, V).ravel(), y.ravel()))

    X = np.array([[[1.0, 1.0], [1.0, 0.0]], [[0.0, 0.0], [0.0, 1.0]], [[0.0, 1.0], [0.0, 1.0]]])
    y = np.array([[1.0, 1.0], [0.0, 0.0], [0.0, 1.0]])
    B = np.array([[0.0, 0.5, 1.0], [0.5, 0.0, 0.8], [1.0, 0.8, 0.0]])
    M = np.array([[0.0, 0.7], [0.7, 0.0]])
    print B.shape, M.shape, X.shape, y.shape

    m = NLIntegrator(verbose=True)
    t0 = time()
    U, V = m.fit(X, y, B, M).coef()
    w = m.sample_weight(y)
    print U.shape, V.shape
    print "NLIntegrator: Loss=%.6f Time=%.6f  Accuracy=%.4f" % \
          (m.loss(m.predict_proba(X), y, w=w), time() - t0, accuracy_score(m.predict(X).ravel(), y.ravel()))

    # # Code for running Network Lasso
    # project = "rhino"  # "aspectj"  # "ant"  # "rhino"
    # X = read_X(project)
    # y = read_Y(project)
    # B = graph_bug(project).toarray()
    # M = graph_method(project).toarray()
    # print X.shape, y.shape, B.shape, M.shape
    #
    # k = [m for b in y for m in b if int(m) == 1]
    # print k
    # print len(k)
    #
    # m = NLIntegrator(verbose=True, niters=5, alpha=0)
    # t0 = time()
    # U, V = m.fit(X, y, B, M).coef()
    # w = m.sample_weight(y)
    # # print U, V
    # print "NLIntegrator: Loss=%.6f Time=%.6f  Accuracy=%.4f" % \
    #       (m.loss(m.predict_proba(X), y, w=w), time() - t0, accuracy_score(m.predict(X).ravel(), y.ravel()))
    # print csr_matrix(y).nnz, csr_matrix(m.predict(X)).nnz

    # m = NetworkIntegrator(verbose=True, niters=5, alpha=0)
    # t0 = time()
    # U, V = m.fit(X, y, B, M)
    # w = m.sample_weight(y)
    # print U.shape, V.shape
    # print "NetworkIntegrator: Loss=%.6f Time=%.6f  Accuracy=%.4f" % \
    #       (m.loss(m.predict_proba(X, U, V), y, w=w), time() - t0, accuracy_score(m.predict(X, U, V).ravel(), y.ravel()))
    # print csr_matrix(y).nnz, csr_matrix(m.predict(X, U, V)).nnz


    # X_new = np.vstack([xij for xi in X for xij in xi])
    # y_new = np.vstack([yij for yi in y for yij in yi]).ravel()
    # print X_new.shape, y_new.shape
    # #
    # m = ScikitIntegrator(niters=30)
    # t0 = time()
    # print m.fit(X_new, y_new).coef()
    # print "SGDIntegrator: Loss=%.6f Time=%.6f  Accuracy=%.4f" % (m.loss(m.predict_proba(X_new), y_new), time() - t0,
    #     accuracy_score(m.predict(X_new), y_new))
    #
    # print csr_matrix(y_new).nnz, csr_matrix(m.predict(X_new)).nnz
