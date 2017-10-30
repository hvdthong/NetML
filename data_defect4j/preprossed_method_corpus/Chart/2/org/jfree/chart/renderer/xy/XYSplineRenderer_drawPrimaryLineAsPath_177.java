











































org jfree chart render















render connect data point natur cubic spline
draw shape data point render design
link plot xyplot shown gener
code spline render demo1 xysplinerendererdemo1 java code program includ free chart jfreechart
demo collect

img src imag spline render sampl xysplinerenderersampl png
alt spline render sampl xysplinerenderersampl png



spline render xysplinerender line shape render xylineandshaperender






















































































draw item pass method draw line
connect item draw separ line
gener path generalpath construct drawn end
seri paint

param graphic devic
param state render state
param plot plot obtain standard color inform

param dataset dataset
param pass pass
param seri seri index base
param item item index base
param select item select
param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param data area dataarea area data drawn

draw primari line path drawprimarylineaspath item render state xyitemrendererst state
graphics2 graphics2d plot xyplot plot dataset xydataset dataset pass
seri item select axi valueaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi rectangle2 rectangle2d data area dataarea

rectangl edg rectangleedg axi locat xaxisloc plot domain axi edg getdomainaxisedg
rectangl edg rectangleedg axi locat yaxisloc plot rang axi edg getrangeaxisedg

data point
dataset getxvalu seri item
dataset getyvalu seri item
tran transx1 domain axi domainaxi java2 valuetojava2d data area dataarea axi locat xaxisloc
tran transy1 rang axi rangeaxi java2 valuetojava2d data area dataarea axi locat yaxisloc

collect point
doubl isnan tran transx1 doubl isnan tran transy1
control point controlpoint control point controlpoint plot orient getorient
plot orient plotorient horizont tran transy1
tran transx1 plot orient getorient
plot orient plotorient horizont tran transx1
tran transy1
point
point add


item dataset item count getitemcount seri
state state state
construct path
point size
point draw
control point controlpoint cp0 control point controlpoint point
seri path seriespath move moveto cp0 cp0
point size
point spline draw simpl line
point
control point controlpoint cp1 control point controlpoint point
seri path seriespath line lineto cp1 cp1


construct spline
point size number point
newton form coeffici
coordin node


oldi
oldt







control point controlpoint cpi control point controlpoint point
cpi
cpi






diag



diag





solv tridiag solvetridiag diag

note
draw
oldt
oldi
seri path seriespath move moveto oldt oldi

loop interv node
precis
precis





seri path seriespath line lineto
oldt
oldi



draw path
draw shape1 drawshape1 pass seri item select seri path seriespath


reset point vector
point vector





























































































