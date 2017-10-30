
















org apach common math geometri








rotat dimension space

rotat repres mathemat
entiti matric ax angl cardan euler angl
quaternion present higher level abstract
user orient hide implement detail
curiou quaternion intern represent
user build rotat represent
represent retriev
code rotat code instanc constructor
getter addit rotat built implicitli
set vector imag
impli convert
represent convert rotat
matrix set cardan angl
singl line code
pre
angl rotat matrix angl getangl rotat order rotationord xyz
pre
focu orient rotat
underli represent built
intern represent rotat oper basic
transform dimension link vector3 vector3d vector
dimension link vector3 vector3d vector depend applic
mean vector vari semant rotat
spacecraft attitud simul tool user
vector fix earth direct
frame chang rotat transform coordin vector inerti
frame coordin vector satellit frame
rotat implicitli defin relat frame
telescop control applic rotat
transform sight direct rest desir observ
direct telescop point object interest
rotat transform direct rest topocentr frame
sight direct topocentr frame impli
frame fix vector move
approach combin telescop
transform observ direct topocentr
frame observ direct inerti frame take account observatori
locat earth rotat essenti applic
approach

exampl show rotat user
push user specif definit
provid method code project vector destin frame projectvectorintodestinationfram code
code comput transform direct computetransformeddirect code simpler gener
method link appli applyto vector3 vector3d appli applyto vector3 vector3d link
appli invers applyinverseto vector3 vector3d appli invers applyinverseto vector3 vector3d

rotat basic vectori oper rotat
compos composit oper code
code mean vector code code
code code rotat
addit vector rotat appli
rotat previou notat
appli code code code code result
code code purpos
method link appli applyto rotat appli applyto rotat
link appli invers applyinverseto rotat appli invers applyinverseto rotat

rotat guarante immut object

version revis date
vector3 vector3d
rotat order rotationord



rotat serializ







































































































































































































build rotat transform pair vector pair

scale factor instanc appli
pair produc pair


angular separ
angular separ
correct
correct vector
plane

param vector origin pair
param vector origin pair
param desir imag rotat
param desir imag rotat
except illeg argument except illegalargumentexcept norm vector

rotat vector3 vector3d vector3 vector3d vector3 vector3d vector3 vector3d

norm comput
u1u1 vector3 vector3d dot product dotproduct
u2u2 vector3 vector3d dot product dotproduct
v1v1 vector3 vector3d dot product dotproduct
v2v2 vector3 vector3d dot product dotproduct
u1u1 u2u2 v1v1 v2v2
math runtim except mathruntimeexcept creat illeg argument except createillegalargumentexcept local format localizedformat norm rotat defin vector


u1x getx
u1i geti
u1z getz

u2x getx
u2i geti
u2z getz

normal order v1' v1'
coeff fast math fastmath sqrt u1u1 v1v1
v1x coeff getx
v1y coeff geti
v1z coeff getz
vector3 vector3d v1x v1y v1z

adjust order v2' v2'
u1u2 vector3 vector3d dot product dotproduct
v1v2 vector3 vector3d dot product dotproduct
coeff coeffu u1u2 u1u1
coeff coeffv v1v2 u1u1
beta fast math fastmath sqrt u2u2 u1u2 coeff coeffu v2v2 v1v2 coeff coeffv
alpha coeff coeffu beta coeff coeffv
v2x alpha v1x beta getx
v2y alpha v1y beta geti
v2z alpha v1z beta getz
vector3 vector3d v2x v2y v2z

preliminari comput explicit formul
reli vector3 vector3d order avoid build lot
temporari object
vector3 vector3d ref uref
vector3 vector3d ref vref
dx1 v1x getx
dy1 v1y geti
dz1 v1z getz
dx2 v2x getx
dy2 v2y geti
dz2 v2z getz
vector3 vector3d vector3 vector3d dy1 dz2 dz1 dy2
dz1 dx2 dx1 dz2
dx1 dy2 dy1 dx2
getx u1i u2z u1z u2i
geti u1z u2x u1x u2z
getz u1x u2i u1i u2x


vector plane
vector
vector3 vector3d vector3 vector3d cross product crossproduct
vector3 vector3d vector3 vector3d cross product crossproduct
u3x getx
u3i geti
u3z getz
v3x getx
v3y geti
v3z getz

dx3 v3x u3x
dy3 v3y u3i
dz3 v3z u3z
vector3 vector3d dy1 dz3 dz1 dy3
dz1 dx3 dx1 dz3
dx1 dy3 dy1 dx3
getx u1i u3z u1z u3i
geti u1z u3x u1x u3z
getz u1x u3i u1i u3x


vector align

vector3 vector3d dy2 dz3 dz2 dy3
dz2 dx3 dx2 dz3
dx2 dy3 dy2 dx3
getx u2i u3z u2z u3i
geti u2z u3x u2x u3z
getz u2x u3i u2i u3x


vector align
ident rotat







comput scalar part
ref uref
ref vref





comput vectori part
fast math fastmath sqrt
inv
inv getx
inv geti
inv getz

comput scalar part
vector3 vector3d ref uref geti ref uref getz
ref uref getz ref uref getx
ref uref getx ref uref geti
vector3 vector3d dot product dotproduct
vector3 vector3d dot product dotproduct ref vref

































































































































































































































































































































































































































































































































































































































































