
























































org jfree chart render
























stack area render link plot xyplot

stack area renderer2 stackedxyarearenderer2 area renderer2 xyarearenderer2









































































































draw visual represent singl data item

param graphic devic
param state render state
param data area dataarea area data drawn
param info collect inform draw
param plot plot obtain standard color inform

param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param dataset dataset
param seri seri index base
param item item index base
param crosshair state crosshairst inform crosshair plot
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

setup collect option entiti info
shape entiti area entityarea
entiti collect entitycollect entiti
info
entiti info owner getown entiti collect getentitycollect


tabl dataset tablexydataset tdataset tabl dataset tablexydataset dataset
plot orient plotorient orient plot orient getorient

data point
dataset getxvalu seri item
dataset getyvalu seri item
doubl isnan


stack1 stack valu getstackvalu tdataset seri item

previou point point calcul
hot spot area chart entiti
dataset getxvalu seri math max item
dataset getyvalu seri math max item
doubl isnan


stack0 stack valu getstackvalu tdataset seri math max item


item count itemcount dataset item count getitemcount seri
dataset getxvalu seri math min item
item count itemcount
dataset getyvalu seri math min item
item count itemcount
doubl isnan


stack2 stack valu getstackvalu tdataset seri math min item
item count itemcount

xleft
xright
stack left stackleft averag stack valu averagestackvalu stack0 stack1
stack stackright averag stack valu averagestackvalu stack1 stack2
adj stack left adjstackleft adjust stack valu adjustedstackvalu stack0 stack1
adj stack adjstackright adjust stack valu adjustedstackvalu stack1 stack2

rectangl edg rectangleedg edge0 plot domain axi edg getdomainaxisedg

tran transx1 domain axi domainaxi java2 valuetojava2d data area dataarea edge0
tran left transxleft domain axi domainaxi java2 valuetojava2d xleft data area dataarea
edge0
tran transxright domain axi domainaxi java2 valuetojava2d xright data area dataarea
edge0

round coordin roundxcoordin
tran transx1 math round tran transx1
tran left transxleft math round tran left transxleft
tran transxright math round tran transxright

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
orient plot orient plotorient vertic
left move moveto tran transx1 tran transy1
left line lineto tran transx1 tran stack1 transstack1
left line lineto tran left transxleft tran stack left transstackleft
left line lineto tran left transxleft tran left transyleft


left move moveto tran transy1 tran transx1
left line lineto tran stack1 transstack1 tran transx1
left line lineto tran stack left transstackleft tran left transxleft
left line lineto tran left transyleft tran left transxleft

left close path closepath


orient plot orient plotorient vertic
left move moveto tran transx1 tran stack1 transstack1
left line lineto tran transx1 tran transy1
left line lineto tran left transxleft tran stack left transstackleft


left move moveto tran stack1 transstack1 tran transx1
left line lineto tran transy1 tran transx1
left line lineto tran stack left transstackleft tran left transxleft

left close path closepath


tran stack transstackright rang axi rangeaxi java2 valuetojava2d
adj stack adjstackright data area dataarea edge1
polygon

yright stack stackright
tran transyright
rang axi rangeaxi java2 valuetojava2d yright data area dataarea edge1
orient plot orient plotorient vertic
move moveto tran transx1 tran stack1 transstack1
line lineto tran transx1 tran transy1
line lineto tran transxright tran transyright
line lineto tran transxright tran stack transstackright


move moveto tran stack1 transstack1 tran transx1
line lineto tran transy1 tran transx1
line lineto tran transyright tran transxright
line lineto tran stack transstackright tran transxright

close path closepath


orient plot orient plotorient vertic
move moveto tran transx1 tran stack1 transstack1
line lineto tran transx1 tran transy1
line lineto tran transxright tran stack transstackright


move moveto tran stack1 transstack1 tran transx1
line lineto tran transy1 tran transx1
line lineto tran stack transstackright tran transxright

close path closepath


handl neg
tran transy1 rang axi rangeaxi java2 valuetojava2d stack1 data area dataarea
edge1
tran stack1 transstack1 rang axi rangeaxi java2 valuetojava2d stack1
data area dataarea edge1
tran stack left transstackleft rang axi rangeaxi java2 valuetojava2d
adj stack left adjstackleft data area dataarea edge1

left polygon

orient plot orient plotorient vertic
left move moveto tran transx1 tran stack1 transstack1
left line lineto tran transx1 tran transy1
left line lineto tran left transxleft tran stack left transstackleft


left move moveto tran stack1 transstack1 tran transx1
left line lineto tran transy1 tran transx1
left line lineto tran stack left transstackleft tran left transxleft

left clone


yleft stack left stackleft
tran left transyleft rang axi rangeaxi java2 valuetojava2d yleft
data area dataarea edge1
orient plot orient plotorient vertic
left move moveto tran transx1 tran transy1
left line lineto tran transx1 tran stack1 transstack1
left line lineto tran left transxleft tran stack left transstackleft
left line lineto tran left transxleft tran left transyleft


left move moveto tran transy1 tran transx1
left line lineto tran stack1 transstack1 tran transx1
left line lineto tran stack left transstackleft tran left transxleft
left line lineto tran left transyleft tran left transxleft

left close path closepath

tran stack transstackright rang axi rangeaxi java2 valuetojava2d
adj stack adjstackright data area dataarea edge1

polygon

orient plot orient plotorient vertic
move moveto tran transx1 tran stack1 transstack1
line lineto tran transx1 tran transy1
line lineto tran transxright tran stack transstackright


move moveto tran stack1 transstack1 tran transx1
line lineto tran transy1 tran transx1
line lineto tran stack transstackright tran transxright

close path closepath


yright stack stackright
tran transyright rang axi rangeaxi java2 valuetojava2d yright
data area dataarea edge1
orient plot orient plotorient vertic
move moveto tran transx1 tran stack1 transstack1
line lineto tran transx1 tran transy1
line lineto tran transxright tran transyright
line lineto tran transxright tran stack transstackright


move moveto tran stack1 transstack1 tran transx1
line lineto tran transy1 tran transx1
line lineto tran transyright tran transxright
line lineto tran stack transstackright tran transxright

close path closepath



seri paint stroke
paint item paint itempaint item paint getitempaint seri item
pass
set paint setpaint item paint itempaint
fill left
fill


add entiti item
entiti
gener path generalpath gener path generalpath left
append
entiti area entityarea
add entiti addent entiti entiti area entityarea dataset seri item
tran transx1 tran transy1














































































































