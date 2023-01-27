CREATE TABLE Admin(
id int auto_increment unique primary key not null,
first_name varchar(15),
surname varchar(10),
date_birth datetime,
nationality varchar(20),
phone long not null,
email varchar(40) not null unique,
password varchar(40) not null
) engine=InnoDb;