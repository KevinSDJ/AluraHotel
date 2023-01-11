package com.app.hotelalura.entities;

import java.util.Date;
import java.util.List;

public class Guest {
    private String id;
    private String Name;
    private String Surname;
    private Date dataBirth;
    private String nationality;
    private String phone;
    private List<Booking> booking;
    
    public Guest(){}
    
    
}
