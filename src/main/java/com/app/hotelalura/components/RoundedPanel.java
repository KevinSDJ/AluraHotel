package com.app.hotelalura.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class RoundedPanel extends javax.swing.JPanel {

    public RoundedPanel() {
        initComponents();
    }

  
    private void initComponents() {
        setBackground(new Color(0,0,0,0));
        setOpaque(false);
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
    protected void paintComponent(Graphics g) {
        Graphics2D g2d =(Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.setPaint(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(g);

    }

}
