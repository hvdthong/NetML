






















































org jfree chart render categori

























render simpl gantt chart

gantt render ganttrender interv bar render intervalbarrender



















































































































































































draw task subtask item

param graphic devic
param state render state
param data area dataarea data plot area
param plot plot
param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param dataset data
param row row index base
param column column index base

draw task drawtask graphics2 graphics2d
categori item render state categoryitemrendererst state
rectangle2 rectangle2d data area dataarea
categori plot categoryplot plot
categori axi categoryaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi
gantt categori dataset ganttcategorydataset dataset
row
column

count dataset interv count getsubintervalcount row column
count
draw task drawtask state data area dataarea plot domain axi domainaxi rang axi rangeaxi
dataset row column


plot orient plotorient orient plot orient getorient
subinterv subinterv count subinterv

rectangl edg rectangleedg rang axi locat rangeaxisloc plot rang axi edg getrangeaxisedg


number value0 dataset start getstartvalu row column subinterv
value0


translat value0 translatedvalue0 rang axi rangeaxi java2 valuetojava2d
value0 doublevalu data area dataarea rang axi locat rangeaxisloc


number value1 dataset end getendvalu row column subinterv
value1


translat value1 translatedvalue1 rang axi rangeaxi java2 valuetojava2d
value1 doublevalu data area dataarea rang axi locat rangeaxisloc

translat value1 translatedvalue1 translat value0 translatedvalue0
temp translat value1 translatedvalue1
translat value1 translatedvalue1 translat value0 translatedvalue0
translat value0 translatedvalue0 temp


rect start rectstart calcul bar calculatebarw0 plot plot orient getorient
data area dataarea domain axi domainaxi state row column
rect length rectlength math ab translat value1 translatedvalue1 translat value0 translatedvalue0
rect breadth rectbreadth state bar width getbarwidth

draw bar
rectangle2 rectangle2d bar
rectangl edg rectangleedg bar base barbas
plot orient getorient plot orient plotorient horizont
bar rectangle2 rectangle2d doubl translat value0 translatedvalue0 rect start rectstart
rect length rectlength rect breadth rectbreadth
bar base barbas rectangl edg rectangleedg left

plot orient getorient plot orient plotorient vertic
bar rectangle2 rectangle2d doubl rect start rectstart translat value0 translatedvalue0
rect breadth rectbreadth rect length rectlength
bar base barbas rectangl edg rectangleedg bottom


rectangle2 rectangle2d complet bar completebar
rectangle2 rectangle2d incomplet bar incompletebar
number percent dataset percent complet getpercentcomplet row column
subinterv
start start percent getstartperc
end end percent getendperc
percent
percent doublevalu
orient plot orient plotorient horizont
complet bar completebar rectangle2 rectangle2d doubl translat value0 translatedvalue0
rect start rectstart start rect breadth rectbreadth rect length rectlength
rect breadth rectbreadth end start
incomplet bar incompletebar rectangle2 rectangle2d doubl translat value0 translatedvalue0
rect length rectlength rect start rectstart start rect breadth rectbreadth
rect length rectlength rect breadth rectbreadth end start

orient plot orient plotorient vertic
complet bar completebar rectangle2 rectangle2d doubl rect start rectstart start
rect breadth rectbreadth translat value0 translatedvalue0 rect length rectlength
rect breadth rectbreadth end start
rect length rectlength
incomplet bar incompletebar rectangle2 rectangle2d doubl rect start rectstart start
rect breadth rectbreadth translat value0 translatedvalue0 rect breadth rectbreadth
end start rect length rectlength




shadow visibl getshadowsvis
bar painter getbarpaint paint bar shadow paintbarshadow row column bar
bar base barbas

bar painter getbarpaint paint bar paintbar row column bar bar base barbas

complet bar completebar
set paint setpaint complet paint getcompletepaint
fill complet bar completebar

incomplet bar incompletebar
set paint setpaint incomplet paint getincompletepaint
fill incomplet bar incompletebar

draw bar outlin isdrawbaroutlin
state bar width getbarwidth bar outlin width threshold
set stroke setstrok item stroke getitemstrok row column
set paint setpaint item outlin paint getitemoutlinepaint row column
draw bar


subinterv count
submit current data point crosshair candid
dataset index datasetindex plot index indexof dataset
compar column kei columnkei dataset column kei getcolumnkei column
compar row kei rowkei dataset row kei getrowkei row
domain axi domainaxi categori seri middl getcategoryseriesmiddl column kei columnkei
row kei rowkei dataset item margin getitemmargin data area dataarea
plot domain axi edg getdomainaxisedg
updat crosshair valu updatecrosshairvalu state crosshair state getcrosshairst
dataset row kei getrowkei row dataset column kei getcolumnkei column
value1 doublevalu dataset index datasetindex
translat value1 translatedvalue1 orient


collect entiti tool tip inform
state info getinfo
entiti collect entitycollect entiti state entiti collect getentitycollect
entiti
add item entiti additement entiti dataset row column bar








































































































































































































































