
















org apach common math od nonstiff











gragg bulirsch stoer integr
ordinari differenti equat

gragg bulirsch stoer algorithm effici
smooth problem richardson
extrapol estim solut step
size decreas


method step size order
integr order minim comput cost
suit high precis need
limit method effici high order
embed rung kutta method link dormand prince853 integr dormandprince853integr
dormand princ depend problem result
hairer norsett wanner book show limit
occur accuraci integr saltzam lorenz
equat author note problem extrem sensit
error integr step
dimension celesti mechan problem
bodi pleiad problem involv quasi collis
automat step size control essenti



implement basic reimplement java

href http www unig math folk hairer prog nonstiff odex odex
fortran code hairer wanner redistribut polici
code
href http www unig hairer prog licenc txt
conveni reproduc


tabl border width cellpad align center bgcolor e0e0e0
copyright ernst hairer

redistribut sourc binari form
modif permit provid
condit met

redistribut sourc code retain copyright
notic list condit disclaim
redistribut binari form reproduc copyright
notic list condit disclaim
document materi provid distribut


strong softwar provid copyright holder
contributor express impli warranti includ
limit impli warranti merchant fit
purpos disclaim event regent
contributor liabl direct indirect incident special
exemplari consequenti damag includ limit
procur substitut good servic loss data
profit busi interrupt caus theori
liabil contract strict liabil tort includ
neglig aris
softwar advis possibl damag strong
tabl

version



gragg bulirsch stoer integr graggbulirschstoerintegr adapt stepsiz integr adaptivestepsizeintegr






























































































































































































































































































































































































































































inherit doc inheritdoc
overrid
integr expand state od expandablestatefulod equat
math illeg state except mathillegalstateexcept math illeg argument except mathillegalargumentexcept

saniti check sanitycheck equat
set equat setequ equat
forward equat time gettim

creat intern work arrai
equat complet state getcompletest
clone
dot0 ydot0 length
length
tmp ytmp length
tmp dot ytmpdot length

diagon sequenc length
diag y1diag sequenc length
sequenc length
diagon length
diag y1diag length


sequenc length
sequenc length

sequenc

substep start point share arrai
dot0 ydot0

sequenc
length





system arraycopi length


dot1 ydot1 length
mid dot ymiddot sequenc length length

initi scale
scale main set dimens mainsetdimens
rescal scale

initi order select
tol
vec rel toler vecrelativetoler scal rel toler scalrelativetoler vec rel toler vecrelativetoler
log10 log10r fast math fastmath log10 fast math fastmath max tol
target iter targetit fast math fastmath max
fast math fastmath min sequenc length
fast math fastmath floor log10 log10r

set interpol share integr arrai
abstract step interpol abstractstepinterpol interpol
gragg bulirsch stoer step interpol graggbulirschstoerstepinterpol dot0 ydot0
dot1 ydot1
mid dot ymiddot forward
equat primari mapper getprimarymapp
equat secondari mapper getsecondarymapp
interpol store time storetim equat time gettim

step start stepstart equat time gettim
hnew
max error maxerror doubl max
previou reject previousreject
time firsttim
step newstep
step comput firststepalreadycomput
init integr initintegr equat time gettim
cost time unit costpertimeunit
step islaststep


error
reject

step newstep

interpol shift

evalu begin step
step comput firststepalreadycomput
comput deriv computederiv step start stepstart dot0 ydot0


time firsttim
hnew initi step initializestep forward target iter targetit scale
step start stepstart dot0 ydot0 tmp ytmp tmp dot ytmpdot


step newstep



step size stepsiz hnew

step adjust bound
forward step start stepstart step size stepsiz
forward step start stepstart step size stepsiz
step size stepsiz step start stepstart

nextt step start stepstart step size stepsiz
step islaststep forward nextt nextt

iter substep size

loop loop



modifi midpoint integr current substep
step trystep step start stepstart step size stepsiz scale
mid dot ymiddot diagon
diag y1diag
tmp ytmp

stabil check fail reduc global step
hnew fast math fastmath ab filter step filterstep step size stepsiz stabil reduct stabilityreduct forward
reject
loop



substep comput successfulli


extrapol state end step
iter data
extrapol diag y1diag
rescal scale

estim error end step
error
main set dimens mainsetdimens
fast math fastmath ab diag y1diag scale
error

error fast math fastmath sqrt error main set dimens mainsetdimens

error 0e15 error max error maxerror
error big reduc global step
hnew fast math fastmath ab filter step filterstep step size stepsiz stabil reduct stabilityreduct forward
reject
loop


max error maxerror fast math fastmath max error

