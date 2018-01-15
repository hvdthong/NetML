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

* Please run test_NetML.py to get used to NetML model. We see that the loss value descrease which means that our loss function converges. 

Input data
----------------

* All the bug reports for each project.
* All the methods for each project.
* Features for each pair of bug report-method, the features mention whether a relationship between the bug report and method. 
* Label data

* Please take a look at folder ./data_example to see the input of our framework: 

	* bug_list.txt: all the bug reports 
	* method_list.txt: all the methods 
	* features.txt: features for each pair of bug-method
	* groundtruth.txt: label data
	
Parameters:
----------------
We have five different parameters:

* nfolds: number of folds to do cross-validation
* iters: number of iterations for training NetML
* alpha and beta: control the strength of ridge and Network lasso regularization, respectively. 
* kNN: number of nearest of neighbors 

Running the model
----------------
Simply run this command to train the network: 

	$ python run_NetML.py ./data_example/bug_list.txt ./data_example/method_list.txt ./data_example/features.txt ./data_example/groundtruth.txt 10 30 0.1 0.01 10
	
Note that in this case, nfolds=10, iters=30, alpha=0.1, beta=0.01, and kNN=10

Example output: 
----------------

$ kNN 10 Alpha 0.1 Beta 0.01 Time 41.380628 MAP 0.

Train and test the model
----------------

Simply run this command to train the network, the data to train is in data/algorithm_trees.pkl, the pretrained_vectors is in data/pretrained_vectors:

    $ python train.py
    
After training, we can test the model easily by running:

    $ python test.py
    
Example output
--------------

![Propose model for the siamese tbcnn](../figure/propose_model.png)
