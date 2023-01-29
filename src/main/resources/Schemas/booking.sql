use hotelalura;

CREATE TABLE if not exists Booking(
id int auto_increment primary key not null,
code varchar(36) unique not null,
dateIn date not null,
dateOut date not null,
price double,
paymentMethod varchar(45) not null,
guest_id int,
foreign key(Guest_id) references Guest(id) ON DELETE CASCADE
) engine= InnoDB;
