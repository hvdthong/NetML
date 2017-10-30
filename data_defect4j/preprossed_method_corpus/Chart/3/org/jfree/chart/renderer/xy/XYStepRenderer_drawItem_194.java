








































































org jfree chart render






















line step item render link plot xyplot draw line
data point allow horizont vertic line step
shown gener
code step render demo1 xysteprendererdemo1 java code program includ free chart jfreechart
demo collect

img src imag step render sampl xysteprenderersampl png
alt step render sampl xysteprenderersampl png

step render xysteprender line shape render xylineandshaperender









































































draw visual represent singl data item

param graphic devic
param state render state
param data area dataarea area data drawn
param plot plot obtain standard color
inform
param domain axi domainaxi domain axi
param rang axi rangeaxi vertic axi
param dataset dataset
param seri seri index base
param item item index base
param pass pass index

draw item drawitem graphics2 graphics2d item render state xyitemrendererst state
rectangle2 rectangle2d data area dataarea plot xyplot plot axi valueaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi dataset xydataset dataset seri
item select pass

item visibl
item visibl getitemvis seri item



plot orient plotorient orient plot orient getorient

paint seri paint seriespaint item paint getitempaint seri item select
stroke seri stroke seriesstrok item stroke getitemstrok seri item select
set paint setpaint seri paint seriespaint
set stroke setstrok seri stroke seriesstrok

data point
dataset getxvalu seri item
dataset getyvalu seri item

rectangl edg rectangleedg axi locat xaxisloc plot domain axi edg getdomainaxisedg
rectangl edg rectangleedg axi locat yaxisloc plot rang axi edg getrangeaxisedg
tran transx1 domain axi domainaxi java2 valuetojava2d data area dataarea axi locat xaxisloc
tran transy1 doubl isnan doubl nan
rang axi rangeaxi java2 valuetojava2d data area dataarea axi locat yaxisloc

pass item
previou data point
dataset getxvalu seri item
dataset getyvalu seri item
tran transx0 domain axi domainaxi java2 valuetojava2d data area dataarea
axi locat xaxisloc
tran transy0 doubl isnan doubl nan
rang axi rangeaxi java2 valuetojava2d data area dataarea axi locat yaxisloc

orient plot orient plotorient horizont
tran transy0 tran transy1
repres situat
draw horizont bar
draw line drawlin state work line workinglin tran transy0 tran transx0 tran transy1
tran transx1

handl perform 'step'

calcul step point
tran transx tran transx0 step point getsteppoint
tran transx1 tran transx0
draw line drawlin state work line workinglin tran transy0 tran transx0 tran transy0
tran transx
draw line drawlin state work line workinglin tran transy0 tran transx tran transy1
tran transx
draw line drawlin state work line workinglin tran transy1 tran transx tran transy1
tran transx1


orient plot orient plotorient vertic
tran transy0 tran transy1 repres situat
draw horizont bar
draw line drawlin state work line workinglin tran transx0 tran transy0 tran transx1
tran transy1

handl perform 'step'
calcul step point
tran transx tran transx0 step point getsteppoint
tran transx1 tran transx0
draw line drawlin state work line workinglin tran transx0 tran transy0 tran transx
tran transy0
draw line drawlin state work line workinglin tran transx tran transy0 tran transx
tran transy1
draw line drawlin state work line workinglin tran transx tran transy1 tran transx1
tran transy1



submit data item candid crosshair point
domain axi index domainaxisindex plot domain axi index getdomainaxisindex domain axi domainaxi
rang axi index rangeaxisindex plot rang axi index getrangeaxisindex rang axi rangeaxi
crosshair state xycrosshairst crosshair state crosshairst state crosshair state getcrosshairst
updat crosshair valu updatecrosshairvalu crosshair state crosshairst domain axi index domainaxisindex
rang axi index rangeaxisindex tran transx1 tran transy1 orient

collect entiti tool tip inform
entiti collect entitycollect entiti state entiti collect getentitycollect
entiti
add entiti addent entiti dataset seri item select
tran transx1 tran transy1




pass
draw item label
item label visibl isitemlabelvis seri item select
tran transx1
tran transy1
orient plot orient plotorient horizont
tran transy1
tran transx1

draw item label drawitemlabel orient dataset seri item select




































































