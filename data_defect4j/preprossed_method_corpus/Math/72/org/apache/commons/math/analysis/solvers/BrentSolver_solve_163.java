















org apach common math analysi solver








implement href http mathworld wolfram brent method brentsmethod html
brent algorithm find zero real univari function

function continu necessarili smooth

version revis date lun juin

brent solver brentsolv univari real solver impl univariaterealsolverimpl

















































































































find interv

requir valu function endpoint opposit
sign code illeg argument except illegalargumentexcept code thrown


param function solv
param min lower bound interv
param max upper bound interv
function
max iter exceed except maxiterationsexceededexcept maximum iter count exceed
function evalu except functionevaluationexcept error occur evalu
function
illeg argument except illegalargumentexcept min max
sign valu function endpoint opposit

solv univari real function univariaterealfunct
min max
max iter exceed except maxiterationsexceededexcept
function evalu except functionevaluationexcept

clear result clearresult
verifi interv verifyinterv min max

ret doubl nan

min ymin min
max ymax max

verifi bracket
sign min ymin max ymax
sign
check close
math ab min ymin function accuraci functionvalueaccuraci
set result setresult min
ret min
math ab max ymax function accuraci functionvalueaccuraci
set result setresult max
ret max

close min max bracket root
math runtim except mathruntimeexcept creat illeg argument except createillegalargumentexcept
bracket messag min max min ymin max ymax

sign
solv endpoint initi guess
ret solv min min ymin max max ymax min min ymin

min max root
min ymin
ret min

ret max



ret




















































































































