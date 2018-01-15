from data_utils import load_data, read_X, read_Y
from os import listdir
from process_defect4j import write_file
import numpy as np


def bug_report_text(data, project):
    bug_list = load_data('%s/bug_list/%s_bug_list.txt' % (data, project))
    corpus = list()
    bug_list = sorted(bug_list)
    for b in bug_list:
        if data == "data":
            corpus.append(' '.join(load_data('%s/bug_reports/stemmed_all/%s.txt' % (data, b))))
        elif data == "data_defect4j":
            corpus.append(' '.join(load_data('%s/bug_reports/%s/%s.txt' % (data, project, b))))
    return corpus


def method_text(data, project):
    dir = '%s/combined_method_text/%s' % (data, project)
    file_int = []
    for f in listdir(dir):
        file_int.append(int(f.replace('.txt', '')))
    file_int = sorted(file_int)

    corpus = []
    for m in file_int:
        corpus.append(' '.join(load_data('%s/combined_method_text/%s/%s.txt' % (data, project, m))))
    return corpus


def write_bug_method(directory, data):
    new_data = list()
    for i in xrange(len(data)):
        new_data.append(str(i) + "\t" + data[i])
    write_file(directory=directory, data=new_data)


def write_bug_feature(directory, data):
    nbugs, nmethods, nftrs = data.shape
    new_data = list()
    for i in xrange(nbugs):
        for j in xrange(nmethods):
            ftr = str(i)
            for k in xrange(nftrs):
                ftr = ftr + "\t" + str(data[i, j, k])
            new_data.append(ftr)
    write_file(directory=directory, data=new_data)


def write_truth_data(directory, data):
    nbugs, nmethods = data.shape
    new_data = list()
    for i in xrange(nbugs):
        for j in xrange(nmethods):
            line = str(i) + "\t" + str(data[i, j])
            new_data.append(line)
    write_file(directory=directory, data=new_data)


if __name__ == "__main__":
    data_, project_ = "data", "rhino"
    bugs = bug_report_text(data=data_, project=project_)
    methods = method_text(data=data_, project=project_)
    write_bug_method(directory="./data_example/bug_list.txt", data=bugs)
    write_bug_method(directory="./data_example/method_list.txt", data=methods)

    X = read_X(data=data_, project=project_)
    y = read_Y(data=data_, project=project_)
    write_bug_feature(directory="./data_example/features.txt", data=X)
    write_truth_data(directory="./data_example/groundtruth.txt", data=y)
