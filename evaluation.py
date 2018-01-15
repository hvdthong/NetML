import numpy as np

from argparse import ArgumentParser, RawDescriptionHelpFormatter, ArgumentDefaultsHelpFormatter
from textwrap import dedent
from sklearn.datasets import load_svmlight_file
from sklearn.preprocessing import LabelBinarizer
from sklearn.metrics import *
import math


def avg_prec(y_q, p_q, top_k=0):
    top_idx = (-np.array(p_q)).argsort()
    top_idx = top_idx[:top_k] if top_k > 0 else top_idx
    # avg_prec = average_precision_score(y_q[top_idx], p_q[top_idx])
    # if not np.isnan(avg_prec):
    #     MAP += average_precision_score(y_q[top_idx], p_q[top_idx])
    top_y = y_q[top_idx]
    numer, denom = 0.0, 0.0
    k = 0
    for y in top_y:
        k += 1
        if y == 1:
            numer += np.sum(top_y[:k]) / float(k)
            denom += 1.0
    return (numer / denom) if denom != 0 else 0.0


def mean_avg_prec(y_true, y_pred, query_ids, top_k=0):
    MAP = 0.0
    Q = np.unique(query_ids)
    for q in Q:
        idx = (query_ids == q)
        MAP += avg_prec(y_true[idx], y_pred[idx], top_k=top_k)
    return MAP / len(Q)


def hit_rate(y_true, y_pred, query_ids, top_k=0):
    hit = 0.0
    Q = np.unique(query_ids)
    for q in Q:
        idx = (query_ids == q)
        y_q, p_q = y_true[idx], y_pred[idx]
        top_idx = (-np.array(y_pred[idx])).argsort()
        top_idx = top_idx[:top_k] if top_k > 0 else top_idx
        hit += 1 if np.sum(y_q[top_idx]) > 0 else 0
    # return hit / len(Q)
    return hit


def mean_reciprocal_rank(y_true, y_pred, query_ids):
    MRR = 0.0
    Q = np.unique(query_ids)
    for q in Q:
        idx = (query_ids == q)
        y_q, p_q = y_true[idx].ravel(), y_pred[idx].ravel()
        sorted_idx = (-np.array(y_pred[idx])).argsort()
        rank = np.array([i + 1 for i, v in enumerate(y_q[sorted_idx]) if v == 1])
        MRR += 1.0 / rank[0]
    return MRR / len(Q)


def parse():
    class CustomFormatter(ArgumentDefaultsHelpFormatter, RawDescriptionHelpFormatter):
        pass
    parser = ArgumentParser(formatter_class=CustomFormatter,
                            description=dedent("""\
                                description:
                                   Evaluation metrics for a ranking model

                                author:
                                   Richard J. Oentaryo
                                   Living Analytics Research Centre
                                   Singapore Management University
                                   Email: roentaryo@smu.edu.sg

                                license:
                                   Creative Commons

                                software version:
                                   1.0
                            """),
                            epilog=dedent("""\
                                example of usage:
                                   python main.py prediction.dat test.dat
                            """))
    parser.add_argument("score", type=str, help="File(s) containing prediction scores (in CSV format)")
    parser.add_argument("data", type=str, help="File(s) containing testing data (in sparse LIBSVM format)")
    parser.add_argument("y_predput", type=str, help="File containing the evaluation metric results")
    return vars(parser.parse_args())


def evaluate(score_file, data_file):
    y_pred = np.genfromtxt(score_file, delimiter=',')
    _, y_true, query_ids = load_svmlight_file(data_file, query_ids=True)
    y_true = LabelBinarizer().fit_transform(y)
    hit5 = hit_rate(y_true, y_pred, query_ids, top_k=5)
    hit10 = hit_rate(y_true, y_pred, query_ids, top_k=10)
    MAP5 = mean_avg_prec(y_true, y_pred, query_ids, top_k=5)
    MAP10 = mean_avg_prec(y_true, y_pred, query_ids, top_k=10)
    MAP = mean_avg_prec(y_true, y_pred, query_ids)
    MRR = mean_reciprocal_rank(y_true, y_pred, query_ids)
    return hit5, hit10, MAP5, MAP10, MAP, MRR

if __name__ == "__main__":
    # params = parse()
    # with open(params["y_predput"], "w") as f:
    #     for score, data in zip(params["score"].split(" "), params["data"].split(" ")):
    #         hit5, hit10, MAP5, MAP10, MAP, MRR = evaluate(score, data)
    #         perf = ("Score=%s Data=%s Hit@5=%.4f Hit@10=%.4f MAP@5=%.4f MAP@10=%.4f MAP=%.4f MRR=%.4f" % \
    #                 (score, data, hit5, hit10, MAP5, MAP10, MAP, MRR))
    #         print perf
    #         f.write(perf + "\n")

    y_true = np.array([0, 0, 1, 0])
    y_pred = np.array([1, 1, 0, 0])
    query_ids = np.array([0, 0, 1, 1])
    print hit_rate(y_true, y_pred, query_ids, top_k=1)
