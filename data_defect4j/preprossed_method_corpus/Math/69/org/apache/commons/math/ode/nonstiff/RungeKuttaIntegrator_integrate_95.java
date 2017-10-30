
















org apach common math od nonstiff












common part fix step rung kutta
integr ordinari differenti equat

method explicit rung kutta method butcher
arrai
pre

a21
a31 a32

as1 as2 ass


pre


euler integr eulerintegr
classic rung kutta integr classicalrungekuttaintegr
gill integr gillintegr
midpoint integr midpointintegr
version revis date



rung kutta integr rungekuttaintegr abstract integr abstractintegr






































inherit doc inheritdoc
integr order differenti equat firstorderdifferentialequ equat


deriv except derivativeexcept integr except integratorexcept

saniti check sanitycheck equat
set equat setequ equat
reset evalu resetevalu
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
requir dens output requiresdenseoutput event handler manag eventshandlersmanag empti isempti
rung kutta step interpol rungekuttastepinterpol rki rung kutta step interpol rungekuttastepinterpol prototyp copi
rki reiniti tmp ytmp dot ydotk forward
interpol rki

interpol dummi step interpol dummystepinterpol tmp ytmp dot ydotk stage forward

interpol store time storetim

set integr control object
step start stepstart
step size stepsiz forward step step
step handler stephandl handler step handler stephandl
handler reset

combin event manag combinedeventsmanag manag add end time checker addendtimecheck event handler manag eventshandlersmanag
step laststep

main integr loop
step laststep

interpol shift

loop loop

stage
comput deriv computederiv step start stepstart dot ydotk

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
step size stepsiz
loop

reject step match time
step size stepsiz


loop




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

manag reset step start stepstart step laststep
event handler trigger
invalid deriv recomput
comput deriv computederiv step start stepstart dot ydotk


make step size set step
step size stepsiz forward step step



stop time stoptim step start stepstart
step start stepstart doubl nan
step size stepsiz doubl nan
stop time stoptim




