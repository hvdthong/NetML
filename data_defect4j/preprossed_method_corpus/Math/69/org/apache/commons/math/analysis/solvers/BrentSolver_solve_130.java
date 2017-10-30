















org apach common math analysi solver








implement href http mathworld wolfram brent method brentsmethod html
brent algorithm find zero real univari function

function continu necessarili smooth

version revis date lun juin

brent solver brentsolv univari real solver impl univariaterealsolverimpl













































































find interv initi guess
throw code illeg argument except illegalargumentexcept code valu
function point sign note
allow endpoint sign initi point
opposit sign function wise

param function solv
param min lower bound interv
param max upper bound interv
param initi start set min
initi point
function
max iter exceed except maxiterationsexceededexcept maximum iter count
exceed
function evalu except functionevaluationexcept error occur evalu
function
illeg argument except illegalargumentexcept initi min max
root

solv univari real function univariaterealfunct
min max initi
max iter exceed except maxiterationsexceededexcept function evalu except functionevaluationexcept

clear result clearresult
initi min initi max
math runtim except mathruntimeexcept creat illeg argument except createillegalargumentexcept
invalid interv initi paramet lower initi upper
min initi max


initi guess good
initi yiniti initi
math ab initi yiniti function accuraci functionvalueaccuraci
set result setresult initi
result


endpoint good
min ymin min
math ab min ymin function accuraci functionvalueaccuraci
set result setresult min
result


reduc interv min initi bracket root
initi yiniti min ymin
solv min min ymin initi initi yiniti min min ymin


endpoint good
max ymax max
math ab max ymax function accuraci functionvalueaccuraci
set result setresult max
result


reduc interv initi max bracket root
initi yiniti max ymax
solv initi initi yiniti max max ymax initi initi yiniti


math runtim except mathruntimeexcept creat illeg argument except createillegalargumentexcept
bracket messag min max min ymin max ymax

















































































































































































