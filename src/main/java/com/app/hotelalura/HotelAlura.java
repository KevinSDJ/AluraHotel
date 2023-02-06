package com.app.hotelalura;

import java.awt.Color;
import java.sql.Connection;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.app.hotelalura.components.statusConnection.StatusBox;
import com.app.hotelalura.dbconn.DbConn;
import com.app.hotelalura.utils.UpTables;
import com.app.hotelalura.views.Home;
import com.app.hotelalura.views.Init;
import com.formdev.flatlaf.FlatLightLaf;

public class HotelAlura extends javax.swing.JFrame {

    private static DbConn dbConn= DbConn.getInstance();

    public HotelAlura() {
        initComponents();
    }

    private void initComponents() {
        setUndecorated(true);
        setAutoRequestFocus(false);
        setSize(1024, 600);
        setResizable(false);
        setBackground(new Color(0, 0, 0,0));
        setLocationRelativeTo(null);
        FlatLightLaf.setup();
        current = new Init(this);
        add(current);

    }

    public static void main(String... args) {

        HotelAlura m= new HotelAlura();
        m.setVisible(true);
        m.setEnabled(false);
        
        try(Connection conn= dbConn.getConnection()){
            
            UpTables.run(conn);

            StatusBox.getInstance().geSubj().updateSuccess();
            m.setEnabled(true);
        }catch(Exception ex){
            StatusBox.getInstance().geSubj().updateFail();
            CompletableFuture.supplyAsync(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex1) {
                    Logger.getLogger(HotelAlura.class.getName()).log(Level.SEVERE, null, ex1);
                }
                System.exit(0);
                return null;
            });
        }
    }

    public void changeView() {
        current.setVisible(false);
        remove(current);
        current = new Home();
        current.setVisible(true);
        add(current);
        repaint();
    }

    public void goHome() {
        changeView();
    }

    private javax.swing.JPanel current;

}
