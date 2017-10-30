







































org jfree chart util








implement link shadow gener shadowgener base
code
href http www jroller gfx entri fast good drop shadow blog
post romain gui



default shadow gener defaultshadowgener shadow gener shadowgener serializ



































































































































appli shadow imag

param imag imag

appli shadow applyshadow buffer imag bufferedimag imag
dst width dstwidth imag width getwidth
dst height dstheight imag height getheight

left shadow size shadows
shadow size shadows left
start xstart left
stop xstop dst width dstwidth
start ystart left
stop ystop dst height dstheight

shadow rgb shadowrgb shadow color shadowcolor rgb getrgb 0x00 ffffff 0x00ffffff

histori ahistori shadow size shadows
histori idx historyidx

sum asum

data buffer databuff data buffer int databufferint imag raster getrast data buffer getdatabuff data getdata
pixel offset lastpixeloffset dst width dstwidth
sum divid sumdivid shadow opac shadowopac shadow size shadows

horizont pass

buffer offset bufferoffset dst height dstheight buffer offset bufferoffset dst width dstwidth
sum asum
histori idx historyidx
shadow size shadows buffer offset bufferoffset
data buffer databuff buffer offset bufferoffset
histori ahistori
sum asum


buffer offset bufferoffset

start xstart stop xstop buffer offset bufferoffset
sum asum sum divid sumdivid
data buffer databuff buffer offset bufferoffset shadow rgb shadowrgb

substract oldest pixel sum
sum asum histori ahistori histori idx historyidx

lastest pixel
data buffer databuff buffer offset bufferoffset
histori ahistori histori idx historyidx
sum asum

histori idx historyidx shadow size shadows
histori idx historyidx shadow size shadows




vertic pass
buffer offset bufferoffset dst width dstwidth buffer offset bufferoffset
sum asum
histori idx historyidx
shadow size shadows buffer offset bufferoffset dst width dstwidth
data buffer databuff buffer offset bufferoffset
histori ahistori
sum asum


buffer offset bufferoffset pixel offset lastpixeloffset

start ystart stop ystop buffer offset bufferoffset dst width dstwidth
sum asum sum divid sumdivid
data buffer databuff buffer offset bufferoffset shadow rgb shadowrgb

substract oldest pixel sum
sum asum histori ahistori histori idx historyidx

lastest pixel
data buffer databuff buffer offset bufferoffset pixel offset lastpixeloffset
histori ahistori histori idx historyidx
sum asum

histori idx historyidx shadow size shadows
histori idx historyidx shadow size shadows





















































