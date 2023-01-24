package com.app.hotelalura.views;

import java.awt.Color;
import com.app.hotelalura.components.SearchSystem;
import java.awt.BorderLayout;

public class Home extends javax.swing.JPanel {

    public Home() {
        initComponents(this);
        System.out.println("home");
    }

    private void initComponents(Home h) {

        backgroundPanel = new com.app.hotelalura.components.RoundedPanel();
        menu1 = new com.app.hotelalura.components.Menu(h);
        jLabel1 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        defMenuView1 = new com.app.hotelalura.components.DefMenuView();
        searchSystem = new com.app.hotelalura.components.SearchSystem();

        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setBackground(new Color(0, 0, 0, 0));
        setOpaque(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu1.setBackground(new java.awt.Color(25, 129, 175));
        backgroundPanel.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-24px.png"))); // NOI18N
        backgroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, -1, -1));

        container.setBackground(new java.awt.Color(255, 255, 0, 40));
        container.setForeground(new java.awt.Color(255, 255, 255));
        container.setMaximumSize(new java.awt.Dimension(740, 540));
        container.setPreferredSize(new java.awt.Dimension(750, 540));
        container.setLayout(new BorderLayout());
        container.add(defMenuView1, BorderLayout.CENTER);

        backgroundPanel.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 740, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
    }

    public void changePanelView() {
        if (container.getComponents()[0].getClass().getSimpleName().equals("DefMenuView")) {
            container.remove(defMenuView1);
            defMenuView1.setVisible(false);
            container.add(searchSystem, BorderLayout.CENTER);
            searchSystem.setVisible(true);
            validate();
            container.repaint();
        }
        
    }

    private com.app.hotelalura.components.RoundedPanel backgroundPanel;
    private javax.swing.JPanel container;
    private javax.swing.JPanel defMenuView1;
    private javax.swing.JPanel searchSystem;
    private javax.swing.JLabel jLabel1;
    private com.app.hotelalura.components.Menu menu1;
}
