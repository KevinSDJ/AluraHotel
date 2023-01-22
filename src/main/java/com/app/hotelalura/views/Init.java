package com.app.hotelalura.views;

import com.app.hotelalura.utils.ToggleChange;
import com.app.hotelalura.utils.base.Observer;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Init extends javax.swing.JPanel implements Observer<Boolean> {

    public Init() {
        initComponents();
        ToggleChange.addObserver(this);
    }

   
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        loginWindow= new LoginWindow();

        loginBtn.setBackground(new Color(0,0,0,0));
        loginBtn.setForeground(new Color(25,129,175,70));
        loginBtn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
               loginBtn.setForeground(new Color(25,129,175));
               loginBtn.setOpaque(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginBtn.setForeground(new Color(25,129,175,70));
                
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                loginWindow.setVisible(true);
            }
            
        });
                
        closeBtn.setBackground(new Color(0,0,0,0));

        setBackground(new java.awt.Color(25, 129, 175));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(Init.class.getResource("/images/menu-img.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1024, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(1024, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 600));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 701, 540));

        jPanel2.setBackground(new java.awt.Color(25, 129, 175));

        jLabel2.setFont(new java.awt.Font("Nimbus Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Developed by Kevin De jesus © 2023");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(384, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(347, 347, 347))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 545, 1044, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(Init.class.getResource("/images/aH-150px.png"))); // NOI18N

        loginBtn.setFont(new java.awt.Font("Nimbus Sans", 0, 18)); // NOI18N
        loginBtn.setIcon(new javax.swing.ImageIcon(Init.class.getResource("/images/login.png"))); // NOI18N
        loginBtn.setText("SIGN IN");
        loginBtn.setBorder(null);
        loginBtn.setBorderPainted(false);
        loginBtn.setDefaultCapable(false);
        loginBtn.setFocusPainted(false);
        loginBtn.setFocusable(false);
        loginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginBtn.setRequestFocusEnabled(false);
        loginBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
       

        closeBtn.setIcon(new javax.swing.ImageIcon(Init.class.getResource("/images/cerrar-24px.png"))); // NOI18N
        closeBtn.setBorder(null);
        closeBtn.setBorderPainted(false);
        closeBtn.setFocusPainted(false);
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeBtn)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(89, 89, 89)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 0, 330, 540));
    }

   
    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    public void closedLoginWindow(){
        loginWindow.setVisible(false);
    }
    
     @Override
    public void update(Boolean o) {
        if(o){
            closedLoginWindow();
        }
    }

    private javax.swing.JFrame loginWindow;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;

}
