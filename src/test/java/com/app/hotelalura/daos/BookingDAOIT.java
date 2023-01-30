package com.app.hotelalura.daos;

import com.app.hotelalura.dto.FullDataDTO;
import com.app.hotelalura.entities.Booking;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;


public class BookingDAOIT {
    private final BookingDAO bookingDao=BookingDAO.getInstance();
    private Integer idtemp;
    public BookingDAOIT() {
    }

    @Test
    public void testGetInstance() {
        UUID code= UUID.randomUUID();
        System.out.println("getInstance");
        System.out.println(code.toString());
        assertEquals(false,bookingDao==null);
        fail("Instance not build");
    }

  
    @Test
    public void testFindAll() {
        System.out.println("findAll");
  
        List<Booking> result = bookingDao.findAll();
        assertEquals(!result.isEmpty(), !result.isEmpty());
        fail("FindAll not return expect, return null");
    }


    @Test
    public void testFindOne() {
        System.out.println("findOne");

        Optional<Booking> result = bookingDao.findOne(idtemp);
        assertEquals(true, result.isPresent());
   
        fail("Booking not found");
    }

    @Test
    public void testSave() {
        Booking booking = new Booking();
        booking.setDateIn(new Date(System.currentTimeMillis()));
        booking.setDateOut(new Date(System.currentTimeMillis()+3603000));
        booking.setPrice(123.01);
        booking.setPaymentMethod("Credit Card");

        int save;
        try {
            save = bookingDao.save(booking);
            idtemp=save;
            if(idtemp==null){
                throw new Exception("Booking not save");
            }
            assertEquals(true,(idtemp!=null&&idtemp>0));
        } catch (Exception ex) {
            Logger.getLogger(BookingDAOIT.class.getName()).log(Level.SEVERE, null, ex);
             fail("fail in save Booking");
        }

    }
    
    @Test
    public void testDelete() {
        System.out.println("delete");
      
        try {
            bookingDao.delete(idtemp);
        } catch (Exception ex) {
            Logger.getLogger(BookingDAOIT.class.getName()).log(Level.SEVERE, null, ex);
            fail(ex.getMessage());
            
        }
        
    }
    
    @Test 
    public void fullDataTest(){
        
        System.out.println("Full data test");
        try{
            FullDataDTO d = bookingDao.findFullData();
            System.out.println("Bookings --------");
            d.b().forEach(System.out::println);
            System.out.println("Guests --------");
            d.g().forEach(System.out::println);
            assertEquals(true,true);
        }catch(Exception ex){
           fail(ex.getMessage());
        }
    }

}
