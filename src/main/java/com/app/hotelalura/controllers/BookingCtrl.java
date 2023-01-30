package com.app.hotelalura.controllers;

import com.app.hotelalura.daos.BookingDAO;
import com.app.hotelalura.dto.BookingDTO;
import com.app.hotelalura.dto.FullDataDTO;
import java.awt.Component;
import javax.swing.JOptionPane;


public class BookingCtrl {
    private final BookingDAO bookingDao;
    private static BookingCtrl instance;
    
    private BookingCtrl(){
        bookingDao=BookingDAO.getInstance();
    }
    
    public static BookingCtrl getInstance(){
        if(instance==null){
            instance= new BookingCtrl();
        }
        return instance;
    }
    
    public void saveBooking(BookingDTO b){
        try{
            bookingDao.save(b.booking());
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(b.comp(), ex.getMessage(),"",0);
        }
    }
    
    public FullDataDTO findFullData(Component comp){
        FullDataDTO result=null;
        try{
            result = bookingDao.findFullData();
        
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(comp, ex.getMessage(),"error",0);
            
        }
        return result;
        
    }
    
    
    
}
