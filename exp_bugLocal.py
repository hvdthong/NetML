__author__ = 'vdthoang'
from data_utils import read_X, read_Y, graph_bug, graph_method
from sklearn.model_selection import KFold
from integrator import NLIntegrator
from time import time
import numpy as np
from evaluation import mean_avg_prec, hit_rate
import multiprocessing
from process_defect4j import write_file


# project: ant, aspectj, lucene, rhino
# project = "rhino"  # "aspectj" # "lucene" # "ant"  # "rhino"
results = []
# print "Running for project %s" % project


def ftr_selected(X, name):
    nbugs, nmethod, num = X.shape
    X = np.vstack([xij for xi in X for xij in xi])
    if name == "text":
        X = np.delete(X, 2, 1)
    elif name == "suspword":
        X = np.delete(X, 1, 1)
    elif name == "spectra":
        X = np.delete(X, 0, 1)
    return X.reshape(nbugs, nmethod, num - 1)


def neighbour_mode(data_, project_, n_folds_, n_iters_, alpha_, beta_, kNN_, ftr_):
    # Code for running Network Lasso
    X = read_X(data=data_, project=project_)
    y = read_Y(data=data_, project=project_)
    B = graph_bug(data=data_, project=project_).toarray()  # bugs graph
    M = graph_method(data=data_, project=project_).toarray()  # methods graph

    print "Matrix X:", X.shape
    print "Matrix y:", y.shape
    print "Bug graph:", B.shape
    print "Method graph:", M.shape

    n = 1  # counting the number of n_folds for cross_validation
    kf = KFold(n_splits=n_folds, shuffle=True, random_state=0)
    MAP_, hit1_, hit5_, hit10_, trace_ = [], [], [], [], []
    test_index, output_results = list(), list()
    for train, test in kf.split(B):
        if ftr_ is None:
            print "Running for project %s, we are doing %i of %i cross-validation with alpha=%.3f, beta=%.3f" % \
                  (project_, n, n_folds_, alpha_, beta_)
        else:
            print "Running for project %s, ftr=%s we are doing %i of %i cross-validation with alpha=%.3f, beta=%.3f" % \
                  (project_, ftr_, n, n_folds_, alpha_, beta_)
        t0 = time()
        for value in test:  # for each bug in test data, considering kNN bug in train data
            # print value, B[value]
            if kNN_ is None:
                # using all training data for kNN
                kNN_ = len(train)

            # pick top K bug reports in training which have most similar to bug report in testing
            idx_bug = (-B[value]).argsort()[:(kNN_ + 1)]
            train_fold, test_fold = idx_bug[1:], idx_bug[:1]
            X_fold, y_fold, B_fold = X[idx_bug], y[idx_bug], B[:, idx_bug][idx_bug]

            # re-index the train and test data for each bug in test data
            train_fold, test_fold = [(i + 1) for i in xrange(len(train_fold))], [0]

            # note that train_fold and test_fold are now different with the train and fold in kf
            qidx = np.array([[a for b in range(len(M))] for a in range(len(test_fold))])
            m = NLIntegrator(verbose=True, niters=n_iters_, alpha=alpha_, beta=beta_)

            # U, V = m.fit_transductive(X_fold, y_fold, B_fold, M, train_folds=train_fold, test_folds=test_fold, qidx=qidx,
            #                           top_k=len(M)).coef()

            U, V = m.fit_advanced(X_fold, y_fold, B_fold, M, test_folds=test_fold, qidx=qidx, top_k=len(M)).coef()

            y_pred = m.predict_proba(X_fold)
            y_test_pred, y_test_true = y_pred[test_fold], y_fold[test_fold]

            MAP_.append(mean_avg_prec(y_test_true, y_test_pred, qidx, top_k=len(M)))


            # save the trace of each iteration
            niters_trace = m.iters_trace
            output = "./results_%s/%s/bug_index-%i_iters-%i_alpha-%.3f_beta-%.3f_kNN-%s_ftr-%s.txt" % \
                     (data_, project_, value, n_iters_, alpha_, beta_, str(kNN_), str(ftr_))
            write_file(output, niters_trace)

            MAP_.append(mean_avg_prec(y_test_true, y_test_pred, qidx, top_k=len(M)))
            hit1_.append(hit_rate(y_test_true, y_test_pred, qidx, top_k=1))
            hit5_.append(hit_rate(y_test_true, y_test_pred, qidx, top_k=5))
            hit10_.append(hit_rate(y_test_true, y_test_pred, qidx, top_k=10))

            output_results.append("Project %s bug_index %i kNN %i Alpha %.3f Beta %.3f Time %.6f MAP %.3f Hit1 %i Hit5 %i Hit10 %i" % \
                                 (project_, value, kNN_, alpha_, beta_, time() - t0, MAP_[-1], hit1_[-1], hit5_[-1], hit10_[-1]))
            print "Project %s bug_index %i kNN %i Alpha %.3f Beta %.3f Time %.6f MAP %.3f Hit1 %i Hit5 %i Hit10 %i" % \
                  (project_, value, kNN_, alpha_, beta_, time() - t0, MAP_[-1], hit1_[-1], hit5_[-1], hit10_[-1])

        test_index += list(test)
        n += 1

    # output_folder = "./results_%s/%s_iters-%i_alpha-%.3f_beta-%.3f_kNN-%s_ftr-%s.txt" % \
    #                 (data_, project_, n_iters_, alpha_, beta_, str(kNN_), str(ftr_))
    # output_results.append("Project %s ftr %s kNN %i Alpha %.3f Beta %.3f Time %.6f MAP %.3f Hit1 %i Hit5 %i Hit10 %i" % \
    #                       (project_, str(ftr_), kNN_, alpha_, beta_, time() - t0, (sum(MAP_) / float(len(MAP_))), int(sum(hit1_)),
    #                        int(sum(hit5_)), int(sum(hit10_))))
    # write_file(output_folder, output_results)
    #
    # if ftr_ is None:
    #     print "Project %s kNN %i Alpha %.3f Beta %.3f Time %.6f MAP %.3f Hit1 %i Hit5 %i Hit10 %i" % \
    #           (project_, kNN_, alpha_, beta_, time() - t0, (sum(MAP_) / float(len(MAP_))), int(sum(hit1_)), int(sum(hit5_)),
    #            int(sum(hit10_)))
    # else:
    #     print "Project %s ftr %s kNN %i Alpha %.3f Beta %.3f Time %.6f MAP %.3f Hit1 %i Hit5 %i Hit10 %i" % \
    #           (project_, ftr_, kNN_, alpha_, beta_, time() - t0, (sum(MAP_) / float(len(MAP_))), int(sum(hit1_)),
    #            int(sum(hit5_)), int(sum(hit10_)))

    # for i in range(0, len(test_index)):
    #     print "Project %s bug_index %i MAP %.3f Hit1 %i Hit5 %i Hit10 %i" % \
    #           (project_, test_index[i], MAP_[i], hit1_[i], hit5_[i], hit10_[i])

    print "Project %s bug_index %s" % (project_, str(test_index).replace("[", "").replace("[", ""))
    print "Project %s MAP_ %s" % (project_, str(MAP_).replace("[", "").replace("[", ""))
    print "Project %s hit1_ %s" % (project_, str(hit1_).replace("[", "").replace("[", ""))
    print "Project %s hit5_ %s" % (project_, str(hit5_).replace("[", "").replace("[", ""))
    print "Project %s hit10_ %s" % (project_, str(hit10_).replace("[", "").replace("[", ""))


