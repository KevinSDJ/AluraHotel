package com.app.hotelalura.daos;

import com.app.hotelalura.entities.Guest;
import java.util.List;
import java.util.Optional;

public class GuestDAO implements ICrud<Guest,Integer>{
    private static final GuestDAO instance = new GuestDAO();
            
    private GuestDAO(){}
    
    
    public static GuestDAO getinst(){
        return instance;
    }

    @Override
    public List<Guest> findAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Guest> findOne(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer save(Guest o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
