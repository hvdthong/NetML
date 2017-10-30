



















































































org jfree chart render




































area item render link plot xyplot draw shape
point line point shape line
fill area fill area shape shown
gener code area render demo1 xyarearendererdemo1 java code program includ
free chart jfreechart demo collect

img src imag area render sampl xyarearenderersampl png
alt area render sampl xyarearenderersampl png

area render xyarearender abstract item render abstractxyitemrender























































































































































































































































































































































draw visual represent singl data item

param graphic devic
param state render state
param data area dataarea area data drawn
param plot plot obtain standard color inform

param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param dataset dataset
param seri seri index base
param item item index base
param pass pass index

draw item drawitem graphics2 graphics2d item render state xyitemrendererst state
rectangle2 rectangle2d data area dataarea plot xyplot plot axi valueaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi dataset xydataset dataset
seri item select pass

item visibl getitemvis seri item


area render state xyarearendererst area state areast area render state xyarearendererst state

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
item count itemcount dataset item count getitemcount seri
dataset getxvalu seri math max item
dataset getyvalu seri math max item
doubl isnan


tran transx0 domain axi domainaxi java2 valuetojava2d data area dataarea
plot domain axi edg getdomainaxisedg
tran transy0 rang axi rangeaxi java2 valuetojava2d data area dataarea
plot rang axi edg getrangeaxisedg

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


item creat area polygon seri
area state areast area polygon
point
rang axi rangeaxi java2 valuetojava2d data area dataarea
plot rang axi edg getrangeaxisedg
plot orient getorient plot orient plotorient vertic
area state areast area add point addpoint tran transx1

plot orient getorient plot orient plotorient horizont
area state areast area add point addpoint tran transx1



add point area
plot orient getorient plot orient plotorient vertic
area state areast area add point addpoint tran transx1 tran transy1

plot orient getorient plot orient plotorient horizont
area state areast area add point addpoint tran transy1 tran transx1


plot orient plotorient orient plot orient getorient
paint paint item paint getitempaint seri item select
stroke stroke item stroke getitemstrok seri item select
set paint setpaint paint
set stroke setstrok stroke

shape shape
plot shape getplotshap
shape item shape getitemshap seri item select
orient plot orient plotorient vertic
shape shape util shapeutil creat translat shape createtranslatedshap shape tran transx1
tran transy1

orient plot orient plotorient horizont
shape shape util shapeutil creat translat shape createtranslatedshap shape tran transy1
tran transx1

draw shape


plot line getplotlin
item
plot orient getorient plot orient plotorient vertic
area state areast line set line setlin tran transx0 tran transy0 tran transx1 tran transy1

plot orient getorient plot orient plotorient horizont
area state areast line set line setlin tran transy0 tran transx0 tran transy1 tran transx1

draw area state areast line



check item item seri
number item draw area singl point
plot area getplotarea item item item count itemcount

orient plot orient plotorient vertic
add point
area state areast area add point addpoint tran transx1 tran transzero

orient plot orient plotorient horizont
add point
area state areast area add point addpoint tran transzero tran transx1


fill paint usefillpaint
paint lookup seri fill paint lookupseriesfillpaint seri

paint gradient paint gradientpaint
gradient paint gradientpaint gradient paint gradientpaint paint
gradient paint gradientpaint adj adjgp gradient transform gradienttransform transform
data area dataarea
set paint setpaint adj adjgp

fill area state areast area

draw outlin area
outlin isoutlin
shape area area state areast area

java2 java2d issu draw dash line larg
geometr shape bug
java bug databas check outlin
dash clip draw
outlin
stroke outlin stroke outlinestrok lookup seri outlin stroke lookupseriesoutlinestrok seri
outlin stroke outlinestrok basic stroke basicstrok
basic stroke basicstrok basic stroke basicstrok outlin stroke outlinestrok
dash arrai getdasharrai
area poli area area state areast area
make clip region slightli larger
data area dataarea clip edg show line
chart
area clip area rectangle2 rectangle2d doubl
data area dataarea getx data area dataarea geti
data area dataarea width getwidth
data area dataarea height getheight
poli intersect clip
area poli

end workaround

set stroke setstrok outlin stroke outlinestrok
set paint setpaint lookup seri outlin paint lookupseriesoutlinepaint seri
draw area



domain axi index domainaxisindex plot domain axi index getdomainaxisindex domain axi domainaxi
rang axi index rangeaxisindex plot rang axi index getrangeaxisindex rang axi rangeaxi
crosshair state xycrosshairst crosshair state crosshairst state crosshair state getcrosshairst
updat crosshair valu updatecrosshairvalu crosshair state crosshairst domain axi index domainaxisindex
rang axi index rangeaxisindex tran transx1 tran transy1 orient

collect entiti tool tip inform
entiti collect entitycollect entiti state entiti collect getentitycollect
entiti hotspot
add entiti addent entiti hotspot dataset seri item select

































































































