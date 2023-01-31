package com.app.hotelalura.views;

import java.awt.Color;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    private void initComponents() {
        setUndecorated(true);
        setAutoRequestFocus(false);
        setSize(1024, 600);
        setResizable(false);
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        current = new Home();
        add(current);

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    public void changeView() {
        current.setVisible(false);
        remove(current);
        current = new Home();
        current.setVisible(true);
        add(current);
        revalidate();
        repaint(300);
    }

    public void goHome() {
        changeView();
    }

    // variables
    private javax.swing.JPanel current;

}
