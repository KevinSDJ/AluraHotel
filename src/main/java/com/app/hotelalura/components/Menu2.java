package com.app.hotelalura.components;

import com.app.hotelalura.views.Home;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Menu2 extends javax.swing.JPanel {

   
    public Menu2() {
        initComponents();
        setOpaque(false);
        homeref=null;
    }
    public Menu2(Home h){
        initComponents();
        setOpaque(false);
        homeref=h;
        searchSystemBtn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                changeSection();
            }
            
        });
        addBookingsBtn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                openViewRegister();
            }
            
        });
        userAvatar.setBackground(Color.red);
        userAvatar.setIcon(new ImageIcon(getClass().getResource("/images/60111.jpg")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBookingsBtn = new com.app.hotelalura.components.CustomButton();
        searchSystemBtn = new com.app.hotelalura.components.CustomButton();
        logoutBtn = new com.app.hotelalura.components.CustomButton();
        configsBtn = new com.app.hotelalura.components.CustomButton();
        jLabel1 = new javax.swing.JLabel();
        userAvatar = new com.app.hotelalura.components.CircleIcon();

        addBookingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-tarea-24.png"))); // NOI18N
        addBookingsBtn.setText("New Register");

        searchSystemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-buscar-cliente-24.png"))); // NOI18N
        searchSystemBtn.setText("Search System");

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closed_session2.png"))); // NOI18N
        logoutBtn.setText("Logout");

        configsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/config.png"))); // NOI18N
        configsBtn.setText("configs");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ha-100px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBookingsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchSystemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(configsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(addBookingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchSystemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(configsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(userAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        Color color2 = new Color(25, 129, 175);
        int w = getWidth(), h = getHeight();
        GradientPaint grandient = new GradientPaint(w / 2, 0, color2, w / 2, h, Color.DARK_GRAY);
        g2d.setPaint(grandient);
        g2d.fillRoundRect(0, 0, w, h, 20, 20);
        super.paintComponent(g);

    }
    
    public void changeSection() {
        homeref.changePanelView();

    }
    public void openViewRegister(){
        homeref.openRegisterView();
    }

    private final Home homeref;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.app.hotelalura.components.CustomButton addBookingsBtn;
    private com.app.hotelalura.components.CustomButton configsBtn;
    private javax.swing.JLabel jLabel1;
    private com.app.hotelalura.components.CustomButton logoutBtn;
    private com.app.hotelalura.components.CustomButton searchSystemBtn;
    private com.app.hotelalura.components.CircleIcon userAvatar;
    // End of variables declaration//GEN-END:variables
}
