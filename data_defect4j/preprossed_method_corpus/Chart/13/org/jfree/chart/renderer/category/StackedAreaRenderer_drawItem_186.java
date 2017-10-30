






























































org jfree chart render categori





















render draw stack area chart
link org jfree chart plot categori plot categoryplot

stack area render stackedarearender area render arearender



















































































draw singl data item

param graphic devic
param state render state
param data area dataarea data plot area
param plot plot
param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param dataset data
param row row index base
param column column index base
param pass pass index

draw item drawitem graphics2 graphics2d
categori item render state categoryitemrendererst state
rectangle2 rectangle2d data area dataarea
categori plot categoryplot plot
categori axi categoryaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi
categori dataset categorydataset dataset
row
column
pass

setup collect option entiti info
shape entiti area entityarea
entiti collect entitycollect entiti state entiti collect getentitycollect


number dataset getvalu row column

doublevalu

stack1 stack valu getstackvalu dataset row column


leav valu untransl
stack previou seri valu
translat
xx1 domain axi domainaxi categori middl getcategorymiddl column column count getcolumncount
data area dataarea plot domain axi edg getdomainaxisedg


previou point point calcul
hot spot area chart entiti

dataset getvalu row math max column

doublevalu

stack0 stack valu getstackvalu dataset row math max column

fixm calcul xx0
xx0 domain axi domainaxi categori start getcategorystart column column count getcolumncount
data area dataarea plot domain axi edg getdomainaxisedg

item count itemcount dataset column count getcolumncount

dataset getvalu row math min column item count itemcount

doublevalu

stack2 stack valu getstackvalu dataset row math min column
item count itemcount

xx2 domain axi domainaxi categori end getcategoryend column column count getcolumncount
data area dataarea plot domain axi edg getdomainaxisedg

fixm calcul left xxleft xxright
left xxleft xx0
xxright xx2

stack left stackleft averag stack valu averagestackvalu stack0 stack1
stack stackright averag stack valu averagestackvalu stack1 stack2
adj stack left adjstackleft adjust stack valu adjustedstackvalu stack0 stack1
adj stack adjstackright adjust stack valu adjustedstackvalu stack1 stack2

tran transy1

rectangl edg rectangleedg edge1 plot rang axi edg getrangeaxisedg

gener path generalpath left gener path generalpath
gener path generalpath gener path generalpath
handl posit
tran transy1 rang axi rangeaxi java2 valuetojava2d stack1 data area dataarea
edge1
tran stack1 transstack1 rang axi rangeaxi java2 valuetojava2d stack1
data area dataarea edge1
tran stack left transstackleft rang axi rangeaxi java2 valuetojava2d
adj stack left adjstackleft data area dataarea edge1

left polygon

yleft stack left stackleft
tran left transyleft
rang axi rangeaxi java2 valuetojava2d yleft data area dataarea edge1
left move moveto xx1 tran transy1
left line lineto xx1 tran stack1 transstack1
left line lineto left xxleft tran stack left transstackleft
left line lineto left xxleft tran left transyleft
left close path closepath


left move moveto xx1 tran stack1 transstack1
left line lineto xx1 tran transy1
left line lineto left xxleft tran stack left transstackleft
left close path closepath


tran stack transstackright rang axi rangeaxi java2 valuetojava2d
adj stack adjstackright data area dataarea edge1
polygon

yright stack stackright
tran transyright
rang axi rangeaxi java2 valuetojava2d yright data area dataarea edge1
move moveto xx1 tran stack1 transstack1
line lineto xx1 tran transy1
line lineto xxright tran transyright
line lineto xxright tran stack transstackright
close path closepath


move moveto xx1 tran stack1 transstack1
line lineto xx1 tran transy1
line lineto xxright tran stack transstackright
close path closepath


handl neg
tran transy1 rang axi rangeaxi java2 valuetojava2d stack1 data area dataarea
edge1
tran stack1 transstack1 rang axi rangeaxi java2 valuetojava2d stack1
data area dataarea edge1
tran stack left transstackleft rang axi rangeaxi java2 valuetojava2d
adj stack left adjstackleft data area dataarea edge1

left polygon

left move moveto xx1 tran stack1 transstack1
left line lineto xx1 tran transy1
left line lineto left xxleft tran stack left transstackleft
left clone


yleft stack left stackleft
tran left transyleft rang axi rangeaxi java2 valuetojava2d yleft
data area dataarea edge1
left move moveto xx1 tran transy1
left line lineto xx1 tran stack1 transstack1
left line lineto left xxleft tran stack left transstackleft
left line lineto left xxleft tran left transyleft
left close path closepath

tran stack transstackright rang axi rangeaxi java2 valuetojava2d
adj stack adjstackright data area dataarea edge1

polygon

move moveto xx1 tran stack1 transstack1
line lineto xx1 tran transy1
line lineto xxright tran stack transstackright
close path closepath


yright stack stackright
tran transyright rang axi rangeaxi java2 valuetojava2d yright
data area dataarea edge1
move moveto xx1 tran stack1 transstack1
line lineto xx1 tran transy1
line lineto xxright tran transyright
line lineto xxright tran stack transstackright
close path closepath



set paint setpaint item paint getitempaint row column
set stroke setstrok item stroke getitemstrok row column

seri paint stroke
paint item paint itempaint item paint getitempaint row column
pass
set paint setpaint item paint itempaint
fill left
fill


add entiti item
entiti
gener path generalpath gener path generalpath left
append
entiti area entityarea
add item entiti additement entiti dataset row column entiti area entityarea





















































































































































































































































































