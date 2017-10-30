
















org apach common math od nonstiff








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

version



embed rung kutta integr embeddedrungekuttaintegr






























































































































inherit doc inheritdoc
overrid
integr order differenti equat firstorderdifferentialequ equat


math user except mathuserexcept integr except integratorexcept

saniti check sanitycheck equat
set equat setequ equat
reset evalu resetevalu
forward

creat intern work arrai
stage length

system arraycopi length

dot ydotk stage length
tmp ytmp length
dot tmp ydottmp length

set interpol share integr arrai
rung kutta step interpol rungekuttastepinterpol interpol rung kutta step interpol rungekuttastepinterpol prototyp copi
interpol reiniti tmp ytmp dot ydotk forward
interpol store time storetim

set integr control object
step start stepstart
hnew
time firsttim
step handler stephandl handler step handler stephandl
handler reset

set state initi setstateiniti

main integr loop
step islaststep


interpol shift

iter step size ensur local normal error smaller
error
error

time firsttim fsal
stage
comput deriv computederiv step start stepstart dot ydotk


time firsttim
scale main set dimens mainsetdimens
vec absolut toler vecabsolutetoler
scale length
scale scal absolut toler scalabsolutetoler scal rel toler scalrelativetoler fast math fastmath ab


scale length
scale vec absolut toler vecabsolutetoler vec rel toler vecrelativetoler fast math fastmath ab


hnew initi step initializestep equat forward order getord scale
step start stepstart dot ydotk tmp ytmp dot ydotk
time firsttim


step size stepsiz hnew

stage
stage

length
sum dot ydotk

sum dot ydotk

tmp ytmp step size stepsiz sum


comput deriv computederiv step start stepstart step size stepsiz tmp ytmp dot ydotk



estim state end step
length
sum dot ydotk
stage
sum dot ydotk

tmp ytmp step size stepsiz sum


estim error end step
error estim error estimateerror dot ydotk tmp ytmp step size stepsiz
error
reject step attempt reduc error stepsiz control
factor
fast math fastmath min max growth maxgrowth
fast math fastmath max min reduct minreduct safeti fast math fastmath pow error exp
hnew filter step filterstep step size stepsiz factor forward




local error small accept step trigger event step handler
interpol store time storetim step start stepstart step size stepsiz
system arraycopi tmp ytmp length
system arraycopi dot ydotk stage dot tmp ydottmp length
step start stepstart accept step acceptstep interpol dot tmp ydottmp

step islaststep

prepar step
interpol store time storetim step start stepstart

fsal
save evalu step
system arraycopi dot tmp ydottmp dot ydotk length


stepsiz control step
factor
fast math fastmath min max growth maxgrowth fast math fastmath max min reduct minreduct safeti fast math fastmath pow error exp
scale scaledh step size stepsiz factor
nextt step start stepstart scale scaledh
nextislast forward nextt nextt
hnew filter step filterstep scale scaledh forward nextislast

filter filterednextt step start stepstart hnew
filter filterednextislast forward filter filterednextt filter filterednextt
filter filterednextislast
hnew step start stepstart




step islaststep

stop time stoptim step start stepstart
reset intern state resetinternalst
stop time stoptim











































