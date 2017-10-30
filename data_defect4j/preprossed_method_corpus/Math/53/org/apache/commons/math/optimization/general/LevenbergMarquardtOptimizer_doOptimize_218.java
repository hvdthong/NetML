















org apach common math optim gener













solv squar problem levenberg marquardt algorithm

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



levenberg marquardt optim levenbergmarquardtoptim abstract squar optim abstractleastsquaresoptim











































































































inherit doc inheritdoc
overrid
vectori point pair vectorialpointvaluepair optim dooptim math user except mathuserexcept
arrai share method
solv col solvedcol fast math fastmath min row col
diag diagr col
jac norm jacnorm col
beta col
permut col
dir lmdir col

local point
delta
norm xnorm
diag col
oldx col
re oldr row
obj oldobj row
qtf row
work1 col
work2 col
work3 col

evalu function start point calcul norm
updat residu cost updateresidualsandcost

outer loop
par lmpar
iter firstiter
vectori point pair vectorialpointvaluepair current vectori point pair vectorialpointvaluepair point object
iter
converg checker convergencecheck vectori point pair vectorialpointvaluepair checker converg checker getconvergencecheck

iter

row
qtf weight residu weightedresidu


comput decomposit jacobian matrix
vectori point pair vectorialpointvaluepair previou current
updat jacobian updatejacobian
decomposit qrdecomposit

comput re
qty qtf
anymor
jacobian matrix diagon element
solv col solvedcol
permut
weight residu jacobian weightedresidualjacobian diag diagr


iter firstiter
scale point norm column
initi jacobian
norm xnorm
col
jac norm jacnorm



point
norm xnorm
diag

norm xnorm fast math fastmath sqrt norm xnorm

initi step bound delta
delta norm xnorm initi step bound factor initialstepboundfactor initi step bound factor initialstepboundfactor norm xnorm


check orthogon function vector jacobian column
max cosin maxcosin
cost
solv col solvedcol
permut
jac norm jacnorm

sum

sum weight residu jacobian weightedresidualjacobian qtf

max cosin maxcosin fast math fastmath max max cosin maxcosin fast math fastmath ab sum cost



max cosin maxcosin ortho toler orthotoler
converg reach
updat residu cost updateresidualsandcost
current vectori point pair vectorialpointvaluepair point object
current


rescal
col
diag fast math fastmath max diag jac norm jacnorm


loop
ratio ratio

save state
solv col solvedcol
permut
oldx point

previou cost previouscost cost
tmp vec tmpvec weight residu weightedresidu
weight residu weightedresidu re oldr
re oldr tmp vec tmpvec
tmp vec tmpvec object
object obj oldobj
obj oldobj tmp vec tmpvec

determin levenberg marquardt paramet
determin paramet determinelmparamet qtf delta diag work1 work2 work3

comput point norm evolut direct
norm lmnorm
solv col solvedcol
permut
dir lmdir dir lmdir
point oldx dir lmdir
diag dir lmdir
norm lmnorm

norm lmnorm fast math fastmath sqrt norm lmnorm
iter adjust initi step bound
iter firstiter
delta fast math fastmath min delta norm lmnorm


evalu function calcul norm
updat residu cost updateresidualsandcost

comput scale actual reduct
act red actr
cost previou cost previouscost
cost previou cost previouscost
act red actr


comput scale predict reduct
scale direct deriv
solv col solvedcol
permut
dir dirj dir lmdir
work1

work1 weight residu jacobian weightedresidualjacobian dir dirj


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
cost previou cost previouscost tmp
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
col
diag point
norm xnorm

norm xnorm fast math fastmath sqrt norm xnorm
current vectori point pair vectorialpointvaluepair point object

test converg
checker
vectori converg checker
checker converg iter previou current
current



fail iter reset previou valu
cost previou cost previouscost
solv col solvedcol
permut
point oldx

tmp vec tmpvec weight residu weightedresidu
weight residu weightedresidu re oldr
re oldr tmp vec tmpvec
tmp vec tmpvec object
object obj oldobj
obj oldobj tmp vec tmpvec


default converg criteria
fast math fastmath ab act red actr cost rel toler costrelativetoler
pre red prere cost rel toler costrelativetoler
ratio
delta par rel toler parrelativetoler norm xnorm
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





















































































































































































































































































































































































































