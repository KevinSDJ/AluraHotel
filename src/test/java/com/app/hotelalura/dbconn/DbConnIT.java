package com.app.hotelalura.dbconn;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DbConnIT {
    
    public DbConnIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetConnection() {
        Connection result = null;
        System.out.println("Connection Db test");
        try {
            result = DbConn.getConnection();

            assertEquals(true, true);
        } catch (SQLException | RuntimeException ex) {
            fail("failt connection");
        } catch (Exception ex) {
            fail("fail connection");
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DbConnIT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @Test
    public void createTableBooking(){
         try (Connection conn = DbConn.getConnection(); PreparedStatement st = conn.prepareStatement("CREATE TABLE  if not exists Booking(\n"
                + "id int primary key auto_increment not null,\n"
                + "code varchar(36) default(uuid()) not null,\n"
                + "dateIn varchar(10) not null,\n"
                + "dateOut varchar(10) not null,\n"
                + "price double not null,\n"
                + "paymentMethod varchar(20) not null\n"
                +") engine=InnoDB;")) {
            st.execute();
            assertEquals(true, true);
        } catch (Exception ex) {
             ex.printStackTrace();
             fail("table not created or already exist");
        }
    
    
    }

    @Test
    public void createTableGuest() {
        try (Connection conn = DbConn.getConnection(); PreparedStatement st = conn.prepareStatement("CREATE TABLE  if not exists Guest(\n"
                + "id int auto_increment primary key not null,\n"
                + "first_name varchar(20) not null,\n"
                + "surname varchar(50) not null,\n"
                + "nationality varchar(40) not null,\n"
                + "phone long not null,\n"
                + "id_booking int not null ,\n"
                + "foreign key (id_booking) references Booking(id)\n"
                + ") engine=InnoDB;")) {
            boolean d = st.execute();
            assertEquals(true, true);
        } catch (Exception ex) {
             ex.printStackTrace();
             fail("table not created or already exist");
        }
    }

    @Test
    public void showTables() throws SQLException {
        ResultSet rst=null;
        try (Connection conn = DbConn.getConnection()){
            DatabaseMetaData metadata= conn.getMetaData();
            
            String[] type={"TABLE"};
            rst= metadata.getTables(null,null,"%",type);
            while(rst.next()){
                System.out.println(rst.getString("TABLE_NAME"));
            }
            rst.close();
            assertEquals(true, true);
        } catch (Exception ex) {
             fail("fail sql command");
             if(rst!=null){
                 rst.close();
             }
             
        }
    }
    
}
