















org apach common math analysi interpol







gener tricub interpol function

version revis date


tricub spline interpol tricubicsplineinterpol


inherit doc inheritdoc

tricub spline interpol function tricubicsplineinterpolatingfunct interpol xval
yval
zval
fval
math except mathexcept illeg argument except illegalargumentexcept
xval length yval length zval length fval length
math runtim except mathruntimeexcept creat illeg argument except createillegalargumentexcept data

xval length fval length
dimens mismatch except dimensionmismatchexcept xval length fval length


math util mathutil check order checkord xval
math util mathutil check order checkord yval
math util mathutil check order checkord zval

len xlen xval length
len ylen yval length
len zlen zval length

sampl order tuplet
fval fvalxi xval yval zval
fval fvalzx xval yval zval
fval fvalxi len zlen len xlen len ylen
fval fvalzx len ylen len zlen len xlen
len xlen
fval length len ylen
dimens mismatch except dimensionmismatchexcept fval length len ylen


len ylen
fval length len zlen
dimens mismatch except dimensionmismatchexcept fval length len zlen


len zlen
fval
fval fvalxi
fval fvalzx




bicub spline interpol bicubicsplineinterpol bsi bicub spline interpol bicubicsplineinterpol

line len xlen construct spline
bicub spline interpol function bicubicsplineinterpolatingfunct spline xsplineyz
bicub spline interpol function bicubicsplineinterpolatingfunct len xlen
len xlen
spline xsplineyz bsi interpol yval zval fval


line len ylen construct spline
bicub spline interpol function bicubicsplineinterpolatingfunct spline ysplinezx
bicub spline interpol function bicubicsplineinterpolatingfunct len ylen
len ylen
spline ysplinezx bsi interpol zval xval fval fvalzx


line len zlen construct spline
bicub spline interpol function bicubicsplineinterpolatingfunct spline zsplinexi
bicub spline interpol function bicubicsplineinterpolatingfunct len zlen
len zlen
spline zsplinexi bsi interpol xval yval fval fvalxi


partial deriv wrt wrt
dfdx len xlen len ylen len zlen
dfdy len xlen len ylen len zlen
d2fdxdy len xlen len ylen len zlen
len zlen
bicub spline interpol function bicubicsplineinterpolatingfunct spline zsplinexi
len xlen
xval
len ylen
yval
dfdx partial deriv partialderivativex
dfdy partial deriv partialderivativei
d2fdxdy partial deriv partialderivativexi




partial deriv wrt wrt
dfdz len xlen len ylen len zlen
d2fdydz len xlen len ylen len zlen
len xlen
bicub spline interpol function bicubicsplineinterpolatingfunct spline xsplineyz
len ylen
yval
len zlen
zval
dfdz partial deriv partialderivativei
d2fdydz partial deriv partialderivativexi




partial deriv wrt wrt
d2fdzdx len xlen len ylen len zlen
len ylen
bicub spline interpol function bicubicsplineinterpolatingfunct spline ysplinezx
len zlen
zval
len xlen
xval
d2fdzdx partial deriv partialderivativexi




partial cross deriv
d3fdxdydz len xlen len ylen len zlen
len xlen
index nextindex len xlen
previou index previousindex
len ylen
index nextindex len ylen
previou index previousindex
len zlen
index nextindex len zlen
previou index previousindex

xxx formula
d3fdxdydz fval fval
fval fval
fval fval
fval fval
xval xval yval yval zval zval




creat interpol spline
tricub spline interpol function tricubicsplineinterpolatingfunct xval yval zval fval
dfdx dfdy dfdz
d2fdxdy d2fdzdx d2fdydz
d3fdxdydz


























