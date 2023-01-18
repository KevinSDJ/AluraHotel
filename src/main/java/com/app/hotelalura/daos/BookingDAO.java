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

public class BookingDAO implements ICrud<Booking, String> {

    private static final BookingDAO instance = new BookingDAO();

    private BookingDAO() {
    }
    public static BookingDAO getInstance(){
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
    public Booking findOne(String id) {
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
                    result= booking;
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
    public String save(Booking o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
