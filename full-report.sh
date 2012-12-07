#!/bin/bash
EMMA_JAR=/Users/lmeadors/.m2/repository/emma/emma/2.1.5320/emma-2.1.5320.jar

cd coverage/target/emma

java -cp $EMMA_JAR emma report -r html -in coverage.em,coverage.ec -sp ../../src/main/java/

#open application/target/emma/coverage/index.html
