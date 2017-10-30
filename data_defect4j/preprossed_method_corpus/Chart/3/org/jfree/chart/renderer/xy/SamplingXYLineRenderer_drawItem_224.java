











































org jfree chart render























render draw line chart render necessarili plot
data item plot data item
make differ visual output data item skip
render design link plot xyplot



sampl line render samplingxylinerender abstract item render abstractxyitemrender





































































































































draw visual represent singl data item

param graphic devic
param state render state
param data area dataarea area data drawn
param plot plot obtain standard color
inform
param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param dataset dataset
param seri seri index base
param item item index base
param pass pass index

draw item drawitem graphics2 graphics2d item render state xyitemrendererst state
rectangle2 rectangle2d data area dataarea plot xyplot plot axi valueaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi dataset xydataset dataset seri item
select pass

item visibl
item visibl getitemvis seri item


rectangl edg rectangleedg axi locat xaxisloc plot domain axi edg getdomainaxisedg
rectangl edg rectangleedg axi locat yaxisloc plot rang axi edg getrangeaxisedg

data point
dataset getxvalu seri item
dataset getyvalu seri item
tran transx1 domain axi domainaxi java2 valuetojava2d data area dataarea axi locat xaxisloc
tran transy1 rang axi rangeaxi java2 valuetojava2d data area dataarea axi locat yaxisloc

state state state
updat path reflect latest point
doubl isnan tran transx1 doubl isnan tran transy1
tran transx1
tran transy1
plot orient plotorient orient plot orient getorient
orient plot orient plotorient horizont
tran transy1
tran transx1

point good lastpointgood
math ab lastx
seri path seriespath line lineto
low lowi high highi
interv path intervalpath move moveto lastx low lowi
interv path intervalpath line lineto lastx high highi

lastx
open openi
high highi
low lowi
close closei


high highi math max high highi
low lowi math min low lowi
close closei



seri path seriespath move moveto
lastx
open openi
high highi
low lowi
close closei

point good lastpointgood


point good lastpointgood

item draw path
item item index getlastitemindex
draw path
path iter pathiter seri path seriespath path iter getpathiter
count
isdon
count


set stroke setstrok item stroke getitemstrok seri item select
set paint setpaint item paint getitempaint seri item select
draw seri path seriespath
draw interv path intervalpath





































































