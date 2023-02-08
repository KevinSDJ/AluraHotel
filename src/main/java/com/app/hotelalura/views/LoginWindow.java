package com.app.hotelalura.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import com.app.hotelalura.components.LoginForm;

public class LoginWindow extends javax.swing.JDialog {

    public LoginWindow(java.awt.Frame parent,Init i, boolean modal) {
        super(parent, modal);
        initref=i;
        initComponents();
        
    }

 

    private void initComponents() {
        
        loginForm= new LoginForm(initref);
        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new Color(0,0,0,80));
        setPreferredSize(new Dimension(1024,600));
        setLocation((toolkit.getScreenSize().width-1024)/2,(toolkit.getScreenSize().height-600)/2);
        getContentPane().setLayout(new java.awt.GridBagLayout());
        getContentPane().add(loginForm);

        pack();
    }

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            LoginWindow dialog = new LoginWindow((JFrame) initref.getParent(),initref, true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paint(g);
    }

    private static Init initref;
    private LoginForm loginForm;
    final Toolkit toolkit = Toolkit.getDefaultToolkit();
  

}
