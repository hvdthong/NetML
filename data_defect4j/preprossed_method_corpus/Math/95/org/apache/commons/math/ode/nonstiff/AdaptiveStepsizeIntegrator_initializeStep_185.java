
















org apach common math od nonstiff







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

estim error
pre
sqrt sum err est errest threshold
pre

state vector dimens step accept
step reject attempt made
stepsiz

version revis date




adapt stepsiz integr adaptivestepsizeintegr




















































































































initi integr step
param equat differenti equat set
param forward forward integr indic
param order order method
param scale scale vector state vector
param start time
param state vector
param dot0 ydot0 time deriv
param work arrai state vector
param dot1 ydot1 work arrai time deriv
integr step
except deriv except derivativeexcept except propag
caller underli user function trigger

initi step initializestep order differenti equat firstorderdifferentialequ equat
forward order scale
dot0 ydot0
dot1 ydot1
deriv except derivativeexcept

initi step initialstep
user provid
forward initi step initialstep initi step initialstep


rough guess scale scale
guess perform euler step
ratio
scale2 yonscale2
dot scale2 ydotonscale2
length
ratio scale
scale2 yonscale2 ratio ratio
ratio dot0 ydot0 scale
dot scale2 ydotonscale2 ratio ratio


scale2 yonscale2 dot scale2 ydotonscale2
math sqrt scale2 yonscale2 dot scale2 ydotonscale2
forward



perform euler step preced rough guess
length
dot0 ydot0

equat comput deriv computederiv dot1 ydot1

estim deriv solut
dot scale yddotonscal
length
ratio dot1 ydot1 dot0 ydot0 scale
dot scale yddotonscal ratio ratio

dot scale yddotonscal math sqrt dot scale yddotonscal

step size comput
order max tol y'' tol
max inv2 maxinv2 math max math sqrt dot scale2 ydotonscale2 dot scale yddotonscal
max inv2 maxinv2
math max math ab
math pow max inv2 maxinv2 order
math min math ab
math max math ab avoid cancel comput
min step getminstep
min step getminstep

max step getmaxstep
max step getmaxstep

forward
































































































