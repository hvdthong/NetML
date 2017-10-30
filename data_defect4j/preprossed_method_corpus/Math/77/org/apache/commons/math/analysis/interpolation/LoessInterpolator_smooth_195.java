















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

version revis date


loess interpol loessinterpol











































































































































comput weight loess fit data origin abscissa

param xval argument interpol point
param yval valu interpol point
param weight point weight coeffici robust weight point multipli
valu loess fit origin abscissa
math except mathexcept condit

argument valu size greater
argument strictli increas order
argument valu finit real number



smooth xval yval weight
math except mathexcept
xval length yval length
math except mathexcept
loess expect abscissa ordin arrai
size
abscisssa ordinata
xval length yval length


xval length


math except mathexcept loess expect point


check finit real checkallfiniter xval abscissa finit real number
check finit real checkallfiniter yval ordinata finit real number
check finit real checkallfiniter weight weight finit real number

check strictli increas checkstrictlyincreas xval


yval



yval yval


bandwidth point bandwidthinpoint bandwidth

bandwidth point bandwidthinpoint
math except mathexcept
bandwidth larg
accomod point
data point bandwidth

bandwidth


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

updat bandwidth interv updatebandwidthinterv xval bandwidth interv bandwidthinterv


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
denom math ab xval edg
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
math sqrt math ab squar meanxsquar meanx meanx accuraci
beta

beta meanxi meanx meani squar meanxsquar meanx meanx


alpha meani beta meanx

re beta alpha
residu math ab yval re


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

math ab median residu medianresidu accuraci




arg residu median residu medianresidu
arg
robust weight robustnessweight

arg arg
robust weight robustnessweight




re








































































































