

















org apach common math3 optim direct
















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
param knew
param adelt

altmov
knew
adelt

print method printmethod xxx

current currentbest dimens getdimens
npt number interpol point numberofinterpolationpoint

arrai real vector arrayrealvector glag arrai real vector arrayrealvector
arrai real vector arrayrealvector hcol arrai real vector arrayrealvector npt

arrai real vector arrayrealvector work1 arrai real vector arrayrealvector
arrai real vector arrayrealvector work2 arrai real vector arrayrealvector

npt
hcol set entri setentri

max npt max
tmp matrix zmatrix entri getentri knew
npt
hcol set entri setentri hcol entri getentri tmp matrix zmatrix entri getentri


alpha hcol entri getentri knew
half alpha

calcul gradient knew lagrang function xopt


glag set entri setentri matrix bmatrix entri getentri knew

npt
tmp

tmp interpol point interpolationpoint entri getentri trust region center offset trustregioncenteroffset entri getentri

tmp hcol entri getentri

glag set entri setentri glag entri getentri tmp interpol point interpolationpoint entri getentri



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

tmp interpol point interpolationpoint entri getentri trust region center offset trustregioncenteroffset entri getentri
dderiv glag entri getentri tmp
distsq tmp tmp

subd adelt math sqrt distsq
slbd subd
ilbd
iubd
sumin math min subd

revis slbd subd bound


tmp interpol point interpolationpoint entri getentri trust region center offset trustregioncenteroffset entri getentri
tmp
slbd tmp lower differ lowerdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri
slbd lower differ lowerdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri tmp
ilbd

subd tmp upper differ upperdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri
comput max
subd math max sumin
upper differ upperdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri tmp
iubd

tmp
slbd tmp upper differ upperdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri
slbd upper differ upperdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri tmp
ilbd

subd tmp lower differ lowerdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri
comput max
subd math max sumin
lower differ lowerdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri tmp
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


tmp trust region center offset trustregioncenteroffset entri getentri stpsav interpol point interpolationpoint entri getentri ksav trust region center offset trustregioncenteroffset entri getentri
point newpoint set entri setentri math max lower differ lowerdiffer entri getentri
math min upper differ upperdiffer entri getentri tmp

ibdsav
point newpoint set entri setentri ibdsav lower differ lowerdiffer entri getentri ibdsav

ibdsav
point newpoint set entri setentri ibdsav upper differ upperdiffer entri getentri ibdsav


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
math min trust region center offset trustregioncenteroffset entri getentri lower differ lowerdiffer entri getentri glag glagvalu
math max trust region center offset trustregioncenteroffset entri getentri upper differ upperdiffer entri getentri glag glagvalu
work1 set entri setentri bigstp
comput 2nd power
ggfree glag glagvalu glag glagvalu


ggfree
alpha


investig compon fix
tmp1 adelt adelt wfixsq
tmp1
step math sqrt tmp1 ggfree
ggfree

work1 entri getentri bigstp
tmp2 trust region center offset trustregioncenteroffset entri getentri step glag entri getentri
tmp2 lower differ lowerdiffer entri getentri
work1 set entri setentri lower differ lowerdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri
comput 2nd power
work1 entri getentri
wfixsq
tmp2 upper differ upperdiffer entri getentri
work1 set entri setentri upper differ upperdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri
comput 2nd power
work1 entri getentri
wfixsq

comput 2nd power
glag entri getentri
ggfree





set remain free compon compon xalt
scale



glag glagvalu glag entri getentri
work1 entri getentri bigstp
work1 set entri setentri step glag glagvalu
min math min upper differ upperdiffer entri getentri
trust region center offset trustregioncenteroffset entri getentri work1 entri getentri
altern point alternativenewpoint set entri setentri math max lower differ lowerdiffer entri getentri min
work1 entri getentri
altern point alternativenewpoint set entri setentri trust region center offset trustregioncenteroffset entri getentri
glag glagvalu
altern point alternativenewpoint set entri setentri lower differ lowerdiffer entri getentri

altern point alternativenewpoint set entri setentri upper differ upperdiffer entri getentri

glag glagvalu work1 entri getentri


set curv curvatur knew lagrang function
scale factor reduc modulu
lagrang function xopt set cauchi
squar function

curv
npt
tmp

tmp interpol point interpolationpoint entri getentri work1 entri getentri

curv hcol entri getentri tmp tmp

iflag
curv curv

curv
curv math sqrt
scale curv

tmp trust region center offset trustregioncenteroffset entri getentri scale work1 entri getentri
altern point alternativenewpoint set entri setentri math max lower differ lowerdiffer entri getentri
math min upper differ upperdiffer entri getentri tmp

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
work2 set entri setentri altern point alternativenewpoint entri getentri

csave cauchi
iflag




csave cauchi

altern point alternativenewpoint set entri setentri work2 entri getentri

cauchi csave


alpha cauchi
altmov





























































































































































































































































































































































































































































































































































































































































































































































































































































































































































