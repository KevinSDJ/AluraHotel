package com.app.hotelalura.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class CustomButton extends JButton {
    
    
    public CustomButton(){
        super();
        initComponent();
    }
    
    private void initComponent(){
        setFocusPainted(false);
        setOpaque(false);
        setForeground(Color.white);
        setBackground(new Color(0,0,0,0));
        setBorderPainted(false);
        setIconTextGap(20);
        setHorizontalTextPosition(RIGHT);
        setHorizontalAlignment(LEADING);
        setIcon(new ImageIcon(getClass().getResource("/images/lupa3.png")));
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(0,0,0,80));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(0,0,0,0));
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        
        Graphics2D g2d= (Graphics2D) g;
        g2d.setPaint(getBackground());
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        super.paint(g); 
    }
}
