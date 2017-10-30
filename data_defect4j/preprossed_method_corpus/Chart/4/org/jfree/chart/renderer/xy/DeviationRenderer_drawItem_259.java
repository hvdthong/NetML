











































org jfree chart render






















specialis subclass link line shape render xylineandshaperender requir
link interv dataset intervalxydataset repres interv shade
area valu chart
shown gener
code deviat render demo1 deviationrendererdemo1 java code program includ
free chart jfreechart demo collect

img src imag deviat render sampl deviationrenderersampl png
alt deviat render sampl deviationrenderersampl png



deviat render deviationrender line shape render xylineandshaperender




































































































































































draw visual represent singl data item

param graphic devic
param state render state
param data area dataarea area data drawn
param plot plot obtain standard color
inform
param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param dataset dataset
param seri seri index base
param item item index base
param pass pass index

draw item drawitem graphics2 graphics2d item render state xyitemrendererst state
rectangle2 rectangle2d data area dataarea plot xyplot plot axi valueaxi domain axi domainaxi
axi valueaxi rang axi rangeaxi dataset xydataset dataset seri item
select pass

item visibl
item visibl getitemvis seri item



pass draw shade
pass
interv dataset intervalxydataset interv dataset intervaldataset interv dataset intervalxydataset dataset
state state drstate state state

interv dataset intervaldataset getxvalu seri item
low ylow interv dataset intervaldataset start getstartyvalu seri item
high yhigh interv dataset intervaldataset end getendyvalu seri item

rectangl edg rectangleedg axi locat xaxisloc plot domain axi edg getdomainaxisedg
rectangl edg rectangleedg axi locat yaxisloc plot rang axi edg getrangeaxisedg

domain axi domainaxi java2 valuetojava2d data area dataarea axi locat xaxisloc
low yylow rang axi rangeaxi java2 valuetojava2d low ylow data area dataarea
axi locat yaxisloc
high yyhigh rang axi rangeaxi java2 valuetojava2d high yhigh data area dataarea
axi locat yaxisloc

plot orient plotorient orient plot orient getorient
orient plot orient plotorient horizont
state drstate lower coordin lowercoordin add low yylow
state drstate upper coordin uppercoordin add high yyhigh

orient plot orient plotorient vertic
state drstate lower coordin lowercoordin add low yylow
state drstate upper coordin uppercoordin add high yyhigh


item dataset item count getitemcount seri
item seri draw lot
set alpha transpar
composit origin composit originalcomposit composit getcomposit
set composit setcomposit alpha composit alphacomposit instanc getinst
alpha composit alphacomposit src alpha
set paint setpaint item fill paint getitemfillpaint seri item select
gener path generalpath area gener path generalpath
coord state drstate lower coordin lowercoordin
area move moveto coord coord
state drstate lower coordin lowercoordin size
coord state drstate lower coordin lowercoordin
area line lineto coord coord

count state drstate upper coordin uppercoordin size
coord state drstate upper coordin uppercoordin count
area line lineto coord coord
count
coord state drstate upper coordin uppercoordin
area line lineto coord coord

area close path closepath
fill area
set composit setcomposit origin composit originalcomposit

state drstate lower coordin lowercoordin clear
state drstate upper coordin uppercoordin clear


line pass islinepass pass

code handl line valu
code
item
state state state
seri path seriespath reset
set point good setlastpointgood


item line visibl getitemlinevis seri item
draw primari line path drawprimarylineaspath state plot dataset pass
seri item select domain axi domainaxi rang axi rangeaxi
data area dataarea



pass add shape item
item pass isitempass pass

setup collect option entiti info
entiti collect entitycollect entiti
state info getinfo
entiti state info getinfo owner getown entiti collect getentitycollect


draw shape2 drawshape2 data area dataarea plot dataset pass seri item
select domain axi domainaxi rang axi rangeaxi entiti

























