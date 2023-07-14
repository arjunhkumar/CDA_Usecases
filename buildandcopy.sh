#!/bin/bash
rm -r target/
ITER_SIZE=100
#export VERSION="NON-PRIMITIVE-$ITER_SIZE"
export VERSION="PRIMITIVE-$ITER_SIZE"
mvn clean package
scp target/usecases-$VERSION.jar arjun@10.8.46.93:/home/arjun/Extended_WD/Expt/CDA/Usecases/Varying/
