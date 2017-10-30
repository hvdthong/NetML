
















org apach common math od


common part embed rung kutta
integr ordinari differenti equat

method embed explicit rung kutta method
set coeffici allow estim error butcher
arrai
pre

a21
a31 a32

as1 as2 ass


b'1 b'2 b' b'
pre


fact arrai defin b'j
comput directli error comput estim
compar

method qualifi fsal
method mean evalu deriv
step step
evalu reus step cost
method evalu method
stage behaviour success step
step reject error estim phase
evalu save fsal method
asi

version revis date



embed rung kutta integr embeddedrungekuttaintegr




































































































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
stage length

system arraycopi length

dot ydotk stage
stage
dot ydotk length

tmp ytmp length

set interpol share integr arrai
abstract step interpol abstractstepinterpol interpol
handler requir dens output requiresdenseoutput switch handler switcheshandl empti isempti
rung kutta step interpol rungekuttastepinterpol rki rung kutta step interpol rungekuttastepinterpol prototyp copi
rki reiniti equat tmp ytmp dot ydotk forward
interpol rki

interpol dummi step interpol dummystepinterpol tmp ytmp forward

interpol store time storetim

step start stepstart
hnew
time firsttim
step laststep
handler reset


interpol shift

error
loop loop

time firsttim fsal
stage
equat comput deriv computederiv step start stepstart dot ydotk


time firsttim
scale
vec absolut toler vecabsolutetoler
scale vec absolut toler vecabsolutetoler

scale length
scale length
scale scal absolut toler scalabsolutetoler


hnew initi step initializestep equat forward order getord scale
step start stepstart dot ydotk tmp ytmp dot ydotk
time firsttim


step size stepsiz hnew

step adjust bound
forward step start stepstart step size stepsiz
forward step start stepstart step size stepsiz
step size stepsiz step start stepstart


stage
stage

length
sum dot ydotk

sum dot ydotk

tmp ytmp step size stepsiz sum


equat comput deriv computederiv step start stepstart step size stepsiz tmp ytmp dot ydotk



estim state end step
length
sum dot ydotk
stage
sum dot ydotk

tmp ytmp step size stepsiz sum


estim error end step
error estim error estimateerror dot ydotk tmp ytmp step size stepsiz
error

switch function handl
interpol store time storetim step start stepstart step size stepsiz
switch handler switcheshandl evalu step evaluatestep interpol
reject step match time
hnew switch handler switcheshandl event time geteventtim step start stepstart

accept step
loop



reject step attempt reduc error stepsiz control
factor math min max growth maxgrowth
math max min reduct minreduct
safeti math pow error exp
hnew filter step filterstep step size stepsiz factor




step accept
step nextstep step start stepstart step size stepsiz
system arraycopi tmp ytmp length
switch handler switcheshandl step accept stepaccept step nextstep
switch handler switcheshandl stop
step laststep

step laststep forward step nextstep step nextstep


provid step data step handler
interpol store time storetim step nextstep
handler handl step handlestep interpol step laststep
step start stepstart step nextstep

fsal
save evalu step
system arraycopi dot ydotk stage dot ydotk length


switch handler switcheshandl reset step start stepstart step laststep
switch function trigger
invalid deriv recomput
equat comput deriv computederiv step start stepstart dot ydotk


step laststep
stepsiz control step
factor math min max growth maxgrowth
math max min reduct minreduct
safeti math pow error exp
scale scaledh step size stepsiz factor
nextt step start stepstart scale scaledh
nextislast forward nextt nextt
hnew filter step filterstep scale scaledh nextislast


step laststep

reset intern state resetinternalst






































































