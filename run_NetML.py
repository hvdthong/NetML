import sys
from data_utilize import graph_constructed, read_ftrs, read_label
from sklearn.model_selection import KFold
from integrator import NLIntegrator
from time import time
import numpy as np
from evaluation import mean_avg_prec, hit_rate


def neighbour_mode(bug_list, method_list, features, label, n_folds, n_iters, alpha, beta, kNN):
    B = graph_constructed(directory=bug_list).toarray()  # bugs graph
    M = graph_constructed(directory=method_list).toarray()  # methods graph
    nbugs, nmethods = B.shape[0], M.shape[0]
    X = read_ftrs(directory=features, num_bugs=nbugs, num_methods=nmethods)
    y = read_label(directory=label, num_bugs=nbugs, num_methods=nmethods)
    print X.shape, y.shape

    print "Matrix X:", X.shape
    print "Matrix y:", y.shape
    print "Bug graph:", B.shape
    print "Method graph:", M.shape

    n = 1  # counting the number of n_folds for cross_validation
    kf = KFold(n_splits=n_folds, shuffle=True, random_state=0)
    MAP_, hit1_, hit5_, hit10_, trace_ = [], [], [], [], []
    test_index, output_results = list(), list()
    for train, test in kf.split(B):
        t0 = time()
        for value in test:  # for each bug in test data, considering kNN bug in train data
            # pick top K bug reports in training which have most similar to bug report in testing
            idx_bug = (-B[value]).argsort()[:(kNN + 1)]
            train_fold, test_fold = idx_bug[1:], idx_bug[:1]
            X_fold, y_fold, B_fold = X[idx_bug], y[idx_bug], B[:, idx_bug][idx_bug]

            # re-index the train and test data for each bug in test data
            train_fold, test_fold = [(i + 1) for i in xrange(len(train_fold))], [0]

            # note that train_fold and test_fold are now different with the train and fold in kf
            qidx = np.array([[a for b in range(len(M))] for a in range(len(test_fold))])
            m = NLIntegrator(verbose=True, niters=n_iters, alpha=alpha, beta=beta)
            U, V = m.fit_advanced(X_fold, y_fold, B_fold, M, test_folds=test_fold, qidx=qidx, top_k=len(M)).coef()

            y_pred = m.predict_proba(X_fold)
            y_test_pred, y_test_true = y_pred[test_fold], y_fold[test_fold]
            MAP_.append(mean_avg_prec(y_test_true, y_test_pred, qidx, top_k=len(M)))
            hit1_.append(hit_rate(y_test_true, y_test_pred, qidx, top_k=1))
            hit5_.append(hit_rate(y_test_true, y_test_pred, qidx, top_k=5))
            hit10_.append(hit_rate(y_test_true, y_test_pred, qidx, top_k=10))

            print "Bug_index %i kNN %i Alpha %.3f Beta %.3f Time %.6f MAP %.3f Hit1 %i Hit5 %i Hit10 %i" % \
                  (value, kNN, alpha, beta, time() - t0, MAP_[-1], hit1_[-1], hit5_[-1], hit10_[-1])

    print "kNN %i Alpha %.3f Beta %.3f Time %.6f MAP %.3f Hit1 %i Hit5 %i Hit10 %i" % \
          (kNN, alpha, beta, time() - t0, (sum(MAP_) / float(len(MAP_))), int(sum(hit1_)),
           int(sum(hit5_)), int(sum(hit10_)))


if __name__ == "__main__":
    if len(sys.argv) == 10:
        neighbour_mode(bug_list=sys.argv[1], method_list=sys.argv[2], features=sys.argv[3], label=sys.argv[4],
                       n_folds=int(sys.argv[5]), n_iters=int(sys.argv[6]), alpha=float(sys.argv[7]),
                       beta=float(sys.argv[8]), kNN=int(sys.argv[9]))
    else:
        print "Please typing correct inputs"
        exit()