def transductive_mode(project_, n_folds_, n_iters_, alpha_, beta_):
    # Code for running Network Lasso
    # print "Running for project %s" % project
    X = read_X(project_)
    y = read_Y(project_)
    B = graph_bug(project_).toarray()  # bugs graph
    M = graph_method(project_).toarray()  # methods graph
    n = 1  # counting the number of n_folds for cross_validation
    kf = KFold(len(B), n_folds=n_folds_, shuffle=True, random_state=0)
    MAP_, hit1_, hit5_, hit10_, trace_ = [], [], [], [], []
    for train, test in kf:
        print "We are doing %i of %i cross-validation with alpha=%s and beta=%s" % (n, n_folds_, alpha_, beta_)
        m = NLIntegrator(verbose=False, niters=n_iters_, alpha=alpha_, beta=beta_)
        t0 = time()
        U, V = m.fit_transductive(X, y, B, M, train_folds=train, test_folds=test).coef()
        y_pred = m.predict_proba(X)
        y_test_pred, y_test_true = y_pred[test], y[test]
        qidx = np.array([[a for b in range(len(M))] for a in range(len(test))])

        # print len(train), len(test)
        # print y_test_pred.shape, y_test_true.shape, qidx.shape

        MAP_.append(mean_avg_prec(y_test_true, y_test_pred, qidx, top_k=len(M)))
        hit1_.append(hit_rate(y_test_true, y_test_pred, qidx, top_k=1))
        hit5_.append(hit_rate(y_test_true, y_test_pred, qidx, top_k=5))
        hit10_.append(hit_rate(y_test_true, y_test_pred, qidx, top_k=10))
        trace_.append(m.trace)
        n += 1

    print "Alpha %.3f Beta %.3f Time %.6f MAP %.3f Hit1 %i Hit5 %i Hit10 %i" % \
          (alpha_, beta_, time() - t0, (sum(MAP_) / float(len(MAP_))), sum(hit1_), sum(hit5_), sum(hit10_))
    results.append("Alpha %.3f Beta %.3f Time %.6f MAP %.3f Hit1 %i Hit5 %i Hit10 %i" %
                   (alpha_, beta_, time() - t0, (sum(MAP_) / float(len(MAP_))), sum(hit1_), sum(hit5_), sum(hit10_)))


