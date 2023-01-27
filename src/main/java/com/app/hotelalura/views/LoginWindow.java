package com.app.hotelalura.views;

import com.app.hotelalura.components.LoginForm;
import java.awt.Color;
import java.awt.GridBagLayout;

public class LoginWindow extends javax.swing.JFrame {
    
    public LoginWindow(Main m,Init i) {
        initref=i;
        mainref=m;
        initComponents(m,i);
        
    }
    
    private void initComponents(Main m,Init i) {
        loginForm= new LoginForm(i,m);
        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(0,0,0,80));
        setSize(1024,600);
        setLayout(new GridBagLayout());
        add(loginForm);
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(()->
                new LoginWindow(mainref,initref).setVisible(true));
    }
    private com.app.hotelalura.components.LoginForm loginForm;
    private static Init initref;
    private static Main mainref;

}
