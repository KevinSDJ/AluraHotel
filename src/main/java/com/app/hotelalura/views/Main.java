package com.app.hotelalura.views;

import java.awt.Color;


public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
       
    }
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setName("main"); 
        setResizable(false);
        setUndecorated(true);
        setBackground(new Color(0,0,0,0));
        initPanel= new Home();
        initPanel.setVisible(true);
        add(initPanel);
        pack();
        setLocationRelativeTo(null);
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(()-> new Main().setVisible(true));
    }
    //variables
    private javax.swing.JPanel initPanel;
 
}
