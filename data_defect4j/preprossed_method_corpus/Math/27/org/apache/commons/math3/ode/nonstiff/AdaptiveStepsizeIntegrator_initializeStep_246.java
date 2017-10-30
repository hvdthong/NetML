
















org apach common math3 od nonstiff











hold common part adapt
stepsiz integr ordinari differenti equat

algorithm perform integr stepsiz control
mean user integr step
toler error error threshold comput
pre
threshold ab tol abstol rel tol reltol max ab ab
pre
ab tol abstol absolut toler compon
state vector rel tol reltol rel toler
compon user scalar valu ab tol abstol
rel tol reltol compon


ordinari differenti equat link expand state od expandablestatefulod
extend od link
org apach common math3 od order differenti equat firstorderdifferentialequ basic od
link expand state od expandablestatefulod primari state getprimaryst primari part
state vector stepsiz control complet state vector


estim error
pre
sqrt sum err est errest threshold
pre

main set dimens step accept
step reject attempt made
stepsiz

version




adapt stepsiz integr adaptivestepsizeintegr








































































































































































initi integr step
param forward forward integr indic
param order order method
param scale scale vector state vector shorter state vector
param start time
param state vector
param dot0 ydot0 time deriv
param work arrai state vector
param dot1 ydot1 work arrai time deriv
integr step

initi step initializestep forward order scale
dot0 ydot0
dot1 ydot1

initi step initialstep
user provid
forward initi step initialstep initi step initialstep


rough guess scale scale
guess perform euler step
ratio
scale2 yonscale2
dot scale2 ydotonscale2
scale length
ratio scale
scale2 yonscale2 ratio ratio
ratio dot0 ydot0 scale
dot scale2 ydotonscale2 ratio ratio


scale2 yonscale2 dot scale2 ydotonscale2
fast math fastmath sqrt scale2 yonscale2 dot scale2 ydotonscale2
forward



perform euler step preced rough guess
length
dot0 ydot0

comput deriv computederiv dot1 ydot1

estim deriv solut
dot scale yddotonscal
scale length
ratio dot1 ydot1 dot0 ydot0 scale
dot scale yddotonscal ratio ratio

dot scale yddotonscal fast math fastmath sqrt dot scale yddotonscal

step size comput
order max tol y'' tol
max inv2 maxinv2 fast math fastmath max fast math fastmath sqrt dot scale2 ydotonscale2 dot scale yddotonscal
max inv2 maxinv2
fast math fastmath max fast math fastmath ab
fast math fastmath pow max inv2 maxinv2 order
fast math fastmath min fast math fastmath ab
fast math fastmath max fast math fastmath ab avoid cancel comput
min step getminstep
min step getminstep

max step getmaxstep
max step getmaxstep

forward







































































