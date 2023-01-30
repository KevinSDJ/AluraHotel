package com.app.hotelalura.components;

import com.app.hotelalura.controllers.BookingCtrl;
import com.app.hotelalura.dto.FullDataDTO;
import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.entities.Guest;
import com.app.hotelalura.utils.Cache;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class SearchSystem extends javax.swing.JPanel {

    public SearchSystem() {
        bookingCtrl = BookingCtrl.getInstance();
        FlatLightLaf.setup();
        initComponents();
        firstLoad();
    }

    private void initComponents() {

        tabPanel = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookinTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        guestTable = new javax.swing.JTable();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabPanel.setBackground(new java.awt.Color(204, 204, 204));
        tabPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 10));
        tabPanel.setForeground(new java.awt.Color(51, 51, 51));

        bookinTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] {
                "id", "code", "date in", "date out", "payment method", "total"
        }) {
            boolean[] canEdit = { false, false, true, true, true, true };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookinTable);

        tabPanel.addTab("Bookiings", jScrollPane1);

        guestTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] {
                "id", "First Name", "Surname", "Nationality", "Date birth", "Phone"
        }) {
            boolean[] canEdit = { false, true, true, true, true, true };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

        });
        jScrollPane2.setViewportView(guestTable);

        tabPanel.addTab("Guests", jScrollPane2);

        editBtn.setBackground(new java.awt.Color(25, 129, 175));
        editBtn.setFont(new java.awt.Font("Nimbus Sans", 1, 14));
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_icon.png")));
        editBtn.setText("edit");
        editBtn.setPreferredSize(new java.awt.Dimension(106, 40));

        deleteBtn.setBackground(new java.awt.Color(255, 102, 102));
        deleteBtn.setFont(new java.awt.Font("Nimbus Sans", 1, 14));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_icon2.png")));
        deleteBtn.setText("delete");
        deleteBtn.setPreferredSize(new java.awt.Dimension(106, 40));

        jLabel1.setBackground(new java.awt.Color(25, 129, 175));
        jLabel1.setFont(new java.awt.Font("Nimbus Sans", 1, 24));
        jLabel1.setForeground(new java.awt.Color(25, 129, 175));
        jLabel1.setText("Search System");

        jTextField1.setFont(new java.awt.Font("Nimbus Sans", 0, 14));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa3.png")));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aH-40px.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                708, Short.MAX_VALUE)
                                                        .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(41, 41, 41)
                                                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(17, 17, 17))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(185, 185, 185)
                                                .addComponent(jLabel1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 364,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap()));

        tabPanel.getAccessibleContext().setAccessibleName("Bookings");
    }

    public void reload(String section) {
        switch (section) {
            case "guest" -> refreshGuest(null);
            case "booking" -> refreshBooking(null);
            default -> firstLoad();
        }
    }

    /* primera carga de datos y carga de cache */
    /**
     * intentare hacer un objeto que simulara una cache
     * para trabajar los datos alli sin tener que hacer peticiones constantes por
     * cada cambio
     * asi la tabla se actualizara con los datos directos de la base de datos
     * solo cuando se vuelva a ingresar a la app
     */
    private void firstLoad() {
        FullDataDTO data = bookingCtrl.findFullData(this.getParent());
        refreshGuest(data.g());
        refreshBooking(data.b());
    }

    /* refresco de tablas especificas */

    private void refreshGuest(List<Guest> data) {
        DefaultTableModel m = (DefaultTableModel) guestTable.getModel();
        m.setRowCount(0);
        List<Guest> guests = data==null?Cache.getCache().getGuests():data;
        if (guests != null) {
            if (guests.size() > 0) {
                for (Guest g : guests) {
                    m.addRow(new Object[] { g.getId(), g.getFirst_name(), g.getSurname(), g.getNationality(),
                            g.getDate_birth(), g.getPhone() });
                }
                guestTable.repaint();
            }
        }
    }
    private void refreshBooking(List<Booking> data) {
        DefaultTableModel bmodel = (DefaultTableModel) bookinTable.getModel();
        bmodel.setRowCount(0);
        List<Booking> bookings = data==null?Cache.getCache().getBookings():data;
        if (bookings != null) {
            if (bookings.size() > 0) {
                for (Booking b : bookings) {
                    bmodel.addRow(new Object[] { 
                        b.getId(), 
                        b.getCode(),
                        b.getDateIn(),
                        b.getDateOut(),
                        b.getPaymentMethod(),
                        b.getPrice()});
                }
                bookinTable.repaint();
            }
        }
    }


    private final BookingCtrl bookingCtrl;
    private javax.swing.JTable bookinTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTable guestTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTabbedPane tabPanel;

}
