






















































































org jfree chart render

































render draw candlestick link plot xyplot requir
link ohlc dataset ohlcdataset

render includ code calcul crosshair point
plot

candlestick render candlestickrender abstract item render abstractxyitemrender























































































































































































































































































































































































































































draw visual represent singl data item

param graphic devic
param state render state
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

horiz
plot orient plotorient orient plot orient getorient
orient plot orient plotorient horizont
horiz

orient plot orient plotorient vertic
horiz





setup collect option entiti info
entiti collect entitycollect entiti
info
entiti info owner getown entiti collect getentitycollect


ohlc dataset ohlcdataset high low data highlowdata ohlc dataset ohlcdataset dataset

high low data highlowdata getxvalu seri item
high yhigh high low data highlowdata high gethighvalu seri item
low ylow high low data highlowdata low getlowvalu seri item
open yopen high low data highlowdata open getopenvalu seri item
close yclose high low data highlowdata close getclosevalu seri item

rectangl edg rectangleedg domain edg domainedg plot domain axi edg getdomainaxisedg
domain axi domainaxi java2 valuetojava2d data area dataarea domain edg domainedg

rectangl edg rectangleedg edg plot rang axi edg getrangeaxisedg
high yyhigh rang axi rangeaxi java2 valuetojava2d high yhigh data area dataarea edg
low yylow rang axi rangeaxi java2 valuetojava2d low ylow data area dataarea edg
open yyopen rang axi rangeaxi java2 valuetojava2d open yopen data area dataarea edg
close yyclos rang axi rangeaxi java2 valuetojava2d close yclose data area dataarea edg

volum width volumewidth
stick width stickwidth
candl width candlewidth
deliber bound minimum max candl width maxcandlewidth
retain behaviour
volum width volumewidth candl width candlewidth
stick width stickwidth candl width candlewidth


width xxwidth
item count itemcount
auto width method autowidthmethod

widthmethod averag
item count itemcount high low data highlowdata item count getitemcount seri
horiz
width xxwidth data area dataarea height getheight item count itemcount


width xxwidth data area dataarea width getwidth item count itemcount



widthmethod smallest
note nice pre calcul seri
item count itemcount high low data highlowdata item count getitemcount seri
po lastpo
width xxwidth data area dataarea width getwidth
item count itemcount
po domain axi domainaxi java2 valuetojava2d
high low data highlowdata getxvalu seri data area dataarea
domain edg domainedg
po lastpo
width xxwidth math min width xxwidth
math ab po po lastpo

po lastpo po



widthmethod intervaldata
interv dataset intervalxydataset interv data intervalxydata
interv dataset intervalxydataset dataset
start po startpo domain axi domainaxi java2 valuetojava2d
interv data intervalxydata start getstartxvalu seri item
data area dataarea plot domain axi edg getdomainaxisedg
end po endpo domain axi domainaxi java2 valuetojava2d
interv data intervalxydata end getendxvalu seri item
data area dataarea plot domain axi edg getdomainaxisedg
width xxwidth math ab end po endpo start po startpo



width xxwidth auto width gap autowidthgap
width xxwidth auto width factor autowidthfactor
width xxwidth math min width xxwidth max candl width maxcandlewidth
volum width volumewidth math max math min max candl width maxcandlewidth width xxwidth
stick width stickwidth math max math min max candl width maxcandlewidth width xxwidth


paint item paint getitempaint seri item
paint outlin paint outlinepaint
outlin paint useoutlinepaint
outlin paint outlinepaint item outlin paint getitemoutlinepaint seri item

stroke item stroke getitemstrok seri item

set stroke setstrok

draw volum drawvolum
volum high low data highlowdata volum getvolumevalu seri item
volum height volumeheight volum max volum maxvolum

min max
horiz
min data area dataarea min getminx
max data area dataarea max getmaxx


min data area dataarea min getmini
max data area dataarea max getmaxi


volum zzvolum volum height volumeheight max min

set paint setpaint color grai
composit origin composit originalcomposit composit getcomposit
set composit setcomposit
alpha composit alphacomposit instanc getinst alpha composit alphacomposit src


horiz
fill rectangle2 rectangle2d doubl min volum width volumewidth
volum zzvolum volum width volumewidth


fill rectangle2 rectangle2d doubl volum width volumewidth
max volum zzvolum volum width volumewidth volum zzvolum


set composit setcomposit origin composit originalcomposit


outlin paint useoutlinepaint
set paint setpaint outlin paint outlinepaint


set paint setpaint


max open close yymaxopenclos math max open yyopen close yyclos
min open close yyminopenclos math min open yyopen close yyclos
max open close maxopenclos math max open yopen close yclose
min open close minopenclos math min open yopen close yclose

draw upper shadow
high yhigh max open close maxopenclos
horiz
draw line2 line2d doubl high yyhigh max open close yymaxopenclos


draw line2 line2d doubl high yyhigh max open close yymaxopenclos



draw lower shadow
low ylow min open close minopenclos
horiz
draw line2 line2d doubl low yylow min open close yyminopenclos


draw line2 line2d doubl low yylow min open close yyminopenclos



draw bodi
shape bodi
horiz
bodi rectangle2 rectangle2d doubl min open close yyminopenclos stick width stickwidth
max open close yymaxopenclos min open close yyminopenclos stick width stickwidth


bodi rectangle2 rectangle2d doubl stick width stickwidth min open close yyminopenclos
stick width stickwidth max open close yymaxopenclos min open close yyminopenclos

close yclose open yopen
paint uppaint
set paint setpaint paint uppaint


set paint setpaint

fill bodi


paint downpaint
set paint setpaint paint downpaint


set paint setpaint

fill bodi

outlin paint useoutlinepaint
set paint setpaint outlin paint outlinepaint


set paint setpaint

draw bodi

add entiti addent entiti bodi dataset seri item

























































































