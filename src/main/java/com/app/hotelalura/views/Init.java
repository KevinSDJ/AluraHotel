package com.app.hotelalura.views;

import com.app.hotelalura.HotelAlura;
import com.app.hotelalura.components.ImgRoundCorner;
import com.app.hotelalura.components.statusConnection.StatusConnection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;

public class Init extends javax.swing.JPanel {

    
    public Init(HotelAlura m){
        mainref=m;
        initComponents(m);
        setEnabled(false);
    }

    private void initComponents(HotelAlura m) {
        
        backgroundBlue = new com.app.hotelalura.components.RoundedPanel();
        receptionImg = new ImgRoundCorner();
        backgroundWhite = new com.app.hotelalura.components.RoundedPanel();
        closeWindow = new javax.swing.JLabel();
        hotelIcon = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        statusConnection= new StatusConnection();
        footer= new javax.swing.JPanel();
        layeredPane=new JLayeredPane();

        backgroundWhite.setPreferredSize(new Dimension(300,540));
        receptionImg.setIcon(new ImageIcon(getClass().getResource("/images/menu-img.png")));
        receptionImg.setPreferredSize(new Dimension((int) (1024 - backgroundWhite.getPreferredSize().getWidth()), 540));
        
        setBackground(new Color(0,0,0,0));
        setSize(1024,600);

        backgroundBlue.setBackground(new java.awt.Color(25, 129, 175));
        backgroundWhite.setBackground(new java.awt.Color(255, 255, 255));
        
        closeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-24px.png"))); // NOI18N
        closeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindowMouseClicked(evt);
            }
        });

        hotelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aH-150px.png"))); // NOI18N

        loginBtn.setBackground(new java.awt.Color(255, 255, 255));
        loginBtn.setFont(new java.awt.Font("Nimbus Sans", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(25, 129, 175));
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        loginBtn.setText("Login");
        loginBtn.setBorder(null);
        loginBtn.setBorderPainted(false);
        loginBtn.setContentAreaFilled(false);
        loginBtn.setDefaultCapable(false);
        loginBtn.setFocusPainted(false);
        loginBtn.setFocusable(false);
        loginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        loginBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        

        javax.swing.GroupLayout backgroundWhiteLayout = new javax.swing.GroupLayout(backgroundWhite);
        backgroundWhite.setLayout(backgroundWhiteLayout);
        backgroundWhiteLayout.setHorizontalGroup(
            backgroundWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundWhiteLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(backgroundWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundWhiteLayout.createSequentialGroup()
                        .addComponent(closeWindow)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundWhiteLayout.createSequentialGroup()
                        .addGroup(backgroundWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hotelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77))))
        );
        backgroundWhiteLayout.setVerticalGroup(
            backgroundWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundWhiteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(closeWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(hotelIcon)
                .addGap(78, 78, 78)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );


        /* footer component */
        jLabel3.setFont(new java.awt.Font("Nimbus Sans", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Developed by Kevin De Jesus  © 2023");
        statusConnection.setBackground(new Color(0,0,0,0));

        footer.setPreferredSize(new Dimension(1024,60));
        footer.setBackground(new Color(0,0,0,0));
        footer.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        footer.add(statusConnection);
        footer.add(jLabel3);

        layeredPane.setPreferredSize(new Dimension(1024,600));

        backgroundBlue.setLayout(new BorderLayout());
        backgroundBlue.setBounds(0,0,1024,600);
        backgroundBlue.add(backgroundWhite,BorderLayout.EAST);
        backgroundBlue.add(receptionImg,BorderLayout.WEST);
        backgroundBlue.add(footer,BorderLayout.SOUTH);

        layeredPane.add(backgroundBlue,JLayeredPane.DEFAULT_LAYER);
        
        setLayout(new BorderLayout());
        add(layeredPane);
    }

    private void closeWindowMouseClicked(java.awt.event.MouseEvent evt) {    
        System.exit(0);
    }
    
    public void closedLogin(){
        loginWindow.setVisible(false);
    }
    
    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {
        if(loginWindow==null){
            loginWindow=new LoginWindow(this);
            layeredPane.add(loginWindow,Integer.valueOf(1));
        }
        loginWindow.setVisible(true);
        
    }
    public void clsLogAndGoHom(){
        loginWindow.setVisible(false);
        mainref.goHome();
    }



    private final HotelAlura mainref;
    private javax.swing.JPanel loginWindow;
    private StatusConnection statusConnection;
    private ImgRoundCorner receptionImg;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel closeWindow;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel hotelIcon;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLayeredPane layeredPane;
    private com.app.hotelalura.components.RoundedPanel backgroundBlue;
    private com.app.hotelalura.components.RoundedPanel backgroundWhite;
   
}
