

















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













































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































version truncat conjug gradient appli line
search restrict constraint procedur restart
valu variabl bound fix
trust region boundari reach made
dimension space span
current gradient xopt stai trust
region boundari termin occur reduct
close greatest reduct achiev
argument npt xpt xopt gopt
mean argument bobyqb
delta trust region radiu present calcul
seek small quadrat model distanc delta
xopt subject bound variabl
xnew set vector variabl approxim
minim quadrat model trust region
subject constraint variabl satisfi
equat bound activ calcul
calcul trial step xopt gener iter
initi xnew xopt iter
gnew hold gradient quadrat model xopt updat
updat
xbdi work space vector element xbdi
set nonzero
variabl fix bound bound
xbdi xbdi
inform accumul construct xnew
arrai hred work space hold
current search direct gradient
reduc reduc
compon fix variabl
dsq set squar length xnew xopt
crvmin set reach trust region boundari
set curvatur occur conjug
gradient search restrict constraint
crvmin 0d0 set search
constrain
param delta
param gnew
param xbdi
param
param
param hred

trsbox
delta
arrai real vector arrayrealvector gnew
arrai real vector arrayrealvector xbdi
arrai real vector arrayrealvector
arrai real vector arrayrealvector
arrai real vector arrayrealvector hred

print method printmethod xxx

current currentbest dimens getdimens
npt number interpol point numberofinterpolationpoint

dsq doubl nan
crvmin doubl nan

local variabl


dhd dh cth sh sth ssq beta sdec blen
iact
nact
angt qred
isav
temp xsav xsum angbd dredg sredg
iterc
resid delsq ggsav tempa tempb
redmax dredsq redsav gredsq rednew
itcsav
rdprev rdnext stplen stepsq
itermax

set constant

function bodi

sign gopt sign chang variabl
reduc xopt xbdi show
fix variabl bound initi
nact set number fix variabl gnew
set iter delsq upper bound sum
squar free variabl qred reduct

iterc
nact

xbdi set entri setentri
trust region center offset trustregioncenteroffset entri getentri lower differ lowerdiffer entri getentri
gradient trust region center gradientattrustregioncent entri getentri
xbdi set entri setentri minu

trust region center offset trustregioncenteroffset entri getentri upper differ upperdiffer entri getentri
gradient trust region center gradientattrustregioncent entri getentri
xbdi set entri setentri


xbdi entri getentri
nact

trial step point trialsteppoint set entri setentri
gnew set entri setentri gradient trust region center gradientattrustregioncent entri getentri

delsq delta delta
qred
crvmin minu

set search direct conjug gradient method
steepest descent direct initi iter
restart variabl fix bound
compon fix variabl itermax
upper bound indic conjug gradient iter

state

state

print state printstat xxx
beta


print state printstat xxx
stepsq

xbdi entri getentri
set entri setentri
beta
set entri setentri gnew entri getentri

set entri setentri beta entri getentri gnew entri getentri

comput 2nd power
entri getentri
stepsq

stepsq
state

beta
gredsq stepsq
itermax iterc nact

gredsq delsq qred qred
state


multipli search direct deriv matrix
calcul scalar choic steplength set blen
length step trust region boundari stplen
steplength ignor simpl bound

state


print state printstat xxx
resid delsq

sh

xbdi entri getentri
comput 2nd power
trial step point trialsteppoint entri getentri
resid
entri getentri trial step point trialsteppoint entri getentri
sh entri getentri entri getentri


resid
state

temp math sqrt stepsq resid

blen temp stepsq

blen resid temp

stplen blen
sh
comput min
stplen math min blen gredsq sh


reduc stplen order preserv simpl bound
let iact index constrain variabl

iact

entri getentri
xsum trust region center offset trustregioncenteroffset entri getentri trial step point trialsteppoint entri getentri
entri getentri
temp upper differ upperdiffer entri getentri xsum entri getentri

temp lower differ lowerdiffer entri getentri xsum entri getentri

temp stplen
stplen temp
iact




updat crvmin gnew set sdec decreas occur

sdec
stplen
iterc
temp sh stepsq
iact temp
crvmin math min crvmin temp
crvmin minu
crvmin temp


ggsav gredsq
gredsq

gnew set entri setentri gnew entri getentri stplen entri getentri
xbdi entri getentri
comput 2nd power
gnew entri getentri
gredsq

trial step point trialsteppoint set entri setentri trial step point trialsteppoint entri getentri stplen entri getentri

comput max
stplen ggsav half stplen sh
sdec math max
qred sdec


restart conjug gradient method hit bound

iact
nact
xbdi set entri setentri iact
entri getentri iact
xbdi set entri setentri iact minu

comput 2nd power
trial step point trialsteppoint entri getentri iact
delsq
delsq
state

state


stplen blen appli conjug
gradient iter return

stplen blen
iterc itermax
state

sdec qred
state

beta gredsq ggsav
state



print state printstat xxx
crvmin

prepar altern iter calcul scalar
multipli reduc deriv matrix
hold reduc call ggmult



