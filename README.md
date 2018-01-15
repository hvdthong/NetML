# Network-clustered Multi-modal Bug Localization.
Building the NetML algorithm, the figure belows illustrate our proposed model:

![Propose model for the siamese tbcnn](../figure/propose_model.png)

First time setup
----------------
Please install the neccessary libraries before running our NetML model:
   
- python 2.7

- numpy 1.13.1

- scikit-learn 0.19.0


Dataset details
----------------

* The dataset is put in two folders ./data and ./data_defect4j. The folder ./data includes four projects, namely Ant, Aspectj, Lucene, and Rhino, whereas the folder ./data_defect4j includes three projects, namely Lang, Math, and Time.


Example running 
----------------

* Please run test_NetML.py to get used to NetML model. 

Input data
----------------

* All the bug reports for each project.
* All the methods for each project.
* Features for each pair of bug report-method, the features mention whether a relationship between the bug report and method. 
* Label data

Running the model
----------------


Train and test the model
----------------

Simply run this command to train the network, the data to train is in data/algorithm_trees.pkl, the pretrained_vectors is in data/pretrained_vectors:

    $ python train.py
    
After training, we can test the model easily by running:

    $ python test.py
    
Example output
--------------

The classification task was to classify 6 different kinds of data structures
and argorithms. The original dataset is divided 7/3 for training/testing

### After training

    ('Accuracy:', 0.9924924924924925)
                precision    recall  f1-score   support

      mergesort       1.00      1.00      1.00       413
     linkedlist       1.00      1.00      1.00       368
      quicksort       1.00      1.00      1.00       401
            bfs       0.95      1.00      0.98       313
     bubblesort       1.00      1.00      1.00       185
       knapsack       1.00      0.95      0.98       318

    avg / total       0.99      0.99      0.99      1998

    [[413   0   0   0   0   0]
     [  0 368   0   0   0   0]
     [  0   0 401   0   0   0]
     [  0   0   0 313   0   0]
     [  0   0   0   0 185   0]
     [  0   0   0  15   0 303]]


### After testing

    ('Accuracy:', 0.99300699300699302)
                precision    recall  f1-score   support

      mergesort       1.00      1.00      1.00       154
     linkedlist       1.00      1.00      1.00       157
      quicksort       1.00      1.00      1.00       166
            bfs       0.96      1.00      0.98       128
     bubblesort       1.00      1.00      1.00       109
       knapsack       1.00      0.96      0.98       144

    avg / total       0.99      0.99      0.99       858

    [[154   0   0   0   0   0]
     [  0 157   0   0   0   0]
     [  0   0 166   0   0   0]
     [  0   0   0 128   0   0]
     [  0   0   0   0 109   0]
     [  0   0   0   6   0 138]]
	

