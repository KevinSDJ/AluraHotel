#!/bin/bash
EXISTS=false

for i in $(docker images )
do 
if [ "${i}" == "mysql" ]; then
EXISTS=true
fi
done

if [[ $EXISTS && true ]]; then
 echo "mysql image find";
else 
docker pull mysql:latest;
fi

docker run --rm --name db-mysql -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=mysql -e MYSQL_DATABASE=hotelalura mysql:latest;
mvn clean package;
java -jar ./target/HotelAlura-1.0-jar-with-dependencies.jar

