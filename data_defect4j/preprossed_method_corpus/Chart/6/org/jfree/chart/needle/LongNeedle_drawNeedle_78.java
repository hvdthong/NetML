










































org jfree chart needl









needl repres line

long needl longneedl meter needl meterneedl














draw needl

param graphic devic
param plot area plotarea plot area
param rotat rotat point
param angl angl

draw needl drawneedl graphics2 graphics2d rectangle2 rectangle2d plot area plotarea
point2 point2d rotat angl

gener path generalpath shape1 gener path generalpath
gener path generalpath shape2 gener path generalpath
gener path generalpath shape3 gener path generalpath

min minx plot area plotarea min getminx
min mini plot area plotarea min getmini
max maxx plot area plotarea max getmaxx
max maxi plot area plotarea max getmaxi
mid midx min minx plot area plotarea width getwidth rotat getrotatex
mid midi min mini plot area plotarea height getheight rotat getrotatei
mid midx min minx plot area plotarea width getwidth
mid midi min mini plot area plotarea height getheight
max maxi max maxi mid midi
min mini
min mini

shape1 move moveto min minx mid midi
shape1 line lineto mid midx min mini
shape1 line lineto mid midx
shape1 close path closepath

shape2 move moveto max maxx mid midi
shape2 line lineto mid midx min mini
shape2 line lineto mid midx
shape2 close path closepath

shape3 move moveto min minx mid midi
shape3 line lineto mid midx max maxi
shape3 line lineto max maxx mid midi
shape3 line lineto mid midx
shape3 close path closepath

shape shape1
shape shape2
shape shape3

rotat angl
rotat huston spin
transform gettransform set rotat settorot angl rotat getx rotat geti
shape1 creat transform shape createtransformedshap transform
shape2 creat transform shape createtransformedshap transform
shape3 creat transform shape createtransformedshap transform



highlight paint gethighlightpaint
set paint setpaint highlight paint gethighlightpaint
fill


fill paint getfillpaint
set paint setpaint fill paint getfillpaint
fill
fill



outlin paint getoutlinepaint
set stroke setstrok outlin stroke getoutlinestrok
set paint setpaint outlin paint getoutlinepaint
draw
draw
draw




































