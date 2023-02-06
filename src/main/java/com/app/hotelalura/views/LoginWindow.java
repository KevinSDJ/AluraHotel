package com.app.hotelalura.views;

import com.app.hotelalura.components.LoginForm;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class LoginWindow extends javax.swing.JPanel {
    
    public LoginWindow(Init i) {
        initComponents(i);
    }
    
    private void initComponents(Init i) {
        loginForm= new LoginForm(i);
        setVisible(false);
        setBackground(new Color(0,0,0,80));
        setBounds(0,0,1024,598);
        setLayout(new GridBagLayout());
        add(loginForm);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d =(Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.setPaint(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);

    }

    private com.app.hotelalura.components.LoginForm loginForm;
}
