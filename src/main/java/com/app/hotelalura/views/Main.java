package com.app.hotelalura.views;

import com.app.hotelalura.utils.ToggleChange;
import com.app.hotelalura.utils.base.Observer;
import java.awt.Color;

public class Main extends javax.swing.JFrame implements Observer<Boolean>  {
    
    public Main() {
        initComponents();
        ToggleChange.addObserver(this);
    }

    private void initComponents() {
        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setName("main");
        setResizable(false);
        setBackground(new Color(0, 0, 0, 0));
        
        current = new Init();
        add(current);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {

       
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    public void changeVew() throws InterruptedException {
        remove(current);
        current = new Home();
        add(current);
    }

    // variables
    private javax.swing.JPanel current;

    @Override
    public void update(Boolean o) {
        System.out.println("Desde el main notificando que el login se cerro");
    }
    

}
