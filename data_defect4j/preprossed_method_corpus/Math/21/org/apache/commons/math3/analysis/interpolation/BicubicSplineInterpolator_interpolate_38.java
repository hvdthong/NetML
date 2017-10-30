















org apach common math3 analysi interpol










gener bicub interpol function

version


bicub spline interpol bicubicsplineinterpol


inherit doc inheritdoc

bicub spline interpol function bicubicsplineinterpolatingfunct interpol xval
yval
fval
data except nodataexcept
dimens mismatch except dimensionmismatchexcept
monoton sequenc except nonmonotonicsequenceexcept
xval length yval length fval length
data except nodataexcept

xval length fval length
dimens mismatch except dimensionmismatchexcept xval length fval length


math arrai matharrai check order checkord xval
math arrai matharrai check order checkord yval

len xlen xval length
len ylen yval length

sampl index coordin subarrai variabl
xval length
yval length
xval yval
len ylen len xlen
len xlen
fval length len ylen
dimens mismatch except dimensionmismatchexcept fval length len ylen


len ylen
fval



spline interpol splineinterpol interpol spinterpol spline interpol splineinterpol

line len ylen construct spline
respect variabl
polynomi spline function polynomialsplinefunct spline ysplinex polynomi spline function polynomialsplinefunct len ylen
len ylen
spline ysplinex interpol spinterpol interpol xval


line len xlen construct spline
respect variabl gener arrai
polynomi spline function polynomialsplinefunct spline xsplinei polynomi spline function polynomialsplinefunct len xlen
len xlen
spline xsplinei interpol spinterpol interpol yval fval


partial deriv respect grid knot
dfdx len xlen len ylen
len ylen
univari function univariatefunct spline ysplinex deriv
len xlen
dfdx xval



partial deriv respect grid knot
dfdy len xlen len ylen
len xlen
univari function univariatefunct spline xsplinei deriv
len ylen
dfdy yval



cross partial deriv
d2fdxdy len xlen len ylen
len xlen
index nextindex len xlen
previou index previousindex
len ylen
index nextindex len ylen
previou index previousindex
d2fdxdy fval fval
fval fval
xval xval yval yval



creat interpol spline
bicub spline interpol function bicubicsplineinterpolatingfunct xval yval fval
dfdx dfdy d2fdxdy



























