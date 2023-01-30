package com.app.hotelalura.views;

import com.app.hotelalura.components.statusConnection.StatusConnection;
import java.awt.Color;
import javax.swing.JFrame;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Init extends javax.swing.JPanel {

    
    public Init(Main m){
        mainref=m;
        initComponents(m,this);
        setEnabled(false);
    }

    private void initComponents(Main m,Init i) {
        
        backgroundBlue = new com.app.hotelalura.components.RoundedPanel();
        receptionImg = new javax.swing.JLabel();
        backgroundWhite = new com.app.hotelalura.components.RoundedPanel();
        closeWindow = new javax.swing.JLabel();
        hotelIcon = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        loginWindow=new LoginWindow(i);
        statusConnection= new StatusConnection();

        setBackground(new Color(0,0,0,0));
        setSize(1024,600);
        setBounds(0,0,1024,600);

        backgroundBlue.setBackground(new java.awt.Color(25, 129, 175));
        backgroundBlue.setLayout(new AbsoluteLayout());

        receptionImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu-img.png"))); // NOI18N
        receptionImg.setText("receptionImg");
        backgroundBlue.add(receptionImg, new AbsoluteConstraints(0, 0, 700, -1));

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

        backgroundBlue.add(backgroundWhite, new AbsoluteConstraints(694, 0, 330, 539));

        jLabel3.setFont(new java.awt.Font("Nimbus Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Developed by Kevin De Jesus  © 2023");
        statusConnection.setBackground(new Color(0,0,0,0));
        backgroundBlue.add(jLabel3, new AbsoluteConstraints(357, 557, 337, 29));
        /* posicionamiento de componente */
        /* los espacios son donde va a ceber el elemento en anchura*/
        /*espacion -x, position y, espacio x+, position x */
        backgroundBlue.add(statusConnection, new AbsoluteConstraints(100, 557, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void closeWindowMouseClicked(java.awt.event.MouseEvent evt) {    
        System.exit(0);
    }
    
    public void closedLogin(){
        loginWindow.setVisible(false);
    }
    
    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {
        loginWindow.setVisible(true);
        
    }
    public void clsLogAndGoHom(){
        loginWindow.setVisible(false);
        mainref.goHome();
    }



    private final Main mainref;
    private JFrame loginWindow;
    private StatusConnection statusConnection;
    private javax.swing.JLabel receptionImg;
    private javax.swing.JLabel closeWindow;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel hotelIcon;
    private javax.swing.JButton loginBtn;
    private com.app.hotelalura.components.RoundedPanel backgroundBlue;
    private com.app.hotelalura.components.RoundedPanel backgroundWhite;
   
}
