















org apach common math estim






solv squar problem

implement work determin system
system variabl equat determin system
solv ignor variabl smallest impact
jacobian column norm rank matrix loop bound
chang implement

resolut engin simpl translat minpack
href http www netlib org minpack lmder lmder routin minor
includ determin resolut
decomposit rewritten algorithm
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

version revis date

deprec org apach common math estim
deprec replac org apach common math optim gener



levenberg marquardt estim levenbergmarquardtestim abstract estim abstractestim serializ
















































































































































































































































































































































































determin levenberg marquardt paramet
implement translat java minpack
href http www netlib org minpack lmpar lmpar
routin
method set par lmpar dir lmdir attribut
author origin fortran function

argonn nation laboratori minpack project march
burton garbow
kenneth hillstrom
jorg

luc maisonob java translat

param arrai qty
param delta upper bound euclidean norm diag diagr dir lmdir
param diag diagon matrix
param work1 work arrai
param work2 work arrai
param work3 work arrai

determin paramet determinelmparamet delta diag
work1 work2 work3

comput store gauss newton direct
jacobian rank defici obtain squar solut
rank
dir lmdir permut

rank col
dir lmdir permut

rank
permut
ypk dir lmdir diag diagr
index

dir lmdir permut ypk jacobian index
index col

dir lmdir ypk


evalu function origin test
accept gauss newton direct
norm dxnorm
solv col solvedcol
permut
diag dir lmdir
work1
norm dxnorm

norm dxnorm math sqrt norm dxnorm
norm dxnorm delta
delta
par lmpar



jacobian rank defici newton step
lower bound parl function
set bound
sum2
parl
rank solv col solvedcol
solv col solvedcol
permut
work1 diag norm dxnorm

sum2
solv col solvedcol
permut
sum
index

sum jacobian index work1 permut
index col

work1 sum diag diagr
work1
sum2

parl delta sum2


calcul upper bound paru function
sum2
solv col solvedcol
permut
sum
index

sum jacobian index
index col

sum diag
sum2 sum sum

norm gnorm math sqrt sum2
paru norm gnorm delta
paru
2251e smallest posit real iee754
paru 2251e math min delta


input par li interv parl paru
set par closer endpoint
par lmpar math min paru math max par lmpar parl
par lmpar
par lmpar norm gnorm norm dxnorm


countdown countdown countdown

evalu function current par lmpar
par lmpar
par lmpar math max 2251e paru

par spar math sqrt par lmpar
solv col solvedcol
permut
work1 par spar diag

determin direct determinelmdirect work1 work2 work3

norm dxnorm
solv col solvedcol
permut
diag dir lmdir
work3
norm dxnorm

norm dxnorm math sqrt norm dxnorm
previou previousfp
norm dxnorm delta

function small accept current
par lmpar test except case parl
math ab delta
parl previou previousfp previou previousfp



comput newton correct
solv col solvedcol
permut
work1 work3 diag norm dxnorm

solv col solvedcol
permut
work1 work2
tmp work1
solv col solvedcol
work1 permut jacobian col tmp


sum2
solv col solvedcol
work1 permut
sum2

correct delta sum2

depend sign function updat parl paru

parl math max parl par lmpar

paru math min paru par lmpar


comput improv estim par lmpar
par lmpar math max parl par lmpar correct


























































































































































































































































