
















org apach common math optim linear




















tableau simplex method



pre
rh

phase object
phase object
constraint
constraint
constraint
pre
phase object function
phase object function
amp decis variabl
extra decis variabl neg valu
amp slack surplu variabl
artifici variabl
rh hand side

version revis date


simplex tableau simplextableau serializ





















































































creat tableau
param maxim goal maxim object function
creat tableau

real matrix realmatrix creat tableau createtableau maxim

creat matrix correct size
width num decis variabl numdecisionvari num slack variabl numslackvari
num artifici variabl numartificialvari num object function getnumobjectivefunct rh
height constraint size num object function getnumobjectivefunct
array2 row real matrix array2drowrealmatrix matrix array2 row real matrix array2drowrealmatrix height width

initi object function row
num object function getnumobjectivefunct
matrix set entri setentri

index zindex num object function getnumobjectivefunct
matrix set entri setentri index zindex index zindex maxim
real vector realvector object coeffici objectivecoeffici
maxim coeffici getcoeffici map multipli mapmultipli coeffici getcoeffici
copi arrai copyarrai object coeffici objectivecoeffici data getdata matrix data ref getdataref index zindex
matrix set entri setentri index zindex width
maxim constant term getconstantterm constant term getconstantterm

restrict neg restricttononneg
matrix set entri setentri index zindex slack variabl offset getslackvariableoffset
invert coeffieci sum getinvertedcoeffiecientsum object coeffici objectivecoeffici


initi constraint row
slack var slackvar
artifici var artificialvar
constraint size
linear constraint linearconstraint constraint constraint
row num object function getnumobjectivefunct

decis variabl coeffici
copi arrai copyarrai constraint coeffici getcoeffici data getdata matrix data ref getdataref row


restrict neg restricttononneg
matrix set entri setentri row slack variabl offset getslackvariableoffset
invert coeffieci sum getinvertedcoeffiecientsum constraint coeffici getcoeffici


rh
matrix set entri setentri row width constraint getvalu

slack variabl
constraint relationship getrelationship relationship leq
matrix set entri setentri row slack variabl offset getslackvariableoffset slack var slackvar slack
constraint relationship getrelationship relationship geq
matrix set entri setentri row slack variabl offset getslackvariableoffset slack var slackvar excess


artifici variabl
constraint relationship getrelationship relationship
constraint relationship getrelationship relationship geq
matrix set entri setentri artifici variabl offset getartificialvariableoffset artifici var artificialvar
matrix set entri setentri row artifici variabl offset getartificialvariableoffset artifici var artificialvar
matrix set row vector setrowvector matrix row vector getrowvector subtract matrix row vector getrowvector row



matrix

































































































































































































































































































































































