def optimize_alpha_beta(alpha, beta, project, n_folds):
    # finding an optimum point (best results) for both alpha and beta
    X = read_X(project)
    y = read_Y(project)
    B = graph_bug(project).toarray()  # bugs graph
    M = graph_method(project).toarray()  # methods graph
    kf = KFold(len(B), n_folds=n_folds, shuffle=True, random_state=0)
    t0 = time()
    print X.shape
    for a in alpha:
        for b in beta:
            print "Running using Alpha=%.3f Beta=%.3f" % (a, b)
            MAPs, hit1s, hit5s, hit10s = [], [], [], []
            for train, test in kf:
                m = NLIntegrator(verbose=False, niters=30, alpha=a, beta=b)
                U, V = m.fit_transductive(X, y, B, M, train_folds=train, test_folds=test).coef()
                y_pred = m.predict_proba(X)
                y_test_pred, y_test_true = y_pred[test], y[test]
                qidx = np.array([[i for j in range(len(M))] for i in range(len(test))])
                MAP = mean_avg_prec(y_test_true, y_test_pred, qidx, top_k=len(M))
                hit1 = hit_rate(y_test_true, y_test_pred, qidx, top_k=1)
                hit5 = hit_rate(y_test_true, y_test_pred, qidx, top_k=5)
                hit10 = hit_rate(y_test_true, y_test_pred, qidx, top_k=10)
                MAPs.append(MAP), hit1s.append(hit1), hit5s.append(hit5), hit10s.append(hit10)
            print "Alpha=%.3f Beta=%.3f Time=%.6f => MAP=%.3f Hit1=%i Hit5=%i Hit10=%i" % \
                  (a, b, time() - t0, (sum(MAPs) / float(len(MAPs))), sum(hit1s), sum(hit5s), sum(hit10s))


