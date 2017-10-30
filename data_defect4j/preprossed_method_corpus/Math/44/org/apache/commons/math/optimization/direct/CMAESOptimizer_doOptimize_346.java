
















org apach common math optim direct























implement activ covari matrix adapt evolut strategi cma
linear convex smooth global function minim
cma evolut strategi cma reliabl stochast optim method
appli deriv base method quasi newton bfg
conjug gradient fail due rug search landscap nois local
optima outlier object function
quasi newton method cma learn appli variabl metric
underli search space unlik quasi newton method
cma estim gradient make consider
reliabl term find good close optim solut

gener smooth object function cma roughli ten time
slower bfg count object function evalu gradient provid
math math variabl deriv free simplex
direct search method nelder mead faster
reliabl cma

cma suit separ
badli condit problem observ advantag cma compar
convent evolut strategi
math math function evalu difficult problem complet
optim singl run expect roughli
math math math math
function evalu

implement translat adapt matlab version
cma algorithm implement modul code cmae version

inform refer link

href http www lri hansen cmae matlab code
href http www lri hansen cmaesintro html introduct cma
href http wikipedia org wiki cma wikipedia


version



cmae optim cmaesoptim






































































































































































































































































inherit doc inheritdoc
overrid
real point pair realpointvaluepair optim dooptim
check paramet checkparamet
initi
minim isminim goal type getgoaltyp equal goal type goaltyp minim
fit function fitnessfunct fitfun fit function fitnessfunct
guess fitfun encod start point getstartpoint
number object variabl problem dimens
dimens guess length
initi cma initializecma guess
iter
bestvalu fitfun guess
push fit histori fitnesshistori bestvalu
real point pair realpointvaluepair optimum real point pair realpointvaluepair start point getstartpoint
minim isminim bestvalu bestvalu
real point pair realpointvaluepair result lastresult

gener loop

gener loop generationloop
iter iter max iter maxiter iter
gener evalu lambda offspr
real matrix realmatrix arz randn1 dimens lambda
real matrix realmatrix arx zero dimens lambda
fit lambda
gener random offspr
lambda
real matrix realmatrix arxk
check feasabl count checkfeasablecount
diagon diagonalonli
arxk xmean add multipli arz column matrix getcolumnmatrix
scalar multipli scalarmultipli sigma sig normal

arxk xmean add time diag diagd arz column matrix getcolumnmatrix
scalar multipli scalarmultipli sigma

check feasabl count checkfeasablecount fitfun feasibl isfeas arxk column getcolumn


regener random argument row
arz set column setcolumn randn dimens

copi column copycolumn arxk arx

fit fitfun arx column getcolumn comput fit
evalu except toomanyevaluationsexcept
gener loop generationloop


sort fit comput weight xmean
arindex sort indic sortedindic fit
calcul xmean select recombin
real matrix realmatrix xold xmean speed
real matrix realmatrix arx bestarx select column selectcolumn arx math arrai matharrai copi copyof arindex
xmean arx bestarx multipli weight
real matrix realmatrix arz bestarz select column selectcolumn arz math arrai matharrai copi copyof arindex
real matrix realmatrix zmean arz bestarz multipli weight
hsig updat evolut path updateevolutionpath zmean xold
diagon diagonalonli
updat covari updatecovari hsig arx bestarx arz arindex xold

updat covari diagon updatecovariancediagonalonli hsig arz bestarz xold

adapt step size sigma
sigma math exp math min normp chi chin damp
fit bestfit fit arindex
worst fit worstfit fit arindex arindex length
bestvalu fit bestfit
bestvalu fit bestfit
result lastresult optimum
optimum real point pair realpointvaluepair
fitfun decod arx bestarx column getcolumn
minim isminim fit bestfit fit bestfit
converg checker getconvergencecheck result lastresult
converg checker getconvergencecheck converg iter optimum result lastresult
gener loop generationloop



handl termin criteria
break fit good
stopfit stopfit defin
fit bestfit minim isminim stopfit stopfit
gener loop generationloop


sqrt diag sqrtdiagc sqrt diag diagc column getcolumn
col pccol column getcolumn
dimens
sigma math max math ab col pccol sqrt diag sqrtdiagc stop tol stoptolx


dimens
gener loop generationloop


dimens
sigma sqrt diag sqrtdiagc stop tol stoptolupx
gener loop generationloop


histori historybest min fit histori fitnesshistori
histori worst historyworst max fit histori fitnesshistori
iter math max histori worst historyworst worst fit worstfit
math min histori historybest fit bestfit stop tol fun stoptolfun
gener loop generationloop

iter fit histori fitnesshistori length
histori worst historyworst histori historybest stop tol hist fun stoptolhistfun
gener loop generationloop

condit number covari matrix exce 1e14
max diag diagd min diag diagd 1e7
gener loop generationloop

user defin termin
converg checker getconvergencecheck
real point pair realpointvaluepair current
real point pair realpointvaluepair arx bestarx column getcolumn
minim isminim fit bestfit fit bestfit
result lastresult
converg checker getconvergencecheck converg iter current result lastresult
gener loop generationloop

result lastresult current

adjust step size equal function valu flat fit
bestvalu fit arindex lambda
sigma sigma math exp damp

iter math max histori worst historyworst fit bestfit
math min histori historybest fit bestfit
sigma sigma math exp damp

store histori
push fit histori fitnesshistori fit bestfit
fitfun set rang setvaluerang worst fit worstfit fit bestfit
gener statist generatestatist
statist sigma histori statisticssigmahistori add sigma
statist fit histori statisticsfitnesshistori add fit bestfit
statist histori statisticsmeanhistori add xmean transpos
statist histori statisticsdhistori add diag diagd transpos scalar multipli scalarmultipli 1e5


optimum











































































































































































































































































































































































































































































































































































































































































































































































































































































































































