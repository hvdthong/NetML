
















org apach common math od nonstiff














implicit adam moulton integr ordinari
differenti equat

adam moulton method fact due adam implicit
multistep od solver implement variat classic
adapt stepsiz implement error control
classic implement fix step size state vector
step simpl combin step
deriv step need
comput method comput
estim comput comput
estim formula depend
number previou step comput
formula estim



5y' 8y'
9y' 19y' 5y'



step adam moulton method order

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
adam moulton method written








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


predict nordsieck vector step comput nordsieck vector step






row shift matrix lower left part ident matrix
pre







pre
predict vector correct vector comput

plusmn



upper repres
predict state lower
repres correct state

vector matrix depend state
depend precomput

version


adam moulton integr adamsmoultonintegr adam integr adamsintegr

















































inherit doc inheritdoc
overrid
integr order differenti equat firstorderdifferentialequ equat


math illeg state except mathillegalstateexcept math illeg argument except mathillegalargumentexcept

length
saniti check sanitycheck equat
set equat setequ equat
reset evalu resetevalu
forward

initi work arrai

system arraycopi

dot ydot length
tmp ytmp length
predict scale predictedsc length
array2 row real matrix array2drowrealmatrix nordsieck tmp nordsiecktmp

set interpol share integr arrai
nordsieck step interpol nordsieckstepinterpol interpol nordsieck step interpol nordsieckstepinterpol
interpol reiniti forward

set integr control object
step handler stephandl handler step handler stephandl
handler reset

set state initi setstateiniti

comput initi nordsieck vector configur starter integr
start
interpol reiniti step start stepstart step size stepsiz scale nordsieck
interpol store time storetim step start stepstart

hnew step size stepsiz
interpol rescal hnew

step islaststep


error
error

step size stepsiz hnew

predict estim state step end pece sequenc
step end stepend step start stepstart step size stepsiz
interpol set interpol time setinterpolatedtim step end stepend
system arraycopi interpol interpol state getinterpolatedst tmp ytmp length

evalu estim deriv pece sequenc
comput deriv computederiv step end stepend tmp ytmp dot ydot

updat nordsieck vector
length
predict scale predictedsc step size stepsiz dot ydot

nordsieck tmp nordsiecktmp updat high order deriv phase1 updatehighorderderivativesphase1 nordsieck
updat high order deriv phase2 updatehighorderderivativesphase2 scale predict scale predictedsc nordsieck tmp nordsiecktmp

appli correct pece sequenc
error nordsieck tmp nordsiecktmp walk optim order walkinoptimizedord corrector predict scale predictedsc tmp ytmp

error
reject step attempt reduc error stepsiz control
factor comput step grow shrink factor computestepgrowshrinkfactor error
hnew filter step filterstep step size stepsiz factor forward
interpol rescal hnew



evalu estim deriv pece sequenc
step end stepend step start stepstart step size stepsiz
comput deriv computederiv step end stepend tmp ytmp dot ydot

updat nordsieck vector
correct scale correctedsc length
length
correct scale correctedsc step size stepsiz dot ydot

updat high order deriv phase2 updatehighorderderivativesphase2 predict scale predictedsc correct scale correctedsc nordsieck tmp nordsiecktmp

discret event handl
system arraycopi tmp ytmp
interpol reiniti step end stepend step size stepsiz correct scale correctedsc nordsieck tmp nordsiecktmp
interpol store time storetim step start stepstart
interpol shift
interpol store time storetim step end stepend
step start stepstart accept step acceptstep interpol dot ydot
scale correct scale correctedsc
nordsieck nordsieck tmp nordsiecktmp

step islaststep

prepar step
interpol store time storetim step start stepstart

reset occur resetoccur
event handler trigger
invalid deriv restart scratch
start step start stepstart
interpol reiniti step start stepstart step size stepsiz scale nordsieck



stepsiz control step
factor comput step grow shrink factor computestepgrowshrinkfactor error
scale scaledh step size stepsiz factor
nextt step start stepstart scale scaledh
nextislast forward nextt nextt
hnew filter step filterstep scale scaledh forward nextislast

filter filterednextt step start stepstart hnew
filter filterednextislast forward filter filterednextt filter filterednextt
filter filterednextislast
hnew step start stepstart


interpol rescal hnew


step islaststep

stop time stoptim step start stepstart
step start stepstart doubl nan
step size stepsiz doubl nan
stop time stoptim


















































































