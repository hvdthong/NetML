















org apach common math filter














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




















creat kalman filter process measur
model

param process
model defin underli process dynam
param measur
model defin measur characterist
org apach common math except null argument except nullargumentexcept
input control
matrix
squar matrix except nonsquarematrixexcept
transit matrix squar
matrix dimens mismatch except matrixdimensionmismatchexcept
matrix dimens fit

kalman filter kalmanfilt process model processmodel process
measur model measurementmodel measur

math util mathutil check null checknotnul process
math util mathutil check null checknotnul measur

process model processmodel process
measur model measurementmodel measur

transit matrix transitionmatrix process model processmodel state transit matrix getstatetransitionmatrix
math util mathutil check null checknotnul transit matrix transitionmatrix
transit matrix transitionmatrixt transit matrix transitionmatrix transpos

creat empti matrix control matrix
process model processmodel control matrix getcontrolmatrix
control matrix controlmatrix array2 row real matrix array2drowrealmatrix

control matrix controlmatrix process model processmodel control matrix getcontrolmatrix


measur matrix measurementmatrix measur model measurementmodel measur matrix getmeasurementmatrix
math util mathutil check null checknotnul measur matrix measurementmatrix
measur matrix measurementmatrixt measur matrix measurementmatrix transpos

check process measur nois matric
directli access model chang
time
real matrix realmatrix process nois processnois process model processmodel process nois getprocessnois
math util mathutil check null checknotnul process nois processnois
real matrix realmatrix mea nois measnois measur model measurementmodel measur nois getmeasurementnois
math util mathutil check null checknotnul mea nois measnois

set initi state estim vector
process model
process model processmodel initi state estim getinitialstateestim
state estim stateestim
arrai real vector arrayrealvector transit matrix transitionmatrix column dimens getcolumndimens

state estim stateestim process model processmodel initi state estim getinitialstateestim


transit matrix transitionmatrix column dimens getcolumndimens state estim stateestim dimens getdimens
dimens mismatch except dimensionmismatchexcept transit matrix transitionmatrix column dimens getcolumndimens
state estim stateestim dimens getdimens


initi error covari process nois
process model
process model processmodel initi error covari getinitialerrorcovari
error covari errorcovari process nois processnois copi

error covari errorcovari process model processmodel initi error covari getinitialerrorcovari


saniti check control matrix

squar matrix
transit matrix transitionmatrix squar issquar
squar matrix except nonsquarematrixexcept
transit matrix transitionmatrix row dimens getrowdimens
transit matrix transitionmatrix column dimens getcolumndimens


row dimens equal
control matrix controlmatrix
control matrix controlmatrix row dimens getrowdimens
control matrix controlmatrix column dimens getcolumndimens
control matrix controlmatrix row dimens getrowdimens transit matrix transitionmatrix row dimens getrowdimens
control matrix controlmatrix column dimens getcolumndimens
matrix dimens mismatch except matrixdimensionmismatchexcept control matrix controlmatrix row dimens getrowdimens
control matrix controlmatrix column dimens getcolumndimens
transit matrix transitionmatrix row dimens getrowdimens


equal
matrix util matrixutil check addit compat checkadditioncompat transit matrix transitionmatrix process nois processnois

column dimens equal row dimens
measur matrix measurementmatrix column dimens getcolumndimens transit matrix transitionmatrix row dimens getrowdimens
matrix dimens mismatch except matrixdimensionmismatchexcept measur matrix measurementmatrix row dimens getrowdimens
measur matrix measurementmatrix column dimens getcolumndimens
measur matrix measurementmatrix row dimens getrowdimens
transit matrix transitionmatrix row dimens getrowdimens


row dimens equal row dimens
mea nois measnois row dimens getrowdimens measur matrix measurementmatrix row dimens getrowdimens
mea nois measnois column dimens getcolumndimens
matrix dimens mismatch except matrixdimensionmismatchexcept mea nois measnois row dimens getrowdimens
mea nois measnois column dimens getcolumndimens
measur matrix measurementmatrix row dimens getrowdimens









































































































































































