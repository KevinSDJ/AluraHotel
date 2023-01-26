package com.app.hotelalura;

import com.app.hotelalura.dbconn.DbConn;
import com.app.hotelalura.views.Main;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HotelAlura {

    public static void main(String args[]) {
        
        
        Main main = new Main();
        main.setVisible(true);
        main.setEnabled(false);
        JOptionPane op= new JOptionPane();
        try (Connection conn=DbConn.getConnection()){
            conn.close();
            main.setEnabled(true);
        } catch (Exception ex) {
            Logger.getLogger(HotelAlura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(main, "Database not connect","error",0);
            System.exit(0);
        }
    }

}
