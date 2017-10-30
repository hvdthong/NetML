

















































































org jfree chart render





























area item render link plot xyplot shown
gener code area renderer2 demo1 xyarearenderer2demo1 java code program includ
free chart jfreechart demo collect

img src imag area renderer2 sampl xyarearenderer2sampl png
alt area renderer2 sampl xyarearenderer2sampl png

area renderer2 xyarearenderer2 abstract item render abstractxyitemrender















































































































































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
axi valueaxi rang axi rangeaxi dataset xydataset dataset seri
item select pass

item visibl getitemvis seri item


data point
dataset getxvalu seri item
dataset getyvalu seri item
doubl isnan



tran transx1 domain axi domainaxi java2 valuetojava2d data area dataarea
plot domain axi edg getdomainaxisedg
tran transy1 rang axi rangeaxi java2 valuetojava2d data area dataarea
plot rang axi edg getrangeaxisedg

previou point point calcul
hot spot area chart entiti
dataset getxvalu seri math max item
dataset getyvalu seri math max item
doubl isnan


tran transx0 domain axi domainaxi java2 valuetojava2d data area dataarea
plot domain axi edg getdomainaxisedg
tran transy0 rang axi rangeaxi java2 valuetojava2d data area dataarea
plot rang axi edg getrangeaxisedg

item count itemcount dataset item count getitemcount seri
dataset getxvalu seri math min item
item count itemcount
dataset getyvalu seri math min item
item count itemcount
doubl isnan


tran transx2 domain axi domainaxi java2 valuetojava2d data area dataarea
plot domain axi edg getdomainaxisedg
tran transy2 rang axi rangeaxi java2 valuetojava2d data area dataarea
plot rang axi edg getrangeaxisedg

tran transzero rang axi rangeaxi java2 valuetojava2d data area dataarea
plot rang axi edg getrangeaxisedg
polygon hotspot
plot orient getorient plot orient plotorient horizont
hotspot polygon
hotspot add point addpoint tran transzero
tran transx0 tran transx1
hotspot add point addpoint tran transy0 tran transy1
tran transx0 tran transx1
hotspot add point addpoint tran transy1 tran transx1
hotspot add point addpoint tran transy1 tran transy2
tran transx1 tran transx2
hotspot add point addpoint tran transzero
tran transx1 tran transx2

vertic orient
hotspot polygon
hotspot add point addpoint tran transx0 tran transx1
tran transzero
hotspot add point addpoint tran transx0 tran transx1
tran transy0 tran transy1
hotspot add point addpoint tran transx1 tran transy1
hotspot add point addpoint tran transx1 tran transx2
tran transy1 tran transy2
hotspot add point addpoint tran transx1 tran transx2
tran transzero


plot orient plotorient orient plot orient getorient
paint paint item paint getitempaint seri item select
stroke stroke item stroke getitemstrok seri item select
set paint setpaint paint
set stroke setstrok stroke

check item item seri
number item draw area singl point
fill hotspot

draw outlin area
outlin isoutlin
set stroke setstrok lookup seri outlin stroke lookupseriesoutlinestrok seri
set paint setpaint lookup seri outlin paint lookupseriesoutlinepaint seri
draw hotspot

domain axi index domainaxisindex plot domain axi index getdomainaxisindex domain axi domainaxi
rang axi index rangeaxisindex plot rang axi index getrangeaxisindex rang axi rangeaxi
crosshair state xycrosshairst crosshair state crosshairst state crosshair state getcrosshairst
updat crosshair valu updatecrosshairvalu crosshair state crosshairst domain axi index domainaxisindex
rang axi index rangeaxisindex tran transx1 tran transy1 orient

entiti collect entitycollect entiti state entiti collect getentitycollect
entiti
add entiti addent entiti hotspot dataset seri item select






































































