
















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

version revis date



embed rung kutta integr embeddedrungekuttaintegr




























































































































inherit doc inheritdoc
overrid
integr order differenti equat firstorderdifferentialequ equat


deriv except derivativeexcept integr except integratorexcept

saniti check sanitycheck equat
set equat setequ equat
reset evalu resetevalu
forward

creat intern work arrai
stage length

system arraycopi length

dot ydotk stage length
tmp ytmp length

set interpol share integr arrai
abstract step interpol abstractstepinterpol interpol
requir dens output requiresdenseoutput event handler manag eventshandlersmanag empti isempti
rung kutta step interpol rungekuttastepinterpol rki rung kutta step interpol rungekuttastepinterpol prototyp copi
rki reiniti tmp ytmp dot ydotk forward
interpol rki

interpol dummi step interpol dummystepinterpol tmp ytmp dot ydotk stage forward

interpol store time storetim

set integr control object
step start stepstart
hnew
time firsttim
step handler stephandl handler step handler stephandl
handler reset

combin event manag combinedeventsmanag manag add end time checker addendtimecheck event handler manag eventshandlersmanag
step laststep

main integr loop
step laststep

interpol shift

error
loop loop

time firsttim fsal
stage
comput deriv computederiv step start stepstart dot ydotk


time firsttim
scale main set dimens mainsetdimens
vec absolut toler vecabsolutetoler
scale length
scale scal absolut toler scalabsolutetoler scal rel toler scalrelativetoler math ab


scale length
scale vec absolut toler vecabsolutetoler vec rel toler vecrelativetoler math ab


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

discret event handl
interpol store time storetim step start stepstart step size stepsiz
manag evalu step evaluatestep interpol
manag event time geteventtim step start stepstart
math ab math ulp step start stepstart
simpli truncat step reject current comput
loop comput state truncat step
small due limit accuraci
code fail handl
set artifici size step copi state
interpol store time storetim step start stepstart
system arraycopi tmp ytmp length
hnew
step size stepsiz
loop

reject step match time
hnew


accept step
loop



reject step attempt reduc error stepsiz control
factor
math min max growth maxgrowth
math max min reduct minreduct safeti math pow error exp
hnew filter step filterstep step size stepsiz factor forward




step accept
step nextstep step start stepstart step size stepsiz
system arraycopi tmp ytmp length
manag step accept stepaccept step nextstep
step laststep manag stop

provid step data step handler
interpol store time storetim step nextstep
step handler stephandl handler step handler stephandl
handler handl step handlestep interpol step laststep

step start stepstart step nextstep

fsal
save evalu step
system arraycopi dot ydotk stage dot ydotk length


manag reset step start stepstart step laststep
event handler trigger
invalid deriv recomput
comput deriv computederiv step start stepstart dot ydotk


step laststep
rare case step size stepsiz
event occur integr start reduc step
reset step safe
step size stepsiz filter step filterstep step size stepsiz forward

stepsiz control step
factor math min max growth maxgrowth
math max min reduct minreduct
safeti math pow error exp
scale scaledh step size stepsiz factor
nextt step start stepstart scale scaledh
nextislast forward nextt nextt
hnew filter step filterstep scale scaledh forward nextislast




stop time stoptim step start stepstart
reset intern state resetinternalst
stop time stoptim











































