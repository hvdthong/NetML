
















org apach common math3 optim nonlinear scalar noderiv














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

version bobyqa optim bobyqaoptim java 02z psteitz


bobyqa optim bobyqaoptim





























































































































































































































































































argument npt rhobeg rhoend iprint maxfun
ident argument subroutin bobyqa
xbase hold shift origin reduc contribut
round error valu model lagrang function
xpt dimension arrai hold coordin
interpol point rel xbase
fval hold valu interpol point
xopt set displac xbase trust region centr
gopt hold gradient quadrat model xbase xopt
hold explicit deriv quadrat model
paramet implicit deriv
quadrat model
bmat hold column
zmat hold factor lead npt npt submatrix
factor zmat time zmat
correct rank posit semi definit
ndim dimens bmat npt
hold differ xbase xbase
compon xopt satisfi bound
leq xopt leq equal
xopt constraint boundari
xnew chosen subroutin trsbox altmov xbase xnew
vector variabl call calfun xnew satisfi
constraint mention
xalt altern xnew chosen altmov replac xnew
order increas denomin updat updat
reserv trial step xopt xnew xopt
vlag valu lagrang function point
part product requir vlag length ndim
dimension arrai work space length
ndim npt

param lower bound lowerbound lower bound
param upper bound upperbound upper bound
object optimum

bobyqb lower bound lowerbound
upper bound upperbound
print method printmethod xxx

current currentbest dimens getdimens
npt number interpol point numberofinterpolationpoint

nptm npt


arrai real vector arrayrealvector work1 arrai real vector arrayrealvector
arrai real vector arrayrealvector work2 arrai real vector arrayrealvector npt
arrai real vector arrayrealvector work3 arrai real vector arrayrealvector npt

cauchi doubl nan
alpha doubl nan
dsq doubl nan
crvmin doubl nan

set constant
paramet adjust

function bodi

call prelim set element xbase xpt fval gopt
bmat zmat iter valu
kopt number call calfun
index interpol point trust region centr
initi xopt set branch label occur maxfun
npt gopt updat kopt kbase

trust region center interpol point index trustregioncenterinterpolationpointindex

prelim lower bound lowerbound upper bound upperbound
xoptsq

trust region center offset trustregioncenteroffset set entri setentri interpol point interpolationpoint entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex
comput 2nd power
delta deltaon trust region center offset trustregioncenteroffset entri getentri
xoptsq delta deltaon delta deltaon

fsave interpol point fatinterpolationpoint entri getentri
kbase

complet set requir iter procedur

ntrit
itest
knew
nfsav evalu getevalu
rho initi trust region radiu initialtrustregionradiu
delta rho
diffa
diffb
diffc

beta
adelt
denom
ratio
dnorm
scaden
biglsq
distsq

updat gopt iter
call rescu make call calfun

state
state

print state printstat xxx
trust region center interpol point index trustregioncenterinterpolationpointindex kbase




gradient trust region center gradientattrustregioncent set entri setentri gradient trust region center gradientattrustregioncent entri getentri model deriv valu modelsecondderivativesvalu entri getentri trust region center offset trustregioncenteroffset entri getentri

gradient trust region center gradientattrustregioncent set entri setentri gradient trust region center gradientattrustregioncent entri getentri model deriv valu modelsecondderivativesvalu entri getentri trust region center offset trustregioncenteroffset entri getentri



evalu getevalu npt
npt
temp

temp interpol point interpolationpoint entri getentri trust region center offset trustregioncenteroffset entri getentri

temp model deriv paramet modelsecondderivativesparamet entri getentri

gradient trust region center gradientattrustregioncent set entri setentri gradient trust region center gradientattrustregioncent entri getentri temp interpol point interpolationpoint entri getentri


path explor except pathisexploredexcept xxx



gener point trust region small
quadrat model subject constraint variabl
ntrit set number trust region iter
occur altern iter length
xnew xopt half rho branch
label ntrit calcul xnew



print state printstat xxx
arrai real vector arrayrealvector gnew arrai real vector arrayrealvector
arrai real vector arrayrealvector xbdi arrai real vector arrayrealvector
arrai real vector arrayrealvector arrai real vector arrayrealvector
arrai real vector arrayrealvector arrai real vector arrayrealvector
arrai real vector arrayrealvector hred arrai real vector arrayrealvector

