package com.app.hotelalura.controllers;

import java.util.ArrayList;
import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.entities.Guest;
import com.app.hotelalura.utils.Cache;
import java.util.List;

public class SearchCtrl {
    private static  SearchCtrl instance;
    private Cache cache;
    private List<Guest> guestCopy;
    private List<Booking> bookingCopy;


    private SearchCtrl(){
        cache= Cache.getInst();
    }

    public static void getInstance(){
        if(instance==null){
            instance= new SearchCtrl();
        }
    }

    public void g(){
       
        
    }
}