print state printstat xxx
nact
state

dredsq
dredg
gredsq

xbdi entri getentri
comput 2nd power
trial step point trialsteppoint entri getentri
dredsq
dredg trial step point trialsteppoint entri getentri gnew entri getentri
comput 2nd power
gnew entri getentri
gredsq
set entri setentri trial step point trialsteppoint entri getentri

set entri setentri


itcsav iterc
state
search direct linear combin reduc
reduc orthogon reduc


print state printstat xxx
iterc
temp gredsq dredsq dredg dredg
temp qred qred
state

temp math sqrt temp

xbdi entri getentri
set entri setentri dredg trial step point trialsteppoint entri getentri dredsq gnew entri getentri temp

set entri setentri


sredg temp

simpl bound variabl calcul upper
bound tangent half angl altern iter
angbd free variabl reach
bound branch back label fix variabl

angbd
iact

xbdi entri getentri
tempa trust region center offset trustregioncenteroffset entri getentri trial step point trialsteppoint entri getentri lower differ lowerdiffer entri getentri
tempb upper differ upperdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri trial step point trialsteppoint entri getentri
tempa
nact
xbdi set entri setentri minu
state
tempb
nact
xbdi set entri setentri
state

comput 2nd power
trial step point trialsteppoint entri getentri
comput 2nd power
entri getentri
ssq
comput 2nd power
trust region center offset trustregioncenteroffset entri getentri lower differ lowerdiffer entri getentri
temp ssq
temp
temp math sqrt temp entri getentri
angbd temp tempa
angbd tempa temp
iact
xsav minu


comput 2nd power
upper differ upperdiffer entri getentri trust region center offset trustregioncenteroffset entri getentri
temp ssq
temp
temp math sqrt temp entri getentri
angbd temp tempb
angbd tempb temp
iact
xsav





calcul hhd curvatur altern iter

state


print state printstat xxx
sh
dh
dhd

xbdi entri getentri
sh entri getentri entri getentri
dh trial step point trialsteppoint entri getentri entri getentri
dhd trial step point trialsteppoint entri getentri hred entri getentri



seek greatest reduct rang equal space valu
angt angbd angt tangent half angl
altern iter

redmax
isav
redsav
angbd

angt angbd
sth angt angt angt angt
temp sh angt angt dhd dh dh
rednew sth angt dredg sredg half sth temp
rednew redmax
redmax rednew
isav
rdprev redsav
isav
rdnext rednew

redsav rednew


return reduct set sine cosin
angl altern iter calcul sdec

isav
state

isav
temp rdnext rdprev redmax redmax rdprev rdnext
angt angbd isav half temp

cth angt angt angt angt
sth angt angt angt angt
temp sh angt angt dhd dh dh
sdec sth angt dredg sredg half sth temp
sdec
state


updat gnew hred angl altern iter
restrict bound free variabl variabl fix
bound

dredg
gredsq

gnew set entri setentri gnew entri getentri cth hred entri getentri sth entri getentri
xbdi entri getentri
trial step point trialsteppoint set entri setentri cth trial step point trialsteppoint entri getentri sth entri getentri
dredg trial step point trialsteppoint entri getentri gnew entri getentri
comput 2nd power
gnew entri getentri
gredsq

hred set entri setentri cth hred entri getentri sth entri getentri

qred sdec
iact isav
nact
xbdi set entri setentri iact xsav
state


sdec suffici small return set xnew
xopt give care attent bound

sdec qred
state



print state printstat xxx
dsq

comput max
comput min
min math min trust region center offset trustregioncenteroffset entri getentri trial step point trialsteppoint entri getentri
upper differ upperdiffer entri getentri
point newpoint set entri setentri math max min lower differ lowerdiffer entri getentri
xbdi entri getentri minu
point newpoint set entri setentri lower differ lowerdiffer entri getentri

xbdi entri getentri
point newpoint set entri setentri upper differ upperdiffer entri getentri

trial step point trialsteppoint set entri setentri point newpoint entri getentri trust region center offset trustregioncenteroffset entri getentri
comput 2nd power
trial step point trialsteppoint entri getentri
dsq

dsq crvmin
instruct multipli current vector
deriv matrix quadrat model put product
reach part softwar
regard extern subroutin


print state printstat xxx


set entri setentri


set entri setentri entri getentri model deriv valu modelsecondderivativesvalu entri getentri entri getentri

set entri setentri entri getentri model deriv valu modelsecondderivativesvalu entri getentri entri getentri



real vector realvector tmp interpol point interpolationpoint oper eb multipli ebemultipli model deriv paramet modelsecondderivativesparamet
npt
model deriv paramet modelsecondderivativesparamet entri getentri

set entri setentri entri getentri tmp entri getentri interpol point interpolationpoint entri getentri



crvmin
state

iterc itcsav
state


hred set entri setentri entri getentri

state


math illeg state except mathillegalstateexcept local format localizedformat simpl messag trsbox


trsbox













































































































































































































