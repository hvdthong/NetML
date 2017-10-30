
















org apach common math optim gener















gauss newton squar solver

solv squar problem solv normal equat
linear problem iter decomposit
decomposit solv normal equat decomposit
faster decomposit robust difficult problem


version




gauss newton optim gaussnewtonoptim abstract squar optim abstractleastsquaresoptim
















































inherit doc inheritdoc
overrid
point vector pair pointvectorvaluepair optim dooptim

converg checker convergencecheck point vector pair pointvectorvaluepair checker
converg checker getconvergencecheck

iter converg reach
point vector pair pointvectorvaluepair current
iter
converg converg
iter

evalu object function jacobian
point vector pair pointvectorvaluepair previou current
updat residu cost updateresidualsandcost
updat jacobian updatejacobian
current point vector pair pointvectorvaluepair point object

target valu targetvalu target ref gettargetref
residu weight residualsweight weight ref getweightref

build linear problem
col
col col
row

grad weight residu jacobian weightedresidualjacobian
weight residu weight residualsweight
residu object target valu targetvalu

comput normal equat
weight residu
col
grad


build contribut matrix measur
col

wgk weight grad
col
wgk grad





solv linear squar problem
real matrix realmatrix block real matrix blockrealmatrix
decomposit solver decompositionsolv solver uselu
decomposit ludecomposit solver getsolv
decomposit qrdecomposit solver getsolv
solver solv arrai real vector arrayrealvector arrai toarrai
updat estim paramet
col
point

singular matrix except singularmatrixexcept
converg except convergenceexcept local format localizedformat unabl solv singular problem


check converg
checker
previou
converg checker converg iter previou current



converg
current


