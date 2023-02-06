package com.app.hotelalura.views;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;

public class Home extends javax.swing.JPanel {
    private Home instance;

    public Home() {
        initComponents(this);
        

    }

    private void initComponents(Home h) {
        instance= h;
        backgroundPanel = new com.app.hotelalura.components.RoundedPanel();
        menu1 = new com.app.hotelalura.components.Menu2(instance);
        closedWindow = new javax.swing.JLabel();
        container = new javax.swing.JLayeredPane();
        defMenuView1 = new com.app.hotelalura.components.DefMenuView();
        current = defMenuView1;
        closedWindow.setBounds(0, 0, 25, 25);
        closedWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-24px.png")));
        closedWindow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

        });

        container.setPreferredSize(new Dimension((int) (1024 - menu1.getPreferredSize().getWidth()), 600));
        current.setBounds(0, 50, (int) container.getPreferredSize().getWidth(), 500);
        closedWindow.setBounds((int) container.getPreferredSize().getWidth() - 35, 10, 25, 25);
        container.add(current, JLayeredPane.DEFAULT_LAYER);
        container.add(closedWindow, Integer.valueOf(1));
        GridBagConstraints constraints = new GridBagConstraints();
        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero.
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
        constraints.gridheight = 2; // El área de texto ocupa 2 filas.
        constraints2.gridx = 2;
        constraints2.gridy = 1;
        constraints2.gridwidth = 5;
        constraints2.gridheight = 5;

        setBackground(new Color(0, 0, 0, 0));
        setLayout(new BorderLayout());
        backgroundPanel.setSize(getWidth(), getHeight());
        backgroundPanel.setBackground(Color.WHITE);
        backgroundPanel.setLayout(new GridBagLayout());
        backgroundPanel.add(menu1, constraints);
        backgroundPanel.add(container, constraints2);
        add(backgroundPanel, BorderLayout.CENTER);

    }

    public void changePanelView() {
        if (!current.equals(searchSystem)) {
            if(searchSystem==null){
                searchSystem = new com.app.hotelalura.components.SearchSystem();
            }
            current.setVisible(false);
            container.remove(current);
            current = searchSystem;
            container.add(current, JLayeredPane.DEFAULT_LAYER);
            current.setBounds(0, 50, (int) container.getPreferredSize().getWidth(), 500);
            current.setVisible(true);
            container.repaint();
        }
    }

    public void openRegisterView() {
        if(registerBooking==null){
            registerBooking = new RegisterBooking(this);
        }
        if(!registerBooking.isVisible()){
            registerBooking.setVisible(true);
        }

    }

    public void closedRegisterView() {
        registerBooking.setVisible(false);
    }

    private com.app.hotelalura.components.RoundedPanel backgroundPanel;
    private javax.swing.JLayeredPane container;
    private javax.swing.JPanel defMenuView1;
    private javax.swing.JPanel searchSystem;
    private javax.swing.JPanel current;
    private javax.swing.JLabel closedWindow;
    private javax.swing.JPanel menu1;
    private javax.swing.JFrame registerBooking;
}
