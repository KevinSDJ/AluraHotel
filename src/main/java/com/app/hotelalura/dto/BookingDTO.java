
package com.app.hotelalura.dto;

import com.app.hotelalura.entities.Booking;
import java.awt.Component;

public record BookingDTO(Component comp,Booking booking) {
    public BookingDTO(Booking booking){
        this(null,booking);
    }
    
}
