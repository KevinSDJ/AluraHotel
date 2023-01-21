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
            String sql = String.format("SELECT * FROM %s", Booking.class.getName() + "s");
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.execute();
                ResultSet resultset = st.getResultSet();
                while (resultset.next()) {
                    Booking booking = new Booking();
                    booking.setCode(resultset.getString("code"));
                    booking.setDateIn(resultset.getString("dateIn"));
                    booking.setDateOut(resultset.getString("dateOut"));
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
    public Booking findOne(Integer id) {
        Booking result = null;
        try (Connection conn = DbConn.getConnection()) {
            String sql = String.format("SELECT * FROM %s", Booking.class.getName() + "s");
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.execute();
                ResultSet resultset = st.getResultSet();
                while (resultset.next()) {
                    Booking booking = new Booking();
                    booking.setCode(resultset.getString("code"));
                    booking.setDateIn(resultset.getString("dateIn"));
                    booking.setDateOut(resultset.getString("dateOut"));
                    booking.setPrice(resultset.getDouble("price"));
                    booking.setPaymentMethod(resultset.getString("paymentMethod"));
                    result = booking;
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
    public Integer save(Booking o) {
        try (Connection conn = DbConn.getConnection()) {
            String sql = "INSERT INTO Booking (dateIn,dateOut,price,paymentMethod) VALUES(?,?,?,?)";
            try (PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                st.setString(1, o.getDateIn());
                st.setString(2, o.getDateOut());
                st.setDouble(3, o.getPrice());
                st.setString(4, o.getPaymentMethod());
                st.execute();
                ResultSet rst = st.getGeneratedKeys();
                if (rst != null && rst.next()) {
                    return rst.getInt(1);
                }
                 
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (Exception ex) {
                throw new Exception(ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
