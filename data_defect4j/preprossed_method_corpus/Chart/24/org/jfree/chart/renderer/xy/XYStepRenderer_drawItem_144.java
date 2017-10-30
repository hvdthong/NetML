



































































org jfree chart render





















line step item render link plot xyplot draw line
data point allow horizont vertic line step

step render xysteprender line shape render xylineandshaperender
































draw visual represent singl data item

param graphic devic
param state render state
param data area dataarea area data drawn
param info collect inform draw
param plot plot obtain standard color
inform
param domain axi domainaxi domain axi
param rang axi rangeaxi vertic axi
param dataset dataset
param seri seri index base
param item item index base
param crosshair state crosshairst crosshair inform plot
code code permit
param pass pass index

draw item drawitem graphics2 graphics2d
item render state xyitemrendererst state
rectangle2 rectangle2d data area dataarea
plot render info plotrenderinginfo info
plot xyplot plot
axi valueaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi
dataset xydataset dataset
seri
item
crosshair state crosshairst crosshair state crosshairst
pass

item visibl
item visibl getitemvis seri item



plot orient plotorient orient plot orient getorient

paint seri paint seriespaint item paint getitempaint seri item
stroke seri stroke seriesstrok item stroke getitemstrok seri item
set paint setpaint seri paint seriespaint
set stroke setstrok seri stroke seriesstrok

data point
dataset getxvalu seri item
dataset getyvalu seri item
doubl isnan



rectangl edg rectangleedg axi locat xaxisloc plot domain axi edg getdomainaxisedg
rectangl edg rectangleedg axi locat yaxisloc plot rang axi edg getrangeaxisedg
tran transx1 domain axi domainaxi java2 valuetojava2d data area dataarea axi locat xaxisloc
tran transy1 rang axi rangeaxi java2 valuetojava2d data area dataarea axi locat yaxisloc

item
previou data point
dataset getxvalu seri item
dataset getyvalu seri item
doubl isnan
tran transx0 domain axi domainaxi java2 valuetojava2d data area dataarea
axi locat xaxisloc
tran transy0 rang axi rangeaxi java2 valuetojava2d data area dataarea
axi locat yaxisloc

line2 line2d line state work line workinglin
orient plot orient plotorient horizont
tran transy0 tran transy1 repres situat
draw horizont bar
line set line setlin tran transy0 tran transx0 tran transy1 tran transx1
draw line

handl perform 'step'
line set line setlin tran transy0 tran transx0 tran transy0 tran transx1
draw line
line set line setlin tran transy0 tran transx1 tran transy1 tran transx1
draw line


orient plot orient plotorient vertic
tran transy0 tran transy1 repres situat
draw horizont bar
line set line setlin tran transx0 tran transy0 tran transx1 tran transy1
draw line

handl perform 'step'
line set line setlin tran transx0 tran transy0 tran transx1 tran transy0
draw line
line set line setlin tran transx1 tran transy0 tran transx1 tran transy1
draw line






draw item label
item label visibl isitemlabelvis seri item
tran transx1
tran transy1
orient plot orient plotorient horizont
tran transy1
tran transx1

draw item label drawitemlabel orient dataset seri item



domain axi index domainaxisindex plot domain axi index getdomainaxisindex domain axi domainaxi
rang axi index rangeaxisindex plot rang axi index getrangeaxisindex rang axi rangeaxi
updat crosshair valu updatecrosshairvalu crosshair state crosshairst domain axi index domainaxisindex
rang axi index rangeaxisindex tran transx1 tran transy1 orient

entiti collect entitycollect entiti state entiti collect getentitycollect
entiti
add entiti addent entiti dataset seri item tran transx1 tran transy1















