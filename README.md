#Run the following command, with the correct 'Dfile' which leads to the file in your local machine.

install:install-file -Dfile=./target/dependency/d2rq-0.8.1.jar -DgroupId=d2rq -DartifactId=d2rq -Dversion=0.8.1 -Dpackaging=jar

install:install-file -Dfile=./target/dependency/mysql-driver-5.1.35.jar -DgroupId=JDBCDriver -DartifactId=mysql-driver -Dversion=5.1.35 -Dpackaging=jar

#Run "maven clean install".
