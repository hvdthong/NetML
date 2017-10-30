















org apach common math linear









implement conjug gradient method
link real linear oper reallinearoper close templat
href barr1994 barrett figur linear system
hand middot residu middot

stopcrit default stop criterion

stop criterion implement iter stop
delta hand side vector current
estim residu delta user toler
note call updat residu
differ residu due round error
href stra2002 strako tichi

iter count

present context iter understood evalu
matrix vector product middot initi phase
count iter

context except context

standard link dimens mismatch except dimensionmismatchexcept
link posit definit oper except nonpositivedefiniteoperatorexcept linear oper
precondition posit definit
link except context exceptioncontext inform

kei code oper point offend linear oper
kei code vector point offend vector
middot middot


refer

barr1994 barret
barrett berri chan demmel donato dongarra
eijkhout pozo romin van der vorst
href http www netlib org linalg html templat templat html
templat solut linear system build block iter
method siam
stra2002 strako tichi

strako tichi
href http etna mc kent vol pp56 dir pp56 pdf
error estim conjug gradient method work
finit precis comput electron transact
numer analysi


version


conjug gradient conjugategradi




















































































inherit doc inheritdoc
overrid
real vector realvector solv place solveinplac real linear oper reallinearoper
invert real linear oper invertiblereallinearoper
real vector realvector real vector realvector
null argument except nullargumentexcept squar oper except nonsquareoperatorexcept
dimens mismatch except dimensionmismatchexcept max count exceed except maxcountexceededexcept
check paramet checkparamet
iter manag iterationmanag manag iter manag getiterationmanag
initi stop criterion
manag reset iter count resetiterationcount
r2max delta delta dot product dotproduct

initi phase count iter
manag increment iter count incrementiterationcount
construct copi type
optim calcul matrix vector product

real vector realvector
real vector realvector copi
real vector realvector oper

real vector realvector combin
dot product dotproduct
real vector realvector





iter linear solver event iterativelinearsolverev event
event conjug gradient event conjugategradientev

real vector realvector residu getresidu
arrai real vector arrayrealvector unmodifi real vector unmodifiablerealvector


overrid
real vector realvector hand side vector getrighthandsidevector
arrai real vector arrayrealvector unmodifi real vector unmodifiablerealvector


overrid
real vector realvector solut getsolut
arrai real vector arrayrealvector unmodifi real vector unmodifiablerealvector


manag fire initi event fireinitializationev event
r2max
manag fire termin event fireterminationev event


rho prev rhoprev

manag increment iter count incrementiterationcount
manag fire iter start event fireiterationstartedev event

solv

rho rhonext dot product dotproduct
check rho rhonext
posit definit oper except nonpositivedefiniteoperatorexcept
posit definit oper except nonpositivedefiniteoperatorexcept
except context exceptioncontext context context getcontext
context set setvalu oper
context set setvalu vector


manag iter getiter
set vector setsubvector

combin combinetoself rho rhonext rho prev rhoprev

oper
dot product dotproduct
check
posit definit oper except nonpositivedefiniteoperatorexcept
posit definit oper except nonpositivedefiniteoperatorexcept
except context exceptioncontext context context getcontext
context set setvalu oper
context set setvalu vector


alpha rho rhonext
combin combinetoself alpha
combin combinetoself alpha
rho prev rhoprev rho rhonext
dot product dotproduct
manag fire iter perform event fireiterationperformedev event
r2max
manag fire termin event fireterminationev event





