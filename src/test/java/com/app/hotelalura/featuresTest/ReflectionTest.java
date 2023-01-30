package com.app.hotelalura.featuresTest;

import com.app.hotelalura.dbconn.DbConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReflectionTest {
    private static DbConn dbConn;
    
    public static void main(String[] args) {
        dbConn=DbConn.getInstance();
        
        try (Connection conn = dbConn.getConnection(); 
                PreparedStatement st = conn.prepareStatement("CREATE TABLE  if not exists Guest(\n"
                + "id int auto_increment primary key not null,\n"
                + "first_name varchar(20) not null,\n"
                + "surname varchar(50) not null,\n"
                + "nationality varchar(40) not null,\n"
                + "phone long not null,\n"
                + "id_booking varchar(36) not null ,\n"
                + "foreign key (id_booking) references Booking(code)\n"
                + ") engine=InnoDB")) {
            st.execute();
        
        } catch (Exception ex) {
            Logger.getLogger(ReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
