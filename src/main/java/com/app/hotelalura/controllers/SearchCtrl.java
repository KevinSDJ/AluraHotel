package com.app.hotelalura.controllers;

import java.util.ArrayList;
import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.entities.Guest;
import com.app.hotelalura.utils.Cache;
import java.util.List;
import java.util.regex.Pattern;

public class SearchCtrl {
    private static  SearchCtrl instance;
    private Cache cache;
    private List<Guest> guestCopy;
    private List<Booking> bookingCopy;


    private SearchCtrl(){
        cache= Cache.getInst();
    }

    public static SearchCtrl getInstance(){
        if(instance==null){
            instance= new SearchCtrl();
        }
        return instance;
    }

    public void typeIn(String typetext){
        
        if(Pattern.matches("^[a-zA-Z ]*$", typetext)){
            searchBySurname(typetext.trim());     
        }else if(Pattern.matches("[0-9]+", typetext)){
            searchById(typetext.trim());
        }
    }
    public void searchById(String typetext){
        int id= Integer.parseInt(typetext);
        System.out.println("Searching by "+id);
    }
    public void searchBySurname(String typeTextString){
        System.out.println("Searching by surname");
    }
}
