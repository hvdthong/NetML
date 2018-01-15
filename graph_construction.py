from string import punctuation
from sklearn.feature_extraction.text import TfidfVectorizer
from nltk import word_tokenize
from nltk.stem.porter import PorterStemmer
from argparse import ArgumentParser, RawDescriptionHelpFormatter, ArgumentDefaultsHelpFormatter
from textwrap import dedent
from scipy.io import mmwrite
from time import time
from os import listdir
from os.path import isfile, join


def tokenize(corpus, stemmer=PorterStemmer()):
    tokens = word_tokenize(corpus)
    tokens = [t for t in tokens if t not in punctuation]  # remove punctuation
    return [stemmer.stem(t) for t in tokens]              # return stemmed words


def similarity_graph(corpus, stop_words='english', tokenizer=None):
    vec = TfidfVectorizer(tokenizer=tokenizer, use_idf=False, norm='l2', stop_words=stop_words)
    X = vec.fit_transform(corpus)  # compute normalized bag of words
    return X.dot(X.transpose())    # return cosine similarity (i.e. X * X^T)


def similarity_graph_v2(corpus):
    vec = TfidfVectorizer(decode_error="ignore")
    X = vec.fit_transform(corpus)  # compute normalized bag of words
    return X.dot(X.transpose())    # return cosine similarity (i.e. X * X^T)


def read_doc(filename):
    with open(filename, 'r') as f:
        return " ".join(" ".join([line for line in f]).split())


def parse():
    class CustomFormatter(ArgumentDefaultsHelpFormatter, RawDescriptionHelpFormatter):
        pass
    parser = ArgumentParser(formatter_class=CustomFormatter,
                            description=dedent('''\
                                description:
                                   Compute similarity graph from a text corpus

                                authors:
                                   Richard J. Oentaryo
                                   Living Analytics Research Centre
                                   Singapore Management University
                                   Email: roentaryo@smu.edu.sg

                                license:
                                   Creative Commons

                                software version:
                                   1.0
                            '''),
                            epilog=dedent('''\
                                example of usage:
                                   python run.py corpus.csv -o corpus_similarity
                            '''))
    parser.add_argument('folder', help='File containing the text corpus')
    parser.add_argument('-o', '--out_file', type=str, default='', help='Output file where the similarity graph is stored')
    parser.add_argument('-e', '--extension', type=str, default='txt', help='File extension to be considered')
    parser.add_argument('-s', '--stop_words', type=str, default='english', choices=['english', None], help='Stop words list')
    parser.add_argument('-v', '--verbose', action='store_true', default=False, help='Whether to print in details or not')
    return vars(parser.parse_args())


if __name__ == '__main__':
    t0 = time()
    params = parse()
    folder, out_file, ext = params["folder"], params["out_file"], params["extension"]
    corpus = [read_doc(folder + "/" + f) for f in listdir(folder) if f.endswith(ext)]
    graph = similarity_graph(corpus, stop_words=params["stop_words"])
    mmwrite(out_file, graph)
    print "Computing similarity graph for %s takes %.4f seconds" % (folder, time() - t0)
