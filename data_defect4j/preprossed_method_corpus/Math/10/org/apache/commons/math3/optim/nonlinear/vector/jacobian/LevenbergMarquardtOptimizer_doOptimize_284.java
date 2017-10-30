















org apach common math3 optim nonlinear vector jacobian













solv squar problem levenberg marquardt
algorithm

constraint support call
link optim optim data optimizationdata optim
link math unsupport oper except mathunsupportedoperationexcept bound pass

implement work determin system
system point equat determin system
solv ignor point smallest impact
jacobian column norm rank matrix loop bound
chang implement

resolut engin simpl translat minpack
href http www netlib org minpack lmder lmder routin minor
includ determin resolut
inherit converg checker decomposit
rewritten algorithm
lascaux theodor book analys num eacut riqu matriciel
appliqu eacut agrav l'art l'ing eacut nieur masson
author origin fortran version

argonn nation laboratori minpack project march
burton garbow
kenneth hillstrom
jorg

redistribut polici minpack
href http www netlib org minpack disclaim conveni
reproduc

tabl border width cellpad align center bgcolor e0e0e0

minpack copyright notic univers chicago
right reserv


redistribut sourc binari form
modif permit provid condit
met

redistribut sourc code retain copyright
notic list condit disclaim
redistribut binari form reproduc
copyright notic list condit
disclaim document materi provid
distribut
end user document includ redistribut
includ acknowledg
code product includ softwar develop univers
chicago oper argonn nation laboratori code
altern acknowledg softwar
parti acknowledg
strong warranti disclaim softwar suppli
warranti kind copyright holder
unit state unit state depart energi
employe disclaim warranti express
impli includ limit impli warranti
merchant fit purpos titl
infring assum legal liabil
respons accuraci complet
us softwar repres
softwar infring privat own right
warrant softwar function
uninterrupt error free error
correct strong
strong limit liabil event copyright
holder unit state unit state depart
energi employe liabl indirect
incident consequenti special punit damag
kind natur includ limit loss
profit loss data reason whatsoev
liabil assert basi contract tort
includ neglig strict liabil
parti warn
possibl loss damag strong

tabl

version


levenberg marquardt optim levenbergmarquardtoptim








































































































































































inherit doc inheritdoc
overrid
point vector pair pointvectorvaluepair optim dooptim
check paramet checkparamet

target gettarget length number observ data
current point currentpoint start point getstartpoint
current point currentpoint length number paramet

arrai share method
solv col solvedcol fast math fastmath min
diag diagr
jac norm jacnorm
beta
permut
dir lmdir

local point
delta
norm xnorm
diag
oldx
re oldr
obj oldobj
qtf
work1
work2
work3

real matrix realmatrix weight matrix sqrt weightmatrixsqrt weight squar root getweightsquareroot

evalu function start point calcul norm
current object currentobject comput object computeobjectivevalu current point currentpoint
current residu currentresidu comput residu computeresidu current object currentobject
point vector pair pointvectorvaluepair current point vector pair pointvectorvaluepair current point currentpoint current object currentobject
current cost currentcost comput cost computecost current residu currentresidu

outer loop
par lmpar
iter firstiter
iter
converg checker convergencecheck point vector pair pointvectorvaluepair checker converg checker getconvergencecheck

iter
point vector pair pointvectorvaluepair previou current

decomposit jacobian matrix
decomposit qrdecomposit comput weight jacobian computeweightedjacobian current point currentpoint

weight residu weightedresidu weight matrix sqrt weightmatrixsqrt oper current residu currentresidu

qtf weight residu weightedresidu


comput re
qty qtf

anymor
jacobian matrix diagon element
solv col solvedcol
permut
weight jacobian weightedjacobian diag diagr


iter firstiter
scale point norm column
initi jacobian
norm xnorm

jac norm jacnorm



current point currentpoint
norm xnorm
diag

norm xnorm fast math fastmath sqrt norm xnorm

initi step bound delta
delta norm xnorm initi step bound factor initialstepboundfactor initi step bound factor initialstepboundfactor norm xnorm


