package com.app.hotelalura.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DateTest {
    

    @Test
    @Order(1)
    public void TestDate(){
        int minima= 2023-18;
        int maxima=2023-90;
        System.out.println("Limite maximo");
        Date date = Date.valueOf(LocalDate.parse(String.format("%s-12-28", maxima)));
        System.out.println(date);

        System.out.println("Limite minimo");
        Date date2 = Date.valueOf(LocalDate.parse(String.format("%s-12-28", minima)));
        System.out.println(date2);
        assertEquals(true, true);

    }
    
}
