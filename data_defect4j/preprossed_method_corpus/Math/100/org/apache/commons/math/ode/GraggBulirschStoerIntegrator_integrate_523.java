
















org apach common math od


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

author hairer wanner fortran version
version revis date



gragg bulirsch stoer integr graggbulirschstoerintegr



































































































































































































































































































































































































































integr differenti equat time
method solv initi problem ivp
method store intern state variabl made
integr link
current sign stepsiz getcurrentsignedsteps thread safe
param equat differenti equat integr
param initi time
param initi state vector
param target time integr
set smaller code code backward integr
param placehold put state vector success
step end integr object
integr except integratorexcept integr perform integr
deriv except derivativeexcept except propag caller
underli user function trigger

integr order differenti equat firstorderdifferentialequ equat

deriv except derivativeexcept integr except integratorexcept

saniti check sanitycheck equat
forward

creat intern work arrai
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


dot1 ydot1
mid dot ymiddot
dens output denseoutput
dot1 ydot1 length
mid dot ymiddot sequenc length
mid dot ymiddot length
mid dot ymiddot length


mid dot ymiddot
mid dot ymiddot length


initi scale
scale length
rescal scale

initi order select
tol
vec rel toler vecrelativetoler scal rel toler scalrelativetoler vec rel toler vecrelativetoler
log10 log10r math log math max tol math log
target iter targetit math max
math min sequenc length
math floor log10 log10r
set interpol share integr arrai
abstract step interpol abstractstepinterpol interpol
dens output denseoutput switch handler switcheshandl empti isempti
interpol gragg bulirsch stoer step interpol graggbulirschstoerstepinterpol dot0 ydot0
dot1 ydot1
mid dot ymiddot forward

interpol dummi step interpol dummystepinterpol forward

interpol store time storetim

step start stepstart
hnew
max error maxerror doubl max
previou reject previousreject
time firsttim
step newstep
step laststep
step comput firststepalreadycomput
handler reset
cost time unit costpertimeunit
step laststep

error
reject

step newstep

interpol shift

evalu begin step
step comput firststepalreadycomput
equat comput deriv computederiv step start stepstart dot0 ydot0


time firsttim

hnew initi step initializestep equat forward
target iter targetit scale
step start stepstart dot0 ydot0 tmp ytmp tmp dot ytmpdot

forward
hnew hnew




step newstep



step size stepsiz hnew

step adjust bound
forward step start stepstart step size stepsiz
forward step start stepstart step size stepsiz
step size stepsiz step start stepstart

nextt step start stepstart step size stepsiz
step laststep forward nextt nextt

iter substep size

loop loop



modifi midpoint integr current substep
step trystep equat step start stepstart step size stepsiz scale
mid dot ymiddot diagon
diag y1diag
tmp ytmp

stabil check fail reduc global step
hnew math ab filter step filterstep step size stepsiz stabil reduct stabilityreduct
reject
loop



substep comput successfulli


extrapol state end step
iter data
extrapol diag y1diag
rescal scale

estim error end step
error
length
math ab diag y1diag scale
error

error math sqrt error length

error 0e15 error max error maxerror
error big reduc global step
hnew math ab filter step filterstep step size stepsiz stabil reduct stabilityreduct
reject
loop


max error maxerror math max error

comput optim stepsiz order
exp
fac step control2 stepcontrol2 math pow error step control1 stepcontrol1 exp
pow math pow step control3 stepcontrol3 exp
fac math max pow step control4 stepcontrol4 math min pow fac
optim step optimalstep math ab filter step filterstep step size stepsiz fac
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
ratio sequenc sequenc
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



time firsttim step laststep error
loop










dens output handl
int hint max step getmaxstep
dens output denseoutput reject

extrapol state middl point step

extrapol diagon mid dot ymiddot


deriv end step
equat comput deriv computederiv step start stepstart step size stepsiz dot1 ydot1

mudif



deriv middl point step

factor math pow sequenc
middl index middleindex length
length
mid dot ymiddot factor middl index middleindex


factor math pow sequenc
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
int hint math ab step size stepsiz math max math pow interp error interperror

interp error interperror
hnew int hint
reject



switch function handl
reject
interpol store time storetim step start stepstart step size stepsiz
switch handler switcheshandl evalu step evaluatestep interpol
reject
hnew math ab switch handler switcheshandl event time geteventtim step start stepstart





reject
reus slope begin step
step comput firststepalreadycomput
system arraycopi dot1 ydot1 dot0 ydot0 length




reject

store end step state
step nextstep step start stepstart step size stepsiz
system arraycopi length

switch handler switcheshandl step accept stepaccept step nextstep
switch handler switcheshandl stop
step laststep


provid step data step handler
interpol store time storetim step nextstep
handler handl step handlestep interpol step laststep
step start stepstart step nextstep

switch handler switcheshandl reset step start stepstart step laststep
switch function trigger
invalid deriv recomput
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
optim iter optimalit math min sequenc length


optim iter optimalit

cost time unit costpertimeunit order control1 ordercontrol1 cost time unit costpertimeunit
optim iter optimalit

cost time unit costpertimeunit order control2 ordercontrol2 cost time unit costpertimeunit optim iter optimalit
optim iter optimalit math min sequenc length



previou reject previousreject
reject step order stepsiz
increas
target iter targetit math min optim iter optimalit
hnew math min math ab step size stepsiz optim step optimalstep target iter targetit

stepsiz control
optim iter optimalit
hnew optim step optimalstep optim iter optimalit

target iter targetit
cost time unit costpertimeunit order control2 ordercontrol2 cost time unit costpertimeunit
hnew filter step filterstep optim step optimalstep
cost step costperstep optim iter optimalit cost step costperstep


hnew filter step filterstep optim step optimalstep
cost step costperstep optim iter optimalit cost step costperstep




target iter targetit optim iter optimalit



step newstep



hnew math min hnew int hint
forward
hnew hnew


time firsttim

reject
step laststep
previou reject previousreject

previou reject previousreject


































































