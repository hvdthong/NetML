
















org apach common math3 od nonstiff




step interpol classic fourth
order rung kutta integr

interpol comput dens output insid
step comput interpol equat consist
integr scheme

refer point step start
theta
theta theta theta
theta theta
theta theta


refer point step end
theta
theta theta theta
theta theta
theta theta





theta belong
evalu deriv comput
step

classic rung kutta integr classicalrungekuttaintegr
version



classic rung kutta step interpol classicalrungekuttastepinterpol

































inherit doc inheritdoc
overrid
comput interpol state deriv computeinterpolatedstateandderiv theta
minu theta oneminusthetah

minu theta oneminustheta theta
minus2 theta oneminus2theta theta
coeff dot1 coeffdot1 minu theta oneminustheta minus2 theta oneminus2theta
coeff dot23 coeffdot23 theta minu theta oneminustheta
coeff dot4 coeffdot4 theta minus2 theta oneminus2theta
previou state previousst theta
theta2 fourtheta2 theta theta
theta
coeff1 theta theta2 fourtheta2
coeff23 theta theta2 fourtheta2
coeff4 theta theta2 fourtheta2
interpol state interpolatedst length
dot1 ydot1 dot ydotk
dot23 ydot23 dot ydotk dot ydotk
dot4 ydot4 dot ydotk
interpol state interpolatedst
previou state previousst coeff1 dot1 ydot1 coeff23 dot23 ydot23 coeff4 dot4 ydot4
interpol deriv interpolatedderiv
coeff dot1 coeffdot1 dot1 ydot1 coeff dot23 coeffdot23 dot23 ydot23 coeff dot4 coeffdot4 dot4 ydot4


theta fourtheta theta
minu theta oneminusthetah
coeff1 theta fourtheta theta
coeff23 theta fourtheta theta
coeff4 theta fourtheta theta
interpol state interpolatedst length
dot1 ydot1 dot ydotk
dot23 ydot23 dot ydotk dot ydotk
dot4 ydot4 dot ydotk
interpol state interpolatedst
current state currentst coeff1 dot1 ydot1 coeff23 dot23 ydot23 coeff4 dot4 ydot4
interpol deriv interpolatedderiv
coeff dot1 coeffdot1 dot1 ydot1 coeff dot23 coeffdot23 dot23 ydot23 coeff dot4 coeffdot4 dot4 ydot4






