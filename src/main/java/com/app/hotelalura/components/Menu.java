package com.app.hotelalura.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import com.app.hotelalura.views.Home;
import java.awt.GradientPaint;


public class Menu extends javax.swing.JPanel {


    public Menu(Home h) {
        initComponents();
        setOpaque(false);
        this.homeref = h;

    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        itemsContainer = new javax.swing.JPanel();
        closedSessionBtn = new javax.swing.JButton();
        registerBookingItem = new javax.swing.JButton();
        searchIconItem = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aH-150px.png"))); // NOI18N

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 150));

        itemsContainer.setBackground(new java.awt.Color(0, 0, 0, 0));

        closedSessionBtn.setBackground(new Color(83, 169, 207));
        closedSessionBtn.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        closedSessionBtn.setForeground(new java.awt.Color(255, 255, 255));
        closedSessionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion 32-px.png"))); // NOI18N
        closedSessionBtn.setText("Logout");
        closedSessionBtn.setBorderPainted(false);
        closedSessionBtn.setDefaultCapable(false);
        closedSessionBtn.setFocusPainted(false);
        closedSessionBtn.setFocusable(false);
        closedSessionBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        closedSessionBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        closedSessionBtn.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().setBackground(new Color(25, 129, 175));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                e.getComponent().setBackground(new Color(83, 169, 207));

            }
        });

        registerBookingItem.setBackground(new Color(83, 169, 207));
        registerBookingItem.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        registerBookingItem.setForeground(new java.awt.Color(255, 255, 255));
        registerBookingItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-reservas.png"))); // NOI18N
        registerBookingItem.setText("Register Booking");
        registerBookingItem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        registerBookingItem.setBorderPainted(false);
        registerBookingItem.setFocusPainted(false);
        registerBookingItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registerBookingItem.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                openViewRegister();
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().setBackground(new Color(25, 129, 175));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                e.getComponent().setBackground(new Color(83, 169, 207));

            }
        });

        searchIconItem.setBackground(new Color(83, 169, 207));
        searchIconItem.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        searchIconItem.setForeground(new java.awt.Color(255, 255, 255));
        searchIconItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-buscar.png"))); // NOI18N
        searchIconItem.setText("Search Panel");
        searchIconItem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchIconItem.setBorderPainted(false);
        searchIconItem.setFocusPainted(false);
        searchIconItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        searchIconItem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchIconItem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               changeSection();
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().setBackground(new Color(25, 129, 175));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                e.getComponent().setBackground(new Color(83, 169, 207));

            }
        });

        javax.swing.GroupLayout itemsContainerLayout = new javax.swing.GroupLayout(itemsContainer);
        itemsContainer.setLayout(itemsContainerLayout);
        itemsContainerLayout.setHorizontalGroup(
                itemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(closedSessionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                        .addComponent(registerBookingItem, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                        .addComponent(searchIconItem, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        itemsContainerLayout.setVerticalGroup(
                itemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(itemsContainerLayout.createSequentialGroup()
                                .addComponent(registerBookingItem, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchIconItem, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closedSessionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 229,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(itemsContainer, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(22, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(59, 59, 59)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemsContainer, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(174, Short.MAX_VALUE)));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        Color color2 = Color.decode("#64dfdf");
        int w = getWidth(), h = getHeight();
        GradientPaint grandient = new GradientPaint(w / 2, 0, color2, w / 2, h, getBackground());
        g2d.setPaint(grandient);
        g2d.fillRoundRect(0, 0, w, h, 15, 15);
        super.paintComponent(g);

    }

    public void changeSection() {
        homeref.changePanelView();

    }
    public void openViewRegister(){
        homeref.openRegisterView();
    }

    private final Home homeref;
    private javax.swing.JPanel itemsContainer;
    private javax.swing.JButton closedSessionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton registerBookingItem;
    private javax.swing.JButton searchIconItem;
    
}
