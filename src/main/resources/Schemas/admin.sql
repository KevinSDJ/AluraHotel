use hotelalura;
drop table Admin;

CREATE TABLE if not exists Admin(
id int auto_increment unique primary key not null,
firstName varchar(20),
surname varchar(20),
dateBirth date,
nationality varchar(20),
phone varchar(40),
email varchar(40) not null unique,
password varchar(200) not null
) engine=InnoDB;
