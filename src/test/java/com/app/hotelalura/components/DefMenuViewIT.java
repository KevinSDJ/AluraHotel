package com.app.hotelalura.components;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DefMenuViewIT extends JFrame {
    
    
    DefMenuViewIT(){
        setSize(740, 600);
        
    }
    
    public static void main (String... args){
        java.awt.EventQueue.invokeLater(() -> new DefMenuViewIT().setVisible(true));
    }
}
