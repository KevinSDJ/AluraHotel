package com.app.hotelalura.views;

import java.awt.Color;
import java.awt.GridBagLayout;

public class RegisterBooking extends javax.swing.JFrame  {
    

    public RegisterBooking(Home ref) {
        homeref=ref;
        initComponents();
    }
     public RegisterBooking() {
        initComponents();
    }
    
    private void initComponents() {

        container = new javax.swing.JPanel();
        guestForm = new com.app.hotelalura.components.GuestForm(this);
        bookingForm= new com.app.hotelalura.components.BookingForm(this);
        current=bookingForm;
        
        setSize(1024,600);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setBackground(new Color(0,0,0,70));

        container.setBackground(new Color(0,0,0,0));
        container.setSize(1024,600);
        container.setLayout(new GridBagLayout());

        container.add(current);
        add(container);
        setLocationRelativeTo(null);
    }

    public static void main(String... args) {
        java.awt.EventQueue.invokeLater(() -> new RegisterBooking(homeref).setVisible(true));
    }
    
    public void nextForm(){
        current.setVisible(false);
        container.remove(current);
        current=guestForm;
        container.add(current);
        current.setVisible(true);
        validate();
        repaint();
        System.out.println(current.getSize());
        
    }
    public void previusForm(){
        current.setVisible(false);
        container.remove(current);
        current=bookingForm;
        container.add(current);
        current.setVisible(true);
        validate();
        repaint();
        System.out.println(current.getSize());
    }
    
    public void closedFormView(){
        homeref.closedRegisterView();
    }

    private static Home homeref;
    private javax.swing.JPanel container;
    private javax.swing.JPanel current;
    private com.app.hotelalura.components.GuestForm guestForm;
    private com.app.hotelalura.components.BookingForm bookingForm;
    
}
