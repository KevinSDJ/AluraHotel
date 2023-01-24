package com.app.hotelalura.views;


import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;



public class HomeIT  extends JFrame{
    
    public HomeIT(){
        setSize(1024,600);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        add(new Home());
    }
    
     public static void main(String... args){
         EventQueue.invokeLater(()->new HomeIT().setVisible(true));
     }
    
}
