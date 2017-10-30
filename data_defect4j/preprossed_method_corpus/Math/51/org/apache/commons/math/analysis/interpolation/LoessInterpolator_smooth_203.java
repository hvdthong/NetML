















org apach common math analysi interpol















implement href http wikipedia org wiki local regress
local regress algorithm loess lowess interpol
real univari function

refer
href http www math tau yekutiel seminar cleveland pdf
william cleveland robust local weight regress smooth
scatterplot

loess method serv interpol
adapt allow build spline obtain loess fit

version


loess interpol loessinterpol







































































































































comput weight loess fit data origin abscissa

param xval argument interpol point
param yval valu interpol point
param weight point weight coeffici robust weight
point multipli
valu loess fit origin abscissa
org apach common math except monoton sequenc except nonmonotonoussequenceexcept
code xval sort strictli increas order
dimens mismatch except dimensionmismatchexcept code xval code yval
size
data except nodataexcept code xval code yval size
org apach common math except finit number except notfinitenumberexcept
argument valu finit real number
number small except numberistoosmallexcept bandwidth small
accomod size input data bandwidth
larger


smooth xval yval
weight
xval length yval length
dimens mismatch except dimensionmismatchexcept xval length yval length


xval length


data except nodataexcept


check finit real checkallfiniter xval
check finit real checkallfiniter yval
check finit real checkallfiniter weight

math util mathutil check order checkord xval


yval



yval yval


bandwidth point bandwidthinpoint bandwidth

bandwidth point bandwidthinpoint
number small except numberistoosmallexcept local format localizedformat bandwidth
bandwidth point bandwidthinpoint


re

residu
sort residu sortedresidu

robust weight robustnessweight

initi fit 'robust iters' 'robustnessiters' robust iter
equival 'robust iter 'robustnessit robust iter
start robust weight set
arrai fill robust weight robustnessweight

iter iter robust iter robustnessit iter
bandwidth interv bandwidthinterv bandwidth point bandwidthinpoint
comput local weight linear regress

xval

find interv sourc point
regress made

updat bandwidth interv updatebandwidthinterv xval weight bandwidth interv bandwidthinterv


ileft bandwidth interv bandwidthinterv
iright bandwidth interv bandwidthinterv

comput point bandwidth interv
farthest
edg
xval xval ileft xval iright xval
edg ileft

edg iright


comput squar linear fit weight
product robust weight tricub
weight function
http wikipedia org wiki linear regress
section univari linear
http wikipedia org wiki weight squar
section weight squar
sum weight sumweight
sum sumx
sum squar sumxsquar
sum sumi
sum sumxi
denom fast math fastmath ab xval edg
ileft iright
xval
yval
dist
tricub dist denom robust weight robustnessweight weight
xkw
sum weight sumweight
sum sumx xkw
sum squar sumxsquar xkw
sum sumi
sum sumxi xkw


meanx sum sumx sum weight sumweight
meani sum sumi sum weight sumweight
meanxi sum sumxi sum weight sumweight
squar meanxsquar sum squar sumxsquar sum weight sumweight

beta
fast math fastmath sqrt fast math fastmath ab squar meanxsquar meanx meanx accuraci
beta

beta meanxi meanx meani squar meanxsquar meanx meanx


alpha meani beta meanx

re beta alpha
residu fast math fastmath ab yval re


recomput robust weight
iter need anymor
iter robust iter robustnessit



recomput robust weight

find median residu
arraycopi sort complet tractabl
preced loop lot expens
system arraycopi residu sort residu sortedresidu
arrai sort sort residu sortedresidu
median residu medianresidu sort residu sortedresidu

fast math fastmath ab median residu medianresidu accuraci




arg residu median residu medianresidu
arg
robust weight robustnessweight

arg arg
robust weight robustnessweight




re











































































































