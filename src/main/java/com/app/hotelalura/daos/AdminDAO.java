package com.app.hotelalura.daos;

import com.app.hotelalura.dbconn.DbConn;
import com.app.hotelalura.entities.Admin;
import com.app.hotelalura.utils.cript.PasswordEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminDAO implements ICrud<Admin, Integer>{
    private static final AdminDAO instance=new AdminDAO();
    
    private AdminDAO (){
    }
    public static AdminDAO getInst(){
        return instance;
    }

    @Override
    public List<Admin> findAll() throws Exception {
         List<Admin> result = new ArrayList<>();
         try (Connection conn = DbConn.getConnection()) {
           
            String sql = "SELECT * FROM Admin";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.execute();
                ResultSet resultset = st.getResultSet();
                while (resultset.next()) {
                    Admin admin = new Admin();
                    admin.setId(resultset.getInt("id"));
                    admin.setFirst_name(resultset.getString("first_name"));
                    admin.setSurname(resultset.getString("surname"));
                    admin.setNationality(resultset.getString("nationality"));
                    admin.setPhone(resultset.getString("phone"));
                    admin.setDate_birth(resultset.getDate("date_birth"));
                    admin.setEmail(resultset.getString("email"));
                    admin.setPassword(resultset.getString("password"));
                    result.add(admin);
                }
            }catch(Exception ex){
                throw new Exception(ex);
            }
        } catch (Exception ex) {
            throw new Exception(ex);
        } 
         return result;
    }

    @Override
    public Optional<Admin> findOne(Integer id) throws Exception {
        Optional<Admin> result = null;
        try (Connection conn = DbConn.getConnection()) {
            String sql ="select * from Admin a where a.id=?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, id);
                st.execute();
                ResultSet resultset = st.getResultSet();
                while (resultset.next()) {
                    System.out.println(resultset);
                    Admin admin = new Admin();
                    admin.setId(resultset.getInt("id"));
                    admin.setFirst_name(resultset.getString("first_name"));
                    admin.setSurname(resultset.getString("surname"));
                    admin.setNationality(resultset.getString("nationality"));
                    admin.setPhone(resultset.getString("phone"));
                    admin.setDate_birth(resultset.getDate("date_birth"));
                    admin.setEmail(resultset.getString("email"));
                    admin.setPassword(resultset.getString("password"));
                    
                    result= Optional.of(admin);
                }
            }catch(Exception ex){
                throw new Exception(ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex);
        }
        return result;
    }

    @Override
    public Integer save(Admin o) throws Exception {
        Integer id=null;
        try (Connection conn = DbConn.getConnection()) {
            String sql = "INSERT INTO Admin (email,password,phone) VALUES(?,?,?)";
            String password=o.getPassword();
            /* encript password , never save password in text plain*/
            o.setPassword(PasswordEncoder.getUtils().encode(password));
            try (PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                st.setString(1, o.getEmail());
                st.setString(2, o.getPassword());
                st.setString(3, o.getPhone());
                st.execute();
                ResultSet rst = st.getGeneratedKeys();
                if (rst != null && rst.next()) {
                    id=rst.getInt(1);
                }
                 
            }catch (Exception ex) {
                throw new Exception(ex);
            }

        }catch (Exception ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex);
        }
        return id;
    }

    @Override
    public void delete(Integer id) throws Exception {
       try (Connection conn = DbConn.getConnection()) {
            String sql = "DELETE FROM Admin a WHERE a.id=?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                
                st.setInt(1, id);
                st.execute();
                 
            }catch (Exception ex) {
                throw new Exception(ex);
            }
        }catch (Exception ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex);
        }
    }
    
    
}
