package View;

import Model.*;
import java.io.*;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AdminAddJadwal extends javax.swing.JFrame {
    private static Film film;
    private static Pengguna currentAdmin;
    private List<Jadwal> jadwal = new ArrayList<>();
    private List<Studio> studio;
    private int currentJadwalCount = 0;
    private final int MAX_JADWAL = 5;
    
    public AdminAddJadwal(Film film, Pengguna currentAdmin) throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        this.film = film;
        this.currentAdmin = currentAdmin;
        loadStudios();
        updateJumlahJadwal();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdJadwal = new javax.swing.JTextField();
        txtJamMulai = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnAddJadwal = new javax.swing.JButton();
        btnSaveFilm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(69, 69, 69));

        jPanel2.setBackground(new java.awt.Color(74, 99, 124));

        lblHeading.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setText("CINEMAXX");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ADMIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(612, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeading)
                    .addComponent(jLabel8))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(74, 99, 124));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ABOUT CINEMAXX");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CONTACT US");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MEMBERSHIP");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("FAQ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(656, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Jadwal:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jam Mulai:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tanggal:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Studio:");

        btnAddJadwal.setText("Add Jadwal");
        btnAddJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJadwalActionPerformed(evt);
            }
        });

        btnSaveFilm.setText("Save Film");
        btnSaveFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFilmActionPerformed(evt);
            }
        });

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtIdJadwal)
                                        .addComponent(txtJamMulai)
                                        .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                                    .addComponent(btnAddJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(btnSaveFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJamMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddJadwal)
                    .addComponent(btnSaveFilm))
                .addGap(73, 73, 73)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAddJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJadwalActionPerformed
        if (currentJadwalCount >= MAX_JADWAL) {
            JOptionPane.showMessageDialog(this, "Tidak bisa menambahkan jadwal lagi. Maksimum 5 jadwal.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String idJadwal = txtIdJadwal.getText().trim();
        String jamMulai = txtJamMulai.getText().trim();
        String tanggal = txtTanggal.getText().trim();
        Studio selectedStudio = (Studio) jComboBox1.getSelectedItem();
        
        if (jamMulai.isEmpty() || tanggal.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Jam Mulai dan Tanggal wajib diisi!", "Validasi Gagal", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (selectedStudio == null || selectedStudio.getIdStudio().equals("N/A")) {
            JOptionPane.showMessageDialog(this, "Pilih studio yang valid.", "Validasi Gagal", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for (Jadwal j : jadwal) {
            if (j.getFilm().getIdFilm().equals(film.getIdFilm()) && j.getStudio().getIdStudio().equals(selectedStudio.getIdStudio()) && j.getJamMulai().equals(jamMulai) && j.getTanggal().equals(tanggal)) {
                JOptionPane.showMessageDialog(this, "Jadwal yang sama sudah ditambahkan untuk film ini.", "Duplikasi Jadwal", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        Jadwal newJadwal = new Jadwal(idJadwal, film, selectedStudio, jamMulai, tanggal);
        
        jadwal.add(newJadwal);
        currentJadwalCount++;
        
        JOptionPane.showMessageDialog(this, "Jadwal berhasil ditambahkan ke daftar.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        clearJadwalFields();
        updateJumlahJadwal();
    }//GEN-LAST:event_btnAddJadwalActionPerformed

    private void btnSaveFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFilmActionPerformed
        if (film == null) {
            JOptionPane.showMessageDialog(this, "Objek Film belum disiapkan. Mohon kembali ke panel Film.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (jadwal.isEmpty()) {
            int confirm = JOptionPane.showConfirmDialog(this, "Tidak ada jadwal yang ditambahkan untuk film ini. Tambahkan jadwal!", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.NO_OPTION) {
                return;
            }
        }
        
        film.setJadwalList(jadwal);
        
        List<Film> allFilms = loadAllFilmsFromFile();
        boolean filmUpdated = false;
        for (int i = 0; i < allFilms.size(); i++) {
            if (allFilms.get(i).getIdFilm().equals(film.getIdFilm())) {
                allFilms.set(i, film);
                filmUpdated = true;
                break;
            }
        }
        if (!filmUpdated) {
            allFilms.add(film); 
        }
        saveAllFilmsToFile(allFilms);
        
        List<Jadwal> existingJadwal = loadAllJadwalFromFile();
        for (Jadwal j : jadwal) {
            existingJadwal.add(j);
        }
        saveAllJadwalToFile(existingJadwal);

        JOptionPane.showMessageDialog(this, "Film dan " + jadwal.size() + " jadwal berhasil disimpan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        ViewAdmin viewAdmin = new ViewAdmin(currentAdmin);
        viewAdmin.setVisible(true);
    }//GEN-LAST:event_btnSaveFilmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        AdminAddFilm adminAddFilm = new AdminAddFilm(currentAdmin);
        adminAddFilm.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private List<Film> loadAllFilmsFromFile() {
        List<Film> films = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("dataFilm.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split("\\|");
                    if (parts.length == 7) {
                        films.add(new Film(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading all films: " + e.getMessage());
        }
        return films;
    }
    
    private void saveAllFilmsToFile(List<Film> films) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dataFilm.txt"))) {
            for (Film f : films) {
                writer.write(f.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving films: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private List<Jadwal> loadAllJadwalFromFile() {
        List<Jadwal> allJadwal = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("dataJadwal.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split("\\|");
                    if (parts.length == 5) {
                        Film dummyFilm = new Film(parts[1], "", "", "", "", "", "");
                        Studio dummyStudio = new Studio(parts[2], "", "");
                        allJadwal.add(new Jadwal(parts[0], dummyFilm, dummyStudio, parts[3], parts[4]));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading all schedules: " + e.getMessage());
        }
        return allJadwal;
    }
    
    private void clearJadwalFields() {
        txtJamMulai.setText("");
        txtTanggal.setText("");
        jComboBox1.setSelectedIndex(0); 
    }
    
    private void loadStudios() throws FileNotFoundException, IOException{
        studio = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("dataStudio.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split("\\|");
                    if (parts.length == 3) {
                        String idStudio = parts[0];
                        String namaStudio = parts[1];
                        String tipeStudio = parts[2];
                        
                        studio.add(new Studio(idStudio, namaStudio, tipeStudio));
                    } else {
                        System.err.println("Skipping malformed line in " + "dataStudio.txt" + ": " + line);
                    }
                } 
            }            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading studio data: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
        }
        
        DefaultComboBoxModel<Studio> model = new DefaultComboBoxModel<>();
        if (studio.isEmpty()) {
            model.addElement(new Studio("N/A", "No Studios Available", "N/A")); 
        } else {
            for (Studio s : studio) {
                jComboBox1.addItem(s);
            }
        }    
    }
    
    private void updateJumlahJadwal() {        
        if (currentJadwalCount >= MAX_JADWAL) {
            btnAddJadwal.setEnabled(false); 
            JOptionPane.showMessageDialog(this, "Maksimum 5 jadwal telah ditambahkan. Silakan 'Save Film'.", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
        } else {
            btnAddJadwal.setEnabled(true);
        }
        
        btnSaveFilm.setEnabled(currentJadwalCount > 0); 
    }
    
    private void saveAllJadwalToFile(List<Jadwal> allJadwal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dataJadwal.txt"))) {
            for (Jadwal j : allJadwal) {
                writer.write(String.join("|",
                        j.getIdJadwal(),
                        j.getFilm().getIdFilm(), 
                        j.getStudio().getIdStudio(), 
                        j.getJamMulai(),
                        j.getTanggal()
                ));
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving schedules: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(AdminAddJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminAddJadwal(film, currentAdmin).setVisible(true);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(AdminAddJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddJadwal;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveFilm;
    private javax.swing.JComboBox<Studio> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTextField txtIdJadwal;
    private javax.swing.JTextField txtJamMulai;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
}
