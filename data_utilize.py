from graph_construction import similarity_graph_v2
import numpy as np


def load_data(filename):
    with open(filename, "r") as f:
        return [line.strip() for line in f]


def graph_constructed(directory):
    data = load_data(directory)
    corpus = list()
    for d in data:
        corpus.append(d.split("\t")[1].strip())
    graph = similarity_graph_v2(corpus)
    return graph


def read_ftrs(directory, num_bugs, num_methods):
    data = load_data(directory)
    num_features = len(data[0].split("\t")) - 1
    X_array = np.zeros((num_bugs, num_methods, num_features))
    chunks = [data[i:i + num_methods] for i in xrange(0, len(data), num_methods)]
    for i in xrange(num_bugs):
        bug_i = chunks[i]
        for j in xrange(num_methods):
            split_ = bug_i[j].split("\t")[1:]
            for k in xrange(0, len(split_)):
                X_array[i, j, k] = float(split_[k])
    return X_array


def read_label(directory, num_bugs, num_methods):
    data = load_data(directory)
    y = np.zeros((num_bugs, num_methods))
    chunks = [data[i:i + num_methods] for i in xrange(0, len(data), num_methods)]
    for i in xrange(num_bugs):
        bug_i = chunks[i]
        for j in xrange(num_methods):
            split_ = bug_i[j].split("\t")[1:]
            y[i, j] = float(split_[0])
    return y