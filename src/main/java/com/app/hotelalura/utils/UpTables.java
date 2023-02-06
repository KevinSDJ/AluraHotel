package com.app.hotelalura.utils;

import java.sql.Connection;
import java.sql.Statement;

public class UpTables {
    private static String adminTable="""
            CREATE TABLE if not exists Admin(
            id int auto_increment unique primary key not null,
            firstName varchar(20),
            surname varchar(20),
            dateBirth date,
            nationality varchar(20),
            phone varchar(40),
            email varchar(40) not null unique,
            password varchar(200) not null
            ) engine=InnoDB
            """;
    private static String bookingTable="""
            CREATE TABLE if not exists Booking(
            id int auto_increment primary key not null,
            code varchar(36) unique not null,
            dateIn date not null,
            dateOut date not null,
            price double,
            paymentMethod varchar(45) not null,
            guest_id int,
            foreign key(Guest_id) references Guest(id) ON DELETE CASCADE
            ) engine= InnoDB
            """;
    private static String guestTable="""
            CREATE TABLE if not exists Guest(
            id int auto_increment unique primary key not null,
            firstName varchar(20) not null,
            surname varchar(20) not null,
            dateBirth date not null,
            nationality varchar(20) not null,
            phone varchar(40) not null
            ) engine=InnoDB
            """;

    public static void run(Connection conn) throws Exception{

        try(Statement st= conn.createStatement()){
            st.executeUpdate(adminTable);
            st.executeUpdate(guestTable);
            st.executeUpdate(bookingTable);
            st.close();
        }catch(Exception ex){
            throw new Exception(ex);
        }finally{
            conn.close();
        }
    } 
    
}
