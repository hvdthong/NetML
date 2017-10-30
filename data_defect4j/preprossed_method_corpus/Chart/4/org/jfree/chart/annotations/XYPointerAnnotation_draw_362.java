




















































org jfree chart annot




























arrow label link plot xyplot arrow
drawn user defin angl point
locat annot

arrow length offset locat control
tip radiu base radiu attribut imagin circl
coordin circl defin tip radiu
outer circl defin base radiu draw arrow start
point outer circl point determin angl
arrow tip drawn point circl


pointer annot xypointerannot text annot xytextannot
































































































































































































































































draw annot

param graphic devic
param plot plot
param data area dataarea data area
param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi
param render index rendererindex render index
param info plot render info

draw graphics2 graphics2d plot xyplot plot rectangle2 rectangle2d data area dataarea
axi valueaxi domain axi domainaxi axi valueaxi rang axi rangeaxi
render index rendererindex
plot render info plotrenderinginfo info

plot orient plotorient orient plot orient getorient
rectangl edg rectangleedg domain edg domainedg plot resolv domain axi locat resolvedomainaxisloc
plot domain axi locat getdomainaxisloc orient
rectangl edg rectangleedg rang edg rangeedg plot resolv rang axi locat resolverangeaxisloc
plot rang axi locat getrangeaxisloc orient
j2dx domain axi domainaxi java2 valuetojava2d getx data area dataarea domain edg domainedg
j2dy rang axi rangeaxi java2 valuetojava2d geti data area dataarea rang edg rangeedg
orient plot orient plotorient horizont
temp j2dx
j2dx j2dy
j2dy temp

start startx j2dx math co angl base radiu baseradiu
start starti j2dy math sin angl base radiu baseradiu

end endx j2dx math co angl tip radiu tipradiu
end endi j2dy math sin angl tip radiu tipradiu

arrow base arrowbasex end endx math co angl arrow length arrowlength
arrow base arrowbasei end endi math sin angl arrow length arrowlength

arrow left arrowleftx arrow base arrowbasex
math co angl math arrow width arrowwidth
arrow left arrowlefti arrow base arrowbasei
math sin angl math arrow width arrowwidth

arrow arrowrightx arrow base arrowbasex
math co angl math arrow width arrowwidth
arrow arrowrighti arrow base arrowbasei
math sin angl math arrow width arrowwidth

gener path generalpath arrow gener path generalpath
arrow move moveto end endx end endi
arrow line lineto arrow left arrowleftx arrow left arrowlefti
arrow line lineto arrow arrowrightx arrow arrowrighti
arrow close path closepath

set stroke setstrok arrow stroke arrowstrok
set paint setpaint arrow paint arrowpaint
line2 line2d line line2 line2d doubl start startx start starti arrow base arrowbasex arrow base arrowbasei
draw line
fill arrow

draw label
label labelx j2dx math co angl base radiu baseradiu
label offset labeloffset
label labe j2dy math sin angl base radiu baseradiu
label offset labeloffset
set font setfont font getfont
shape hotspot text util textutil calcul rotat string bound calculaterotatedstringbound
text gettext label labelx label labe text anchor gettextanchor
rotat angl getrotationangl rotat anchor getrotationanchor
background paint getbackgroundpaint
set paint setpaint background paint getbackgroundpaint
fill hotspot

set paint setpaint paint getpaint
text util textutil draw rotat string drawrotatedstr text gettext label labelx
label labe text anchor gettextanchor rotat angl getrotationangl
rotat anchor getrotationanchor
outlin visibl isoutlinevis
set stroke setstrok outlin stroke getoutlinestrok
set paint setpaint outlin paint getoutlinepaint
draw hotspot


string tool tip tooltip tool tip text gettooltiptext
string url url geturl
tool tip tooltip url
add entiti addent info hotspot render index rendererindex tool tip tooltip url














































































































