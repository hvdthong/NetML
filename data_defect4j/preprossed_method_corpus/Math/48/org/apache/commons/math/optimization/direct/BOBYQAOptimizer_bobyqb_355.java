
















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

param xbase
param xpt
param fval
param xopt
param gopt
param
param
param bmat
param zmat
param
param
param xnew
param xalt
param
param vlag


bobyqb
arrai real vector arrayrealvector xbase
array2 row real matrix array2drowrealmatrix xpt
arrai real vector arrayrealvector fval
arrai real vector arrayrealvector xopt
arrai real vector arrayrealvector gopt
arrai real vector arrayrealvector
arrai real vector arrayrealvector
array2 row real matrix array2drowrealmatrix bmat
array2 row real matrix array2drowrealmatrix zmat
arrai real vector arrayrealvector
arrai real vector arrayrealvector
arrai real vector arrayrealvector xnew
arrai real vector arrayrealvector xalt
arrai real vector arrayrealvector
arrai real vector arrayrealvector vlag

system println bobyqb xxx

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

system gener local


local variabl



den rho sum diff beta gisq
knew
temp suma sumb bsum fopt
curv
ksav
gqsq dist sumw sumz diffa diffb diffc hdiag
kbase
delta adelt denom fsave bdtol delsq
nfsav
ratio dnorm vquad pqold
itest
sumpq scaden
errbig fracsq biglsq densav
bdtest
frhosq
distsq
ntrit

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

prelim current currentbest xbase
xpt fval gopt bmat
zmat
xoptsq

xopt set entri setentri xpt entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex
comput 2nd power
delta deltaon xopt entri getentri
xoptsq delta deltaon delta deltaon

fsave fval entri getentri
kbase

complet set requir iter procedur

rho initi trust region radiu initialtrustregionradiu
delta rho
ntrit
diffa
diffb
itest
nfsav evalu getevalu

updat gopt iter
call rescu make call calfun

state
state

trust region center interpol point index trustregioncenterinterpolationpointindex kbase




gopt set entri setentri gopt entri getentri entri getentri xopt entri getentri

gopt set entri setentri gopt entri getentri entri getentri xopt entri getentri



evalu getevalu npt
npt
temp

temp xpt entri getentri xopt entri getentri

temp entri getentri temp

gopt set entri setentri gopt entri getentri temp xpt entri getentri


path explor except pathisexploredexcept xxx



gener point trust region small
quadrat model subject constraint variabl
ntrit set number trust region iter
occur altern iter length
xnew xopt half rho branch
label ntrit calcul xnew



arrai real vector arrayrealvector gnew arrai real vector arrayrealvector
arrai real vector arrayrealvector xbdi arrai real vector arrayrealvector
arrai real vector arrayrealvector arrai real vector arrayrealvector
arrai real vector arrayrealvector arrai real vector arrayrealvector
arrai real vector arrayrealvector hred arrai real vector arrayrealvector

dsq crvmin dsqcrvmin trsbox xpt xopt gopt
delta xnew gnew xbdi
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
xnew entri getentri entri getentri
bdtest work1 entri getentri

xnew entri getentri entri getentri
bdtest work1 entri getentri

bdtest bdtol
curv entri getentri
npt
comput 2nd power
xpt entri getentri
curv entri getentri

bdtest half curv rho
bdtest bdtol
state



state

ntrit

sever cancel occur xopt xbase
test hold xbase shift xopt
made bmat
deriv current model begin bmat
depend zmat vlag temporarili work space



dsq xoptsq thousand
fracsq xoptsq
sumpq
real vector realvector sum vector sumvector
arrai real vector arrayrealvector npt half xoptsq add xpt oper xopt
npt
sumpq entri getentri
sum half xoptsq

sum xpt entri getentri xopt entri getentri

sum sum vector sumvector entri getentri xxx test acklei testacklei test diff pow testdiffpow fail
work2 set entri setentri sum
temp fracsq half sum

work1 set entri setentri bmat entri getentri
vlag set entri setentri sum xpt entri getentri temp xopt entri getentri
npt

