
















org apach common math optim direct









nelder mead direct search method

serializ

version revis date
multi direct multidirect


nelder mead neldermead direct search optim directsearchoptim serializ











































inherit doc inheritdoc
overrid
iter simplex iteratesimplex compar real point pair realpointvaluepair compar
function evalu except functionevaluationexcept optim except optimizationexcept

increment iter counter incrementiterationscount

simplex point dimens
simplex length

interest valu
real point pair realpointvaluepair simplex
real point pair realpointvaluepair secondbest simplex
real point pair realpointvaluepair worst simplex
worst xworst worst point ref getpointref

comput centroid vertic
dismiss worst point index
centroid

simplex point ref getpointref

centroid


scale

centroid scale


comput reflect point


centroid rho centroid worst xworst

real point pair realpointvaluepair reflect real point pair realpointvaluepair evalu

compar compar reflect
compar compar reflect secondbest

accept reflect point
replac worst point replaceworstpoint reflect compar

compar compar reflect

comput expans point


centroid khi centroid

real point pair realpointvaluepair expand real point pair realpointvaluepair evalu

compar compar expand reflect
accept expans point
replac worst point replaceworstpoint expand compar

accept reflect point
replac worst point replaceworstpoint reflect compar




compar compar reflect worst

perform contract


centroid gamma centroid

real point pair realpointvaluepair contract outcontract real point pair realpointvaluepair evalu

compar compar contract outcontract reflect
accept contract point
replac worst point replaceworstpoint contract outcontract compar





perform insid contract


centroid gamma centroid worst xworst

real point pair realpointvaluepair contract incontract real point pair realpointvaluepair evalu

compar compar contract incontract worst
accept contract point
replac worst point replaceworstpoint contract incontract compar





perform shrink
smallest xsmallest simplex point ref getpointref
simplex length
simplex point getpoint

smallest xsmallest sigma smallest xsmallest

simplex real point pair realpointvaluepair doubl nan

evalu simplex evaluatesimplex compar






