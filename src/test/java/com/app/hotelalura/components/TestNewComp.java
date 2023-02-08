package com.app.hotelalura.components;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

import javax.swing.JPanel;

public class TestNewComp extends javax.swing.JFrame {

    public TestNewComp() {
        setUndecorated(true);
        p = new JPanel();
        p.setPreferredSize(new Dimension(1024, 600));
        p.setBackground(new Color(0, 0, 0, 80));
        initComponents();

        jPopupMenu1.add(new javax.swing.JMenuItem("one"));
        jPopupMenu1.add(new javax.swing.JMenuItem("two"));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jPopupMenu1.show(jTable1, getX(), getY());
            }

        });
        JPanel card = new JPanel();
        JButton butonclosed = new JButton("close glass");
        butonclosed.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getGlassPane().setVisible(false);
            }

        });
        card.add(butonclosed);
        card.setPreferredSize(new Dimension(400, 300));
        p.setLayout(new GridBagLayout());
        p.add(card);
        p.setVisible(true);
        setGlassPane(p);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        roundedPanel1 = new com.app.hotelalura.components.RoundedPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Image"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        roundedPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, -1));

        jButton1.setText("Toggle Popup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        roundedPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        getContentPane().add(roundedPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (getGlassPane().isVisible()) {
            getGlassPane().setVisible(false);
            remove(getGlassPane());
        } else {
            setGlassPane(p);
            getGlassPane().setVisible(true);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TestNewComp().setVisible(true));

    }

    Boolean isShow = false;
    private javax.swing.JPanel p;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.app.hotelalura.components.RoundedPanel roundedPanel1;
    // End of variables declaration//GEN-END:variables
}
