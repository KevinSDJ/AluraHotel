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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guest{");
        sb.append("first_name").append(getFirst_name());
        sb.append(", surname").append(getSurname());
        sb.append(", date_birth").append(getDate_birth().toString());
        sb.append(", nationality").append(getNationality());
        sb.append(", phone").append(getPhone());
        sb.append(", booking=").append(booking);
        sb.append('}');
        return sb.toString();
    }
    
    
}
