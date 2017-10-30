
















org apach common math optim gener













gauss newton squar solver

solv squar problem solv normal equat
linear problem iter decomposit
decomposit solv normal equat decomposit
faster decomposit robust difficult problem


version revis date




gauss newton optim gaussnewtonoptim abstract squar optim abstractleastsquaresoptim


















inherit doc inheritdoc
overrid
vectori point pair vectorialpointvaluepair optim dooptim
function evalu except functionevaluationexcept optim except optimizationexcept illeg argument except illegalargumentexcept

iter converg reach
vectori point pair vectorialpointvaluepair current
converg converg

increment iter counter incrementiterationscount

evalu object function jacobian
vectori point pair vectorialpointvaluepair previou current
updat residu cost updateresidualsandcost
updat jacobian updatejacobian
current vectori point pair vectorialpointvaluepair point object

build linear problem
col
col col
row

grad jacobian
weight weight
residu object target

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
real matrix realmatrix dens real matrix denserealmatrix
decomposit solver decompositionsolv solver uselu
decomposit impl ludecompositionimpl solver getsolv
decomposit impl qrdecompositionimpl solver getsolv
solver solv

updat estim paramet
col
point


invalid matrix except invalidmatrixexcept
optim except optimizationexcept unabl solv singular problem


check converg
previou
converg checker converg iter getiter previou current




converg
current