dsq crvmin dsqcrvmin trsbox delta gnew xbdi
hred
dsq dsq crvmin dsqcrvmin
crvmin dsq crvmin dsqcrvmin

comput min
delta deltaon delta
delta deltatwo math sqrt dsq
dnorm math min delta deltaon delta deltatwo
dnorm half rho
ntrit
comput 2nd power
delta deltaon ten rho
distsq delta deltaon delta deltaon
evalu getevalu nfsav
state


choic label depend
work current rho complet rho
decreas termin occur error quadrat model
interpol point compar favour predict
improv model distanc half rho xopt

comput max
delta deltaon math max diffa diffb
errbig math max delta deltaon diffc
frhosq rho rho
crvmin
errbig frhosq crvmin
state

bdtol errbig rho

bdtest bdtol
point newpoint entri getentri lower differ lowerdiffer entri getentri
bdtest work1 entri getentri

point newpoint entri getentri upper differ upperdiffer entri getentri
bdtest work1 entri getentri

bdtest bdtol
curv model deriv valu modelsecondderivativesvalu entri getentri
npt
comput 2nd power
interpol point interpolationpoint entri getentri
curv model deriv paramet modelsecondderivativesparamet entri getentri

bdtest half curv rho
bdtest bdtol
state

path explor except pathisexploredexcept xxx


state

ntrit

sever cancel occur xopt xbase
test hold xbase shift xopt
made bmat
deriv current model begin bmat
depend zmat vlag temporarili work space



print state printstat xxx
dsq xoptsq thousand
fracsq xoptsq
sumpq
real vector realvector sum vector sumvector
arrai real vector arrayrealvector npt half xoptsq add interpol point interpolationpoint oper trust region center trustregioncent
npt
sumpq model deriv paramet modelsecondderivativesparamet entri getentri
sum half xoptsq

sum interpol point interpolationpoint entri getentri trust region center offset trustregioncenteroffset entri getentri

sum sum vector sumvector entri getentri xxx test acklei testacklei test diff pow testdiffpow fail
work2 set entri setentri sum
temp fracsq half sum

work1 set entri setentri matrix bmatrix entri getentri
lagrang valu point lagrangevaluesatnewpoint set entri setentri sum interpol point interpolationpoint entri getentri temp trust region center offset trustregioncenteroffset entri getentri
npt

matrix bmatrix set entri setentri
matrix bmatrix entri getentri
work1 entri getentri lagrang valu point lagrangevaluesatnewpoint entri getentri
lagrang valu point lagrangevaluesatnewpoint entri getentri work1 entri getentri




revis bmat depend zmat calcul

nptm
sumz
sumw
npt
sumz matrix zmatrix entri getentri
lagrang valu point lagrangevaluesatnewpoint set entri setentri work2 entri getentri matrix zmatrix entri getentri
sumw lagrang valu point lagrangevaluesatnewpoint entri getentri


sum fracsq sumz half sumw trust region center offset trustregioncenteroffset entri getentri
npt
sum lagrang valu point lagrangevaluesatnewpoint entri getentri interpol point interpolationpoint entri getentri

work1 set entri setentri sum
npt
matrix bmatrix set entri setentri
matrix bmatrix entri getentri
sum matrix zmatrix entri getentri



npt
temp work1 entri getentri

matrix bmatrix set entri setentri
matrix bmatrix entri getentri
temp work1 entri getentri




instruct complet shift includ
deriv paramet quadrat model



work1 set entri setentri half sumpq trust region center offset trustregioncenteroffset entri getentri
npt
work1 set entri setentri work1 entri getentri model deriv paramet modelsecondderivativesparamet entri getentri interpol point interpolationpoint entri getentri
interpol point interpolationpoint set entri setentri interpol point interpolationpoint entri getentri trust region center offset trustregioncenteroffset entri getentri


model deriv valu modelsecondderivativesvalu set entri setentri
model deriv valu modelsecondderivativesvalu entri getentri
work1 entri getentri trust region center offset trustregioncenteroffset entri getentri
trust region center offset trustregioncenteroffset entri getentri work1 entri getentri
matrix bmatrix set entri setentri npt matrix bmatrix entri getentri npt




origin shift originshift set entri setentri origin shift originshift entri getentri trust region center offset trustregioncenteroffset entri getentri
point newpoint set entri setentri point newpoint entri getentri trust region center offset trustregioncenteroffset entri getentri
lower differ lowerdiffer set entri setentri lower differ lowerdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri
upper differ upperdiffer set entri setentri upper differ upperdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri
trust region center offset trustregioncenteroffset set entri setentri

