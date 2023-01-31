package com.app.hotelalura.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.app.hotelalura.entities.Booking;

public class TestReflection {

    public static void main(String[] args){

        Booking booking=new Booking();
        Method[] methods= booking.getClass().getDeclaredMethods();
        for(Method m :methods){
            if(m.getName().startsWith("get")){
                try {
                    System.out.println(m.invoke(booking)+" "+ m.getReturnType());
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                   
                    e.printStackTrace();
                }
            }
        }
    }
}
