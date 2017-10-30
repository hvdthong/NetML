
















org apach common math optim direct







nelder mead simplex algorithm

version


nelder mead simplex neldermeadsimplex abstract simplex abstractsimplex

























































































































































inherit doc inheritdoc
overrid
iter multivari function multivariatefunct evalu function evaluationfunct
compar point pair pointvaluepair compar
simplex point dimens
dimens getdimens

interest valu
point pair pointvaluepair point getpoint
point pair pointvaluepair secondbest point getpoint
point pair pointvaluepair worst point getpoint
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

point pair pointvaluepair reflect
point pair pointvaluepair evalu function evaluationfunct

compar compar reflect
compar compar reflect secondbest
accept reflect point
replac worst point replaceworstpoint reflect compar
compar compar reflect
comput expans point


centroid khi centroid

point pair pointvaluepair expand
point pair pointvaluepair evalu function evaluationfunct

compar compar expand reflect
accept expans point
replac worst point replaceworstpoint expand compar

accept reflect point
replac worst point replaceworstpoint reflect compar


compar compar reflect worst
perform contract


centroid gamma centroid

point pair pointvaluepair contract outcontract
point pair pointvaluepair evalu function evaluationfunct
compar compar contract outcontract reflect
accept contract point
replac worst point replaceworstpoint contract outcontract compar



perform insid contract


centroid gamma centroid worst xworst

point pair pointvaluepair contract incontract
point pair pointvaluepair evalu function evaluationfunct

compar compar contract incontract worst
accept contract point
replac worst point replaceworstpoint contract incontract compar




perform shrink
smallest xsmallest point getpoint point ref getpointref

point getpoint point getpoint

smallest xsmallest sigma smallest xsmallest

set point setpoint point pair pointvaluepair doubl nan

evalu evalu function evaluationfunct compar



