




















































org jfree chart render






























render draw line connect start end valu
link plot xyplot shown gener
code interv render demo1 yintervalrendererdemo1 java code program includ free chart jfreechart
demo collect

img src imag interv render sampl yintervalrenderersampl png
alt interv render sampl yintervalrenderersampl png

interv render yintervalrender abstract item render abstractxyitemrender




































































draw visual represent singl data item

param graphic devic
param state render state
param data area dataarea area plot drawn
param plot plot obtain standard color
inform
param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param dataset dataset
param seri seri index base
param item item index base
param select item select
param pass pass index



draw item drawitem graphics2 graphics2d item render state xyitemrendererst state
rectangle2 rectangle2d data area dataarea plot xyplot plot axi valueaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi dataset xydataset dataset seri item
select pass

setup collect option entiti info
entiti collect entitycollect entiti
state info getinfo
entiti state info getinfo owner getown entiti collect getentitycollect


interv dataset intervalxydataset interv dataset intervaldataset interv dataset intervalxydataset dataset

interv dataset intervaldataset getxvalu seri item
low ylow interv dataset intervaldataset start getstartyvalu seri item
high yhigh interv dataset intervaldataset end getendyvalu seri item

rectangl edg rectangleedg axi locat xaxisloc plot domain axi edg getdomainaxisedg
rectangl edg rectangleedg axi locat yaxisloc plot rang axi edg getrangeaxisedg

domain axi domainaxi java2 valuetojava2d data area dataarea axi locat xaxisloc
low yylow rang axi rangeaxi java2 valuetojava2d low ylow data area dataarea axi locat yaxisloc
high yyhigh rang axi rangeaxi java2 valuetojava2d high yhigh data area dataarea axi locat yaxisloc

paint item paint getitempaint seri item select
stroke item stroke getitemstrok seri item select

line2 line2d line
shape shape item shape getitemshap seri item select
shape top
shape bottom
plot orient plotorient orient plot orient getorient
orient plot orient plotorient horizont
line line2 line2d doubl low yylow high yyhigh
top shape util shapeutil creat translat shape createtranslatedshap shape high yyhigh
bottom shape util shapeutil creat translat shape createtranslatedshap shape low yylow

orient plot orient plotorient vertic
line line2 line2d doubl low yylow high yyhigh
top shape util shapeutil creat translat shape createtranslatedshap shape high yyhigh
bottom shape util shapeutil creat translat shape createtranslatedshap shape low yylow

set paint setpaint
set stroke setstrok
draw line

fill top
fill bottom

item label special
possibl draw regular item label
upper regular item label upper
addit item label lower
item label visibl isitemlabelvis seri item select
draw item label drawitemlabel orient dataset seri item select
high yyhigh
draw addit item label drawadditionalitemlabel orient dataset seri item
low yylow


add entiti item
entiti
add entiti addent entiti line bound getbound dataset seri item
select












































































