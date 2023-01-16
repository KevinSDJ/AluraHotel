package com.app.hotelalura.entities;

import java.util.List;

public class Guest extends Person {
  
    private List<Booking> booking;
    
    public Guest(){}
    
    public List<Booking> getBooking() {
        return booking;
    }  
    public void setBooking(List<Booking> booking) {
        this.booking = booking;
    }
    
}
