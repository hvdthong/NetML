
















org apach common math optim direct



















powell' bobyqa algorithm implement translat
adapt fortran version
href http plato asu ftp softwar bobyqa zip
href http www optim onlin org html html
paper introduct

bobyqa suit high dimension problem
deriv case outperform
link powel optim powelloptim significantli stochast algorithm
link cmae optim cmaesoptim succe bobyqa
expens bobyqa consid replac
deriv base optim deriv approxim
finit differ

version


bobyqa optim bobyqaoptim




































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































argument npt xpt xopt bmat zmat ndim
mean argument bobyqb
kopt index optim interpol point
knew index interpol point move
adelt current trust region bound
xnew set suitabl posit interpol point
xpt knew specif satisfi trust region
bound provid larg denomin call
updat step xnew xopt xopt restrict move
straight line xopt interpol point
xalt larg modulu knew lagrang
function subject constraint mention main
differ xnew xalt xopt constrain version
cauchi step trust region except xalt
calcul compon glag
alpha set knew diagon element matrix
cauchi set squar knew lagrang function
step xalt xopt xopt vector xalt return
cauchi set xalt calcul
glag work space vector length gradient
knew lagrang function xopt
hcol work space vector length npt deriv
coeffici knew lagrang function
work space vector length hold
constrain cauchi step xopt lagrang function
downhil version xalt uphil step calcul

set npt compon lead element
knew column matrix
param xpt
param xopt
param bmat
param zmat
param
param
param knew
param adelt
param xnew
param xalt

altmov
array2 row real matrix array2drowrealmatrix xpt
arrai real vector arrayrealvector xopt
array2 row real matrix array2drowrealmatrix bmat
array2 row real matrix array2drowrealmatrix zmat
arrai real vector arrayrealvector
arrai real vector arrayrealvector
knew
adelt
arrai real vector arrayrealvector xnew
arrai real vector arrayrealvector xalt

system println altmov xxx

current currentbest dimens getdimens
npt number interpol point numberofinterpolationpoint

arrai real vector arrayrealvector glag arrai real vector arrayrealvector
arrai real vector arrayrealvector hcol arrai real vector arrayrealvector npt

arrai real vector arrayrealvector work1 arrai real vector arrayrealvector
arrai real vector arrayrealvector work2 arrai real vector arrayrealvector

npt
hcol set entri setentri

max npt max
tmp zmat entri getentri knew
npt
hcol set entri setentri hcol entri getentri tmp zmat entri getentri


alpha hcol entri getentri knew
half alpha

calcul gradient knew lagrang function xopt


glag set entri setentri bmat entri getentri knew

npt
tmp

tmp xpt entri getentri xopt entri getentri

tmp hcol entri getentri

glag set entri setentri glag entri getentri tmp xpt entri getentri



search larg denomin straight line xopt
interpol point slbd subd lower upper
bound step line turn predsq
set squar predict denomin line presav
set largest admiss predsq occur

presav
step doubl nan
ksav
ibdsav
stpsav
npt
trust region center interpol point index trustregioncenterinterpolationpointindex


dderiv
distsq

tmp xpt entri getentri xopt entri getentri
dderiv glag entri getentri tmp
distsq tmp tmp

subd adelt math sqrt distsq
slbd subd
ilbd
iubd
sumin math min subd

revis slbd subd bound


tmp xpt entri getentri xopt entri getentri
tmp
slbd tmp entri getentri xopt entri getentri
slbd entri getentri xopt entri getentri tmp
ilbd

subd tmp entri getentri xopt entri getentri
comput max
subd math max sumin
entri getentri xopt entri getentri tmp
iubd

tmp
slbd tmp entri getentri xopt entri getentri
slbd entri getentri xopt entri getentri tmp
ilbd

subd tmp entri getentri xopt entri getentri
comput max
subd math max sumin
entri getentri xopt entri getentri tmp
iubd




seek larg modulu knew lagrang function index
interpol point line xopt knew

step slbd
isbd ilbd
vlag doubl nan
knew
diff dderiv
vlag slbd dderiv slbd diff
subd dderiv subd diff
math ab math ab vlag
step subd
vlag
isbd iubd

half dderiv
diff slbd
diff subd

diff
math ab math ab vlag
step diff
vlag
isbd



search line xopt point


vlag slbd slbd
tmp subd subd
math ab tmp math ab vlag
step subd
vlag tmp
isbd iubd

subd half
math ab vlag
step half
vlag
isbd


vlag dderiv


calcul predsq current line search maintain presav

tmp step step distsq
predsq vlag vlag vlag vlag tmp tmp
predsq presav
presav predsq
ksav
stpsav step
ibdsav isbd



construct xnew satisfi bound constraint


tmp xopt entri getentri stpsav xpt entri getentri ksav xopt entri getentri
xnew set entri setentri math max entri getentri
math min entri getentri tmp

ibdsav
xnew set entri setentri ibdsav entri getentri ibdsav

ibdsav
xnew set entri setentri ibdsav entri getentri ibdsav


prepar iter method assembl constrain cauchi
step sum squar fix compon form
wfixsq free compon set bigstp

bigstp adelt adelt
iflag
cauchi doubl nan
csave

wfixsq
ggfree

glag glagvalu glag entri getentri
work1 set entri setentri
math min xopt entri getentri entri getentri glag glagvalu
math max xopt entri getentri entri getentri glag glagvalu
work1 set entri setentri bigstp
comput 2nd power
ggfree glag glagvalu glag glagvalu


ggfree
alpha


investig compon fix
l120
tmp adelt adelt wfixsq
tmp
wsqsav wfixsq
step math sqrt tmp ggfree
ggfree

work1 entri getentri bigstp
tmp2 xopt entri getentri step glag entri getentri
tmp2 entri getentri
work1 set entri setentri entri getentri xopt entri getentri
comput 2nd power
work1 entri getentri
wfixsq
tmp2 entri getentri
work1 set entri setentri entri getentri xopt entri getentri
comput 2nd power
work1 entri getentri
wfixsq

comput 2nd power
glag entri getentri
ggfree



wfixsq wsqsav
ggfree
l120


end l120

set remain free compon compon xalt
scale



glag glagvalu glag entri getentri
work1 entri getentri bigstp
work1 set entri setentri step glag glagvalu
min math min entri getentri
xopt entri getentri work1 entri getentri
xalt set entri setentri math max entri getentri min
work1 entri getentri
xalt set entri setentri xopt entri getentri
glag glagvalu
xalt set entri setentri entri getentri

xalt set entri setentri entri getentri

glag glagvalu work1 entri getentri


set curv curvatur knew lagrang function
scale factor reduc modulu
lagrang function xopt set cauchi
squar function

curv
npt
tmp

tmp xpt entri getentri work1 entri getentri

curv hcol entri getentri tmp tmp

iflag
curv curv

curv
curv math sqrt
scale curv

tmp xopt entri getentri scale work1 entri getentri
xalt set entri setentri math max entri getentri
math min entri getentri tmp

comput 2nd power
half scale
cauchi

comput 2nd power
half curv
cauchi


iflag xalt calcul revers
sign glag xalt vector
chosen larger cauchi

iflag

glag set entri setentri glag entri getentri
work2 set entri setentri xalt entri getentri

csave cauchi
iflag




csave cauchi

xalt set entri setentri work2 entri getentri

cauchi csave


alpha cauchi
altmov












































































































































































































































































































































































































































































































































































































































































































































































































































































































































