xoptsq

ntrit
state

state

xbase move xopt call rescu calcul
expens previou shift matric bmat
zmat gener scratch includ replac
interpol point posit caus linear
depend interpol condit rescu call
round error reduc factor
denomin formula updat matrix
safeguard invok applic bobyqa



print state printstat xxx
pick altern vector variabl rel xbase
suitabl posit knew interpol point
firstli xnew set point line xopt
interpol point minim predict
denomin subject xnew xopt leq adelt
bound xalt set feasibl point
constrain version cauchi step knew lagrang
function squar function
return cauchi choic altern
made denomin calcul

alpha cauchi alphacauchi altmov knew adelt
alpha alpha cauchi alphacauchi
cauchi alpha cauchi alphacauchi


trial step point trialsteppoint set entri setentri point newpoint entri getentri trust region center offset trustregioncenteroffset entri getentri


calcul vlag beta current choic scalar
product xpt held npt
vquad calcul



print state printstat xxx
npt
suma
sumb
sum

suma interpol point interpolationpoint entri getentri trial step point trialsteppoint entri getentri
sumb interpol point interpolationpoint entri getentri trust region center offset trustregioncenteroffset entri getentri
sum matrix bmatrix entri getentri trial step point trialsteppoint entri getentri

work3 set entri setentri suma half suma sumb
lagrang valu point lagrangevaluesatnewpoint set entri setentri sum
work2 set entri setentri suma

beta
nptm
sum
npt
sum matrix zmatrix entri getentri work3 entri getentri

beta sum sum
npt
lagrang valu point lagrangevaluesatnewpoint set entri setentri lagrang valu point lagrangevaluesatnewpoint entri getentri sum matrix zmatrix entri getentri


dsq
bsum


comput 2nd power
trial step point trialsteppoint entri getentri
dsq
sum
npt
sum work3 entri getentri matrix bmatrix entri getentri

bsum sum trial step point trialsteppoint entri getentri
npt

sum matrix bmatrix entri getentri trial step point trialsteppoint entri getentri

lagrang valu point lagrangevaluesatnewpoint set entri setentri sum
bsum sum trial step point trialsteppoint entri getentri
trial step point trialsteppoint entri getentri trust region center offset trustregioncenteroffset entri getentri


beta dsq xoptsq half dsq beta bsum origin
beta dsq xoptsq half dsq bsum xxx test acklei testacklei test diff pow testdiffpow fail
beta dsq xoptsq half dsq beta bsum xxx test diff pow testdiffpow fail

lagrang valu point lagrangevaluesatnewpoint set entri setentri trust region center interpol point index trustregioncenterinterpolationpointindex
lagrang valu point lagrangevaluesatnewpoint entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex

ntrit denomin increas replac
step altmov cauchi step rescu call
round error damag chosen denomin

ntrit
comput 2nd power
lagrang valu point lagrangevaluesatnewpoint entri getentri knew
denom alpha beta
denom cauchi cauchi

point newpoint set entri setentri altern point alternativenewpoint entri getentri
trial step point trialsteppoint set entri setentri point newpoint entri getentri trust region center offset trustregioncenteroffset entri getentri

cauchi xxx statement
state

altern ntrit posit set knew index
interpol point delet make room trust
region step rescu call round error damag
chosen denomin reason attempt select
knew calcul object function


delsq delta delta
scaden
biglsq
knew
npt
trust region center interpol point index trustregioncenterinterpolationpointindex


hdiag
nptm
comput 2nd power
matrix zmatrix entri getentri
hdiag

comput 2nd power
lagrang valu point lagrangevaluesatnewpoint entri getentri
den beta hdiag
distsq

comput 2nd power
interpol point interpolationpoint entri getentri trust region center offset trustregioncenteroffset entri getentri
distsq

comput max
comput 2nd power
distsq delsq
temp math max
temp den scaden
scaden temp den
knew
denom den

comput max
comput 2nd power
lagrang valu point lagrangevaluesatnewpoint entri getentri
biglsq math max biglsq temp



put variabl calcul object function
xnew adjust bound

calcul object function xbase xnew
limit number calcul reach



print state printstat xxx

