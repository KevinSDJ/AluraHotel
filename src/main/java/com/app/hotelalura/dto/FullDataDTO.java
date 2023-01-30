package com.app.hotelalura.dto;

import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.entities.Guest;
import java.util.List;


public record FullDataDTO(List<Booking>b,List<Guest> g) {
   
}
