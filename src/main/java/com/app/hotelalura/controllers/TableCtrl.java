package com.app.hotelalura.controllers;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
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
                        
            int id=(int) bookingTable.getModel().getValueAt(row, 0);
            String code= (String) bookingTable.getModel().getValueAt(row, 1);
            Date dateIn= Date.valueOf(String.valueOf(bookingTable.getModel().getValueAt(row, 2)));
            Date dateOut= Date.valueOf(String.valueOf(bookingTable.getModel().getValueAt(row, 3)));
            String paymen= (String) bookingTable.getModel().getValueAt(row, 4);
            Double price= (Double) bookingTable.getModel().getValueAt(row, 5); 

            bookingTable.clearSelection();
                        
        }else if(tabpanel.equals("Guests")&& row2>=0){
            
            int id=(int) guestTable.getModel().getValueAt(row, 0);
            String firstName=(String) guestTable.getModel().getValueAt(row, 1);
            String surname= (String) guestTable.getModel().getValueAt(row, 2);
            String nationality= (String) guestTable.getModel().getValueAt(row, 3);
            Date dateBirth= Date.valueOf(String.valueOf(guestTable.getModel().getValueAt(row, 4)));
            String phone= (String) guestTable.getModel().getValueAt(row, 5);

            bookingTable.clearSelection();

        }else {
            JOptionPane.showMessageDialog(pcontext,
            "Item not selected",
            "warning",
            JOptionPane.WARNING_MESSAGE);
        }
                

    }

}
