CREATE TABLE if not exists Guest (id int auto_increment primary key,firstName VARCHAR(35),
surname VARCHAR(25) NOT NULL UNIQUE,
nationality VARCHAR(20) NOT NULL,
dateBirth date,
phone MEDIUMINT NOT NULL UNIQUE) type=InnoDb;

CREATE TABLE if not exists Booking (
id int auto_increment primary key,
code varchar(36) default(uuid()) not null,
dateIn datetime not null,
dateOut datetime not null,
price double not null,
) type = InnoDb;