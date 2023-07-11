#!/bin/bash
rm -r target/
export VERSION="NON-PRIMITIVE-1.0"
#export VERSION="PRIMITIVE-1.0"
mvn clean package
scp target/usecases-$VERSION.jar arjun@10.8.46.93:/home/arjun/Extended_WD/Expt/CDA/Usecases/2


