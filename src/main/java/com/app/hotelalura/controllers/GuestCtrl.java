/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.hotelalura.controllers;

import com.app.hotelalura.daos.GuestDAO;
import com.app.hotelalura.dto.GuestDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinsdj
 */
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

    public Integer editGuest(GuestDTO g) {
        Integer id=null;
        try{
            id= guestDao.save(g.g());
        }catch(Exception ex){
             ex.printStackTrace();
             JOptionPane.showMessageDialog(g.comp(), ex.getMessage(),"",0);
        }
        
        return id;

    }

}
