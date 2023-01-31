package com.app.hotelalura.controllers;

import com.app.hotelalura.daos.BookingDAO;
import com.app.hotelalura.dto.BookingDTO;
import com.app.hotelalura.dto.FullDataDTO;
import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.utils.Cache;

import java.awt.Component;
import java.lang.reflect.Method;
import java.util.Optional;

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

    public void edit(BookingDTO b){
        Optional<Booking> bk = Cache.getInst().getBookings().stream()
        .filter(e->e.getId()==b.booking().getId()).findFirst();
        Method[] methods= bk.get().getClass().getMethods();
        for(Method m:methods){
            System.out.println(m);
        }

    } 
    
    
    
}
