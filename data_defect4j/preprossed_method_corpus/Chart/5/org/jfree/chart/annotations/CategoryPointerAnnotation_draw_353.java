









































org jfree chart annot




























arrow label link categori plot categoryplot arrow
drawn user defin angl point categori
locat annot

arrow length offset categori locat
control tip radiu base radiu attribut imagin
circl categori coordin circl defin
tip radiu outer circl defin base radiu draw
arrow start point outer circl point
determin angl arrow tip drawn
point circl



categori pointer annot categorypointerannot categori text annot categorytextannot


































































































































































































































































draw annot

param graphic devic
param plot plot
param data area dataarea data area
param domain axi domainaxi domain axi
param rang axi rangeaxi rang axi

draw graphics2 graphics2d categori plot categoryplot plot rectangle2 rectangle2d data area dataarea
categori axi categoryaxi domain axi domainaxi axi valueaxi rang axi rangeaxi

plot orient plotorient orient plot orient getorient
rectangl edg rectangleedg domain edg domainedg plot resolv domain axi locat resolvedomainaxisloc
plot domain axi locat getdomainaxisloc orient
rectangl edg rectangleedg rang edg rangeedg plot resolv rang axi locat resolverangeaxisloc
plot rang axi locat getrangeaxisloc orient
categori dataset categorydataset dataset plot dataset getdataset
cat index catindex dataset column index getcolumnindex categori getcategori
cat count catcount dataset column count getcolumncount
j2dx domain axi domainaxi categori middl getcategorymiddl cat index catindex cat count catcount
data area dataarea domain edg domainedg
j2dy rang axi rangeaxi java2 valuetojava2d getvalu data area dataarea rang edg rangeedg
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
line2 line2d line line2 line2d doubl start startx start starti end endx end endi
draw line
fill arrow

draw label
set font setfont font getfont
set paint setpaint paint getpaint
label labelx j2dx
math co angl base radiu baseradiu label offset labeloffset
label labe j2dy
math sin angl base radiu baseradiu label offset labeloffset
rectangle2 rectangle2d hotspot text util textutil draw align string drawalignedstr text gettext
label labelx label labe text anchor gettextanchor
todo implement entiti annot

















































































































