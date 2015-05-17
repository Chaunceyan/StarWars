#Run the following command.

mvn install:install-file -Dfile=./target/dependency/d2rq-0.8.1.jar -DgroupId=d2rq -DartifactId=d2rq -Dversion=0.8.1 -Dpackaging=jar

mvn install:install-file -Dfile=./target/dependency/mysql-driver-5.1.35.jar -DgroupId=JDBCDriver -DartifactId=mysql-driver -Dversion=5.1.35 -Dpackaging=jar

mvn deploy:deploy-file -Durl=file:./target/dependency/ -Dfile=./target/dependency/d2rq-0.8.1.jar -DgroupId=d2rq -DartifactId=d2rq -Dversion=0.8.1 -Dpackaging=jar

mvn deploy:deploy-file -Durl=file:./target/dependency/ -Dfile=./target/dependency/mysql-driver-5.1.35.jar -DgroupId=JDBCDriver -DartifactId=mysql-driver -Dversion=5.1.35 -Dpackaging=jar

mvn clean install

foreman start web

#Run "maven clean install".
