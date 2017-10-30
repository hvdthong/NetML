
















org apach common math od


common part rung kutta fehlberg
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

version rung kutta fehlberg integr rungekuttafehlbergintegr java 39z luc



rung kutta fehlberg integr rungekuttafehlbergintegr






































































































integr order differenti equat firstorderdifferentialequ equat


deriv except derivativeexcept integr except integratorexcept

saniti check
equat dimens getdimens length
integr except integratorexcept dimens mismatch od problem dimens
state vector dimens
string
integ string tostr equat dimens getdimens
integ string tostr length


math ab math max math ab math ab
integr except integratorexcept small integr interv length
string
doubl string tostr math ab



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
rung kutta step interpol rungekuttastepinterpol rki rung kutta step interpol rungekuttastepinterpol prototyp clone
rki reiniti equat tmp ytmp dot ydotk forward
interpol rki

interpol dummi step interpol dummystepinterpol tmp ytmp forward

interpol store time storetim

current currentt
hnew
time firsttim
step laststep
handler reset


interpol shift


error
loop loop

time firsttim fsal
stage
equat comput deriv computederiv current currentt dot ydotk


time firsttim
scale
vec absolut toler vecabsolutetoler
scale vec absolut toler vecabsolutetoler

scale length
scale length
scale scal absolut toler scalabsolutetoler


hnew initi step initializestep equat forward order getord scale
current currentt dot ydotk tmp ytmp dot ydotk
time firsttim


hnew

step adjust bound
forward current currentt
forward current currentt
current currentt


stage
stage

length
sum dot ydotk

sum dot ydotk

tmp ytmp sum


equat comput deriv computederiv current currentt tmp ytmp dot ydotk



estim state end step
length
sum dot ydotk
stage
sum dot ydotk

tmp ytmp sum


estim error end step
error estim error estimateerror dot ydotk tmp ytmp
error

switch function handl
interpol store time storetim current currentt
switch handler switcheshandl evalu step evaluatestep interpol
reject step match time
hnew switch handler switcheshandl event time geteventtim current currentt

accept step
loop



reject step attempt reduc error stepsiz control
factor math min max growth maxgrowth
math max min reduct minreduct
safeti math pow error exp
hnew filter step filterstep factor




step accept
current currentt
system arraycopi tmp ytmp length
switch handler switcheshandl step accept stepaccept current currentt
switch handler switcheshandl stop
step laststep

step laststep forward current currentt current currentt


provid step data step handler
interpol store time storetim current currentt
handler handl step handlestep interpol step laststep

fsal
save evalu step
system arraycopi dot ydotk stage dot ydotk length


switch handler switcheshandl reset current currentt step laststep
switch function trigger
invalid deriv recomput
equat comput deriv computederiv current currentt dot ydotk


step laststep
stepsiz control step
factor math min max growth maxgrowth
math max min reduct minreduct
safeti math pow error exp
scale scaledh factor
nextt current currentt scale scaledh
nextislast forward nextt nextt
hnew filter step filterstep scale scaledh nextislast


step laststep






































































