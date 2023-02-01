package com.app.hotelalura.dto;

import java.awt.Component;
import java.sql.Date;

import com.app.hotelalura.entities.Guest;

public record GuestDTO(
    Component comp,
    int id,
    String firstname,
    String surname,
    Date dateBirth,
    String nationality,
    String phone
    ) {
    public GuestDTO(
        int id,
        String firstname,
        String surname,
        Date dateBirth,
        String nationality,
        String phone
        ){
        this(null,id,firstname,surname,dateBirth,nationality,phone);
    }
    public Guest buildEntity(){
        Guest guest= new Guest();
        
        guest.setId(id);
        guest.setFirst_name(firstname);
        guest.setSurname(surname);
        guest.setDate_birth(dateBirth);
        guest.setNationality(nationality);
        guest.setPhone(phone);

        return guest;
    }
}
