package com.app.hotelalura.controllers;

import com.app.hotelalura.daos.GuestDAO;
import com.app.hotelalura.dto.GuestDTO;
import com.app.hotelalura.entities.Guest;
import com.app.hotelalura.utils.Cache;

import javax.swing.JOptionPane;
import java.awt.Component;
import java.util.List;
import java.util.stream.Collectors;

public class GuestCtrl {

    private final GuestDAO guestDao;
    private static GuestCtrl instance;

    private GuestCtrl() {
        guestDao = GuestDAO.getinst();
    }

    public static GuestCtrl getInstance() {
        if (instance == null) {
            instance = new GuestCtrl();
        }
        return instance;
    }

    public Integer saveGuest(GuestDTO g) {
        Integer id=null;
        try{
            id= guestDao.save(g.buildEntity());
            JOptionPane.showMessageDialog(
                g.comp(),
                "save sucessfully",
                "info",
                JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception ex){
             ex.printStackTrace();
             JOptionPane.showMessageDialog(g.comp(), ex.getMessage(),"",0);
        }
        
        return id;
    }
    public void editGuest(GuestDTO g){
        Guest guest = g.buildEntity();
        List<Guest> newlist = Cache.getInst().getGuests().stream()
                .filter(e -> e.getId() != guest.getId()).collect(Collectors.toList());
        
        try {

            guestDao.update(guest);
            newlist.add(guest);
            Cache.getInst().updateGuests(newlist);

        } catch (Exception e1) {
            e1.printStackTrace();
            JOptionPane.showMessageDialog(g.comp(), e1.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void deleteGuest(Component context,int id){
        
        try{
            
            guestDao.delete(id);
            Cache.getInst().updateFull();;
            
        }catch(Exception ex){

            ex.printStackTrace();
            JOptionPane.showMessageDialog(context, ex.getMessage(),"error",JOptionPane.ERROR_MESSAGE);
        }
    }

}
