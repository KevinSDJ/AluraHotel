use hotelalura;


CREATE TABLE if not exists Guest(
id int auto_increment unique primary key not null,
firstName varchar(20) not null,
surname varchar(20) not null,
dateBirth date not null,
nationality varchar(20) not null,
phone varchar(40) not null
) engine=InnoDB;

