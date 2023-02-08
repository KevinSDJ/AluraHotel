package com.app.hotelalura.components;


import javax.swing.JComponent;


import javax.swing.Popup;

public class JPopup extends Popup {

    public JPopup(JComponent aThis, JComponent jTable1,int x,int y) {
        
        super(aThis,jTable1,x,y);
        System.out.println(aThis.getX());
    }
    
}
