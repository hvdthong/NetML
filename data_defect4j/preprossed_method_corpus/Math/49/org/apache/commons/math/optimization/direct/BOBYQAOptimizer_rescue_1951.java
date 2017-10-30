
















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






















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































ndim npt element arrai work space
element bmat zmat set condit
valu interpol point
element gopt revis valu
quadrat model

argument npt iprint maxfun xbase xpt fval xopt
gopt bmat zmat ndim mean
argument bobyqb entri rescu
maintain number call calfun
set maxfun prevent progress
kopt maintain fval kopt calcul function
correct entri updat
function found
xopt gopt made call program
delta current trust region radiu
vlag work space vector valu
provision lagrang function interpol point
part product requir vlag length ndim
ptsaux work space arrai ptsaux
ptsaux posit provision interpol
point nonzero step coordin
direct xbase xopt
step length delta length chosen
order satisfi bound variabl
ptsid work space arrai npt compon denot
provision posit origin interpol point
need restor linear independ
interpol condit point candid chang
ptsid nonzero
part ptsid ptsid multipli
posit step xbase xopt
interpol point ptsaux ptsaux
step ptsaux ptsaux case

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
param delta
param vlag

rescu
fortran arrai fortranarrai xbase
fortran matrix fortranmatrix xpt
fortran arrai fortranarrai fval
fortran arrai fortranarrai xopt
fortran arrai fortranarrai gopt
fortran arrai fortranarrai
fortran arrai fortranarrai
fortran matrix fortranmatrix bmat
fortran matrix fortranmatrix zmat
fortran arrai fortranarrai
fortran arrai fortranarrai
delta
fortran arrai fortranarrai vlag

system println rescu xxx

current currentbest dimens getdimens
npt number interpol point numberofinterpolationpoint
ndim bmat row dimens getrowdimens

fortran matrix fortranmatrix ptsaux fortran matrix fortranmatrix
fortran arrai fortranarrai ptsid fortran arrai fortranarrai npt

fortran arrai fortranarrai work1 fortran arrai fortranarrai npt origin npt
fortran arrai fortranarrai work2 fortran arrai fortranarrai origin npt npt
fortran arrai fortranarrai work3 fortran arrai fortranarrai npt origin npt npt npt


sfrac half
nptm npt

system gener local



local variabl


den
ihp
jpn kpt
sum diff beta
kold
winc
nrem knew
temp bsum
hdiag fbase denom vquad sumpq
dsqmin distsq vlmxsq

set constant

function bodi

shift interpol point xopt origin set
element zmat sumpq requir
updat squar distanc xopt
interpol point set end increment winc
ad squar balanc consider
choic point current

sumpq
winc
npt
distsq

xpt set entri setentri xpt entri getentri xopt entri getentri
comput 2nd power
xpt entri getentri
distsq

sumpq entri getentri
work3 set entri setentri distsq
winc math max winc distsq
nptm
zmat set entri setentri



updat defin deriv model
xbase shift trust region centr



work2 set entri setentri half sumpq xopt entri getentri
npt
work2 set entri setentri work2 entri getentri entri getentri xpt entri getentri



set entri setentri entri getentri work2 entri getentri xopt entri getentri work2 entri getentri xopt entri getentri



shift xbase xopt set element bmat
set element ptsaux


xbase set entri setentri xbase entri getentri xopt entri getentri
set entri setentri entri getentri xopt entri getentri
set entri setentri entri getentri xopt entri getentri
xopt set entri setentri
comput min
delta
entri getentri
ptsaux set entri setentri index offset math min
comput max
delta
entri getentri
ptsaux set entri setentri index offset math max
ptsaux entri getentri index offset ptsaux entri getentri index offset
temp ptsaux entri getentri index offset
ptsaux set entri setentri index offset ptsaux entri getentri index offset
ptsaux set entri setentri index offset temp

ptsaux entri getentri index offset
ptsaux entri getentri index offset
math ab half math ab
ptsaux set entri setentri index offset half ptsaux entri getentri index offset

ndim
bmat set entri setentri


fbase fval entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex

set identifi artifici interpol point
coordin direct xopt set
nonzero element bmat zmat

ptsid set entri setentri index offset sfrac


jpn
ptsid set entri setentri sfrac
jpn npt
ptsid set entri setentri jpn sfrac
temp ptsaux entri getentri index offset ptsaux entri getentri index offset
bmat set entri setentri temp ptsaux entri getentri index offset
bmat set entri setentri jpn temp ptsaux entri getentri index offset
bmat set entri setentri index offset bmat entri getentri bmat entri getentri jpn
ptsaux entri getentri index offset ptsaux entri getentri index offset
zmat set entri setentri index offset math sqrt math ab
zmat set entri setentri zmat entri getentri index offset
ptsaux entri getentri index offset temp
zmat set entri setentri jpn zmat entri getentri index offset
ptsaux entri getentri index offset temp

bmat set entri setentri index offset ptsaux entri getentri index offset
bmat set entri setentri ptsaux entri getentri index offset
comput 2nd power
ptsaux entri getentri index offset
bmat set entri setentri npt half



set remain identifi nonzero element zmat

npt
npt
half





ptsid set entri setentri
sfrac
temp ptsaux entri getentri index offset ptsaux entri getentri index offset
zmat set entri setentri index offset temp
zmat set entri setentri temp
zmat set entri setentri temp
zmat set entri setentri temp


nrem npt
kold
knew trust region center interpol point index trustregioncenterinterpolationpointindex

reorder provision point exchang ptsid kold
ptsid knew

