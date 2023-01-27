package com.app.hotelalura;

import com.app.hotelalura.components.statusConnection.StatusBox;
import com.app.hotelalura.dbconn.DbConn;
import com.app.hotelalura.views.Main;
import java.sql.Connection;

public class HotelAlura {

    public static void main(String args[]) {
        
        
        Main main = new Main();
        main.setVisible(true);
        main.setEnabled(false);
        try(Connection conn= DbConn.getConnection()){
            conn.close();
            StatusBox.getInstance().geSubj().updateSuccess();
            main.setEnabled(true);
        }catch(Exception ex){
            StatusBox.getInstance().geSubj().updateFail();
            System.exit(0);
        }
       
    }

}
