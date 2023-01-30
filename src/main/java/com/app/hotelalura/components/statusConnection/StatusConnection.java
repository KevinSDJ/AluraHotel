
package com.app.hotelalura.components.statusConnection;

import java.awt.Color;



public class StatusConnection extends javax.swing.JPanel {

    /**
     * Creates new form StatusConnection
     */
    public StatusConnection() {
        initComponents();
        StatusBox.getInstance().setStConnInst(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new com.app.hotelalura.components.RoundedPanel();
        ovalPanel2 = new com.app.hotelalura.components.OvalPanel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(170, 30));
        setMinimumSize(new java.awt.Dimension(170, 30));
        setPreferredSize(new java.awt.Dimension(170, 30));

        roundedPanel1.setBackground(new java.awt.Color(204, 204, 204));
        roundedPanel1.setMaximumSize(new java.awt.Dimension(170, 30));
        roundedPanel1.setMinimumSize(new java.awt.Dimension(170, 30));
        roundedPanel1.setPreferredSize(new java.awt.Dimension(170, 30));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ovalPanel2.setBackground(new java.awt.Color(255, 0, 0));
        ovalPanel2.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout ovalPanel2Layout = new javax.swing.GroupLayout(ovalPanel2);
        ovalPanel2.setLayout(ovalPanel2Layout);
        ovalPanel2Layout.setHorizontalGroup(
            ovalPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        ovalPanel2Layout.setVerticalGroup(
            ovalPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        roundedPanel1.add(ovalPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 2, -1, -1));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Verify Connection");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 0, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void updateSuccess(){
        jLabel1.setText("Connected");
        ovalPanel2.setBackground(Color.GREEN);
    }
    public void updateFail(){
        jLabel1.setText("Fail connection");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.app.hotelalura.components.OvalPanel ovalPanel2;
    private com.app.hotelalura.components.RoundedPanel roundedPanel1;
    // End of variables declaration//GEN-END:variables
}
