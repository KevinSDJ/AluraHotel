package com.app.hotelalura.components;

import javax.swing.JFrame;
import javax.swing.JTextField;


public class DefMenuViewIT extends JFrame {
    private JTextField custTextField;
    
    public DefMenuViewIT(){
        custTextField=new JTextField("dsdsddsdsdsd");

        setSize(740, 600);
        getContentPane().add(custTextField);
        
    }
    
    public static void main (String... args){
        java.awt.EventQueue.invokeLater(() -> new DefMenuViewIT().setVisible(true));
    }
}
