package com.app.hotelalura.controllers;

import com.app.hotelalura.daos.BookingDAO;
import com.app.hotelalura.dto.BookingDTO;
import com.app.hotelalura.dto.FullDataDTO;
import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.utils.Cache;
import java.awt.Component;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class BookingCtrl {
    private final BookingDAO bookingDao;
    private static BookingCtrl instance;

    private BookingCtrl() {
        bookingDao = BookingDAO.getInstance();
    }

    public static BookingCtrl getInstance() {
        if (instance == null) {
            instance = new BookingCtrl();
        }
        return instance;
    }

    public void saveBooking(BookingDTO b) {
        try {
            bookingDao.save(b.buildEntity());
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(b.comp(), ex.getMessage(), "", 0);
        }
    }

    public FullDataDTO findFullData(Component comp) {
        FullDataDTO result = null;
        try {
            result = bookingDao.findFullData();

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(comp, ex.getMessage(), "error", 0);

        }
        return result;

    }

    public void editBooking(BookingDTO b) {
        Booking booking =b.buildEntity();
        List<Booking> newlist = Cache.getInst().getBookings().stream()
                .filter(e -> e.getId() != booking.getId()).collect(Collectors.toList());
        
        try {
            bookingDao.update(booking);

            newlist.add(booking);
            Cache.getInst().updateBookings(newlist);
        } catch (Exception e1) {
            e1.printStackTrace();
            JOptionPane.showMessageDialog(b.comp(), e1.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void deleteBooking(Component context,int id ){
        List<Booking> bookings= Cache.getInst().getBookings().stream()
        .filter(e-> e.getId()!=id).collect(Collectors.toList());

        try{

            bookingDao.delete(id);
            Cache.getInst().updateBookings(bookings);

        }catch(Exception ex){
            
            ex.printStackTrace();
            JOptionPane.showMessageDialog(context, ex.getMessage(),"error",JOptionPane.ERROR_MESSAGE);
        }
    }

}
