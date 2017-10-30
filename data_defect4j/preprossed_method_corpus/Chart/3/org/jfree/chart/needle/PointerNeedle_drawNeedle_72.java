












































org jfree chart needl








needl shape pointer
link org jfree chart plot compass plot compassplot

pointer needl pointerneedl meter needl meterneedl






draw needl

param graphic devic
param plot area plotarea plot area
param rotat rotat point
param angl angl

draw needl drawneedl graphics2 graphics2d rectangle2 rectangle2d plot area plotarea
point2 point2d rotat angl

gener path generalpath shape1 gener path generalpath
gener path generalpath shape2 gener path generalpath
min minx plot area plotarea min getminx
min mini plot area plotarea min getmini
max maxx plot area plotarea max getmaxx
max maxi plot area plotarea max getmaxi
mid midx min minx plot area plotarea width getwidth
mid midi min mini plot area plotarea height getheight

shape1 move moveto min minx mid midi
shape1 line lineto mid midx min mini
shape1 line lineto max maxx mid midi
shape1 close path closepath

shape2 move moveto min minx mid midi
shape2 line lineto mid midx max maxi
shape2 line lineto max maxx mid midi
shape2 close path closepath

rotat angl
rotat huston spin
transform gettransform set rotat settorot angl rotat getx rotat geti
shape1 transform transform gettransform
shape2 transform transform gettransform


fill paint getfillpaint
set paint setpaint fill paint getfillpaint
fill shape1


highlight paint gethighlightpaint
set paint setpaint highlight paint gethighlightpaint
fill shape2


outlin paint getoutlinepaint
set stroke setstrok outlin stroke getoutlinestrok
set paint setpaint outlin paint getoutlinepaint
draw shape1
draw shape2













































