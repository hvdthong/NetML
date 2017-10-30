







































































org jfree chart render categori






































box whisker render render requir
link box whisker categori dataset boxandwhiskercategorydataset
link categori plot categoryplot

box whisker render boxandwhiskerrender abstract categori item render abstractcategoryitemrender





































































































































































































































































































































































































draw visual represent singl data item plot
vertic orient

param graphic devic
param state render state
param data area dataarea area plot drawn
param plot plot obtain standard color inform

param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param dataset dataset
param row row index base
param column column index base

draw vertic item drawverticalitem graphics2 graphics2d
categori item render state categoryitemrendererst state
rectangle2 rectangle2d data area dataarea
categori plot categoryplot plot
categori axi categoryaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi
categori dataset categorydataset dataset
row
column

box whisker categori dataset boxandwhiskercategorydataset baw dataset bawdataset
box whisker categori dataset boxandwhiskercategorydataset dataset

categori end categoryend domain axi domainaxi categori end getcategoryend column
column count getcolumncount data area dataarea plot domain axi edg getdomainaxisedg
categori start categorystart domain axi domainaxi categori start getcategorystart column
column count getcolumncount data area dataarea plot domain axi edg getdomainaxisedg
categori width categorywidth categori end categoryend categori start categorystart

categori start categorystart
seri count seriescount row count getrowcount
categori count categorycount column count getcolumncount

seri count seriescount
seri gap seriesgap data area dataarea width getwidth item margin getitemmargin
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


averag yyaverag
outlier yyoutlier

paint item paint getitempaint row column

set paint setpaint

stroke item stroke getitemstrok row column
set stroke setstrok

radiu aradiu averag radiu

rectangl edg rectangleedg locat plot rang axi edg getrangeaxisedg

number yq1 baw dataset bawdataset getq1valu row column
number yq3 baw dataset bawdataset getq3valu row column
number max ymax baw dataset bawdataset max regular getmaxregularvalu row column
number min ymin baw dataset bawdataset min regular getminregularvalu row column
shape box
yq1 yq3 max ymax min ymin

yyq1 rang axi rangeaxi java2 valuetojava2d yq1 doublevalu data area dataarea
locat
yyq3 rang axi rangeaxi java2 valuetojava2d yq3 doublevalu data area dataarea
locat
max yymax rang axi rangeaxi java2 valuetojava2d max ymax doublevalu
data area dataarea locat
min yymin rang axi rangeaxi java2 valuetojava2d min ymin doublevalu
data area dataarea locat
xxmid state bar width getbarwidth

draw upper shadow
draw line2 line2d doubl xxmid max yymax xxmid yyq3
draw line2 line2d doubl max yymax state bar width getbarwidth
max yymax

draw lower shadow
draw line2 line2d doubl xxmid min yymin xxmid yyq1
draw line2 line2d doubl min yymin state bar width getbarwidth
min yymin

draw bodi
box rectangle2 rectangle2d doubl math min yyq1 yyq3
state bar width getbarwidth math ab yyq1 yyq3
fill box fillbox
fill box

draw box



set paint setpaint artifact paint artifactpaint

draw special aim requir
number ymean baw dataset bawdataset getmeanvalu row column
ymean
averag yyaverag rang axi rangeaxi java2 valuetojava2d ymean doublevalu
data area dataarea locat
radiu aradiu state bar width getbarwidth
ellipse2 ellipse2d doubl avg ellips avgellips ellipse2 ellipse2d doubl radiu aradiu
averag yyaverag radiu aradiu radiu aradiu radiu aradiu
fill avg ellips avgellips
draw avg ellips avgellips


draw median
number median ymedian baw dataset bawdataset median getmedianvalu row column
median ymedian
median yymedian rang axi rangeaxi java2 valuetojava2d median ymedian doublevalu
data area dataarea locat
draw line2 line2d doubl median yymedian state bar width getbarwidth
median yymedian


draw outlier youtlier
max axi maxaxisvalu rang axi rangeaxi java2 valuetojava2d
rang axi rangeaxi upper bound getupperbound data area dataarea locat radiu aradiu
min axi minaxisvalu rang axi rangeaxi java2 valuetojava2d
rang axi rangeaxi lower bound getlowerbound data area dataarea locat radiu aradiu

set paint setpaint

draw outlier
radiu oradiu state bar width getbarwidth outlier radiu
list outlier arrai list arraylist
outlier list collect outlierlistcollect outlier list collect outlierlistcollect
outlier list collect outlierlistcollect

outlier arrai sort outlier put
list farout set flag
outlier list collect outlierlistcollect
list outlier youtlier baw dataset bawdataset outlier getoutli row column
outlier youtlier
outlier youtlier size
outlier number outlier youtlier doublevalu
number min outlier minoutli baw dataset bawdataset min outlier getminoutli row column
number max outlier maxoutli baw dataset bawdataset max outlier getmaxoutli row column
number min regular minregular baw dataset bawdataset min regular getminregularvalu row column
number max regular maxregular baw dataset bawdataset max regular getmaxregularvalu row column
outlier max outlier maxoutli doublevalu
outlier list collect outlierlistcollect set high sethighfarout

outlier min outlier minoutli doublevalu
outlier list collect outlierlistcollect set low setlowfarout

outlier max regular maxregular doublevalu
outlier yyoutlier rang axi rangeaxi java2 valuetojava2d outlier data area dataarea
locat
outlier add outlier state bar width getbarwidth
outlier yyoutlier radiu oradiu

outlier min regular minregular doublevalu
outlier yyoutlier rang axi rangeaxi java2 valuetojava2d outlier data area dataarea
locat
outlier add outlier state bar width getbarwidth
outlier yyoutlier radiu oradiu

collect sort outlier


process outlier outlier ad
outlier list outlier list made
iter iter outlier iter iter hasnext
outlier outlier outlier iter
outlier list collect outlierlistcollect add outlier


iter iter outlier list collect outlierlistcollect iter
iter hasnext
outlier list outlierlist list outlier list outlierlist iter
outlier outlier list averag outlier getaveragedoutli
point2 point2d point outlier point getpoint

list multipl ismultipl
draw multipl ellips drawmultipleellips point state bar width getbarwidth radiu oradiu



draw ellips drawellips point radiu oradiu



draw farout indic
outlier list collect outlierlistcollect high ishighfarout
draw high drawhighfarout radiu aradiu
state bar width getbarwidth max axi maxaxisvalu


outlier list collect outlierlistcollect low islowfarout
draw low drawlowfarout radiu aradiu
state bar width getbarwidth min axi minaxisvalu


collect entiti tool tip inform
state info getinfo box
entiti collect entitycollect entiti state entiti collect getentitycollect
entiti
add item entiti additement entiti dataset row column box






























































































































