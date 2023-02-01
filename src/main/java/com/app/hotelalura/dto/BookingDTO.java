
package com.app.hotelalura.dto;

import com.app.hotelalura.entities.Booking;
import java.awt.Component;
import java.sql.Date;

public record BookingDTO(Component comp,
        int id,
        String code,
        Date dateIn,
        Date dateOut,
        String paymentMethod,
        Double price,
        Integer guest_id
        ) {
    public BookingDTO(
        int id2,
        String code2,
        Date dateOut,
        Date dateOut2,
        String paymentMethod,
        Double price) {
        this(null,id2,code2,dateOut,dateOut2,paymentMethod,price,null);
    }
    public BookingDTO(
        int id2,
        String code2,
        Date dateOut,
        Date dateOut2,
        String paymentMethod,
        Double price,Integer guest_id) {
        this(null,id2,code2,dateOut,dateOut2,paymentMethod,price,guest_id);
    }
    public BookingDTO(
        Component comp,
        int id2,
        String code2,
        Date dateOut,
        Date dateOut2,
        String paymentMethod,
        Double price) {
        this(comp,id2,code2,dateOut,dateOut2,paymentMethod,price,null);
    }

    public Booking buildEntity() {
        Booking newbooking= new Booking();

        newbooking.setId(id);
        newbooking.setCode(code);
        newbooking.setDateIn(dateIn);
        newbooking.setDateOut(dateOut);
        newbooking.setPaymentMethod(paymentMethod);
        newbooking.setPrice(price);
        newbooking.setGuest_id(guest_id);
        return newbooking;
    }

}
