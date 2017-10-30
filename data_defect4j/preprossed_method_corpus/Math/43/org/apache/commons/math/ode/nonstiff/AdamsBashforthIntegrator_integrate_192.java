
















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

version


adam bashforth integr adamsbashforthintegr adam integr adamsintegr
















































inherit doc inheritdoc
overrid
integr expand state od expandablestatefulod equat
math illeg state except mathillegalstateexcept math illeg argument except mathillegalargumentexcept

saniti check sanitycheck equat
set equat setequ equat
reset evalu resetevalu
forward equat time gettim

initi work arrai
equat complet state getcompletest
clone
dot ydot length

set interpol share integr arrai
nordsieck step interpol nordsieckstepinterpol interpol nordsieck step interpol nordsieckstepinterpol
interpol reiniti forward
equat primari mapper getprimarymapp equat secondari mapper getsecondarymapp

set integr control object
step handler stephandl handler step handler stephandl
handler reset

set state initi setstateiniti

comput initi nordsieck vector configur starter integr
start equat time gettim
interpol reiniti step start stepstart step size stepsiz scale nordsieck
interpol store time storetim step start stepstart
row lastrow nordsieck row dimens getrowdimens

reus step chosen starter integr
hnew step size stepsiz
interpol rescal hnew

main integr loop
step islaststep


error
error

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
reject step attempt reduc error stepsiz control
factor comput step grow shrink factor computestepgrowshrinkfactor error
hnew filter step filterstep step size stepsiz factor forward
interpol rescal hnew




predict estim state step end
step end stepend step start stepstart step size stepsiz
interpol shift
interpol set interpol time setinterpolatedtim step end stepend
system arraycopi interpol interpol state getinterpolatedst length

evalu deriv
comput deriv computederiv step end stepend dot ydot

updat nordsieck vector
predict scale predictedsc length
length
predict scale predictedsc step size stepsiz dot ydot

array2 row real matrix array2drowrealmatrix nordsieck tmp nordsiecktmp updat high order deriv phase1 updatehighorderderivativesphase1 nordsieck
updat high order deriv phase2 updatehighorderderivativesphase2 scale predict scale predictedsc nordsieck tmp nordsiecktmp
interpol reiniti step end stepend step size stepsiz predict scale predictedsc nordsieck tmp nordsiecktmp

discret event handl
interpol store time storetim step end stepend
step start stepstart accept step acceptstep interpol dot ydot
scale predict scale predictedsc
nordsieck nordsieck tmp nordsiecktmp
interpol reiniti step end stepend step size stepsiz scale nordsieck

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

dispatch result
equat set time settim step start stepstart
equat set complet state setcompletest

reset intern state resetinternalst




