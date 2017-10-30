














org joda time chrono





abstract chronolog implement chronolog base gregorian julian formula
util method requir subclass
reflect intent defin

basic chronolog basicgjchronolog thread safe immut subclass


author stephen colebourn
author brian neill o'neil
author gui allard
refactor common chronolog commongjchronolog

basic chronolog basicgjchronolog basic chronolog basicchronolog
















































































































year differ getyeardiffer minuend instant minuendinst subtrahend instant subtrahendinst
minuend year minuendyear year getyear minuend instant minuendinst
subtrahend year subtrahendyear year getyear subtrahend instant subtrahendinst

inlin remaind method avoid duplic call
minuend rem minuendrem minuend instant minuendinst year milli getyearmilli minuend year minuendyear
subtrahend rem subtrahendrem subtrahend instant subtrahendinst year milli getyearmilli subtrahend year subtrahendyear

balanc leap year differ remaind
subtrahend rem subtrahendrem feb
leap year isleapyear subtrahend year subtrahendyear
leap year isleapyear minuend year minuendyear
subtrahend rem subtrahendrem date time constant datetimeconst milli dai

minuend rem minuendrem feb leap year isleapyear minuend year minuendyear
minuend rem minuendrem date time constant datetimeconst milli dai



differ minuend year minuendyear subtrahend year subtrahendyear
minuend rem minuendrem subtrahend rem subtrahendrem
differ

differ