state
state


temp bmat entri getentri kold
bmat set entri setentri kold bmat entri getentri knew
bmat set entri setentri knew temp

nptm
temp zmat entri getentri kold
zmat set entri setentri kold zmat entri getentri knew
zmat set entri setentri knew temp

ptsid set entri setentri kold ptsid entri getentri knew
ptsid set entri setentri knew
work3 set entri setentri knew
nrem
knew trust region center interpol point index trustregioncenterinterpolationpointindex
temp vlag entri getentri kold
vlag set entri setentri kold vlag entri getentri knew
vlag set entri setentri knew temp

updat bmat zmat matric statu knew
interpol point chang provision origin
branch label occur origin point reinstat
nonneg valu ndim requir search

updat bmat zmat vlag
beta denom knew

nrem


npt
work3 set entri setentri math ab work3 entri getentri



pick index knew origin interpol point
replac provision interpol point give
attent close xopt previou knew


dsqmin
npt
work3 entri getentri

dsqmin
dsqmin
knew
dsqmin



dsqmin
state


form vector chosen origin interpol point


work2 set entri setentri xpt entri getentri knew

npt
sum
trust region center interpol point index trustregioncenterinterpolationpointindex
ptsid entri getentri

sum work2 entri getentri xpt entri getentri


ptsid entri getentri

sum work2 entri getentri ptsaux entri getentri index offset

ptsid entri getentri

index offset

index offset

sum work2 entri getentri ptsaux entri getentri


work1 set entri setentri half sum sum


calcul vlag beta requir updat matrix
xpt knew reinstat set interpol point

npt
sum

sum bmat entri getentri work2 entri getentri

vlag set entri setentri sum

beta
nptm
sum
npt
sum zmat entri getentri work1 entri getentri

beta sum sum
npt
vlag set entri setentri vlag entri getentri sum zmat entri getentri


bsum
distsq

sum
npt
sum bmat entri getentri work1 entri getentri

npt
bsum sum work2 entri getentri

sum bmat entri getentri npt work2 entri getentri

bsum sum work2 entri getentri
vlag set entri setentri sum
comput 2nd power
xpt entri getentri knew
distsq

beta half distsq distsq beta bsum
vlag set entri setentri trust region center interpol point index trustregioncenterinterpolationpointindex vlag entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex

kold set index provision interpol point
delet make knew origin interpol
point choic kold govern avoid small
denomin updat calcul updat

denom
vlmxsq
npt
ptsid entri getentri
hdiag
nptm
comput 2nd power
zmat entri getentri
hdiag

comput 2nd power
vlag entri getentri
den beta hdiag
den denom
kold
denom den


comput max
comput 2nd power
vlag entri getentri
vlmxsq math max vlmxsq

denom vlmxsq
work3 set entri setentri knew work3 entri getentri knew winc
state

state

label reach posit interpol
point chosen includ
xpt bmat zmat matric complet
shift xbase updat quadrat model remain
cycl interpol point begin
put point xpt kpt set kpt
return occur maxfun prohibit



kpt kpt npt kpt
ptsid entri getentri kpt




work2 set entri setentri xpt entri getentri kpt
xpt set entri setentri kpt
temp entri getentri kpt work2 entri getentri


set entri setentri entri getentri temp work2 entri getentri


set entri setentri kpt
ptsid entri getentri kpt
ptsid entri getentri kpt

ptsaux entri getentri index offset
xpt set entri setentri kpt


ptsaux entri getentri index offset

ptsaux entri getentri index offset

xpt set entri setentri kpt


set vquad current model point

vquad fbase

ihp
vquad gopt entri getentri half entri getentri ihp


ihq
vquad gopt entri getentri half entri getentri ihq

iiw math max ihp ihq math ab
vquad entri getentri iiw


npt
temp

temp xpt entri getentri


temp xpt entri getentri

vquad half entri getentri temp temp


calcul interpol point set diff factor
multipli kpt lagrang function model
updat provid interpol function


comput min
comput max
lower bound lowerbound f2jai
xbase entri getentri xpt entri getentri kpt
math max
upper bound upperbound f2jai
work2 set entri setentri math min
xpt entri getentri kpt entri getentri
work2 set entri setentri lower bound lowerbound f2jai

xpt entri getentri kpt entri getentri
work2 set entri setentri upper bound upperbound f2jai



comput object computeobjectivevalu work2 data getdata

minim isminim

fval set entri setentri kpt
fval entri getentri trust region center interpol point index trustregioncenterinterpolationpointindex
trust region center interpol point index trustregioncenterinterpolationpointindex kpt

diff vquad

updat quadrat model return subroutin occur
interpol point includ model


gopt set entri setentri gopt entri getentri diff bmat entri getentri kpt

npt
sum
nptm
sum zmat entri getentri zmat entri getentri kpt

temp diff sum
ptsid entri getentri
set entri setentri entri getentri temp

ptsid entri getentri
ptsid entri getentri
ihq

comput 2nd power
ptsaux entri getentri index offset
set entri setentri ihq entri getentri ihq temp

ihp
comput 2nd power
ptsaux entri getentri index offset
set entri setentri ihp entri getentri ihp temp

comput 2nd power
ptsaux entri getentri index offset
set entri setentri ihq entri getentri ihq temp
math max ihp ihq math ab
set entri setentri entri getentri
temp ptsaux entri getentri index offset ptsaux entri getentri index offset




ptsid set entri setentri kpt



rescu








































































































































































































































































































































































































































































































































































































































































































































































































