
















org apach common math3 od nonstiff













gragg bulirsch stoer integr
ordinari differenti equat

gragg bulirsch stoer algorithm effici
smooth problem richardson
extrapol estim solut step
size decreas


method step size order
integr order minim comput cost
suit high precis need
limit method effici high order
embed rung kutta method link dormand prince853 integr dormandprince853integr
dormand princ depend problem result
hairer norsett wanner book show limit
occur accuraci integr saltzam lorenz
equat author note problem extrem sensit
error integr step
dimension celesti mechan problem
bodi pleiad problem involv quasi collis
automat step size control essenti



implement basic reimplement java

href http www unig math folk hairer prog nonstiff odex odex
fortran code hairer wanner redistribut polici
code
href http www unig hairer prog licenc txt
conveni reproduc


tabl border width cellpad align center bgcolor e0e0e0
copyright ernst hairer

redistribut sourc binari form
modif permit provid
condit met

redistribut sourc code retain copyright
notic list condit disclaim
redistribut binari form reproduc copyright
notic list condit disclaim
document materi provid distribut


strong softwar provid copyright holder
contributor express impli warranti includ
limit impli warranti merchant fit
purpos disclaim event regent
contributor liabl direct indirect incident special
exemplari consequenti damag includ limit
procur substitut good servic loss data
profit busi interrupt caus theori
liabil contract strict liabil tort includ
neglig aris
softwar advis possibl damag strong
tabl

version



gragg bulirsch stoer integr graggbulirschstoerintegr adapt stepsiz integr adaptivestepsizeintegr























































































































































































































































































































































perform integr step substep modifi
midpoint method
param initi time
param initi state vector
param step global step
param iter number sequenc length
param scale scale arrai shorter state
param placehold put state vector deriv substep
element initi deriv
param middl ymiddl placehold put state vector middl step
param end yend placehold put state vector end
param tmp ytmp placehold state vector
comput properli
stabil check fail end comput
except max count exceed except maxcountexceededexcept number function evalu exceed
except dimens mismatch except dimensionmismatchexcept arrai dimens match equat set

step trystep step
scale
middl ymiddl end yend
tmp ytmp
max count exceed except maxcountexceededexcept dimens mismatch except dimensionmismatchexcept

sequenc
step substep step
step2 substep2 step substep

substep
step substep
length
tmp ytmp
end yend step substep

comput deriv computederiv end yend

substep



save point middl step
system arraycopi end yend middl ymiddl length


step substep
length
middl end yend
end yend tmp ytmp step2 substep2
tmp ytmp middl


comput deriv computederiv end yend

stabil check
perform test performtest max check maxcheck max iter maxit
initi norm initialnorm
scale length
ratio scale
initi norm initialnorm ratio ratio

delta norm deltanorm
scale length
ratio scale
delta norm deltanorm ratio ratio

delta norm deltanorm fast math fastmath max initi norm initialnorm






correct substep step
length
end yend tmp ytmp end yend step substep




















































































































































































































































































































































































































































