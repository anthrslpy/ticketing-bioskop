package View;

import Model.*;
import java.util.*;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PilihStudio extends javax.swing.JFrame {
    private PilihStudio pilihStudio;    
    private static Film selectedFilm;
    private static String currentStudio;  
    private static Pengguna user;
    
    public PilihStudio(Film selectedFilm, Pengguna user) {
        initComponents();
        this.selectedFilm = selectedFilm;  
        this.user = user;
        setLocationRelativeTo(null);
        try {
            updateFilmInfo();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(pilihStudio, "Failed to save your data!");
        }
        labelFilm.setText(selectedFilm.getJudul());
        textAreaSinopsis.setText(selectedFilm.getSinopsis());
        textAreaSinopsis.setEditable(false);
    }
    
    public List<Jadwal> getJadwalByTipeStudio(String tipeStudio) throws IOException {
        List<Jadwal> result = new ArrayList<>();
        List<Film> films = loadFilms("dataFilm.txt");
        List<Studio> studios = loadStudios("dataStudio.txt");
        List<Jadwal> jadwals = loadJadwal("dataJadwal.txt", films, studios);
        for (Jadwal j : jadwals) {
            if (j.getStudio().getTipeStudio().equalsIgnoreCase(tipeStudio)) {
                result.add(j);                
            }
        }
        return result;
    }
    
    private void updateFilmInfo() throws IOException {
        labelFilm.setText(selectedFilm.getJudul());
        textAreaSinopsis.setText(selectedFilm.getSinopsis());
        textAreaSinopsis.setEditable(false);
                
        List<Jadwal> jadwalReguler = getJadwalByTipeStudio("Reguler");
        setJadwalButtons(jadwalReguler, new JButton[]{btnTime1Studio1, btnTime2Studio1, btnTime3Studio1}, "Reguler");        

        List<Jadwal> jadwalDeluxe = getJadwalByTipeStudio("Deluxe");
        setJadwalButtons(jadwalDeluxe, new JButton[]{btnTime1Studio2, btnTime2Studio2}, "Deluxe");
                
    }
    
    private void setJadwalButtons(List<Jadwal> jadwals, JButton[] buttons, String studioType) {
        for (int i = 0; i < buttons.length; i++) {
            if (i < jadwals.size()) {                
                Jadwal j = jadwals.get(i);
                buttons[i].setText(j.getJamMulai());
                buttons[i].setVisible(true);
                buttons[i].putClientProperty("jadwal", j);
                buttons[i].putClientProperty("studioType", studioType);
            } else {                
                buttons[i].setVisible(false);
            }
        }
    }
    
    private void handleTimeButtonClick(JButton button) {
        Jadwal selectedJadwal = (Jadwal) button.getClientProperty("jadwal");
        String studioType = (String) button.getClientProperty("studioType");
        if (selectedJadwal != null) {
            currentStudio = studioType;
            PilihKursi pilihKursi = new PilihKursi(selectedJadwal.getIdJadwal(), selectedFilm, currentStudio, user);
            pilihKursi.setVisible(true);
            this.dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelFilm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaSinopsis = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnTime1Studio1 = new javax.swing.JButton();
        btnTime1Studio2 = new javax.swing.JButton();
        btnTime2Studio1 = new javax.swing.JButton();
        btnTime3Studio1 = new javax.swing.JButton();
        btnTime2Studio2 = new javax.swing.JButton();
        pnlTop = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        pnlBottom = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(69, 69, 69));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        labelFilm.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        labelFilm.setForeground(new java.awt.Color(255, 255, 255));
        labelFilm.setText("Avengers : End Game");

        textAreaSinopsis.setBackground(new java.awt.Color(69, 69, 69));
        textAreaSinopsis.setColumns(20);
        textAreaSinopsis.setForeground(new java.awt.Color(255, 255, 255));
        textAreaSinopsis.setLineWrap(true);
        textAreaSinopsis.setRows(5);
        textAreaSinopsis.setText("Setelah kekalahan tragis dari Thanos yang menghapus setengah populasi alam semesta, para Avengers yang tersisa bersatu untuk melakukan perjalanan waktu, mengumpulkan Infinity Stones, dan membalikkan kehancuran. Dalam perjuangan akhir yang epik, mereka menghadapi Thanos sekali lagi demi menyelamatkan dunia—mengorbankan banyak hal, termasuk Iron Man yang gugur demi kemenangan umat manusia.");
        textAreaSinopsis.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textAreaSinopsis);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Deluxe 2D");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reguler 2D");

        btnTime1Studio1.setText("12 : 10");
        btnTime1Studio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTime1Studio1ActionPerformed(evt);
            }
        });

        btnTime1Studio2.setText("16 : 30");
        btnTime1Studio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTime1Studio2ActionPerformed(evt);
            }
        });

        btnTime2Studio1.setText("14 : 20");
        btnTime2Studio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTime2Studio1ActionPerformed(evt);
            }
        });

        btnTime3Studio1.setText("18 :40");
        btnTime3Studio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTime3Studio1ActionPerformed(evt);
            }
        });

        btnTime2Studio2.setText("20 : 00");
        btnTime2Studio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTime2Studio2ActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FAQ");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CONTACT US");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MEMBERSHIP");

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(58, 58, 58)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
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
            .addComponent(pnlBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFilm)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTime1Studio1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTime1Studio2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTime2Studio1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(btnTime3Studio1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTime2Studio2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(labelFilm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnTime1Studio1)
                    .addComponent(btnTime2Studio1)
                    .addComponent(btnTime3Studio1))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnTime1Studio2)
                    .addComponent(btnTime2Studio2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(pnlBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelFilm.getAccessibleContext().setAccessibleName("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTime1Studio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTime1Studio1ActionPerformed
        handleTimeButtonClick(btnTime1Studio1);        
    }//GEN-LAST:event_btnTime1Studio1ActionPerformed

    private void btnTime3Studio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTime3Studio1ActionPerformed
        handleTimeButtonClick(btnTime3Studio1);        
    }//GEN-LAST:event_btnTime3Studio1ActionPerformed

    private void btnTime1Studio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTime1Studio2ActionPerformed
        handleTimeButtonClick(btnTime1Studio2);        
    }//GEN-LAST:event_btnTime1Studio2ActionPerformed

    private void btnTime2Studio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTime2Studio1ActionPerformed
        handleTimeButtonClick(btnTime2Studio1);        
    }//GEN-LAST:event_btnTime2Studio1ActionPerformed

    private void btnTime2Studio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTime2Studio2ActionPerformed
        handleTimeButtonClick(btnTime2Studio2);        
    }//GEN-LAST:event_btnTime2Studio2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        ViewFilm viewFilm = new ViewFilm(selectedFilm, user);
        viewFilm.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(PilihStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        try {
            List<Film> films = loadFilms("dataFilm.txt");
            if (!films.isEmpty()) {
                java.awt.EventQueue.invokeLater(() -> {
                    new PilihStudio(films.get(0), user).setVisible(true);
                });
            } else {
                JOptionPane.showMessageDialog(null, "Tidak ada film tersedia");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihStudio(selectedFilm, user).setVisible(true);
            }
        });
    }
    
    public static List<Film> loadFilms(String path) throws IOException {
        List<Film> films = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split("\\|");
                if (parts.length == 7) {
                    Film film = new Film();
                    film.setIdFilm(parts[0]);
                    film.setJudul(parts[1]);
                    film.setGenre(parts[2]);
                    film.setDurasi(parts[3]);
                    film.setSinopsis(parts[4]);                    
                    film.setPosterPath1(parts[5]);                    
                    film.setPosterPath2(parts[6]);                    
                    films.add(film);
                }
            }
        }
        return films;
    }
    
    public static List<Jadwal> loadJadwal(String path, List<Film> films, List<Studio> studios) throws IOException {
        List<Jadwal> jadwalList = new ArrayList<>();
        Map<String, Film> filmMap = new HashMap<>();
        Map<String, Studio> studioMap = new HashMap<>();

        for (Film f : films) {
            filmMap.put(f.getIdFilm(), f);
        }
        for (Studio s : studios) {
            studioMap.put(s.getIdStudio(), s);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split("\\|");
                if (parts.length >= 5) {
                    String idJadwal = parts[0];
                    String idFilm = parts[1];
                    String idStudio = parts[2];
                    String jamMulai = parts[3];
                    String tanggal = parts[4];

                    Film film = filmMap.get(idFilm);
                    Studio studio = studioMap.get(idStudio);

                    if (film != null && studio != null) {
                        Jadwal jadwal = new Jadwal(idJadwal, film, studio, jamMulai, tanggal);
                        jadwalList.add(jadwal);
                        film.tambahJadwal(jadwal);
                    }
                }
            }
        }
        return jadwalList;
    }
    
    public static List<Studio> loadStudios(String filePath) throws IOException {
        List<Studio> studios = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\|");
            if (parts.length >= 3) { 
                Studio studio = new Studio(parts[0], parts[1], parts[2]);                                
                studios.add(studio);
            } else {
                System.err.println("Skipping malformed studio line: " + line);
            }
        }
        reader.close();
        return studios;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTime1Studio1;
    private javax.swing.JButton btnTime1Studio2;
    private javax.swing.JButton btnTime2Studio1;
    private javax.swing.JButton btnTime2Studio2;
    private javax.swing.JButton btnTime3Studio1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFilm;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextArea textAreaSinopsis;
    // End of variables declaration//GEN-END:variables
}
