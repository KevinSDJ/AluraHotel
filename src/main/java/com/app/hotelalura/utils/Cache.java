package com.app.hotelalura.utils;

import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.entities.Guest;
import java.util.List;


public class Cache {
    private List<Booking> bookings;
    private List<Guest> guests;
    private static Cache instance;
    
    private Cache(){}
    
    public static Cache getCache(){
        if(instance==null){
            instance= new Cache();
        }
        return instance;
    }
    
    public void setBookings(List<Booking> b){
        bookings=b;
    }
    public void setGuests(List<Guest> g){
        guests=g;
    }
    public List<Guest> getGuests(){
        return guests;
    }
    public List<Booking> getBookings(){
        return bookings;
    }
    
}