if __name__ == "__main__":
    d, p, n_folds, n_iters, alpha, beta, kNN, ftr = "data", "rhino", 5, 50, 0.01, 0.001, 10, None
    neighbour_mode(d, p, n_folds, n_iters, alpha, beta, kNN, ftr)

    # d, p, n_folds, n_iters, alpha, beta, kNN, ftr = "data_defect4j", "Lang", 2, 1, 0.01, 0.001, 10, None
    # neighbour_mode(d, p, n_folds, n_iters, alpha, beta, kNN, ftr)
    # exit()

    # alpha = [0.001, 0.01, 0.1, 1, 10]
    # beta = [0.001, 0.01, 0.1, 1, 10]
    # # data, projects = "data_defect4j", ["Lang", "Math", "Time"]
    # data, projects = "data_defect4j", ["Math"]
    # kNN, n_folds, n_iters, ftr = 10, 10, 50, None
    # for p in projects:
    #     for a in alpha:
    #         for b in beta:
    #             print "Running with alpha=%.3f, beta=%.3f" % (a, b)
    #             multi_process = multiprocessing.Process(target=neighbour_mode, args=(data, p, n_folds, n_iters, a, b, kNN, ftr))
    #             multi_process.start()
    #     multi_process.join()

    # alpha = [0.001, 0.01, 0.1, 1, 10]
    # beta = [0.001, 0.01, 0.1, 1, 10]
    # data, projects = "data", ["ant", "aspectj", "lucene", "rhino"]
    # kNN, n_folds, n_iters, ftr = 10, 10, 50, None
    # for p in projects:
    #     for a in alpha:
    #         for b in beta:
    #             print "Running with alpha=%.3f, beta=%.3f" % (a, b)
    #             multi_process = multiprocessing.Process(target=neighbour_mode, args=(data, p, n_folds, n_iters, a, b, kNN, ftr))
    #             multi_process.start()
    #     multi_process.join()

    # alpha = [0.001]
    # beta = [0.1]
    # data, projects = "data_defect4j", ["Lang", "Math", "Time"]
    # kNN, n_folds, n_iters, ftr = 10, 10, 50, None
    # for p in projects:
    #     for a in alpha:
    #         for b in beta:
    #             print "Running with alpha=%.3f, beta=%.3f" % (a, b)
    #             multi_process = multiprocessing.Process(target=neighbour_mode, args=(data, p, n_folds, n_iters, a, b, kNN, ftr))
    #             multi_process.start()
    # multi_process.join()

    # alpha = [0.001, 0.01, 0.1, 1, 10]
    # beta = [0.001, 0.01, 0.1, 1, 10]
    # data, projects = "data_defect4j", ["Time"]
    # data, projects = "data_defect4j", ["Lang"]
    # data, projects = "data_defect4j", ["Math"]

    # kNN, n_folds, n_iters, ftr = 10, 10, 50, None
    # for p in projects:
    #     for a in alpha:
    #         for b in beta:
    #             print "Running with alpha=%.3f, beta=%.3f" % (a, b)
    #             multi_process = multiprocessing.Process(target=neighbour_mode, args=(data, p, n_folds, n_iters, a, b, kNN, ftr))
    #             multi_process.start()
    # multi_process.join()

    # alpha = [10]
    # beta = [1]
    # kNN = [5, 10, 15, 20, 25]
    # data, projects = "data_defect4j", ["Lang"]

    # alpha = [0.1]
    # beta = [0.001]
    # kNN = [5, 10, 15, 20, 25]
    # data, projects = "data_defect4j", ["Time"]

    # alpha = [10]
    # beta = [1]
    # kNN = [5, 10, 15, 20, 25]
    # data, projects = "data_defect4j", ["Math"]
    # n_folds, n_iters, ftr = 10, 50, None
    # for p in projects:
    #     for a in alpha:
    #         for b in beta:
    #             for k in kNN:
    #                 multi_process = multiprocessing.Process(target=neighbour_mode, args=(data, p, n_folds, n_iters, a, b, k, ftr))
    #                 multi_process.start()
    # multi_process.join()

    # alpha = [1]
    # beta = [0.001]
    # kNN = [10]
    # data, projects = "data_defect4j", ["Lang"]
    # n_folds, n_iters, ftr = 10, 50, ["text", "suspword", "spectra"]
    # for p in projects:
    #     for a in alpha:
    #         for b in beta:
    #             for k in kNN:
    #                 for f in ftr:
    #                     multi_process = multiprocessing.Process(target=neighbour_mode, args=(data, p, n_folds, n_iters, a, b, k, f))
    #                     multi_process.start()
    # multi_process.join()

    # alpha = [1]
    # beta = [0.1]
    # kNN = [10]
    # data, projects = "data_defect4j", ["Math"]
    # n_folds, n_iters, ftr = 10, 50, ["text", "suspword", "spectra"]
    # for p in projects:
    #     for a in alpha:
    #         for b in beta:
    #             for k in kNN:
    #                 for f in ftr:
    #                     multi_process = multiprocessing.Process(target=neighbour_mode, args=(data, p, n_folds, n_iters, a, b, k, f))
    #                     multi_process.start()
    # multi_process.join()

    # alpha = [1]
    # beta = [0.01]
    # kNN = [10]
    # data, projects = "data_defect4j", ["Time"]
    # n_folds, n_iters, ftr = 10, 50, ["text", "suspword", "spectra"]
    # for p in projects:
    #     for a in alpha:
    #         for b in beta:
    #             for k in kNN:
    #                 for f in ftr:
    #                     multi_process = multiprocessing.Process(target=neighbour_mode, args=(data, p, n_folds, n_iters, a, b, k, f))
    #                     multi_process.start()
    # multi_process.join()

    ################################################################################################################
    # alpha = [0.001, 0.01, 0.1, 1, 10]
    # beta = [0.001, 0.01, 0.1, 1, 10]
    # n_folds, n_iters = 10, 90
    # for a in alpha:
    #     for b in beta:
    #         print "Running with alpha=%.3f and beta=%.3f" % (a, b)
    #         transductive_mode(project, n_folds, n_iters, a, b)
    #         p = multiprocessing.Process(target=transductive_mode, args=(project, n_folds, n_iters, a, b, ))
    #         p.start()
    #     p.join()

    # file = open("./results/%s.txt" % (project_), 'w+')
    # for line in results:
    #     file.write(line + "\n")
    # file.close()

    # 'rhino': best experimental results for alpha = 0.01 and beta = 0.001
    # Code for running Network Lasso using transductive_mode
    # project = 'rhino'
    # alpha, beta = 0.01, 0.001
    # n_folds, n_iters = 10, 30  # following Duy's paper, we used 10-folds cross validation + 30 iteration
    # transductive_mode(project, n_folds, n_iters, alpha, beta)

    # project: ant, aspectj, lucene, rhino

    # projects, kNN = ["rhino", "lucene", "ant", "aspectj"], [5, 10, 15, 20, 25]
    # projects, kNN = ["rhino", "lucene", "ant", "aspectj"], [None]
    # projects, kNN = ["rhino", "lucene", "ant", "aspectj"], [10]
    # alpha, beta, n_folds, n_iters = [0.01], [0.001], 10, 30
    # jobs = []
    # for p in projects:
    #     print "Running for project %s" % p
    #     for k in kNN:
    #         for a in alpha:
    #             for b in beta:
    #                 neighbour_mode(p, n_folds, n_iters, a, b, k)
    #                 multi_process = multiprocessing.Process(target=neighbour_mode, args=(p, n_folds, n_iters, a, b, k, ))
    #                 multi_process.start()
    # multi_process.join()

    # projects, kNN = ["rhino", "lucene", "ant", "aspectj"], [10]
    # alpha, beta, n_folds, n_iters = [0.01], [0.001], 10, 30
    # ftr = ["text", "suspword", "spectra"]
    # jobs = []
    # for p in projects:
    #     print "Running for project %s" % p
    #     for k in kNN:
    #         for a in alpha:
    #             for b in beta:
    #                 for f in ftr:
    #                     neighbour_mode(p, n_folds, n_iters, a, b, k, f)
                        # multi_process = multiprocessing.Process(target=neighbour_mode,
                        #                                         args=(p, n_folds, n_iters, a, b, k, f, ))
                        # multi_process.start()

    # projects, kNN = ["rhino", "lucene", "ant", "aspectj"], [None]
    # alpha, beta, n_folds, n_iters = [0.01], [0.001], 10, 30
    # ftr = [None]
    # for p in projects:
    #     print "Running for project %s" % p
    #     for k in kNN:
    #         for a in alpha:
    #             for b in beta:
    #                 for f in ftr:
    #                     neighbour_mode(p, n_folds, n_iters, a, b, k, f)
    #                     # multi_process = multiprocessing.Process(target=neighbour_mode,
    #                     #                                         args=(p, n_folds, n_iters, a, b, k, f,))
    #                     # multi_process.start()

