















org apach common math estim





solv squar problem

implement work determin system
system variabl equat determin system
solv ignor variabl smallest impact
jacobian column norm rank matrix loop bound
chang implement featur undergon basic test
consid experiment

resolut engin simpl translat minpack
href http www netlib org minpack lmder lmder routin minor
includ determin resolut
decomposit rewritten algorithm
lascaux theodor book analys num eacut riqu matriciel
appliqu eacut agrav l'art l'ing eacut nieur masson
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

author argonn nation laboratori minpack project march origin fortran
author burton garbow origin fortran
author kenneth hillstrom origin fortran
author jorg origin fortran

levenberg marquardt estim levenbergmarquardtestim serializ estim



















































































































































solv estim problem levenberg marquardt algorithm
algorithm modifi levenberg marquardt base
minpack href http www netlib org minpack lmder lmder
routin algorithm set set method
call link set initi step bound factor setinitialstepboundfactor
link set max cost eval setmaxcostev link set cost rel toler setcostrelativetoler
link set par rel toler setparrelativetoler link set ortho toler setorthotoler method
method call valu set
link levenberg marquardt estim levenbergmarquardtestim constructor
author origin fortran function

argonn nation laboratori minpack project march
burton garbow
kenneth hillstrom
jorg

luc maisonob java translat

param problem estim problem solv
except estim except estimationexcept converg
reach algorithm set variabl
equat
set initi step bound factor setinitialstepboundfactor
set max cost eval setmaxcostev
set cost rel toler setcostrelativetoler
set par rel toler setparrelativetoler
set ortho toler setorthotoler

estim estim problem estimationproblem problem
estim except estimationexcept

retriev equat paramet
measur problem measur getmeasur
paramet problem unbound paramet getunboundparamet

arrai share method
row measur length
col paramet length
solv col solvedcol math min row col
jacobian row col
diag diagr col
jac norm jacnorm col
beta col
permut col
dir lmdir col
residu row

local variabl
delta norm xnorm
diag col
oldx col
re oldr row
work1 col
work2 col
work3 col

evalu function start point calcul norm
updat residu cost updateresidualsandcost

outer loop
par lmpar
cost evalu costevalu
jacobian evalu jacobianevalu
iter firstiter
cost evalu costevalu max cost eval maxcostev

comput decomposit jacobian matrix
updat jacobian updatejacobian
decomposit qrdecomposit

comput re
qty residu

anymor
jacobian matrix diagon element
solv col solvedcol
permut
jacobian col diag diagr


iter firstiter

scale variabl norm column
initi jacobian
norm xnorm
col
jac norm jacnorm



paramet estim getestim
norm xnorm
diag

norm xnorm math sqrt norm xnorm

initi step bound delta
delta norm xnorm
initi step bound factor initialstepboundfactor initi step bound factor initialstepboundfactor norm xnorm



check orthogon function vector jacobian column
max cosin maxcosin
cost
solv col solvedcol
permut
jac norm jacnorm

sum
index index col
sum jacobian index residu

max cosin maxcosin math max max cosin maxcosin math ab sum cost



max cosin maxcosin ortho toler orthotoler



rescal
col
diag math max diag jac norm jacnorm


loop
ratio ratio

save state
solv col solvedcol
permut
oldx paramet estim getestim

previou cost previouscost cost
tmp vec tmpvec residu
residu re oldr
re oldr tmp vec tmpvec

determin levenberg marquardt paramet
determin paramet determinelmparamet re oldr delta diag work1 work2 work3

comput point norm evolut direct
norm lmnorm
solv col solvedcol
permut
dir lmdir dir lmdir
paramet set estim setestim oldx dir lmdir
diag dir lmdir
norm lmnorm

norm lmnorm math sqrt norm lmnorm

iter adjust initi step bound
iter firstiter
delta math min delta norm lmnorm


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
index index col
work1 jacobian index dir dirj


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

delta tmp math min delta norm lmnorm
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
diag paramet estim getestim
norm xnorm

norm xnorm math sqrt norm xnorm

fail iter reset previou valu
cost previou cost previouscost
solv col solvedcol
permut
paramet set estim setestim oldx

tmp vec tmpvec residu
residu re oldr
re oldr tmp vec tmpvec


test converg
math ab act red actr cost rel toler costrelativetoler
pre red prere cost rel toler costrelativetoler
ratio
delta par rel toler parrelativetoler norm xnorm



test termin stringent toler
2204e machin epsilon ieee754
cost evalu costevalu max cost eval maxcostev


math ab act red actr 2204e
pre red prere 2204e
ratio
estim except estimationexcept cost rel toler small
reduct
sum squar
string
doubl string tostr cost rel toler costrelativetoler

delta 2204e norm xnorm
estim except estimationexcept paramet rel toler small
improv
approxim solut
string
doubl string tostr par rel toler parrelativetoler

max cosin maxcosin 2204e
estim except estimationexcept orthogon toler small
solut orthogon jacobian
string
doubl string tostr ortho toler orthotoler







estim except estimationexcept maxim number evalu exceed
string
integ string tostr max cost eval maxcostev







































































































































































































































































































































































































































































































