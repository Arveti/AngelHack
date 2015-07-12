getimage<-function(Image)
{
  img<-Image
##source("http://bioconductor.org/biocLite.R")
##library(EBImage)
biocLite()
biocLite("EBImage")
Image <- readImage('http://genfash.eu-gb.mybluemix.net/Images/1.jpeg')
display(Image)
print(Image)
redpixels = imageData(Image)[, , 1];
greenpixelsl = imageData(Image)[, , 2];
bluepixels = imageData(Image)[, , 3];
fhi <- matrix(1, nc=3, nr=3)
imgfhi <- filter2(Image, fhi)
print(imgfhi)
display(imgfhi)

}