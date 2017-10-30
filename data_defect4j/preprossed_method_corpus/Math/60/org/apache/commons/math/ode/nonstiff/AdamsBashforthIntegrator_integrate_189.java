
















org apach common math od nonstiff












explicit adam bashforth integr ordinari
differenti equat

adam bashforth method fact due adam explicit
multistep od solver implement variat classic
adapt stepsiz implement error control
classic implement fix step size state vector
step simpl combin step
deriv step depend number previou
step comput formula



3y'
23y' 16y' 5y'
55y' 59y' 37y' 9y'



step adam bashforth method order

implement detail

defin scale deriv step
pre
deriv
y'' deriv
y''' deriv

deriv
pre

definit classic represent previou
deriv let defin
pre

pre
omit index notat clariti definit
adam bashforth method written








classic represent deriv
implement nordsieck vector
higher degre scale deriv step
defin
pre

pre
omit index notat clariti


taylor seri formula show index offset
comput formula exact
degre polynomi
pre
sum
pre
previou formula valu comput transform
classic represent nordsieck vector transform
result taylor seri formula
pre

pre
vector time matrix built
term
pre





pre

nordsieck vector advantag

greatli simplifi step interpol interpol appli
taylor seri formula
simplifi step occur discret event truncat
step trigger
extend method order support adapt stepsiz


nordsieck vector step comput nordsieck vector step





row shift matrix lower left part ident matrix
pre







pre

vector matrix depend state
depend precomput

version revis date


adam bashforth integr adamsbashforthintegr adam integr adamsintegr












































inherit doc inheritdoc
overrid
integr order differenti equat firstorderdifferentialequ equat


math user except mathuserexcept integr except integratorexcept

length
saniti check sanitycheck equat
set equat setequ equat
reset evalu resetevalu
forward

initi work arrai

system arraycopi

dot ydot
tmp ytmp length

set interpol share integr arrai
nordsieck step interpol nordsieckstepinterpol interpol nordsieck step interpol nordsieckstepinterpol
interpol reiniti forward
nordsieck step interpol nordsieckstepinterpol interpol tmp interpolatortmp nordsieck step interpol nordsieckstepinterpol
interpol tmp interpolatortmp reiniti tmp ytmp forward

set integr control object
step handler stephandl handler step handler stephandl
handler reset

combin event manag combinedeventsmanag manag add end time checker addendtimecheck event handler manag eventshandlersmanag

comput initi nordsieck vector configur starter integr
start
interpol reiniti step start stepstart step size stepsiz scale nordsieck
interpol store time storetim step start stepstart
row lastrow nordsieck row dimens getrowdimens

reus step chosen starter integr
hnew step size stepsiz
interpol rescal hnew

step laststep
step laststep

shift data
interpol shift

error
loop loop

step size stepsiz hnew

evalu error term taylor expans
error
main set dimens mainsetdimens
scale yscale fast math fastmath ab
tol vec absolut toler vecabsolutetoler
scal absolut toler scalabsolutetoler scal rel toler scalrelativetoler scale yscale
vec absolut toler vecabsolutetoler vec rel toler vecrelativetoler scale yscale
ratio nordsieck entri getentri row lastrow tol
error ratio ratio

error fast math fastmath sqrt error main set dimens mainsetdimens

error

predict estim state step end
step end stepend step start stepstart step size stepsiz
interpol set interpol time setinterpolatedtim step end stepend
system arraycopi interpol interpol state getinterpolatedst tmp ytmp length

evalu deriv
comput deriv computederiv step end stepend tmp ytmp dot ydot

updat nordsieck vector
predict scale predictedsc length
length
predict scale predictedsc step size stepsiz dot ydot

array2 row real matrix array2drowrealmatrix nordsieck tmp nordsiecktmp updat high order deriv phase1 updatehighorderderivativesphase1 nordsieck
updat high order deriv phase2 updatehighorderderivativesphase2 scale predict scale predictedsc nordsieck tmp nordsiecktmp

discret event handl
interpol tmp interpolatortmp reiniti step end stepend step size stepsiz predict scale predictedsc nordsieck tmp nordsiecktmp
interpol tmp interpolatortmp store time storetim step start stepstart
interpol tmp interpolatortmp shift
interpol tmp interpolatortmp store time storetim step end stepend
manag evalu step evaluatestep interpol tmp interpolatortmp
manag event time geteventtim step start stepstart
fast math fastmath ab fast math fastmath ulp step start stepstart
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
interpol rescal hnew


accept step
scale predict scale predictedsc
nordsieck nordsieck tmp nordsiecktmp
interpol reiniti step end stepend step size stepsiz scale nordsieck
loop



reject step attempt reduc error stepsiz control
factor comput step grow shrink factor computestepgrowshrinkfactor error
hnew filter step filterstep step size stepsiz factor forward
interpol rescal hnew




step accept truncat
step nextstep step start stepstart step size stepsiz
system arraycopi tmp ytmp
interpol store time storetim step nextstep
manag step accept stepaccept step nextstep
step laststep manag stop

provid step data step handler
step handler stephandl handler step handler stephandl
interpol set interpol time setinterpolatedtim step nextstep
handler handl step handlestep interpol step laststep

step start stepstart step nextstep

step laststep manag reset step start stepstart

event handler trigger
invalid deriv restart scratch
start step start stepstart
interpol reiniti step start stepstart step size stepsiz scale nordsieck



step laststep
rare case step size stepsiz
event occur integr start reduc step
reset step safe
step size stepsiz filter step filterstep step size stepsiz forward

stepsiz control step
factor comput step grow shrink factor computestepgrowshrinkfactor error
scale scaledh step size stepsiz factor
nextt step start stepstart scale scaledh
nextislast forward nextt nextt
hnew filter step filterstep scale scaledh forward nextislast
interpol rescal hnew




stop time stoptim step start stepstart
step start stepstart doubl nan
step size stepsiz doubl nan
stop time stoptim




