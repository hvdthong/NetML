__author__ = 'vdthoang'
import numpy as np
from scipy.special import expit
from time import time


# def logit(x):
#     if np.isscalar(x):
#         return expit(x)              # sigmoid function
#     e_x = np.exp(x - np.max(x))
#     return e_x / np.sum(e_x)  # softmax function


class IntegratorNetwork():
    def __init__(self, alpha=1.0, beta=0.0, stdev=0.01, niters=50, verbose=False):
        self.alpha = alpha
        self.beta = beta
        self.stdev = stdev
        self.niters = niters
        self.U = None  # weight of bug reports
        self.V = None  # weight of methods
        self.verbose = verbose

    def loss(self, X, y):
        p = self.predict(X)
        return -np.sum(y * np.log(p) + (1.0 - y) * np.log(1.0 - p)) / np.prod(y.shape)

    def predict(self, X):
        nbugs, nmethods, nfeatures = X.shape  # size of bug reports, methods, and features
        f = np.zeros((nbugs, nmethods))
        for b in xrange(nbugs):
            for m in xrange(nmethods):
                # print self.U[b, :], self.V[m, :]
                f[b, m] = (self.U[b, :] + self.V[m, :]).dot(X[b, m, :])
        return expit(f)

    def fit(self, X, y, B, M):
        nbugs, nmethods, nfeatures = X.shape  # size of bug reports, methods, and features
        self.U = np.zeros((nbugs, nfeatures))  # construct bug parameters
        self.V = np.zeros((nmethods, nfeatures))  # construct method parameters
        z_bug = np.sum(B, axis=1)  # precompute constant term of bug reports
        z_method = np.sum(M, axis=1)  # precompute constant term of methods
        t0 = time()

        for n in xrange(1, self.niters + 1):
            # Step 1: Compute all prediction
            sigma = self.predict(X)
            # Step 2: Update all U & V
            for j in xrange(nfeatures):
                # Step 2a: Update U
                p = B.dot(self.U[:, j])
                for b in xrange(nbugs):
                    sigma_b, X_bj, U_bj = sigma[b, :], X[b, :, j], self.U[b, j]
                    numer = (sigma_b - y[b, :]).dot(X_bj) + self.beta * (U_bj * z_bug[b] - p[b]) + self.alpha * U_bj
                    denom = ((sigma_b * (1.0 - sigma_b)).dot(X_bj * X_bj)) + self.beta * z_bug[b] + self.alpha
                    self.U[b, j] = U_bj - (numer / denom)
                # Step 2b: Update V
                p = M.dot(self.V[:, j])
                for m in xrange(nmethods):
                    sigma_m, X_mj, V_mj = sigma[:, m], X[:, m, j], self.V[m, j]
                    numer = (sigma_m - y[:, m]).dot(X_mj) + self.beta * (V_mj * z_method[m] - p[m]) + self.alpha * V_mj
                    denom = ((sigma_m * (1.0 - sigma_m)).dot(X_mj * X_mj)) + self.beta * z_method[m] + self.alpha
                    self.V[m, j] = V_mj - (numer / denom)

            if self.verbose and n % 2 == 0:
                print "- Iteration %d with loss %.6f takes %.6f seconds" % (n, self.loss(X, y), time() - t0)
        return self


if __name__ == '__main__':
    X = np.array([[[1, 1], [1, 0]], [[0, 0], [0, 1]], [[0, 1], [0, 1]]])
    y = np.array([[1, 0], [0, 1], [0, 1]])
    B = np.array([[0.0, 0.5, 1.0], [0.5, 0.0, 0.8], [1.0, 0.8, 0.0]])
    M = np.array([[0.0, 0.7], [0.7, 0.0]])
    model = IntegratorNetwork(verbose=True)
    t0 = time()
    model.fit(X, y, B, M)
    print "Training model for %d bugs and %d methods takes %.6f seconds" % (X.shape[0], X.shape[1], time() - t0)
    print "U matrix:", model.U
    print "V matrix:", model.V
    print "Prediction:", model.predict(X)
