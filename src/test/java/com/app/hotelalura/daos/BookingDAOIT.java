package com.app.hotelalura.daos;

import com.app.hotelalura.entities.Booking;
import java.sql.SQLException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kevinsdj
 */
public class BookingDAOIT {

    public BookingDAOIT() {
    }

    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        BookingDAO expResult = null;
        BookingDAO result = BookingDAO.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class BookingDAO.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        BookingDAO instance = null;
        List<Booking> expResult = null;
        List<Booking> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOne method, of class BookingDAO.
     */
    @Test
    public void testFindOne() {
        System.out.println("findOne");
        int id = 1;
        BookingDAO instance = null;
        Booking expResult = null;
        Booking result = instance.findOne(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class BookingDAO.
     */
    @Test
    public void testSave() {
        Booking booking = new Booking();
        booking.setDateIn("18/01/2023");
        booking.setDateOut("28/01/2023");
        booking.setPrice(123.01);
        booking.setPaymentMethod("Credit Card");

        BookingDAO bookingdao = BookingDAO.getInstance();
        int save = bookingdao.save(booking);
        assertEquals(true,save);
        fail("fail in save Booking");

    }

    /**
     * Test of delete method, of class BookingDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 1;
        BookingDAO instance = null;
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSaveBooking() {
        Booking booking = new Booking();
        booking.setDateIn("18/01/2023");
        booking.setDateOut("28/01/2023");
        booking.setPrice(123.01);
        booking.setPaymentMethod("Credit Card");

        BookingDAO bookingdao = BookingDAO.getInstance();
        int save = bookingdao.save(booking);
        assertEquals(true,save);
        fail("fail in save Booking");

    }

}
