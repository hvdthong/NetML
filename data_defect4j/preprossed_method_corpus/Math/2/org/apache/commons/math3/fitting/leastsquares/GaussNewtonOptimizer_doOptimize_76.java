















org apach common math3 fit leastsquar

















gauss newton squar solver


solv squar problem solv normal equat
linear problem iter decomposit
decomposit solv normal equat decomposit
faster decomposit robust difficult problem


version


gauss newton optim gaussnewtonoptim abstract squar optim abstractleastsquaresoptim gauss newton optim gaussnewtonoptim


























inherit doc inheritdoc
overrid
point vector pair pointvectorvaluepair optim dooptim
converg checker convergencecheck point vector pair pointvectorvaluepair checker
converg checker getconvergencecheck

comput useless checker loop
checker
null argument except nullargumentexcept


target valu targetvalu target gettarget
target valu targetvalu length number observ data

real matrix realmatrix weight matrix weightmatrix weight getweight
weight matrix weightmatrix row dimens getrowdimens
dimens mismatch except dimensionmismatchexcept weight matrix weightmatrix row dimens getrowdimens

weight matrix weightmatrix column dimens getcolumndimens
dimens mismatch except dimensionmismatchexcept weight matrix weightmatrix column dimens getcolumndimens


diagon weight matrix
residu weight residualsweight

residu weight residualsweight weight matrix weightmatrix entri getentri


current point currentpoint start getstart
current point currentpoint length

iter converg reach
point vector pair pointvectorvaluepair current
converg converg
increment iter count incrementiterationcount

evalu object function jacobian
point vector pair pointvectorvaluepair previou current
object function current point currentpoint
current object currentobject comput object computeobjectivevalu current point currentpoint
current residu currentresidu comput residu computeresidu current object currentobject
real matrix realmatrix weight jacobian weightedjacobian comput weight jacobian computeweightedjacobian current point currentpoint
current point vector pair pointvectorvaluepair current point currentpoint current object currentobject

build linear problem




grad weight jacobian weightedjacobian row getrow
weight residu weight residualsweight
residu current residu currentresidu

comput normal equat
weight residu

grad


build contribut matrix measur


wgk weight grad

wgk grad




check converg
previou
converg checker converg iter getiter previou current
converg
current




solv linear squar problem
real matrix realmatrix block real matrix blockrealmatrix
decomposit solver decompositionsolv solver uselu
decomposit ludecomposit solver getsolv
decomposit qrdecomposit solver getsolv
solver solv arrai real vector arrayrealvector arrai toarrai
updat estim paramet

current point currentpoint

singular matrix except singularmatrixexcept
converg except convergenceexcept local format localizedformat unabl solv singular problem


happen
math intern error mathinternalerror


