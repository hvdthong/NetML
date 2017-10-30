















org apach common math3 linear











implement symmlq iter linear solver propos
href paig1975 paig saunder implement
larg base fortran code michael saunder
href http www stanford group sol softwar symmlq f77


symmlq design solv system linear equat middot
time adjoint linear oper defin
link real linear oper reallinearoper vector oper
requir posit definit definit method
conjug gradient prefer requir
number iter symmlq slightli work iter


symmlq design solv system shift middot middot
shift scalar shift suitabl chosen
comput vector approxim unnorm eigenvector
method invers iter rayleigh quotient iter
linear oper shift middot posit
definit adjoint work iter
slightli shift

precondit

precondit reduc number iter requir solver
provid posit definit precondition
middot
approxim
shift middot sens matrix vector
product form middot comput effici
symmlq implicitli solv system equat
middot shift middot middot middot
hat middot
hat middot hat hat

hat middot shift middot middot
hat middot
solut
middot hat
residu
hat hat hat middot hat
middot shift middot middot
middot


precondit link iter linear solver event iterativelinearsolverev
solver fire
link iter linear solver event iterativelinearsolverev norm residu getnormofresidu return norm
precondit updat residu middot norm
residu

stopcrit default stop criterion

stop criterion implement iter stop rhat
delta ahat xhat xhat current estim
solut transform system rhat current estim
residu delta user toler

iter count

present context iter understood evalu
matrix vector product middot initi phase
count iter user requir check symmetri
entail matrix vector product initi phase
product account iter count
word number iter requir reach converg
ident check requir


present definit iter count differ adopt
origin fotran code initi phase
account

initguess initi guess solut

code paramet

link solv real linear oper reallinearoper real vector realvector real vector realvector
link solv real linear oper reallinearoper real linear oper reallinearoper real vector realvector real vector realvector
link solv place solveinplac real linear oper reallinearoper real vector realvector real vector realvector
link solv place solveinplac real linear oper reallinearoper real linear oper reallinearoper real vector realvector real vector realvector
link solv place solveinplac real linear oper reallinearoper real linear oper reallinearoper real vector realvector real vector realvector

consid initi guess set
initi phase good approxim
comput middot solv middot
set

context except context

standard link dimens mismatch except dimensionmismatchexcept
link adjoint oper except nonselfadjointoperatorexcept linear oper
precondition symmetr link except context exceptioncontext
inform

kei code oper point offend linear oper
kei code vector1 point offend vector
kei code vector2 point offend vector
middot middot middot
middot accuraci



link posit definit oper except nonpositivedefiniteoperatorexcept thrown
precondition posit definit relev kei
link except context exceptioncontext

kei code oper point offend linear oper

kei code vector point offend vector
middot middot


refer

paig1975 paig saunder
paig saunder
href http www stanford group sol softwar symmlq ps75 pdf
solut spars indefinit system linear equat siam
journal numer analysi


version


symm symmlq

































































































































































































































































































































































































perform initi phase symmlq algorithm
state variabl code object correspond


init
set

set lanczo vector beta1


copi
copi oper
check
check symmetri checksymmetri oper


beta1 dot product dotproduct
beta1
npdlo except thrownpdloexcept

beta1
stop
null bisnul


null bisnul
beta1 fast math fastmath sqrt beta1
point


beta1 beta

real vector realvector map multipli mapmultipli beta1
oper
check
check symmetri checksymmetri oper


set lanczo vector beta
small eigenvector

daxpi shift
alpha dot product dotproduct
daxpi alpha beta1

point
alpha alpha
beta

make orthogon
vty dot product dotproduct
vtv dot product dotproduct
daxpi vty vtv
copi

oper

oldb beta1
beta dot product dotproduct
beta
npdlo except thrownpdloexcept

beta fast math fastmath sqrt beta

point
oldb beta
beta beta
beta
beta

cgnorm beta1
gbar alpha
dbar beta
gamma zeta gammazeta beta1
minu ep zeta minusepszeta
bstep
snprod
tnorm alpha alpha beta beta
ynorm2
gmax fast math fastmath ab alpha mach prec
gmin gmax

goodb
wbar arrai real vector arrayrealvector row dimens getrowdimens
wbar set

wbar

updat norm updatenorm


















































































































































































































































































































































































































































































































































































































