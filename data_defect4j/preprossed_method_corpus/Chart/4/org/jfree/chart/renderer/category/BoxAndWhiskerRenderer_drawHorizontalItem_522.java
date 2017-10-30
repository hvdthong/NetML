















































































org jfree chart render categori






































box whisker render render requir
link box whisker categori dataset boxandwhiskercategorydataset
link categori plot categoryplot shown gener
code box whisker chart demo1 boxandwhiskerchartdemo1 java code program includ
free chart jfreechart demo collect

img src imag box whisker render sampl boxandwhiskerrenderersampl png
alt box whisker render sampl boxandwhiskerrenderersampl png

box whisker render boxandwhiskerrender abstract categori item render abstractcategoryitemrender





















































































































































































































































































































































































draw visual represent singl data item plot
horizont orient

param graphic devic
param state render state
param data area dataarea area plot drawn
param plot plot obtain standard color
inform
param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param dataset dataset instanc
link box whisker categori dataset boxandwhiskercategorydataset
param row row index base
param column column index base
param select item select
param pass number current pass



draw horizont item drawhorizontalitem graphics2 graphics2d
categori item render state categoryitemrendererst state rectangle2 rectangle2d data area dataarea
categori plot categoryplot plot categori axi categoryaxi domain axi domainaxi axi valueaxi rang axi rangeaxi
categori dataset categorydataset dataset row column select
pass

box whisker categori dataset boxandwhiskercategorydataset baw dataset bawdataset
box whisker categori dataset boxandwhiskercategorydataset dataset

categori end categoryend domain axi domainaxi categori end getcategoryend column
column count getcolumncount data area dataarea plot domain axi edg getdomainaxisedg
categori start categorystart domain axi domainaxi categori start getcategorystart column
column count getcolumncount data area dataarea plot domain axi edg getdomainaxisedg
categori width categorywidth math ab categori end categoryend categori start categorystart

categori start categorystart
seri count seriescount row count getrowcount
categori count categorycount column count getcolumncount

seri count seriescount
seri gap seriesgap data area dataarea height getheight item margin getitemmargin
categori count categorycount seri count seriescount
width usedwidth state bar width getbarwidth seri count seriescount
seri gap seriesgap seri count seriescount
offset start box total width smaller
categori width
offset categori width categorywidth width usedwidth
offset row state bar width getbarwidth seri gap seriesgap


offset start box box width smaller
categori width
offset categori width categorywidth state bar width getbarwidth
offset


set paint setpaint item paint getitempaint row column select
stroke item stroke getitemstrok row column select
set stroke setstrok

rectangl edg rectangleedg locat plot rang axi edg getrangeaxisedg

number xq1 baw dataset bawdataset getq1valu row column
number xq3 baw dataset bawdataset getq3valu row column
number max xmax baw dataset bawdataset max regular getmaxregularvalu row column
number min xmin baw dataset bawdataset min regular getminregularvalu row column

shape box
xq1 xq3 max xmax min xmin

xxq1 rang axi rangeaxi java2 valuetojava2d xq1 doublevalu data area dataarea
locat
xxq3 rang axi rangeaxi java2 valuetojava2d xq3 doublevalu data area dataarea
locat
max xxmax rang axi rangeaxi java2 valuetojava2d max xmax doublevalu data area dataarea
locat
min xxmin rang axi rangeaxi java2 valuetojava2d min xmin doublevalu data area dataarea
locat
yymid state bar width getbarwidth

draw upper shadow
draw line2 line2d doubl max xxmax yymid xxq3 yymid
draw line2 line2d doubl max xxmax max xxmax
state bar width getbarwidth

draw lower shadow
draw line2 line2d doubl min xxmin yymid xxq1 yymid
draw line2 line2d doubl min xxmin min xxmin
state bar width getbarwidth

draw box
box rectangle2 rectangle2d doubl math min xxq1 xxq3
math ab xxq1 xxq3 state bar width getbarwidth
fill box fillbox
fill box

set stroke setstrok item outlin stroke getitemoutlinestrok row column select
set paint setpaint item outlin paint getitemoutlinepaint row column select
draw box


draw special aim requir
set paint setpaint artifact paint artifactpaint
radiu aradiu averag radiu
visibl meanvis
number xmean baw dataset bawdataset getmeanvalu row column
xmean
xxmean rang axi rangeaxi java2 valuetojava2d xmean doublevalu
data area dataarea locat
radiu aradiu state bar width getbarwidth
check averag marker fact
visibl draw
xxmean data area dataarea min getminx radiu aradiu
xxmean data area dataarea max getmaxx radiu aradiu
ellipse2 ellipse2d doubl avg ellips avgellips ellipse2 ellipse2d doubl xxmean
radiu aradiu radiu aradiu radiu aradiu radiu aradiu
fill avg ellips avgellips
draw avg ellips avgellips




draw median
median visibl medianvis
number median xmedian baw dataset bawdataset median getmedianvalu row column
median xmedian
median xxmedian rang axi rangeaxi java2 valuetojava2d median xmedian doublevalu
data area dataarea locat
draw line2 line2d doubl median xxmedian median xxmedian
state bar width getbarwidth



collect entiti tool tip inform
state info getinfo box
entiti collect entitycollect entiti state entiti collect getentitycollect
entiti
add entiti addent entiti box dataset row column select








































































































































































































































































































































































