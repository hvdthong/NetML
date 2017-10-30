















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

version


laguerr solver laguerresolv abstract polynomi solver abstractpolynomialsolv











































inherit doc inheritdoc

overrid
solv dosolv
min min getmin
max max getmax
initi start getstartvalu
function accuraci functionvalueaccuraci function accuraci getfunctionvalueaccuraci

verifi sequenc verifysequ min initi max

return initi guess good
initi yiniti comput object computeobjectivevalu initi
fast math fastmath ab initi yiniti function accuraci functionvalueaccuraci
initi


return endpoint good
min ymin comput object computeobjectivevalu min
fast math fastmath ab min ymin function accuraci functionvalueaccuraci
min


reduc interv min initi bracket root
initi yiniti min ymin
laguerr min initi min ymin initi yiniti


return endpoint good
max ymax comput object computeobjectivevalu max
fast math fastmath ab max ymax function accuraci functionvalueaccuraci
max


reduc interv initi max bracket root
initi yiniti max ymax
laguerr initi max initi yiniti max ymax


bracket except nobracketingexcept min max min ymin max ymax










































































































































































































