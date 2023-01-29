package com.app.hotelalura.dto;

import com.app.hotelalura.entities.Guest;
import java.awt.Component;

public record GuestDTO(Component comp,Guest g) {
    public GuestDTO(Guest g){
        this(null,g);
    }
}
