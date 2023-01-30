package com.app.hotelalura.daos;

import com.app.hotelalura.dbconn.DbConn;
import com.app.hotelalura.dto.FullDataDTO;
import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.entities.Guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingDAO implements ICrud<Booking, Integer> {

    private static final BookingDAO instance = new BookingDAO();
    private final DbConn dbConn;

    private BookingDAO() {
        dbConn=DbConn.getInstance();
    }

    public static BookingDAO getInstance() {
        return instance;
    }

    @Override
    public List<Booking> findAll() {
        try (Connection conn = dbConn.getConnection()) {
            List<Booking> result = new ArrayList<>();
            String sql = String.format("SELECT * FROM %s", Booking.class.getSimpleName());
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.execute();
                ResultSet resultset = st.getResultSet();
                while (resultset.next()) {
                    Booking booking = new Booking();
                    booking.setCode(resultset.getString("code"));
                    booking.setDateIn(resultset.getDate("dateIn"));
                    booking.setDateOut(resultset.getDate("dateOut"));
                    booking.setPrice(resultset.getDouble("price"));
                    booking.setPaymentMethod(resultset.getString("paymentMethod"));
                    result.add(booking);
                }
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public Optional<Booking> findOne(Integer id) {
        Optional<Booking> result = null;
        try (Connection conn = dbConn.getConnection()) {
            String sql = String.format("SELECT * FROM %s", Booking.class.getSimpleName());
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.execute();
                ResultSet resultset = st.getResultSet();
                while (resultset.next()) {
                    Booking booking = new Booking();
                    booking.setCode(resultset.getString("code"));
                    booking.setDateIn(resultset.getDate("dateIn"));
                    booking.setDateOut(resultset.getDate("dateOut"));
                    booking.setPrice(resultset.getDouble("price"));
                    booking.setPaymentMethod(resultset.getString("paymentMethod"));
                    result= Optional.of(booking);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    @Override
    public Integer save(Booking o) throws Exception {
        UUID code=UUID.randomUUID();
        Integer id=null;
        o.setCode(code.toString());
        try (Connection conn = dbConn.getConnection()) {
            String sql = "INSERT INTO Booking (code,dateIn,dateOut,price,paymentMethod,guest_id) VALUES(?,?,?,?,?,?);";
            System.out.println(sql);
            try (PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                st.setString(1,o.getCode());
                st.setDate(2, o.getDateIn());
                st.setDate(3, o.getDateOut());
                st.setDouble(4, o.getPrice());
                st.setString(5, o.getPaymentMethod());
                st.setInt(6,o.getGuest_id());
                st.execute();
                ResultSet rst = st.getGeneratedKeys();
                if (rst != null && rst.next()) {
                    id= rst.getInt(1);
                }
                 
            }catch (Exception ex) {
                throw new Exception(ex);
            }

        } catch (Exception ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex);
        }
        return id;
    }

    @Override
    public void delete(Integer id) throws Exception {
        try (Connection conn = dbConn.getConnection()) {
            String sql = "DELETE FROM Booking b WHERE b.id=?";
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
     
     public FullDataDTO findFullData() throws Exception{
         List<Booking> b= new ArrayList<>();
         List<Guest> g = new ArrayList<>();
        try (Connection conn = dbConn.getConnection()) {
            String sql = "select * from Booking b INNER JOIN Guest g  WHERE b.guest_id=g.id";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                
                st.execute();
                ResultSet rst = st.getResultSet();
                while(rst.next()){
                    Booking booking= new Booking();
                    Guest guest= new Guest();
                    booking.setId(rst.getInt("id"));
                    booking.setCode(rst.getString("code"));
                    booking.setDateIn(rst.getDate("dateIn"));
                    booking.setDateOut(rst.getDate("dateOut"));
                    booking.setPrice(rst.getDouble("price"));
                    booking.setPaymentMethod(rst.getString("paymentMethod"));
                    /* Guest */
                    guest.setId(rst.getInt("guest_id"));
                    guest.setFirst_name(rst.getString("firstName"));
                    guest.setSurname(rst.getString("surname"));
                    guest.setDate_birth(rst.getDate("dateBirth"));
                    guest.setNationality(rst.getString("nationality"));
                    guest.setPhone(rst.getString("phone"));
                    g.add(guest);
                    b.add(booking);
                }
            }catch (Exception ex) {
                throw new Exception(ex);
            }
        }catch (Exception ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex);
        }
        return new FullDataDTO(b, g);
    }
}
