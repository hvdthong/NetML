















org apach common math3 geometri euclidean on









repres region set interv
version


interv set intervalsset abstract region abstractregion euclidean1 euclidean1d euclidean1 euclidean1d















































































































































































updat interv list
param node current node
param list list updat
param lower lower bound current convex cell
param upper upper bound current convex cell

recurs list recurselist bsp tree bsptree euclidean1 euclidean1d node
list interv list
lower upper

node cut getcut
boolean node attribut getattribut
leaf cell insid cell interv
list add interv lower upper


orient point orientedpoint orient point orientedpoint node cut getcut hyperplan gethyperplan
vector1 vector1d loc locat getloc
loc getx

make explor tree increas order
bsp tree bsptree euclidean1 euclidean1d low
direct isdirect node minu getminu node getplu
bsp tree bsptree euclidean1 euclidean1d high
direct isdirect node getplu node minu getminu

recurs list recurselist low list lower
check point checkpoint low loc locat insid
check point checkpoint high loc locat insid
merg interv ad high tree
list remov list size lower getlow

recurs list recurselist high list upper