comput min
comput max
lower bound lowerbound
origin shift originshift entri getentri point newpoint entri getentri
math max
upper bound upperbound
current currentbest set entri setentri math min
point newpoint entri getentri lower differ lowerdiffer entri getentri
current currentbest set entri setentri lower bound lowerbound

point newpoint entri getentri upper differ upperdiffer entri getentri
current currentbest set entri setentri upper bound upperbound



comput object computeobjectivevalu current currentbest arrai toarrai

minim isminim

ntrit
fsave
state


quadrat model predict chang due step
set diff error predict

fopt interpol point fatinterpolationpoint entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex
vquad


vquad trial step point trialsteppoint entri getentri gradient trust region center gradientattrustregioncent entri getentri

temp trial step point trialsteppoint entri getentri trial step point trialsteppoint entri getentri

temp half

vquad model deriv valu modelsecondderivativesvalu entri getentri temp



npt
comput 2nd power
work2 entri getentri
squar prevent test failur
vquad half model deriv paramet modelsecondderivativesparamet entri getentri

diff fopt vquad
diffc diffb
diffb diffa
diffa math ab diff
dnorm rho
nfsav evalu getevalu


pick delta trust region step

ntrit
vquad
math illeg state except mathillegalstateexcept local format localizedformat trust region step fail vquad

ratio fopt vquad
delta hdelta half delta
ratio ten
comput min
delta math min delta hdelta dnorm
ratio
comput max
delta math max delta hdelta dnorm

comput max
delta math max delta hdelta dnorm

delta rho
delta rho


recalcul knew denom fopt

fopt
ksav knew
densav denom
delsq delta delta
scaden
biglsq
knew
npt
hdiag
nptm
comput 2nd power
matrix zmatrix entri getentri
hdiag

comput 2nd power
lagrang valu point lagrangevaluesatnewpoint entri getentri
den beta hdiag
distsq

comput 2nd power
interpol point interpolationpoint entri getentri point newpoint entri getentri
distsq

comput max
comput 2nd power
distsq delsq
temp math max
temp den scaden
scaden temp den
knew
denom den

comput max
comput 2nd power
lagrang valu point lagrangevaluesatnewpoint entri getentri
temp
biglsq math max biglsq

scaden half biglsq
knew ksav
denom densav




updat bmat zmat knew interpol point
move updat deriv term model

updat beta denom knew


pqold model deriv paramet modelsecondderivativesparamet entri getentri knew
model deriv paramet modelsecondderivativesparamet set entri setentri knew

temp pqold interpol point interpolationpoint entri getentri knew

model deriv valu modelsecondderivativesvalu set entri setentri model deriv valu modelsecondderivativesvalu entri getentri temp interpol point interpolationpoint entri getentri knew



nptm
temp diff matrix zmatrix entri getentri knew
npt
model deriv paramet modelsecondderivativesparamet set entri setentri model deriv paramet modelsecondderivativesparamet entri getentri temp matrix zmatrix entri getentri



includ interpol point make gopt
xopt caus updat quadrat model

interpol point fatinterpolationpoint set entri setentri knew

interpol point interpolationpoint set entri setentri knew point newpoint entri getentri
work1 set entri setentri matrix bmatrix entri getentri knew

npt
suma
nptm
suma matrix zmatrix entri getentri knew matrix zmatrix entri getentri

sumb

sumb interpol point interpolationpoint entri getentri trust region center offset trustregioncenteroffset entri getentri

temp suma sumb

work1 set entri setentri work1 entri getentri temp interpol point interpolationpoint entri getentri



gradient trust region center gradientattrustregioncent set entri setentri gradient trust region center gradientattrustregioncent entri getentri diff work1 entri getentri


updat xopt gopt kopt calcul fopt

fopt
trust region center interpol point index trustregioncenterinterpolationpointindex knew
xoptsq


trust region center offset trustregioncenteroffset set entri setentri point newpoint entri getentri
comput 2nd power
trust region center offset trustregioncenteroffset entri getentri
xoptsq


gradient trust region center gradientattrustregioncent set entri setentri gradient trust region center gradientattrustregioncent entri getentri model deriv valu modelsecondderivativesvalu entri getentri trial step point trialsteppoint entri getentri

gradient trust region center gradientattrustregioncent set entri setentri gradient trust region center gradientattrustregioncent entri getentri model deriv valu modelsecondderivativesvalu entri getentri trial step point trialsteppoint entri getentri



npt
temp

temp interpol point interpolationpoint entri getentri trial step point trialsteppoint entri getentri

