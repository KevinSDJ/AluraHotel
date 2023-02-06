package com.app.hotelalura.components;

import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.utils.enviroment.EnvVariables;
import com.app.hotelalura.views.RegisterBooking;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;


public class BookingForm extends javax.swing.JPanel {


    public BookingForm(RegisterBooking r) {
        this.parentref = r;
        initComponents();
        extConfig();
    }

    public BookingForm() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        extConfig();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new com.app.hotelalura.components.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roundedPanel2 = new com.app.hotelalura.components.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        inputDateIn = new com.toedter.calendar.JDateChooser();
        inputDateOut = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        valueField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nextStepBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        paymentMethodInput = new javax.swing.JComboBox<>();
        paymentLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(838, 520));

        roundedPanel1.setBackground(new java.awt.Color(25, 129, 175));
        roundedPanel1.setMaximumSize(new java.awt.Dimension(830, 512));
        roundedPanel1.setPreferredSize(new java.awt.Dimension(830, 512));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reservas-img-3.png"))); // NOI18N

        roundedPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Nimbus Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 129, 175));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Booking Record");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        inputDateIn.setDateFormatString("yyyy-MM-dd");
        inputDateIn.setIcon(null);
        inputDateIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputDateInchange(evt);
            }
        });

        inputDateOut.setDateFormatString("yyyy-MM-dd");
        inputDateOut.setIcon(null);
        inputDateOut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                onchangedateOutInput(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Entry Date");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel5.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Departure date");

        valueField.setEditable(false);
        valueField.setText("$");

        jLabel6.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Value Reservation");

        nextStepBtn.setBackground(new java.awt.Color(131, 197, 190));
        nextStepBtn.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        nextStepBtn.setForeground(new java.awt.Color(255, 255, 255));
        nextStepBtn.setText("next step");
        nextStepBtn.setBorderPainted(false);
        nextStepBtn.setPreferredSize(new java.awt.Dimension(80, 25));
   

        cancelBtn.setBackground(new java.awt.Color(102, 102, 102));
        cancelBtn.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("cancel");
        cancelBtn.setPreferredSize(new java.awt.Dimension(72, 33));
      

        paymentMethodInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CREDIT CARD", "CARD DEBIT", "PAY CASH" }));

        paymentLabel.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        paymentLabel.setForeground(new java.awt.Color(102, 102, 102));
        paymentLabel.setText("Payment Method");

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(valueField)
                        .addComponent(inputDateIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputDateOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundedPanel2Layout.createSequentialGroup()
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                            .addComponent(nextStepBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(paymentMethodInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paymentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paymentMethodInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextStepBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

 
    private void onchangedateOutInput(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_onchangedateOutInput
        // TODO add your handling code here:
        if (inputDateIn.getDate() != null && inputDateOut.getDate() != null) {
            long dayspass = inputDateOut.getDate().getTime() - inputDateIn.getDate().getTime();
            String price = EnvVariables.getEnv("PRICE_PER_NIGTH");
            int priceTotal = (int) (Math.round(dayspass / 86400000) * Integer.parseInt(price));
            valueField.setText(String.valueOf(priceTotal));
            booking = new Booking();
            booking.setPrice((double) priceTotal);
            nextStepBtn.setEnabled(true);

        }
    }//GEN-LAST:event_onchangedateOutInput

    private void inputDateInchange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputDateInchange
        // TODO add your handling code here:
        if (inputDateIn.getDate() != null) {
            inputDateOut.setMinSelectableDate(new Date(inputDateIn.getDate().getTime() + 86400000));
        }
    }//GEN-LAST:event_inputDateInchange

    private void extConfig() {
        setBackground(new Color(0, 0, 0, 0));
        setSize(1024, 600);
        roundedPanel1.setSize(1024, 600);
        nextStepBtn.setEnabled(false);
        /* inputs*/
        inputDateIn.setMinSelectableDate(Date.valueOf(LocalDate.now()));
        inputDateIn.setDateFormatString("yyyy-MM-dd");
        inputDateIn.getCalendarButton().setIcon(new ImageIcon(BookingForm.class.getResource("/images/calendario.png")));
        inputDateOut.setDateFormatString("yyyy-MM-dd");
        inputDateOut.getCalendarButton().setIcon(new ImageIcon(BookingForm.class.getResource("/images/calendario.png")));
        valueField.setEditable(false);
        cancelBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cancelRecord();
            }

        });
        nextStepBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                next();
            }

        });

    }

    private void cancelRecord() {
        parentref.closedFormView();
    }

    private void next() {
        if (nextStepBtn.isEnabled()) {
            booking.setDateIn(new Date(inputDateIn.getDate().getTime()));
            booking.setDateOut(new Date(inputDateOut.getDate().getTime()));
            booking.setPaymentMethod(paymentMethodInput.getSelectedItem().toString());
            List<Booking> d = new ArrayList<>();
            d.add(booking);
            parentref.updateDataForm().setBooking(d);

            parentref.nextForm();
        }

    }

    private Booking booking;
    private com.app.hotelalura.views.RegisterBooking parentref;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private com.toedter.calendar.JDateChooser inputDateIn;
    private com.toedter.calendar.JDateChooser inputDateOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton nextStepBtn;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JComboBox<String> paymentMethodInput;
    private com.app.hotelalura.components.RoundedPanel roundedPanel1;
    private com.app.hotelalura.components.RoundedPanel roundedPanel2;
    private javax.swing.JTextField valueField;
    // End of variables declaration//GEN-END:variables
}
