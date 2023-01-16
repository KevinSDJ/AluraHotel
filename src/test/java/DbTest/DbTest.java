package DbTest;

import com.app.hotelalura.dbconn.DbConn;
import com.app.hotelalura.utils.enviroment.GetCredentialsDb;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbTest {
    public static void main (String [] args){
        Connection conn=null;
        try {
            conn=DbConn.getConnection();
            conn.close();
            System.out.println("Connection success");
        } catch (SQLException ex) {
            Logger.getLogger(DbTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(GetCredentialsDb.getUrl());
        System.out.println(GetCredentialsDb.getUser());
        System.out.println(GetCredentialsDb.getPassword());
    }
    
}
