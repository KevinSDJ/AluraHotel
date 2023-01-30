#!/bin/bash

docker pull mysql:latest;
docker run --name db-mysql --rm -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=mysql -e MYSQL_DATABASE=hotelalura mysql:latest;