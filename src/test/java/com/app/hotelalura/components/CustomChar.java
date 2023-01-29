package com.app.hotelalura.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class CustomChar extends JComponent {

    @Override
    public void paint(Graphics g) {
         Graphics2D g2d= (Graphics2D) g;
         g2d.fillArc(50, 50, (getWidth()*100)/40, (getWidth()*100)/40, 90, 80);
         g2d.setColor(Color.red);
         g2d.setPaint(Color.BLUE);
         g2d.dispose();
         
    }
    
    
}
