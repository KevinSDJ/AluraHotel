package com.app.hotelalura.views;

import com.app.hotelalura.components.LoginForm;
import java.awt.Color;
import java.awt.GridBagLayout;

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

    private com.app.hotelalura.components.LoginForm loginForm;
}
