package com.app.hotelalura.utils;

import com.app.hotelalura.dto.FullDataDTO;
import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.entities.Guest;
import com.app.hotelalura.utils.pattern_obs.Observer;
import java.util.ArrayList;
import java.util.List;


public class Cache {
    private List<Booking> bookings;
    private List<Guest> guests;
    private static Cache instance;
    private List<Observer<FullDataDTO>> observers;
    
    private Cache(){}
    
    public static Cache getCache(){
        if(instance==null){
            instance= new Cache();
        }
        return instance;
    }
    /**
     * Inicializadores 
    */
    public void initState(FullDataDTO d){
        if(guests!=null&&bookings!=null){
            bookings=d.b();
            guests=d.g();
        }
    }
    public static Cache getInst(){
        if(instance==null){
            instance= new Cache();
        }
        return instance;
    }
    
    /* carga de datos y modificadores de estado */
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
    
    public void updateGuests(List<Guest> g){
        guests=g;
        notifyState(new FullDataDTO(null,g));
    }
    public void updateBookings(List<Booking> b){
        bookings=b;
        notifyState(new FullDataDTO(b,null));
    }

    /*
     * noticadores de estado y manejadores de observadores 
    */
      
    public void subscribe(Observer<FullDataDTO> ob){
        if(observers==null){
            observers= new ArrayList<>();
        }
        observers.add(ob);
    }
    public void unsubscribe(Observer<FullDataDTO> ob){
        observers= observers.stream().filter(e-> e!=ob).toList();
    }

    private void notifyState(FullDataDTO d){
        for(Observer<FullDataDTO> o:observers){
            o.update(d);
        }
    }
    
}
