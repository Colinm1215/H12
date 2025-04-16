@echo off


mvn checkstyle:check
mvn clean compile
mvn spotbugs:check
mvn javadoc:javadoc
mvn test

pause
