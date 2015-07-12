Hackathon<-function(directory,observation)
{
  dir<-directory
  ob<-observation
  library(caret)
  library(doParallel)
  training<- read.csv(dir)
  obtr<-paste("training$",ob)
  obte<-paste("testing$",ob)
  choosencol    <- which((colSums(!is.na(training)) >= 0.65*nrow(training)))
  training[is.na(training)]<-0
  training <- training[,choosencol]
  inTraining  <- createDataPartition(obtr, p = 0.6, list = FALSE)
  training    <- training[inTraining, ]
  testing     <- training[-inTraining, ]
  rfmodel <- train(training, obtr, method="parRF", 
                   tuneGrid=data.frame(mtry=3), 
                   trControl=trainControl(method="none"))
  ##rfmodel
  predicttest <- predict(rfmodel, newdata=testing)
  conMatrix <- confusionMatrix(predicttest,obte)
  conMatrix
  conMatrix$overall[1]
}
