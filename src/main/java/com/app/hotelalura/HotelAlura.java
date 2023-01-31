package com.app.hotelalura;


import com.app.hotelalura.components.statusConnection.StatusBox;
import com.app.hotelalura.dbconn.DbConn;
import com.app.hotelalura.views.Main;
import java.sql.Connection;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HotelAlura {
    private static DbConn dbConn= DbConn.getInstance();

    public static void main(String args[]) {
        
      
        Main main = new Main();
        main.setVisible(true);
        //main.setEnabled(false);
        /**
         * añadi un methodo que verifique la conexion a la base de datos
         * en caso de fallar o la falta de la base de datos correspondiente para la app
         * se mostrara un mensaje de fallo la conexion y se cerrara la app
        */
        /*try(Connection conn= dbConn.getConnection()){
            conn.close();
            StatusBox.getInstance().geSubj().updateSuccess();
            main.setEnabled(true);
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
        }*/
       
    }

}
