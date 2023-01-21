package com.app.hotelalura.views;

import com.app.hotelalura.components.DefMenuView;
import java.awt.Color;

public class Home extends javax.swing.JPanel {

    
    public Home() {
        initComponents();
        
    }

    private void initComponents() {

        roundedPanel2 = new com.app.hotelalura.components.RoundedPanel();
        menu = new com.app.hotelalura.components.Menu();
        sectionContainer = new javax.swing.JPanel();
        defMenuView1 = new com.app.hotelalura.components.DefMenuView();
        closedBtn = new javax.swing.JButton();

        setBackground(new Color(0,0,0,0));
        setOpaque(false);

        roundedPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel2.setMaximumSize(new java.awt.Dimension(1024, 600));
        roundedPanel2.setMinimumSize(new java.awt.Dimension(1024, 600));

        menu.setBackground(new java.awt.Color(25, 129, 175));

        sectionContainer.setMaximumSize(new java.awt.Dimension(740, 32767));
        sectionContainer.setPreferredSize(new java.awt.Dimension(750, 545));
        sectionContainer.add(new DefMenuView());

        javax.swing.GroupLayout sectionContainerLayout = new javax.swing.GroupLayout(sectionContainer);
        sectionContainer.setLayout(sectionContainerLayout);
        sectionContainerLayout.setHorizontalGroup(
            sectionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionContainerLayout.createSequentialGroup()
                .addComponent(defMenuView1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sectionContainerLayout.setVerticalGroup(
            sectionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sectionContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(defMenuView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        closedBtn.setIcon(new javax.swing.ImageIcon(Home.class.getResource("/images/cerrar-24px.png")));
        closedBtn.setBorder(null);
        closedBtn.setBorderPainted(false);
        closedBtn.setContentAreaFilled(false);
        closedBtn.setDefaultCapable(false);
        closedBtn.setFocusPainted(false);
        closedBtn.setFocusable(false);
        closedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closedBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addGap(980, 980, 980)
                        .addComponent(closedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sectionContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(closedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sectionContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }

    private void closedBtnMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }


    private com.app.hotelalura.components.DefMenuView defMenuView1;
    private javax.swing.JButton closedBtn;
    private com.app.hotelalura.components.Menu menu;
    private com.app.hotelalura.components.RoundedPanel roundedPanel2;
    private javax.swing.JPanel sectionContainer;
}
