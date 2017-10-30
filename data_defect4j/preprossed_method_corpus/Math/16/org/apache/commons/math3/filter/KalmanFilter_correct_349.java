















org apach common math3 filter
















implement kalman filter estim state
discret time control process govern linear
stochast differ equat

pre

pre

measur

pre

pre


random variabl repres
process measur nois assum independ
distribut normal probabl white nois

kalman filter cycl involv step

predict project current state estim ahead time
correct adjust project estim actual measur


kalman filter initi link process model processmodel
link measur model measurementmodel transform
nois covari matric paramet name respect model
correspond name commonli mathemat
literatur

state transit matrix
control input matrix
measur matrix
process nois covari matrix
measur nois covari matrix
error covari matrix


href http www unc welch kalman kalman filter
resourc
href http www unc welch media pdf kalman intro pdf
introduct kalman filter greg welch gari bishop
href http academ csuohio simond cours eec644 kalman pdf
kalman filter dan simon
process model processmodel
measur model measurementmodel

version

kalman filter kalmanfilt





























































































































































































































































correct current state estim actual measur

param
measur vector
null argument except nullargumentexcept
measur vector code
dimens mismatch except dimensionmismatchexcept
dimens measur vector fit
singular matrix except singularmatrixexcept
covari matrix invert

correct real vector realvector
null argument except nullargumentexcept dimens mismatch except dimensionmismatchexcept singular matrix except singularmatrixexcept

saniti check
math util mathutil check null checknotnul
dimens getdimens measur matrix measurementmatrix row dimens getrowdimens
dimens mismatch except dimensionmismatchexcept dimens getdimens
measur matrix measurementmatrix row dimens getrowdimens



real matrix realmatrix measur matrix measurementmatrix multipli error covari errorcovari
multipli measur matrix measurementmatrixt
add measur model measurementmodel measur nois getmeasurementnois

invert
error covari matrix symmetr posit
semi definit matrix choleski decomposit
decomposit solver decompositionsolv solver choleski decomposit choleskydecomposit solver getsolv
real matrix realmatrix invert invert solver invers getinvers

inn hat xhat
real vector realvector innov subtract measur matrix measurementmatrix oper state estim stateestim

calcul gain matrix


real matrix realmatrix kalman gain kalmangain error covari errorcovari multipli measur matrix measurementmatrixt multipli invert invert

updat estim measur
hat xhat hat xhat inn
state estim stateestim state estim stateestim add kalman gain kalmangain oper innov

updat covari predict error

real matrix realmatrix ident matrix util matrixutil creat real ident matrix createrealidentitymatrix kalman gain kalmangain row dimens getrowdimens
error covari errorcovari ident subtract kalman gain kalmangain multipli measur matrix measurementmatrix multipli error covari errorcovari


