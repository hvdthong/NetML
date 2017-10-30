

























































org jfree chart render




















specialis render displai wind intens direct data

wind item render winditemrender abstract item render abstractxyitemrender













draw visual represent singl data item

param graphic devic
param state render state
param plot area plotarea area plot drawn
param info option inform collect
param plot plot obtain standard color
inform
param domain axi domainaxi horizont axi
param rang axi rangeaxi vertic axi
param dataset dataset
param seri seri index base
param item item index base
param crosshair state crosshairst crosshair inform plot
code code permit
param pass pass index

draw item drawitem graphics2 graphics2d
item render state xyitemrendererst state
rectangle2 rectangle2d plot area plotarea
plot render info plotrenderinginfo info
plot xyplot plot
axi valueaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi
dataset xydataset dataset
seri
item
crosshair state crosshairst crosshair state crosshairst
pass

wind dataset winddataset wind data winddata wind dataset winddataset dataset

paint seri paint seriespaint item paint getitempaint seri item
stroke seri stroke seriesstrok item stroke getitemstrok seri item
set paint setpaint seri paint seriespaint
set stroke setstrok seri stroke seriesstrok

data point

number wind data winddata getx seri item
number wind dir winddir wind data winddata wind direct getwinddirect seri item
number wforc wind data winddata wind forc getwindforc seri item
wind forc windforc wforc doublevalu

wdirt math radian toradian wind dir winddir doublevalu

ax1 ax2 ay1 ay2 rax2 ray2

rectangl edg rectangleedg domain axi locat domainaxisloc plot domain axi edg getdomainaxisedg
rectangl edg rectangleedg rang axi locat rangeaxisloc plot rang axi edg getrangeaxisedg
ax1 domain axi domainaxi java2 valuetojava2d doublevalu plot area plotarea
domain axi locat domainaxisloc
ay1 rang axi rangeaxi java2 valuetojava2d plot area plotarea rang axi locat rangeaxisloc

rax2 doublevalu wind forc windforc math co wdirt
ray2 wind forc windforc math sin wdirt

ax2 domain axi domainaxi java2 valuetojava2d rax2 plot area plotarea domain axi locat domainaxisloc
ay2 rang axi rangeaxi java2 valuetojava2d ray2 plot area plotarea rang axi locat rangeaxisloc

diri wind dir winddir intvalu
forcei wforc intvalu
string dirforc diri forcei
line2 line2d line line2 line2d doubl ax1 ay1 ax2 ay2

draw line
set paint setpaint color blue
set font setfont font tahoma

draw string drawstr dirforc ax1 ay1

set paint setpaint seri paint seriespaint
set stroke setstrok seri stroke seriesstrok

alx2 aly2 arx2 ary2
ralx2 raly2 rarx2 rary2

aldir math radian toradian wind dir winddir doublevalu

ralx2 wforc doublevalu math co aldir
doublevalu
raly2 wforc doublevalu math sin aldir

alx2 domain axi domainaxi java2 valuetojava2d ralx2 plot area plotarea domain axi locat domainaxisloc
aly2 rang axi rangeaxi java2 valuetojava2d raly2 plot area plotarea rang axi locat rangeaxisloc

line line2 line2d doubl alx2 aly2 ax2 ay2
draw line

ardir math radian toradian wind dir winddir doublevalu

rarx2 wforc doublevalu math co ardir
doublevalu
rary2 wforc doublevalu math sin ardir

arx2 domain axi domainaxi java2 valuetojava2d rarx2 plot area plotarea domain axi locat domainaxisloc
ary2 rang axi rangeaxi java2 valuetojava2d rary2 plot area plotarea rang axi locat rangeaxisloc

line line2 line2d doubl arx2 ary2 ax2 ay2
draw line