bmat set entri setentri
bmat entri getentri
work1 entri getentri vlag entri getentri
vlag entri getentri work1 entri getentri




revis bmat depend zmat calcul

nptm
sumz
sumw
npt
sumz zmat entri getentri
vlag set entri setentri work2 entri getentri zmat entri getentri
sumw vlag entri getentri


sum fracsq sumz half sumw xopt entri getentri
npt
sum vlag entri getentri xpt entri getentri

work1 set entri setentri sum
npt
bmat set entri setentri
bmat entri getentri
sum zmat entri getentri



npt
temp work1 entri getentri

bmat set entri setentri
bmat entri getentri
temp work1 entri getentri




instruct complet shift includ
deriv paramet quadrat model



work1 set entri setentri half sumpq xopt entri getentri
npt
work1 set entri setentri work1 entri getentri entri getentri xpt entri getentri
xpt set entri setentri xpt entri getentri xopt entri getentri


set entri setentri
entri getentri
work1 entri getentri xopt entri getentri
xopt entri getentri work1 entri getentri
bmat set entri setentri npt bmat entri getentri npt




xbase set entri setentri xbase entri getentri xopt entri getentri
xnew set entri setentri xnew entri getentri xopt entri getentri
set entri setentri entri getentri xopt entri getentri
set entri setentri entri getentri xopt entri getentri
xopt set entri setentri

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

alpha cauchi alphacauchi altmov xpt xopt
bmat zmat
knew adelt xnew xalt
alpha alpha cauchi alphacauchi
cauchi alpha cauchi alphacauchi


set entri setentri xnew entri getentri xopt entri getentri


calcul vlag beta current choic scalar
product xpt held npt
vquad calcul



npt
suma
sumb
sum

suma xpt entri getentri entri getentri
sumb xpt entri getentri xopt entri getentri
sum bmat entri getentri entri getentri

work3 set entri setentri suma half suma sumb
vlag set entri setentri sum
work2 set entri setentri suma

beta
nptm
sum
npt
sum zmat entri getentri work3 entri getentri

beta sum sum
npt
vlag set entri setentri vlag entri getentri sum zmat entri getentri


dsq
bsum


comput 2nd power
entri getentri
dsq
sum
npt
sum work3 entri getentri bmat entri getentri

bsum sum entri getentri
npt

sum bmat entri getentri entri getentri

vlag set entri setentri sum
bsum sum entri getentri
entri getentri xopt entri getentri

beta dsq xoptsq half dsq beta bsum
vlag set entri setentri trust region center interpol point index trustregioncenterinterpolationpointindex vlag entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex

ntrit denomin increas replac
step altmov cauchi step rescu call
round error damag chosen denomin

ntrit
comput 2nd power
vlag entri getentri knew
denom alpha beta
denom cauchi cauchi

xnew set entri setentri xalt entri getentri
set entri setentri xnew entri getentri xopt entri getentri

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
zmat entri getentri
hdiag

comput 2nd power
vlag entri getentri
den beta hdiag
distsq

comput 2nd power
xpt entri getentri xopt entri getentri
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
vlag entri getentri
biglsq
temp
biglsq math max



put variabl calcul object function
xnew adjust bound

calcul object function xbase xnew
limit number calcul reach




comput min
comput max
lower bound lowerbound
xbase entri getentri xnew entri getentri
math max
upper bound upperbound
current currentbest set entri setentri math min
xnew entri getentri entri getentri
current currentbest set entri setentri lower bound lowerbound

xnew entri getentri entri getentri
current currentbest set entri setentri upper bound upperbound



comput object computeobjectivevalu current currentbest data getdata

minim isminim

ntrit
fsave
state


quadrat model predict chang due step
set diff error predict

fopt fval entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex
vquad


vquad entri getentri gopt entri getentri

temp entri getentri entri getentri

temp half temp

vquad entri getentri temp



npt
comput 2nd power
work2 entri getentri
squar prevent test failur
vquad half entri getentri

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
ratio ten
comput min
half delta
delta math min dnorm
ratio
comput max
half delta
delta math max dnorm

comput max
half delta
dnorm dnorm
delta math max

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
zmat entri getentri
hdiag

