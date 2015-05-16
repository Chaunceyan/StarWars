Run the following command, with the correct 'Dfile' which leads to the file in your local machine.

mvn install:install-file -Dfile=/Applications/d2rq-0.8.1/lib/d2rq-0.8.1.jar -DgroupId=d2rq -DartifactId=d2rq -Dversion=0.8.1 -Dpackaging=jar

mvn install:install-file -Dfile=/Applications/d2rq-0.8.1/lib/mysql-connector-java-5.1.35-bin.jar -DgroupId=JDBCDriver -DartifactId=mysql-driver -Dversion=5.1.35 -Dpackaging=jar

Run "maven clean install".
