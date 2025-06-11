package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PilihKursi extends javax.swing.JFrame {    
    private static Pengguna user;
    private static Film selectedFilm;
    private static String idJadwal;    
    private static String currentStudio;
    private ArrayList<String> kursiDipilih = new ArrayList<>();
    private static final String KURSI_FILE = "dataKursi.txt";
    
    
    public PilihKursi(String idJadwal, Film selectedFilm, String currentStudio, Pengguna user) {
        initComponents();
        this.user = user;
        this.idJadwal = idJadwal;
        this.selectedFilm = selectedFilm;
        this.currentStudio = currentStudio;        
        setLocationRelativeTo(null);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jFieldTicketNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFieldSelectSeat = new javax.swing.JTextField();
        jLabelSelected = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnContinue = new javax.swing.JButton();
        pnlTop = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        pnlBottom = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(69, 69, 69));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jButton2.setIcon(new javax.swing.ImageIcon("/Users/anasyalaili/NetBeansProjects/TicketingBioskop/kursiBioskop.jpeg")); // NOI18N
        jButton2.setText("jButton2");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Number of ticket(s) :");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select seat number :");

        jLabelSelected.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelSelected.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSelected.setText("Your selected seat :");

        btnOK.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnContinue.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnContinue.setText("Continue");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        pnlTop.setBackground(new java.awt.Color(74, 99, 124));

        lblHeading.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setText("CINEMAXX");

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblHeading)
                .addContainerGap(650, Short.MAX_VALUE))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblHeading)
                .addGap(30, 30, 30))
        );

        pnlBottom.setBackground(new java.awt.Color(74, 99, 124));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ABOUT CINEMAXX");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FAQ");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTACT US");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MEMBERSHIP");

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(58, 58, 58)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnBack.setBackground(new java.awt.Color(60, 80, 100));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelSelected)
                            .addComponent(jFieldTicketNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFieldSelectSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnOK)))
                        .addContainerGap(100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFieldTicketNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFieldSelectSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabelSelected)
                        .addGap(56, 56, 56)
                        .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addComponent(pnlBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        if (kursiDipilih.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seat could not be blank!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        
        ViewPayment viewPayment = new ViewPayment(idJadwal, kursiDipilih, selectedFilm, currentStudio, user);
        viewPayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContinueActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        try {
            String jumlahTiketStr = jFieldTicketNumber.getText();
            String nomorKursi = jFieldSelectSeat.getText().trim().toUpperCase();

            if (jumlahTiketStr.isEmpty() || nomorKursi.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Input cannot be blank!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int jumlahTiket = Integer.parseInt(jumlahTiketStr);

            if (jumlahTiket < 1) {
                JOptionPane.showMessageDialog(this, "Minimum ticket quantity is 1!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!nomorKursi.matches("^[A-Ia-i]\\d+$")) {
                JOptionPane.showMessageDialog(this, "Invalid seat format. Example: A1, B2, C3", "Warning", JOptionPane.WARNING_MESSAGE);
                jFieldSelectSeat.setText("");
                return;
            }

            if (isKursiTerpakai(idJadwal, nomorKursi)) {
                JOptionPane.showMessageDialog(this, "Seat " + nomorKursi + " is already booked!", "Warning", JOptionPane.WARNING_MESSAGE);
                jFieldSelectSeat.setText("");
                return;
            }

            if (kursiDipilih.contains(nomorKursi)) {
                JOptionPane.showMessageDialog(this, "Seat " + nomorKursi + " is not available!", "Warning", JOptionPane.WARNING_MESSAGE);
                jFieldSelectSeat.setText("");
                return;
            }

            kursiDipilih.add(nomorKursi);
            jLabelSelected.setText("Your selected seat: " + String.join(", ", kursiDipilih));
            jFieldSelectSeat.setText("");

            if (kursiDipilih.size() >= jumlahTiket) {
                jFieldSelectSeat.setEnabled(false);
                btnOK.setEnabled(false);
                JOptionPane.showMessageDialog(this, "You have selected all the seats according to the number of tickets.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "The number of tickets must be a number!", "Error", JOptionPane.ERROR_MESSAGE);
            jFieldTicketNumber.setText("");
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        PilihStudio pilihStudio = new PilihStudio(selectedFilm, user);
        pilihStudio.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
    
    private boolean isKursiTerpakai(String idJadwal, String nomorKursi) {
        if (!new File(KURSI_FILE).exists()) {
            return false;
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(KURSI_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3 && parts[0].equals(idJadwal) && parts[1].equals(nomorKursi)) {
                    return parts[2].equals("terisi");
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to read seat data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PilihKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                    
                    Film film = loadFilmFromFile("dataFilm.txt", selectedFilm.getIdFilm());
                    if (film != null) {
                        new PilihKursi(idJadwal, selectedFilm, currentStudio, user).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Film is not found.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
        });
    }
    
    private static Film loadFilmFromFile(String filePath, String idFilm) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(idFilm)) {
                    Film film = new Film();
                    film.setIdFilm(parts[0]);
                    film.setJudul(parts[1]);
                    film.setSinopsis(parts[4]);
                    return film;
                }
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jFieldSelectSeat;
    private javax.swing.JTextField jFieldTicketNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelSelected;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlTop;
    // End of variables declaration//GEN-END:variables
}
