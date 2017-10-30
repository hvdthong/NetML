















org apach common math analysi solver









implement href http mathworld wolfram laguerr method laguerresmethod html
laguerre' method root find real coeffici polynomi
refer
quot
numer analysi
isbn 048641454x chapter
quot
laguerre' method global sens start initi
approxim solv root point
algorithm requir bracket condit

version revis date


laguerr solver laguerresolv abstract polynomi solver abstractpolynomialsolv





























































































































































































































find complex root polynomi coeffici
start initi

param coeffici polynomi coeffici
param initi start
point function
org apach common math except evalu except toomanyevaluationsexcept
maximum number evalu exceed
null argument except nullargumentexcept code coeffici
code
data except nodataexcept code coeffici arrai empti

complex solv complex coeffici complex initi
coeffici
null argument except nullargumentexcept


coeffici length

data except nodataexcept local format localizedformat polynomi


absolut accuraci absoluteaccuraci absolut accuraci getabsoluteaccuraci
rel accuraci relativeaccuraci rel accuraci getrelativeaccuraci
function accuraci functionvalueaccuraci function accuraci getfunctionvalueaccuraci

complex complex
complex complex

complex
complex
complex d2v
complex
complex
complex
complex delta
complex denomin
complex initi
complex oldz complex doubl posit infin
doubl posit infin

comput polynomi deriv
d2v deriv simultan
coeffici
complex
d2v complex

d2v add multipli d2v
add multipli
coeffici add multipli

d2v d2v multipli complex

check converg
toler fast math fastmath max rel accuraci relativeaccuraci ab
absolut accuraci absoluteaccuraci
subtract oldz ab toler


ab function accuraci functionvalueaccuraci



calcul approxim
divid
multipli
subtract d2v divid
delta multipli multipli subtract
choos denomin larger magnitud
complex delta sqrt deltasqrt delta sqrt
complex dplu add delta sqrt deltasqrt
complex dminu subtract delta sqrt deltasqrt
denomin dplu ab dminu ab dplu dminu
perturb denomin instanc

denomin equal complex
add complex absolut accuraci absoluteaccuraci absolut accuraci absoluteaccuraci
oldz complex doubl posit infin
doubl posit infin

oldz
subtract divid denomin

increment evalu count incrementevaluationcount




