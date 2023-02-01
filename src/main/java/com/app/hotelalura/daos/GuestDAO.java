package com.app.hotelalura.daos;

import com.app.hotelalura.dbconn.DbConn;
import com.app.hotelalura.entities.Guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GuestDAO implements ICrud<Guest,Integer>{
    private static final GuestDAO instance = new GuestDAO();
    private final DbConn dbConn;
            
    private GuestDAO(){
        dbConn= DbConn.getInstance();
    }
    
    
    public static GuestDAO getinst(){
        return instance;
    }

    @Override
    public List<Guest> findAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Optional<Guest> findOne(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer save(Guest o) throws Exception {
         Integer id=null;
        try (Connection conn = dbConn.getConnection()) {
            String sql = "INSERT INTO Guest (firstName,surname,dateBirth,nationality,phone) VALUES(?,?,?,?,?);";
            System.out.println(sql);
            try (PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                st.setString(1,o.getFirst_name());
                st.setString(2, o.getSurname());
                st.setDate(3, o.getDate_birth());
                st.setString(4, o.getNationality());
                st.setString(5, o.getPhone());
                st.execute();
                ResultSet rst = st.getGeneratedKeys();
                if (rst != null && rst.next()) {
                    id= rst.getInt(1);
                }
                 
            }catch (Exception ex) {
                throw new Exception(ex);
            }

        } catch (Exception ex) {
            Logger.getLogger(GuestDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex);
        }
        return id;
    }

    @Override
    public void delete(Integer id) throws Exception {
        try (Connection conn = dbConn.getConnection()) {
            String sql = "DELETE FROM Guest g WHERE g.id=?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                
                st.setInt(1, id);
                st.execute();
                 
            }catch (Exception ex) {
                throw new Exception(ex);
            }
        }catch (Exception ex) {
            Logger.getLogger(GuestDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex);
        } 
    }
    

    public void update (Guest o) throws Exception{

        Integer id=null;
        try (Connection conn = dbConn.getConnection()) {
            String sql = "UPDATE Guest SET firstName=?,surname=?,dateBirth=?,nationality=? ,phone=? where id=?";
            try (PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                st.setString(1, o.getFirst_name());
                st.setString(2, o.getSurname());
                st.setDate(3, o.getDate_birth());
                st.setString(4, o.getNationality());
                st.setString(5, o.getPhone());
                st.setInt(6, o.getId());
                id=st.executeUpdate();        
            }catch (Exception ex) {
                throw new Exception(ex);
            }

        } catch (Exception ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex);
        }
  
    }

}
