package com.app.hotelalura.views;


import com.app.hotelalura.contexts.StateMainContext;
import com.app.hotelalura.contexts.ToggleChange;
import com.app.hotelalura.utils.base.Observer;
import java.awt.Color;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JFrame implements Observer<Boolean> {

    public Main() {
        initComponents();
        StateMainContext.addObserver(this);
        StateMainContext.addState(false);
    }

    private void initComponents() {
        setUndecorated(true);
        setAutoRequestFocus(false);
        setSize(1024,600);
        setResizable(false);
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        current=new Init();
        add(current);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    public void changeView() {
        current.setVisible(false);
        remove(current);
        current=new Home();
        current.setVisible(true);
        add(current);
        revalidate();
        repaint(300);
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void update(Boolean o) {
        // in javascript this would be a timeout, 
        // this function uses a thread to simulate a late execution of the task so that 
        // it waits as long as necessary for the task on which it depends to complete before
        if (!ToggleChange.isOpen()&& o) {
            System.out.println("Login is true, change");
            CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                changeView();
                return null;
            });
        }else {
            System.out.println("Can't change, login is open");
        }
        
    }

    // variables
    private javax.swing.JPanel current;

}
