package com.app.hotelalura.components;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class OvalPanel extends javax.swing.JPanel {


    public OvalPanel() {
        initComponents();
    }

    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 =(Graphics2D) g;
        g2.setPaint(getBackground());
        g2.fillOval(0, 0, getWidth(), getHeight());
    }

}
