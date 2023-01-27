package com.app.hotelalura.daos;

import com.app.hotelalura.dbconn.DbConn;
import com.app.hotelalura.entities.Booking;
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

    private BookingDAO() {
    }

    public static BookingDAO getInstance() {
        return instance;
    }

    @Override
    public List<Booking> findAll() {
        try (Connection conn = DbConn.getConnection()) {
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
        try (Connection conn = DbConn.getConnection()) {
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
        try (Connection conn = DbConn.getConnection()) {
            String sql = "INSERT INTO Booking (code,dateIn,dateOut,price,paymentMethod) VALUES(?,?,?,?,?);";
            System.out.println(sql);
            try (PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                st.setString(1,o.getCode());
                st.setDate(2, o.getDateIn());
                st.setDate(3, o.getDateOut());
                st.setDouble(4, o.getPrice());
                st.setString(5, o.getPaymentMethod());
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
        try (Connection conn = DbConn.getConnection()) {
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

}
