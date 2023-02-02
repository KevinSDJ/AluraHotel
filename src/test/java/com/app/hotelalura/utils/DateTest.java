package com.app.hotelalura.utils;

import javax.swing.ImageIcon;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DateTest {
    

    @Test
    @Order(1)
    public void TestDate(){
        System.out.println(new ImageIcon(DateTest.class.getResource("/icon-buscar.png")));

    }
    
}