comput 2nd power
vlag entri getentri
den beta hdiag
distsq

comput 2nd power
xpt entri getentri xnew entri getentri
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
vlag entri getentri
biglsq
temp
biglsq math max

scaden half biglsq
knew ksav
denom densav




updat bmat zmat knew interpol point
move updat deriv term model

updat bmat zmat vlag
beta denom knew


pqold entri getentri knew
set entri setentri knew

temp pqold xpt entri getentri knew

set entri setentri entri getentri temp xpt entri getentri knew



nptm
temp diff zmat entri getentri knew
npt
set entri setentri entri getentri temp zmat entri getentri



includ interpol point make gopt
xopt caus updat quadrat model

fval set entri setentri knew

xpt set entri setentri knew xnew entri getentri
work1 set entri setentri bmat entri getentri knew

npt
suma
nptm
suma zmat entri getentri knew zmat entri getentri

sumb

sumb xpt entri getentri xopt entri getentri

temp suma sumb

work1 set entri setentri work1 entri getentri temp xpt entri getentri



gopt set entri setentri gopt entri getentri diff work1 entri getentri


updat xopt gopt kopt calcul fopt

fopt
trust region center interpol point index trustregioncenterinterpolationpointindex knew
xoptsq


xopt set entri setentri xnew entri getentri
comput 2nd power
xopt entri getentri
xoptsq


gopt set entri setentri gopt entri getentri entri getentri entri getentri

gopt set entri setentri gopt entri getentri entri getentri entri getentri



npt
temp

temp xpt entri getentri entri getentri

temp entri getentri temp

gopt set entri setentri gopt entri getentri temp xpt entri getentri




calcul paramet frobeniu norm interpol
current data gradient interpol xopt put
vlag npt

ntrit
npt
vlag set entri setentri fval entri getentri fval entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex
work3 set entri setentri

nptm
sum
npt
sum zmat entri getentri vlag entri getentri

npt
work3 set entri setentri work3 entri getentri sum zmat entri getentri


npt
sum

sum xpt entri getentri xopt entri getentri

work2 set entri setentri work3 entri getentri
work3 set entri setentri sum work3 entri getentri

gqsq
gisq

sum
npt
sum bmat entri getentri
vlag entri getentri xpt entri getentri work3 entri getentri

xopt entri getentri entri getentri
comput min

gopt entri getentri
comput 2nd power
math min
gqsq
comput 2nd power
math min sum
gisq
xopt entri getentri entri getentri
comput max

gopt entri getentri
comput 2nd power
math max
gqsq
comput 2nd power
math max sum
gisq

comput 2nd power
gopt entri getentri
gqsq
gisq sum sum

vlag set entri setentri npt sum


test replac quadrat model frobeniu
norm interpol make replac test satisfi

itest
gqsq ten gisq
itest

itest
max math max npt max

gopt set entri setentri vlag entri getentri npt

npt
set entri setentri work2 entri getentri


set entri setentri

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


knew
npt
sum

comput 2nd power
xpt entri getentri xopt entri getentri
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
ten delta
half dist
delta math min
delta rho
delta rho


ntrit
comput max
comput min
ten dist
math min delta
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


rho stop trust region radiu stoppingtrustregionradiu
delta half rho
ratio rho stop trust region radiu stoppingtrustregionradiu
ratio sixteen
rho stop trust region radiu stoppingtrustregionradiu
ratio hundr fifti
rho math sqrt ratio stop trust region radiu stoppingtrustregionradiu

rho ten rho

delta math max delta rho
ntrit
nfsav evalu getevalu
state


return calcul newton raphson step


ntrit
state



fval entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex fsave

comput min
comput max
lower bound lowerbound
xbase entri getentri xopt entri getentri
math max
upper bound upperbound
current currentbest set entri setentri math min
xopt entri getentri entri getentri
current currentbest set entri setentri lower bound lowerbound

xopt entri getentri entri getentri
current currentbest set entri setentri upper bound upperbound


fval entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex




math illeg state except mathillegalstateexcept local format localizedformat simpl messag bobyqb

bobyqb






















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































