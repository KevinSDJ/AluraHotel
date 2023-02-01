package com.app.hotelalura.controllers;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import com.app.hotelalura.dto.BookingDTO;
import com.app.hotelalura.dto.GuestDTO;
import com.app.hotelalura.entities.Guest;
import java.awt.Component;
import java.sql.Date;

public class TableCtrl {
    private static TableCtrl instance;
    private BookingCtrl bookingCtrl;
    private GuestCtrl guestCtrl;
    private TableCtrl(){
        guestCtrl= GuestCtrl.getInstance();
        bookingCtrl= BookingCtrl.getInstance();
    }

    public static TableCtrl getInstance(){
        if(instance==null){
            instance= new TableCtrl();
        }
        return instance;
    }

    public void editItem(Component pcontext,JTabbedPane tabPanel,JTable guestTable,JTable bookingTable){

        String tabpanel=tabPanel.getTitleAt(tabPanel.getSelectedIndex());
        int row = bookingTable.getSelectedRow();
        int row2 =guestTable.getSelectedRow();
        
        if(tabpanel.equals("Bookings")&& row>=0){
            try{
                int id= (int) bookingTable.getModel().getValueAt(row, 0);
                String code= (String) bookingTable.getModel().getValueAt(row, 1);
                Date dateIn= Date.valueOf(String.valueOf(bookingTable.getModel().getValueAt(row, 2)));
                Date dateOut= Date.valueOf(String.valueOf(bookingTable.getModel().getValueAt(row, 3)));
                String paymentMethod= (String) bookingTable.getModel().getValueAt(row, 4);
                double price=Double.valueOf(bookingTable.getModel().getValueAt(row, 5).toString());
                
                bookingCtrl.editBooking(new BookingDTO(pcontext,id,code,dateIn,dateOut,paymentMethod,price));
                bookingTable.clearSelection();
            }catch(Exception ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(pcontext, ex.getMessage(),"error",0);
            }           
        }else if(tabpanel.equals("Guests")&& row2>=0){
            
            Guest guest= new Guest();
            guest.setId((int) guestTable.getModel().getValueAt(row2, 0));
            guest.setFirst_name((String) guestTable.getModel().getValueAt(row2, 1));
            guest.setSurname((String) guestTable.getModel().getValueAt(row2, 2));
            guest.setNationality((String) guestTable.getModel().getValueAt(row2, 3));
            guest.setDate_birth(Date.valueOf(String.valueOf(guestTable.getModel().getValueAt(row2, 4))));
            guest.setPhone((String) guestTable.getModel().getValueAt(row2, 5));

            guestCtrl.editGuest(new GuestDTO(pcontext, guest));
            guestTable.clearSelection();

        }else {
            JOptionPane.showMessageDialog(pcontext,
            "Item not selected",
            "warning",
            JOptionPane.WARNING_MESSAGE);
        } 

    }

}
