
















org apach common math optim direct








nelder mead simplex algorithm

version revis date


nelder mead simplex neldermeadsimplex abstract simplex abstractsimplex

























































































































































inherit doc inheritdoc
overrid
iter multivari real function multivariaterealfunct evalu function evaluationfunct
compar real point pair realpointvaluepair compar
math user except mathuserexcept
simplex point dimens
dimens getdimens

interest valu
real point pair realpointvaluepair point getpoint
real point pair realpointvaluepair secondbest point getpoint
real point pair realpointvaluepair worst point getpoint
worst xworst worst point ref getpointref

comput centroid vertic dismiss worst
point index
centroid

point getpoint point ref getpointref

centroid


scale

centroid scale


comput reflect point


centroid rho centroid worst xworst

real point pair realpointvaluepair reflect
real point pair realpointvaluepair evalu function evaluationfunct

compar compar reflect
compar compar reflect secondbest
accept reflect point
replac worst point replaceworstpoint reflect compar
compar compar reflect
comput expans point


centroid khi centroid

real point pair realpointvaluepair expand
real point pair realpointvaluepair evalu function evaluationfunct

compar compar expand reflect
accept expans point
replac worst point replaceworstpoint expand compar

accept reflect point
replac worst point replaceworstpoint reflect compar


compar compar reflect worst
perform contract


centroid gamma centroid

real point pair realpointvaluepair contract outcontract
real point pair realpointvaluepair evalu function evaluationfunct
compar compar contract outcontract reflect
accept contract point
replac worst point replaceworstpoint contract outcontract compar



perform insid contract


centroid gamma centroid worst xworst

real point pair realpointvaluepair contract incontract
real point pair realpointvaluepair evalu function evaluationfunct

compar compar contract incontract worst
accept contract point
replac worst point replaceworstpoint contract incontract compar




perform shrink
smallest xsmallest point getpoint point ref getpointref

point getpoint point getpoint

smallest xsmallest sigma smallest xsmallest

set point setpoint real point pair realpointvaluepair doubl nan

evalu evalu function evaluationfunct compar



