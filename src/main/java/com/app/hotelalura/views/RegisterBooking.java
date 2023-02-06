package com.app.hotelalura.views;

import com.app.hotelalura.entities.Guest;
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
        java.awt.EventQueue.invokeLater(() -> new RegisterBooking(homeref));
    }
    
    public void nextForm(){
        current.setVisible(false);
        container.remove(current);
        if(guestForm==null){
            guestForm = new com.app.hotelalura.components.GuestForm(this);
        }
        current=guestForm;
        container.add(current);
        current.setVisible(true);
        validate();
        repaint();
        guestForm.update();
        
    }
    public void previusForm(){
        current.setVisible(false);
        container.remove(current);
        current=bookingForm;
        container.add(current);
        current.setVisible(true);
        validate();
        repaint();
    }
    
    public void closedFormView(){
        guestForm=null;
        homeref.closedRegisterView();
    }
    public Guest updateDataForm(){
        if(dataForm==null){
            dataForm= new Guest();
        }
        return dataForm;
    }
    
    private Guest dataForm;
    private static Home homeref;
    private javax.swing.JPanel container;
    private javax.swing.JPanel current;
    private com.app.hotelalura.components.GuestForm guestForm;
    private com.app.hotelalura.components.BookingForm bookingForm;
    
}
