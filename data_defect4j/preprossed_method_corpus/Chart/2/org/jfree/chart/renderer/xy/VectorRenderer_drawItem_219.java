













































org jfree chart render



















render repres data link vector dataset vectorxydataset draw
line arrow point
shown gener code vector plot demo1 vectorplotdemo1 java code
program includ free chart jfreechart demo collect

img src imag vector render sampl vectorrenderersampl png
alt vector render sampl vectorrenderersampl png



vector render vectorrender abstract item render abstractxyitemrender
































































































































draw block repres item

param graphic devic
param state state
param data area dataarea data area
param plot plot
param domain axi domainaxi axi
param rang axi rangeaxi axi
param dataset dataset
param seri seri index
param item item index
param pass pass index

draw item drawitem graphics2 graphics2d item render state xyitemrendererst state
rectangle2 rectangle2d data area dataarea plot xyplot plot axi valueaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi dataset xydataset dataset seri item
select pass

dataset getxvalu seri item
dataset getyvalu seri item


dataset vector dataset vectorxydataset
vector dataset vectorxydataset dataset vector getvectorxvalu seri item
vector dataset vectorxydataset dataset vector getvectoryvalu seri item

xx0 domain axi domainaxi java2 valuetojava2d data area dataarea
plot domain axi edg getdomainaxisedg
yy0 rang axi rangeaxi java2 valuetojava2d data area dataarea
plot rang axi edg getrangeaxisedg
xx1 domain axi domainaxi java2 valuetojava2d data area dataarea
plot domain axi edg getdomainaxisedg
yy1 rang axi rangeaxi java2 valuetojava2d data area dataarea
plot rang axi edg getrangeaxisedg
line2 line2d line
plot orient plotorient orient plot orient getorient
orient equal plot orient plotorient horizont
line line2 line2d doubl yy0 xx0 yy1 xx1


line line2 line2d doubl xx0 yy0 xx1 yy1

set paint setpaint item paint getitempaint seri item select
set stroke setstrok item stroke getitemstrok seri item select
draw line

calcul arrow head draw
dxx xx1 xx0
dyi yy1 yy0
xx0 base length baselength dxx
yy0 base length baselength dyi

xx0 head length headlength dxx
yy0 head length headlength dyi

angl
dxx
angl math math atan dyi dxx

delta deltax math co angl
delta deltai math sin angl

leftx delta deltax
lefti delta deltai
rightx delta deltax
righti delta deltai

gener path generalpath gener path generalpath
orient plot orient plotorient vertic
move moveto xx1 yy1
line lineto rightx righti
line lineto
line lineto leftx lefti

orient horizont
move moveto yy1 xx1
line lineto righti rightx
line lineto
line lineto lefti leftx

close path closepath
draw

setup collect option entiti info
entiti collect entitycollect entiti
state info getinfo
entiti state info getinfo owner getown entiti collect getentitycollect
entiti
add entiti addent entiti line bound getbound dataset seri item
select

















































