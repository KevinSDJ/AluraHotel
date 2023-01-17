package com.app.hotelalura.daos;

import com.app.hotelalura.dbconn.DbConn;
import com.app.hotelalura.entities.Booking;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingDAO implements ICrud<Booking,String> {
    private BookingDAO instance =new BookingDAO();
    private DbConn connection=null;
    
    private BookingDAO(){
        connection=DbConn.getInstance();
    }

    @Override
    public List<Booking> findAll(){
        try {
            Connection conn= connection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;  
    }

    @Override
    public Booking findOne(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String save(Booking o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     
    
}
