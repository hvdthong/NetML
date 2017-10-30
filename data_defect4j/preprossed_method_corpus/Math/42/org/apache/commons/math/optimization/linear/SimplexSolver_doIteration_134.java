
















org apach common math optim linear










solv linear problem phase simplex method
version


simplex solver simplexsolv abstract linear optim abstractlinearoptim































































































run iter simplex method model
param tableau simpl tableau problem
max count exceed except maxcountexceededexcept maxim iter count exceed
unbound solut except unboundedsolutionexcept model found bound solut

iter doiter simplex tableau simplextableau tableau
max count exceed except maxcountexceededexcept unbound solut except unboundedsolutionexcept

increment iter counter incrementiterationscount

integ pivot col pivotcol pivot column getpivotcolumn tableau
integ pivot row pivotrow pivot row getpivotrow tableau pivot col pivotcol
pivot row pivotrow
unbound solut except unboundedsolutionexcept


set pivot element
pivot val pivotv tableau entri getentri pivot row pivotrow pivot col pivotcol
tableau divid row dividerow pivot row pivotrow pivot val pivotv

set rest pivot column
tableau height getheight
pivot row pivotrow
multipli tableau entri getentri pivot col pivotcol
tableau subtract row subtractrow pivot row pivotrow multipli















































