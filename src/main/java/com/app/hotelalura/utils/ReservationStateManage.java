package com.app.hotelalura.utils;

import com.app.hotelalura.utils.base.Subject;
import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.entities.Guest;
import java.util.HashMap;
import java.util.Map;

public class ReservationStateManage extends Subject {
    private Boolean cancel=null;
    private Boolean nextStep=null;
    private Booking booking=new Booking();
    private Guest guest= new Guest();
    private static final ReservationStateManage instance = new ReservationStateManage();
    
    private ReservationStateManage(){}
    
    public void setCancel(Boolean state){
        cancel=state;
        Map<String,Object>data= new HashMap<>();
        data.put("cancel", cancel);
        data.put("nextStep",nextStep);
        data.put("booking", booking);
        notifyState(data);
    }
    public void setNextSteps(Boolean state){
        instance.nextStep=state;
        instance.notifyAction();
    }
    public static Subject getInstance(){
        return instance;
    }
    
}
