















org apach common math analysi solver







href http mathworld wolfram brent method brentsmethod html
brent algorithm find zero real univari function
function continu necessarili smooth
code solv method return code function code
interv code toler
code ep ab code ep rel accuraci
code absolut accuraci
interv bracket root

version

brent solver brentsolv abstract univari solver abstractunivariatesolv










































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
brent min initi min ymin initi yiniti


return endpoint good
max ymax comput object computeobjectivevalu max
fast math fastmath ab max ymax function accuraci functionvalueaccuraci
max


reduc interv initi max bracket root
initi yiniti max ymax
brent initi max initi yiniti max ymax


bracket except nobracketingexcept min max min ymin max ymax















































































































