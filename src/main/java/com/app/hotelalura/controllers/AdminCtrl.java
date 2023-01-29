package com.app.hotelalura.controllers;

import com.app.hotelalura.daos.AdminDAO;
import com.app.hotelalura.dto.AdminDTO;
import com.app.hotelalura.entities.Admin;
import com.app.hotelalura.utils.cript.PasswordEncoder;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdminCtrl {

    private final AdminDAO repository;
    private static AdminCtrl instance = null;
    private final PasswordEncoder passwordEncoder;

    private AdminCtrl() {
        repository = AdminDAO.getInst();
        passwordEncoder= PasswordEncoder.getUtils();
    }

    public static AdminCtrl getInstance() {
        if (instance == null) {
            instance = new AdminCtrl();
        }
        return instance;
    }

    public Boolean Login(AdminDTO logindt) {
        try {
            int countusers= repository.countUsers();
            if(countusers==0){
                register(logindt);
                return true;
            }
            Optional<AdminDTO> datadb = repository.findByEmail(logindt.email());
            if(datadb.isEmpty()){
                JOptionPane.showMessageDialog(
                        logindt.comp(),
                        "User not found,check your email",
                        "warning",1
                        );
                return false;
            }
            Boolean isValidPassword=passwordEncoder.compare(logindt.password(), datadb.get().password());
            if(!isValidPassword){
                JOptionPane.showMessageDialog(
                        logindt.comp(),
                        "Email invalid, try again",
                        "warning",1
                        );
                return false;
                
            }
            return true;
            
        } catch (Exception ex) {
            Logger.getLogger(AdminCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public void register(AdminDTO register){
        
        try{
            Admin a = new Admin();
            a.setEmail(register.email());
            a.setPassword(register.password());
            repository.save(a);
        }catch(Exception ex){
            Logger.getLogger(AdminCtrl.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(
                        register.comp(),
                        ex.getMessage(),
                        "error",0
                        );
        }
        
    }
}
