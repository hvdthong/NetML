
















org apach common math3 od












base multistep integr ordinari
differenti equat
defin scale deriv step
pre
deriv
y'' deriv
y''' deriv

deriv
pre
store previou step separ implement
nordsieck vector higher degre scale deriv
step defin
pre

pre
omit index notat clariti

multistep integr nordsieck represent highli sensit
larg step step multipli factor
compon nordsieck vector multipli
compon accur max growth
factor set low order


org apach common math3 od nonstiff adam bashforth integr adamsbashforthintegr
org apach common math3 od nonstiff adam moulton integr adamsmoultonintegr
version


multistep integr multistepintegr adapt stepsiz integr adaptivestepsizeintegr



















































































































































































































































































inherit doc inheritdoc
handl step handlestep step interpol stepinterpol interpol islast

prev interpol previou time getprevioustim
curr interpol current time getcurrenttim

count
step store begin step
interpol set interpol time setinterpolatedtim prev
prev
system arraycopi interpol interpol state getinterpolatedst
length
system arraycopi interpol interpol deriv getinterpolatedderiv
dot ydot dot ydot length


store end step
count
interpol set interpol time setinterpolatedtim curr
count curr
system arraycopi interpol interpol state getinterpolatedst
count count length
system arraycopi interpol interpol deriv getinterpolatedderiv
dot ydot count dot ydot count length

count length

step need comput deriv
step start stepstart
step size stepsiz length length

scale deriv
scale dot ydot clone
scale length
scale step size stepsiz


higher order deriv
nordsieck initi high order deriv initializehighorderderiv step size stepsiz dot ydot

stop integr need step handl
initi complet marker except initializationcompletedmarkerexcept




















