comput optim stepsiz order
exp
fac step control2 stepcontrol2 fast math fastmath pow error step control1 stepcontrol1 exp
pow fast math fastmath pow step control3 stepcontrol3 exp
fac fast math fastmath max pow step control4 stepcontrol4 fast math fastmath min pow fac
optim step optimalstep fast math fastmath ab filter step filterstep step size stepsiz fac forward
cost time unit costpertimeunit cost step costperstep optim step optimalstep

check converg
target iter targetit


target iter targetit previou reject previousreject

check stop iter
error
converg reach target iter targetit
loop

estim chanc converg
reach iter
asymptot evolut error
ratio sequenc target iter targetit sequenc target iter targetit
sequenc sequenc
error ratio ratio
expect converg iter
reject step immedi reduc order
reject
loop
target iter targetit
target iter targetit
cost time unit costpertimeunit target iter targetit
order control1 ordercontrol1 cost time unit costpertimeunit target iter targetit
target iter targetit

hnew optim step optimalstep target iter targetit






error
converg reach target iter targetit
loop

estim chanc converg
reach iter
asymptot evolut error
ratio sequenc sequenc
error ratio ratio
expect converg iter
reject step immedi
reject
loop
target iter targetit
cost time unit costpertimeunit target iter targetit
order control1 ordercontrol1 cost time unit costpertimeunit target iter targetit
target iter targetit

hnew optim step optimalstep target iter targetit





error
reject
target iter targetit
cost time unit costpertimeunit target iter targetit
order control1 ordercontrol1 cost time unit costpertimeunit target iter targetit
target iter targetit

hnew optim step optimalstep target iter targetit

loop



time firsttim step islaststep error
loop










reject
deriv end step
comput deriv computederiv step start stepstart step size stepsiz dot1 ydot1


dens output handl
int hint max step getmaxstep
reject

extrapol state middl point step

extrapol diagon mid dot ymiddot


mudif



deriv middl point step

factor fast math fastmath pow sequenc
middl index middleindex length
length
mid dot ymiddot factor middl index middleindex


factor fast math fastmath pow sequenc
middl index middleindex length
length
diagon factor middl index middleindex

extrapol diagon mid dot ymiddot

length
mid dot ymiddot step size stepsiz


comput center differ evalu deriv

length
length









estim dens output coeffici
gragg bulirsch stoer step interpol graggbulirschstoerstepinterpol gb interpol gbsinterpol
gragg bulirsch stoer step interpol graggbulirschstoerstepinterpol interpol
gb interpol gbsinterpol comput coeffici computecoeffici step size stepsiz

interpol error useinterpolationerror
interpol error limit stepsiz
interp error interperror gb interpol gbsinterpol estim error estimateerror scale
int hint fast math fastmath ab step size stepsiz fast math fastmath max fast math fastmath pow interp error interperror

interp error interperror
hnew int hint
reject







reject

discret event handl
interpol store time storetim step start stepstart step size stepsiz
step start stepstart accept step acceptstep interpol dot1 ydot1

prepar step
interpol store time storetim step start stepstart
system arraycopi length
system arraycopi dot1 ydot1 dot0 ydot0 length
step comput firststepalreadycomput

optim iter optimalit

optim iter optimalit
previou reject previousreject
optim iter optimalit

target iter targetit
optim iter optimalit
cost time unit costpertimeunit order control1 ordercontrol1 cost time unit costpertimeunit
optim iter optimalit
cost time unit costpertimeunit order control2 ordercontrol2 cost time unit costpertimeunit
optim iter optimalit fast math fastmath min sequenc length


optim iter optimalit

cost time unit costpertimeunit order control1 ordercontrol1 cost time unit costpertimeunit
optim iter optimalit

cost time unit costpertimeunit order control2 ordercontrol2 cost time unit costpertimeunit optim iter optimalit
optim iter optimalit fast math fastmath min sequenc length



previou reject previousreject
reject step order stepsiz
increas
target iter targetit fast math fastmath min optim iter optimalit
hnew fast math fastmath min fast math fastmath ab step size stepsiz optim step optimalstep target iter targetit

stepsiz control
optim iter optimalit
hnew optim step optimalstep optim iter optimalit

target iter targetit
cost time unit costpertimeunit order control2 ordercontrol2 cost time unit costpertimeunit
hnew filter step filterstep optim step optimalstep cost step costperstep optim iter optimalit cost step costperstep
forward

hnew filter step filterstep optim step optimalstep cost step costperstep optim iter optimalit cost step costperstep
forward



target iter targetit optim iter optimalit



step newstep



hnew fast math fastmath min hnew int hint
forward
hnew hnew


time firsttim

reject
step islaststep
previou reject previousreject

previou reject previousreject


step islaststep

dispatch result
equat set time settim step start stepstart
equat set complet state setcompletest

reset intern state resetinternalst




