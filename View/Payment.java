package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Payment extends javax.swing.JFrame {
    private String studioType;
    private ArrayList<String> selectedSeats;
    private String movieTitle;

    public Payment(String studioType, ArrayList<String> seats, String movieTitle) {
        this.studioType = studioType;
        this.selectedSeats = seats;
        this.movieTitle = movieTitle;
        initComponents();
        calculateTotal();
    }

    private void calculateTotal() {
        int pricePerSeat = studioType.contains("Deluxe") ? 50000 : 35000;
        int total = selectedSeats.size() * pricePerSeat;
        lblTotal.setText("Rp " + String.format("%,d", total));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblStudioType = new javax.swing.JLabel();
        detailPanel = new javax.swing.JPanel();
        lblSeatsTitle = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblPriceTitle = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblMethodTitle = new javax.swing.JLabel();
        cmbPayment = new javax.swing.JComboBox<>();
        bottomPanel = new javax.swing.JPanel();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(69, 69, 69));
        jPanel1.setLayout(new java.awt.BorderLayout());

        topPanel.setBackground(new java.awt.Color(74, 99, 124));
        topPanel.setPreferredSize(new java.awt.Dimension(900, 110));

        lblTitle.setFont(new java.awt.Font("Verdana", 1, 24));
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText(movieTitle);

        lblStudioType.setFont(new java.awt.Font("Verdana", 1, 18));
        lblStudioType.setForeground(new java.awt.Color(255, 255, 255));
        lblStudioType.setText(studioType);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(lblStudioType))
                .addContainerGap(600, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStudioType)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(topPanel, java.awt.BorderLayout.NORTH);

        detailPanel.setBackground(new java.awt.Color(69, 69, 69));
        detailPanel.setLayout(new java.awt.GridLayout(5, 1, 0, 20));

        lblSeatsTitle.setFont(new java.awt.Font("Verdana", 1, 18));
        lblSeatsTitle.setForeground(Color.WHITE);
        lblSeatsTitle.setText("Selected Seats:");
        detailPanel.add(lblSeatsTitle);

        lblSeats.setFont(new java.awt.Font("Verdana", 0, 16));
        lblSeats.setForeground(Color.WHITE);
        lblSeats.setText(String.join(", ", selectedSeats));
        detailPanel.add(lblSeats);

        lblPriceTitle.setFont(new java.awt.Font("Verdana", 1, 18));
        lblPriceTitle.setForeground(Color.WHITE);
        lblPriceTitle.setText("Total Price:");
        detailPanel.add(lblPriceTitle);

        lblTotal.setFont(new java.awt.Font("Verdana", 1, 24));
        lblTotal.setForeground(Color.WHITE);
        detailPanel.add(lblTotal);

        lblMethodTitle.setFont(new java.awt.Font("Verdana", 1, 18));
        lblMethodTitle.setForeground(Color.WHITE);
        lblMethodTitle.setText("Payment Method:");
        detailPanel.add(lblMethodTitle);

        cmbPayment.setFont(new java.awt.Font("Verdana", 0, 16));
        cmbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "QRIS", "DEBIT", "CREDIT", "On the Spot" }));
        detailPanel.add(cmbPayment);

        jPanel1.add(detailPanel, java.awt.BorderLayout.CENTER);

        bottomPanel.setBackground(new java.awt.Color(74, 99, 124));
        bottomPanel.setPreferredSize(new java.awt.Dimension(900, 65));

        btnConfirm.setFont(new java.awt.Font("Verdana", 1, 16));
        btnConfirm.setText("CONFIRM PAYMENT");
        btnConfirm.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Payment Successful!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        jPanel1.add(bottomPanel, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ArrayList<String> sampleSeats = new ArrayList<>();
                sampleSeats.add("A3");
                sampleSeats.add("B5");
                
                new Payment(
                        "Deluxe 2D",
                        sampleSeats,
                        "Avengers: End Game"
                ).setVisible(true);
            }
        });
    }
    // Variables declaration
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblStudioType;
    private javax.swing.JLabel lblSeatsTitle;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblPriceTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblMethodTitle;
    private javax.swing.JComboBox<String> cmbPayment;
    private javax.swing.JButton btnConfirm;
}