package com.app.hotelalura.controllers;

import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.entities.Guest;
import com.app.hotelalura.utils.Cache;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SearchCtrl {
    private static  SearchCtrl instance;
    private Cache cache;
    private List<Guest> guestCopy;
    private List<Booking> bookingCopy;


    private SearchCtrl(){
        cache= Cache.getInst();
        guestCopy= cache.getGuests();
        bookingCopy=cache.getBookings();
    }

    public static SearchCtrl getInstance(){
        if(instance==null){
            instance= new SearchCtrl();
        }
        return instance;
    }

    public void typeIn(String typetext){
        if(typetext.isEmpty()){
            System.out.println("Is empty , reload full");
            reloadFull();
            return ;
        }
        if(Pattern.matches("^[a-zA-Z ]*$", typetext)){
            searchBySurname(typetext.trim());     
        }else if(Pattern.matches("[0-9]+", typetext)){
            searchById(typetext.trim());
        }
    }
    public void searchById(String typetext){
        int id= Integer.parseInt(typetext);
        System.out.println("Searching by "+id);
        if(bookingCopy.size()>0){
            cache.updateBookings(bookingCopy.stream()
            .filter(e-> e.getId()==id).collect(Collectors.toList()));   
        }
    }
    public void searchBySurname(String typeTextString){
        System.out.println("Searching by surname");
        if(guestCopy.size()>0){
            cache.updateGuests(guestCopy.stream()
            .filter(e-> e.getSurname().toLowerCase().contains(typeTextString.toLowerCase())).collect(Collectors.toList()));   
        }
    }
    public void reloadFull(){
        cache.updateGuests(guestCopy);
        cache.updateBookings(bookingCopy);
    }
    public void updateCopies(){
        guestCopy=cache.getGuests();
        bookingCopy=cache.getBookings();
    }
}