check orthogon function vector jacobian column
max cosin maxcosin
current cost currentcost
solv col solvedcol
permut
jac norm jacnorm

sum

sum weight jacobian weightedjacobian qtf

max cosin maxcosin fast math fastmath max max cosin maxcosin fast math fastmath ab sum current cost currentcost



max cosin maxcosin ortho toler orthotoler
converg reach
set cost setcost current cost currentcost
current


rescal

diag fast math fastmath max diag jac norm jacnorm


loop
ratio ratio

save state
solv col solvedcol
permut
oldx current point currentpoint

previou cost previouscost current cost currentcost
tmp vec tmpvec weight residu weightedresidu
weight residu weightedresidu re oldr
re oldr tmp vec tmpvec
tmp vec tmpvec current object currentobject
current object currentobject obj oldobj
obj oldobj tmp vec tmpvec

determin levenberg marquardt paramet
determin paramet determinelmparamet qtf delta diag work1 work2 work3

comput point norm evolut direct
norm lmnorm
solv col solvedcol
permut
dir lmdir dir lmdir
current point currentpoint oldx dir lmdir
diag dir lmdir
norm lmnorm

norm lmnorm fast math fastmath sqrt norm lmnorm
iter adjust initi step bound
iter firstiter
delta fast math fastmath min delta norm lmnorm


evalu function calcul norm
current object currentobject comput object computeobjectivevalu current point currentpoint
current residu currentresidu comput residu computeresidu current object currentobject
current point vector pair pointvectorvaluepair current point currentpoint current object currentobject
current cost currentcost comput cost computecost current residu currentresidu

comput scale actual reduct
act red actr
current cost currentcost previou cost previouscost
current cost currentcost previou cost previouscost
act red actr


comput scale predict reduct
scale direct deriv
solv col solvedcol
permut
dir dirj dir lmdir
work1

work1 weight jacobian weightedjacobian dir dirj


coeff1
solv col solvedcol
coeff1 work1 work1

pc2 previou cost previouscost previou cost previouscost
coeff1 coeff1 pc2
coeff2 par lmpar norm lmnorm norm lmnorm pc2
pre red prere coeff1 coeff2
dir der dirder coeff1 coeff2

ratio actual predict reduct
ratio pre red prere act red actr pre red prere

updat step bound
ratio
tmp
act red actr dir der dirder dir der dirder act red actr
current cost currentcost previou cost previouscost tmp
tmp

delta tmp fast math fastmath min delta norm lmnorm
par lmpar tmp
par lmpar ratio
delta norm lmnorm
par lmpar


test success iter
ratio
success iter updat norm
iter firstiter
norm xnorm

diag current point currentpoint
norm xnorm

norm xnorm fast math fastmath sqrt norm xnorm

test converg
checker
vectori converg checker
checker converg iter previou current
set cost setcost current cost currentcost
current



fail iter reset previou valu
current cost currentcost previou cost previouscost
solv col solvedcol
permut
current point currentpoint oldx

tmp vec tmpvec weight residu weightedresidu
weight residu weightedresidu re oldr
re oldr tmp vec tmpvec
tmp vec tmpvec current object currentobject
current object currentobject obj oldobj
obj oldobj tmp vec tmpvec
reset current previou valu
current point vector pair pointvectorvaluepair current point currentpoint current object currentobject


default converg criteria
fast math fastmath ab act red actr cost rel toler costrelativetoler
pre red prere cost rel toler costrelativetoler
ratio
delta par rel toler parrelativetoler norm xnorm
set cost setcost current cost currentcost
current


test termin stringent toler
2204e machin epsilon ieee754
fast math fastmath ab act red actr 2204e pre red prere 2204e ratio
converg except convergenceexcept local format localizedformat small cost rel toler
cost rel toler costrelativetoler
delta 2204e norm xnorm
converg except convergenceexcept local format localizedformat small paramet rel toler
par rel toler parrelativetoler
max cosin maxcosin 2204e
converg except convergenceexcept local format localizedformat small orthogon toler
ortho toler orthotoler












































































































































































































































































































































































































































