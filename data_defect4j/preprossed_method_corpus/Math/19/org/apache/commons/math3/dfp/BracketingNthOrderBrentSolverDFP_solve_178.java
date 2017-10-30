















org apach common math3 dfp











modif
href http mathworld wolfram brent method brentsmethod html brent algorithm

respect origin brent algorithm

return chosen current interv
user link allow solut allowedsolut
maxim order invert polynomi root search
user invert quadrat


interv bracket root

version

bracket nth order brent solver dfp bracketingnthorderbrentsolverdfp





















































































































solv interv start code start startvalu
solver requir interv bracket singl root
solver requir bracket handl
endpoint root

param max eval maxev maximum number evalu
param function solv
param min lower bound interv
param max upper bound interv
param start startvalu start
param allow solut allowedsolut kind solut root find algorithm
accept solut
function
except null argument except nullargumentexcept
except bracket except nobracketingexcept root bracket

dfp solv max eval maxev univari dfp function univariatedfpfunct
dfp min dfp max dfp start startvalu
allow solut allowedsolut allow solut allowedsolut
null argument except nullargumentexcept bracket except nobracketingexcept

check
math util mathutil check null checknotnul

reset
evalu set maxim count setmaximalcount max eval maxev
evalu reset count resetcount
dfp start startvalu getzero
dfp nan instanc newinst dfp qnan

prepar arrai point
dfp dfp maxim order maximalord
dfp dfp maxim order maximalord
min
start startvalu
max

evalu initi guess
evalu increment count incrementcount

iszero
initi guess perfect root



evalu endpoint
evalu increment count incrementcount

iszero
endpoint perfect root



point nbpoint
sign chang index signchangeindex
multipli neg null negativeornul

reduc interv bracket root
point nbpoint
sign chang index signchangeindex



evalu endpoint
evalu increment count incrementcount

iszero
endpoint perfect root



multipli neg null negativeornul
comput point start sampl arrai solv
point nbpoint
sign chang index signchangeindex

bracket except nobracketingexcept doubl todoubl doubl todoubl
doubl todoubl doubl todoubl




prepar work arrai invers polynomi interpol
dfp tmp tmpx dfp length

current tightest bracket root
dfp sign chang index signchangeindex
dfp sign chang index signchangeindex
dfp ab absxa ab
dfp ab absya ab
ag aginga
dfp sign chang index signchangeindex
dfp sign chang index signchangeindex
dfp ab absxb ab
dfp ab absyb ab
ag agingb

search loop


check converg bracket interv
dfp max maxx ab absxa lessthan ab absxb ab absxb ab absxa
dfp max maxi ab absya lessthan ab absyb ab absyb ab absya
dfp tol xtol absolut accuraci absoluteaccuraci add rel accuraci relativeaccuraci multipli max maxx
subtract subtract tol xtol neg null negativeornul
max maxi lessthan function accuraci functionvalueaccuraci
allow solut allowedsolut
side
ab absya lessthan ab absyb
left side

side

side
lessthan
side
lessthan

happen
math intern error mathinternalerror



target evalu point
dfp target targeti
ag aginga maxim ag
updat high bracket compens
target targeti divid negat
ag agingb maxim ag
updat low bracket compens
target targeti divid negat

bracket balanc find root
target targeti


make attempt guess root
dfp nextx
start
end point nbpoint


guess current target invers polynomi interpol
system arraycopi start tmp tmpx start end start
nextx guess guessx target targeti tmp tmpx start end

nextx greater greaterthan nextx lessthan
guess root strictli insid tightest bracket interv

guess root strictli insid interv
nan occur sampl point share
lower interpol order
sign chang index signchangeindex start end sign chang index signchangeindex
point sign chang drop lowest point
start

point sign chang drop highest point
end


attempt
nextx nan



nextx isnan end start

nextx isnan
fall back bisect
nextx add subtract divid
start sign chang index signchangeindex
end sign chang index signchangeindex


evalu function guess root
evalu increment count incrementcount
dfp nexti nextx
nexti iszero
found exact root approxim
bother allow solut set
nextx


point nbpoint end start point nbpoint

forc ignor point bracket
root drop
point nbpoint end start
system arraycopi start point nbpoint
system arraycopi start point nbpoint
sign chang index signchangeindex start

point nbpoint length

drop point order insert
point nbpoint

tightest bracket interv center
sign chang index signchangeindex length
drop lowest point shift arrai index
system arraycopi point nbpoint
system arraycopi point nbpoint
sign chang index signchangeindex




insert comput point
construct li insid tightest bracket interv
system arraycopi sign chang index signchangeindex sign chang index signchangeindex point nbpoint sign chang index signchangeindex
sign chang index signchangeindex nextx
system arraycopi sign chang index signchangeindex sign chang index signchangeindex point nbpoint sign chang index signchangeindex
sign chang index signchangeindex nexti
point nbpoint

updat bracket interv
nexti multipli neg null negativeornul
sign chang occur insert point
nextx
nexti
ab absyb ab
ag aginga
ag agingb

sign chang occur insert point
nextx
nexti
ab absya ab
ag aginga
ag agingb

updat sign chang index
sign chang index signchangeindex











































