import os

from collections import OrderedDict
import numpy as np
from graph_construction import similarity_graph_v2
from os import listdir


def load_data(filename):
    with open(filename, "r") as f:
        return [line.strip() for line in f]


def read_X(data, project):
    bug_list = load_data('%s/bug_list/%s_bug_list.txt' % (data, project))

    X = {}
    bug_dict = {}
    method_dict = {}
    feature_dict = {}

    for bug in bug_list:
        for fname in os.listdir("%s/features" % data):
            fpath = '%s/features/%s/%s/%s.txt' % (data, fname, project, bug)
            feature_lines = [l.split('\t') for l in load_data(fpath)]
            features = {f: float(s) for f, s in feature_lines}

            for method, score in features.iteritems():
                if bug not in X:
                    X[bug] = {}
                if method not in X[bug]:
                    X[bug][method] = {}
                X[bug][method][fname] = score
                bug_dict[bug] = -1
                method_dict[method] = -1
                feature_dict[fname] = -1

    bug_dict = OrderedDict(zip(sorted(bug_dict.keys()), range(len(bug_dict))))
    method_dict = OrderedDict(zip(sorted(method_dict.keys()), range(len(method_dict))))
    feature_dict = OrderedDict(zip(sorted(feature_dict.keys()), range(len(feature_dict))))
    X_array = np.zeros((len(bug_dict), len(method_dict), len(feature_dict)))
    for bid, b in X.iteritems():
        for mid, m in b.iteritems():
            for fid, f in m.iteritems():
                X_array[bug_dict[bid], method_dict[mid], feature_dict[fid]] = f
    return X_array


def read_X_advance(project):
    bug_list = load_data('data/bug_list/%s_bug_list.txt' % project)

    X = {}
    bug_dict = {}
    method_dict = {}
    feature_dict = {}

    for bug in bug_list:
        for fname in os.listdir("data/features"):
            print fname
            # fpath = 'data/features/' + fname + '/' + project + '/' + bug + '.txt'
            # feature_lines = [l.split('\t') for l in load_data(fpath)]
            # features = {f: float(s) for f, s in feature_lines}
            #
            # for method, score in features.iteritems():
            #     if bug not in X:
            #         X[bug] = {}
            #     if method not in X[bug]:
            #         X[bug][method] = {}
            #     X[bug][method][fname] = score
            #     bug_dict[bug] = -1
            #     method_dict[method] = -1
            #     feature_dict[fname] = -1
        quit()
    bug_dict = OrderedDict(zip(sorted(bug_dict.keys()), range(len(bug_dict))))
    method_dict = OrderedDict(zip(sorted(method_dict.keys()), range(len(method_dict))))
    feature_dict = OrderedDict(zip(sorted(feature_dict.keys()), range(len(feature_dict))))
    X_array = np.zeros((len(bug_dict), len(method_dict), len(feature_dict)))
    for bid, b in X.iteritems():
        print bid
        for mid, m in b.iteritems():
            print mid
            for fid, f in m.iteritems():
                print fid
                X_array[bug_dict[bid], method_dict[mid], feature_dict[fid]] = f
    return X_array


def read_Y(data, project):
    bug_list = load_data('%s/bug_list/%s_bug_list.txt' % (data, project))
    all_method_list = list()
    for bug in bug_list:
        method_list = load_data('%s/method_list/%s/%s.txt' % (data, project, bug))
        all_method_list += method_list
    all_method_list = set(all_method_list)

    faulty_mapping = {}
    for bug in bug_list:
        faults = set(load_data('%s/ground_truth/%s/%s.txt' % (data, project, bug)))
        faulty_mapping[bug] = faults

    bug_list = sorted(bug_list)
    all_method_list = sorted(all_method_list)

    bug_index = {bug_list[i]: i for i in xrange(len(bug_list))}
    method_index = {all_method_list[i]: i for i in xrange(len(all_method_list))}

    Y_array = np.zeros((len(bug_list), len(all_method_list)))
    for bug in bug_list:
        for method in all_method_list:
            Y_array[bug_index[bug]][method_index[method]] = 1 if method in faulty_mapping[bug] else 0
    return Y_array


def graph_bug(data, project):
    bug_list = load_data('%s/bug_list/%s_bug_list.txt' % (data, project))
    corpus = list()
    bug_list = sorted(bug_list)
    for b in bug_list:
        if data == "data":
            corpus.append(' '.join(load_data('%s/bug_reports/stemmed_all/%s.txt' % (data, b))))
        elif data == "data_defect4j":
            corpus.append(' '.join(load_data('%s/bug_reports/%s/%s.txt' % (data, project, b))))
    bgraph = similarity_graph_v2(corpus)
    return bgraph
    

def graph_method(data, project):
    dir = '%s/combined_method_text/%s' % (data, project)
    file_int = []
    for f in listdir(dir):
        file_int.append(int(f.replace('.txt', '')))
    file_int = sorted(file_int)

    corpus = []
    for m in file_int:
        corpus.append(' '.join(load_data('%s/combined_method_text/%s/%s.txt' % (data, project, m))))
    mgraph = similarity_graph_v2(corpus)
    return mgraph


if __name__ == '__main__':
    ## using for new data in defect4j
    # projet: Lang, Math, Time
    data_, project_ = "data_defect4j", "Time"
    print read_X(data=data_, project=project_).shape
    print read_Y(data=data_, project=project_).shape
    # graph_b = graph_bug(data=data_, project=project_)
    print graph_bug(data=data_, project=project_).shape
    print graph_method(data=data_, project=project_).shape

    ############################################################
    ## using for old data
    # # project: ant, aspectj, lucene, rhino
    # d, p = "data", "rhino"
    # print read_X(d, p).shape
    # print read_Y(d, p).shape
    # print graph_bug(d, p).shape
    # print graph_method(d, p).shape

    # X_new = np.vstack([xij for xi in X for xij in xi])
    # print X.shape, X_new.shape
    # print read_Y(p).shape
    # graph_method(p)
    # exit()
    # graph_method(p)
    # exit()

    # X_new_advance = X_new.reshape(26, 5935, 3)
    # print X[0, 0], X_new_advance[0,0]

    # X_new = np.delete(X_new, 2, 1)
    # print X_new.shape, X_new.reshape(26, 5935, 2).shape
    # print X[0,1], X_new[1, :]
    # Y = read_Y(p)
    # print Y.shape
    #
    # print graph_bug(p).shape
    # print graph_method(p).shape

    # X = read_X_advance(p)






