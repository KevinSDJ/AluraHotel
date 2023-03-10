package com.app.hotelalura.components;

import com.app.hotelalura.controllers.BookingCtrl;
import com.app.hotelalura.controllers.GuestCtrl;
import com.app.hotelalura.dto.BookingDTO;
import com.app.hotelalura.dto.GuestDTO;
import com.app.hotelalura.entities.Booking;
import com.app.hotelalura.utils.Cache;
import com.app.hotelalura.views.RegisterBooking;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.ImageIcon;

public class GuestForm extends javax.swing.JPanel {

    public GuestForm(RegisterBooking r) {
        guestCtrl = GuestCtrl.getInstance();
        bookingCtrl = BookingCtrl.getInstance();
        parentref = r;
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setVisible(true);
        extConfig();
    }

    public GuestForm() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setVisible(true);
        extConfig();
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
        roundedPanel2 = new com.app.hotelalura.components.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        surnameInput = new javax.swing.JTextField();
        dateBirthInput = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nationalityInput = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        phoneInput = new javax.swing.JTextField();
        reservationCode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(838, 520));
        setPreferredSize(new java.awt.Dimension(838, 520));

        roundedPanel1.setBackground(new java.awt.Color(25, 129, 175));
        roundedPanel1.setMaximumSize(new java.awt.Dimension(830, 512));

        roundedPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Nimbus Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 129, 175));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Guest Record");

        jLabel4.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Name");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        nameInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Surname");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        surnameInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surnameOnKeytyped(evt);
            }
        });

        dateBirthInput.setDateFormatString("yyyy-MM-dd");
        dateBirthInput.setIcon(null);
        int maxima= LocalDate.now().getYear()-18;
        int minima=LocalDate.now().getYear()-90;
        dateBirthInput.setSelectableDateRange(
            Date.valueOf(LocalDate.parse(String.format("%s-12-28", minima)))
            ,Date.valueOf(LocalDate.parse(String.format("%s-12-28", maxima))));
        
        dateBirthInput.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                onchangeDateBirth(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Date of birth");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel7.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nationality");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        nationalityInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { 
            "Argentina",
            "Mexico",
            "Brazil",
            "Uruguay",
            "Pararguay",
            "Chile",
            "Others"
        }));

        jLabel8.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Phone");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        phoneInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onPhoneKeyTyped(evt);
            }
        });

        reservationCode.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Reservation number");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        backBtn.setBackground(new java.awt.Color(102, 102, 102));
        backBtn.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("back");

        saveBtn.setBackground(new java.awt.Color(131, 197, 190));
        saveBtn.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("save");
        saveBtn.setBorderPainted(false);
        saveBtn.setEnabled(false);
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickSaveBtn(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservationCode)
                    .addComponent(jLabel9)
                    .addComponent(phoneInput)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(surnameInput)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameInput)
                    .addComponent(dateBirthInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nationalityInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateBirthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nationalityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registro.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void onClickSaveBtn(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickSaveBtn
        
        Boolean isDateBirth = dateBirthInput.getDate() == null;
        Boolean notName = nameInput.getText().isEmpty();
        Boolean notSurname = surnameInput.getText().isEmpty();
        Boolean notPhone = phoneInput.getText().isEmpty();
        if (!isDateBirth && !notName && !notSurname && !notPhone) {
            parentref.updateDataForm().setFirst_name(nameInput.getText());
            parentref.updateDataForm().setSurname(surnameInput.getText());
            parentref.updateDataForm().setDate_birth(new Date(dateBirthInput.getDate().getTime()));
            parentref.updateDataForm().setPhone(phoneInput.getText());
            parentref.updateDataForm().setNationality(String.valueOf(nationalityInput.getSelectedItem()));
            GuestDTO g = new GuestDTO(
                this,
                parentref.updateDataForm().getId(),
                parentref.updateDataForm().getFirst_name(),
                parentref.updateDataForm().getSurname().trim(),
                parentref.updateDataForm().getDate_birth(),
                parentref.updateDataForm().getNationality(),
                parentref.updateDataForm().getPhone()
                );
            Integer id = guestCtrl.saveGuest(g);
            if (id != null) {
                Booking b=parentref.updateDataForm().getBooking().get(0);
                b.setGuest_id(id);
                bookingCtrl.saveBooking(
                    new BookingDTO(this,b.getId(),b.getCode(),b.getDateIn(),b.getDateOut(),b.getPaymentMethod(),b.getPrice(),b.getGuest_id())
                    );
            }
            Cache.getInst().updateFull();
            parentref.closedFormView();
        }
    }//GEN-LAST:event_onClickSaveBtn

    private void onchangeDateBirth(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_onchangeDateBirth
        
        if (!surnameInput.getText().isEmpty() && dateBirthInput.getDate() != null && !phoneInput.getText().isEmpty() && !nameInput.getText().isEmpty()) {
            saveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_onchangeDateBirth

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
       
        if (!surnameInput.getText().isEmpty() && dateBirthInput.getDate() != null && !phoneInput.getText().isEmpty() && !nameInput.getText().isEmpty()) {
            saveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_nameKeyTyped

    private void surnameOnKeytyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surnameOnKeytyped
        
        if (!surnameInput.getText().isEmpty() && dateBirthInput.getDate() != null && !phoneInput.getText().isEmpty() && !nameInput.getText().isEmpty()) {
            saveBtn.setEnabled(true);
        }
        
    }//GEN-LAST:event_surnameOnKeytyped

    private void onPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onPhoneKeyTyped
        // TODO add your handling code here:
        if (!surnameInput.getText().isEmpty() && dateBirthInput.getDate() != null && !phoneInput.getText().isEmpty() && !nameInput.getText().isEmpty()) {
            saveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_onPhoneKeyTyped

    private void extConfig() {
        setSize(830, 512);
        setMaximumSize(new Dimension(830, 512));
        /* inputs*/
        dateBirthInput.setDateFormatString("yyyy-MM-dd");
        dateBirthInput.getCalendarButton().setIcon(new ImageIcon(BookingForm.class.getResource("/images/calendario.png")));
        backBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                parentref.previusForm();
            }

        });

    }

    public void update() {
        reservationCode.setText(parentref.updateDataForm().getBooking().get(0).getCode());
    }

    private com.app.hotelalura.views.RegisterBooking parentref;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateBirthInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameInput;
    private javax.swing.JComboBox<String> nationalityInput;
    private javax.swing.JTextField phoneInput;
    private javax.swing.JTextField reservationCode;
    private com.app.hotelalura.components.RoundedPanel roundedPanel1;
    private com.app.hotelalura.components.RoundedPanel roundedPanel2;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField surnameInput;
    // End of variables declaration//GEN-END:variables
    private BookingCtrl bookingCtrl;
    private GuestCtrl guestCtrl;
}