temp model deriv paramet modelsecondderivativesparamet entri getentri

gradient trust region center gradientattrustregioncent set entri setentri gradient trust region center gradientattrustregioncent entri getentri temp interpol point interpolationpoint entri getentri




calcul paramet frobeniu norm interpol
current data gradient interpol xopt put
vlag npt

ntrit
npt
lagrang valu point lagrangevaluesatnewpoint set entri setentri interpol point fatinterpolationpoint entri getentri interpol point fatinterpolationpoint entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex
work3 set entri setentri

nptm
sum
npt
sum matrix zmatrix entri getentri lagrang valu point lagrangevaluesatnewpoint entri getentri

npt
work3 set entri setentri work3 entri getentri sum matrix zmatrix entri getentri


npt
sum

sum interpol point interpolationpoint entri getentri trust region center offset trustregioncenteroffset entri getentri

work2 set entri setentri work3 entri getentri
work3 set entri setentri sum work3 entri getentri

gqsq
gisq

sum
npt
sum matrix bmatrix entri getentri
lagrang valu point lagrangevaluesatnewpoint entri getentri interpol point interpolationpoint entri getentri work3 entri getentri

trust region center offset trustregioncenteroffset entri getentri lower differ lowerdiffer entri getentri
comput min
comput 2nd power
math min gradient trust region center gradientattrustregioncent entri getentri
gqsq
comput 2nd power
math min sum
gisq
trust region center offset trustregioncenteroffset entri getentri upper differ upperdiffer entri getentri
comput max
comput 2nd power
math max gradient trust region center gradientattrustregioncent entri getentri
gqsq
comput 2nd power
math max sum
gisq

comput 2nd power
gradient trust region center gradientattrustregioncent entri getentri
gqsq
gisq sum sum

lagrang valu point lagrangevaluesatnewpoint set entri setentri npt sum


test replac quadrat model frobeniu
norm interpol make replac test satisfi

itest
gqsq ten gisq
itest

itest
max math max npt max

gradient trust region center gradientattrustregioncent set entri setentri lagrang valu point lagrangevaluesatnewpoint entri getentri npt

npt
model deriv paramet modelsecondderivativesparamet set entri setentri work2 entri getentri


model deriv valu modelsecondderivativesvalu set entri setentri

itest




trust region step provid suffici decreas
branch trust region calcul ntrit occur
interpol point reach altern step

ntrit
state

fopt ten vquad
state


altern find interpol point close
point

comput max
comput 2nd power
delta
comput 2nd power
ten rho
distsq math max


print state printstat xxx
knew
npt
sum

comput 2nd power
interpol point interpolationpoint entri getentri trust region center offset trustregioncenteroffset entri getentri
sum

sum distsq
knew
distsq sum



knew posit altmov find altern posit
knew interpol point distanc adelt xopt
reach label branch label
trust region iter calcul
current rho complet

knew
dist math sqrt distsq
ntrit
comput min
delta math min ten delta half dist
delta rho
delta rho


ntrit
comput max
comput min
math min ten dist delta
adelt math max rho
dsq adelt adelt
state

ntrit
state

ratio
state

math max delta dnorm rho
state


calcul current rho complet pick
valu rho delta


print state printstat xxx
rho stop trust region radiu stoppingtrustregionradiu
delta half rho
ratio rho stop trust region radiu stoppingtrustregionradiu
ratio sixteen
rho stop trust region radiu stoppingtrustregionradiu
ratio hundr fifti
rho math sqrt ratio stop trust region radiu stoppingtrustregionradiu

rho ten

delta math max delta rho
ntrit
nfsav evalu getevalu
state


return calcul newton raphson step


ntrit
state



print state printstat xxx
interpol point fatinterpolationpoint entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex fsave

comput min
comput max
lower bound lowerbound
origin shift originshift entri getentri trust region center offset trustregioncenteroffset entri getentri
math max
upper bound upperbound
current currentbest set entri setentri math min
trust region center offset trustregioncenteroffset entri getentri lower differ lowerdiffer entri getentri
current currentbest set entri setentri lower bound lowerbound

trust region center offset trustregioncenteroffset entri getentri upper differ upperdiffer entri getentri
current currentbest set entri setentri upper bound upperbound


interpol point fatinterpolationpoint entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex




math illeg state except mathillegalstateexcept local format localizedformat simpl messag bobyqb

bobyqb
















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































