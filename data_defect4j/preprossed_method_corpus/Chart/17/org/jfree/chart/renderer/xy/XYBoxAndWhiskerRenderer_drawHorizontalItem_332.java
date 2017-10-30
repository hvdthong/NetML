









































































org jfree chart render






































render draw box whisker item link plot xyplot
render requir link box whisker dataset boxandwhiskerxydataset

render includ code calcul crosshair point

box whisker render xyboxandwhiskerrender abstract item render abstractxyitemrender




































































































































































































draw visual represent singl data item

param graphic devic
param data area dataarea area plot drawn
param info collect info draw
param plot plot obtain standard color
inform
param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param dataset dataset
param seri seri index base
param item item index base
param crosshair state crosshairst crosshair inform plot
code code permit
param pass pass index

draw horizont item drawhorizontalitem graphics2 graphics2d
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

setup collect option entiti info
entiti collect entitycollect entiti
info
entiti info owner getown entiti collect getentitycollect


box whisker dataset boxandwhiskerxydataset box whisker data boxandwhiskerdata
box whisker dataset boxandwhiskerxydataset dataset

number box whisker data boxandwhiskerdata getx seri item
number max ymax box whisker data boxandwhiskerdata max regular getmaxregularvalu seri item
number min ymin box whisker data boxandwhiskerdata min regular getminregularvalu seri item
number median ymedian box whisker data boxandwhiskerdata median getmedianvalu seri item
number averag yaverag box whisker data boxandwhiskerdata getmeanvalu seri item
number median yq1median box whisker data boxandwhiskerdata getq1valu seri item
number median yq3median box whisker data boxandwhiskerdata getq3valu seri item

domain axi domainaxi java2 valuetojava2d doublevalu data area dataarea
plot domain axi edg getdomainaxisedg

rectangl edg rectangleedg locat plot rang axi edg getrangeaxisedg
max yymax rang axi rangeaxi java2 valuetojava2d max ymax doublevalu data area dataarea
locat
min yymin rang axi rangeaxi java2 valuetojava2d min ymin doublevalu data area dataarea
locat
median yymedian rang axi rangeaxi java2 valuetojava2d median ymedian doublevalu
data area dataarea locat
averag yyaverag
averag yaverag
averag yyaverag rang axi rangeaxi java2 valuetojava2d averag yaverag doublevalu
data area dataarea locat

median yyq1median rang axi rangeaxi java2 valuetojava2d median yq1median doublevalu
data area dataarea locat
median yyq3median rang axi rangeaxi java2 valuetojava2d median yq3median doublevalu
data area dataarea locat

exact box width exactboxwidth box width getboxwidth
width exact box width exactboxwidth
data area dataareax data area dataarea height getheight
max box percent maxboxperc
max box width maxboxwidth data area dataareax max box percent maxboxperc
exact box width exactboxwidth
item count itemcount box whisker data boxandwhiskerdata item count getitemcount seri
exact box width exactboxwidth data area dataareax item count itemcount
exact box width exactboxwidth
width

exact box width exactboxwidth max box width maxboxwidth
width max box width maxboxwidth


width exact box width exactboxwidth



paint box paint getboxpaint

set paint setpaint

stroke item stroke getitemstrok seri item
set stroke setstrok

draw upper shadow
draw line2 line2d doubl max yymax median yyq3median
draw line2 line2d doubl max yymax width max yymax
width

draw lower shadow
draw line2 line2d doubl min yymin median yyq1median
draw line2 line2d doubl min yymin width min yymin
width

draw bodi
shape box
median yyq1median median yyq3median
box rectangle2 rectangle2d doubl median yyq1median width
median yyq3median median yyq1median width


box rectangle2 rectangle2d doubl median yyq3median width
median yyq1median median yyq3median width

box paint getboxpaint
set paint setpaint box paint getboxpaint

fill box fillbox
fill box

draw box

draw median
set paint setpaint artifact paint getartifactpaint
draw line2 line2d doubl median yymedian
width median yymedian width

draw averag special aim requir
averag yaverag
radiu aradiu width
ellipse2 ellipse2d doubl avg ellips avgellips ellipse2 ellipse2d doubl
averag yyaverag radiu aradiu radiu aradiu radiu aradiu
radiu aradiu
fill avg ellips avgellips
draw avg ellips avgellips


fixm draw outlier

add entiti item
entiti box intersect data area dataarea
add entiti addent entiti box dataset seri item averag yyaverag








































































































































































































































































































































































