/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesananmakanan1;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


/**
 *
 * @author Abe Dhe
 */
public class form_Pemesanan extends javax.swing.JFrame {

    /**
     * Creates new form form_Pemesanan
     */
    int total = 0;
    public form_Pemesanan() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        judul_warung = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        MasukkanNama = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CB_Pilihpesanan = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        isiJumlahPesanan = new javax.swing.JTextField();
        tombol_Proses = new javax.swing.JButton();
        tombol_Batal = new javax.swing.JButton();
        tombol_Keluar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        kolom_Total = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        kolom_Keterangan = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kolom_Kembalian = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kolom_Tunai = new javax.swing.JTextField();
        tombol_Bayar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul_warung.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        judul_warung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul_warung.setText("Warung Makan \"Wong Boement\"");
        jPanel1.add(judul_warung, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 881, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 70));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nasi + Ayam Geprek");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 158, 36));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nasi Goreng");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 158, 36));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Indomie + Telur");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 158, 36));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pemesananmakanan1/04-nasi goreng.jpg"))); // NOI18N
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 260, 160));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pemesananmakanan1/01-Ayam Geprek.jpg"))); // NOI18N
        jLabel22.setText("GAMBAR1");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 200, 110));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pemesananmakanan1/03-indomie telur.jpg"))); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 250, 160));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 910, 200));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("7.000/Porsi");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 158, 34));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("10.000/Porsi");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 157, 34));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("9.000/Porsi");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 158, 34));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 910, 40));

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Masukkan Nama :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 100, 43));

        MasukkanNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasukkanNamaActionPerformed(evt);
            }
        });
        jPanel4.add(MasukkanNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 15, 230, 40));

        jLabel17.setText("Pilih Pesanan      :");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 100, 37));

        CB_Pilihpesanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nasi + Ayam Geprek", "Indomie + Telur", "Nasi Goreng" }));
        CB_Pilihpesanan.setSelectedIndex(-1);
        CB_Pilihpesanan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_PilihpesananItemStateChanged(evt);
            }
        });
        CB_Pilihpesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_PilihpesananActionPerformed(evt);
            }
        });
        jPanel4.add(CB_Pilihpesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 65, 230, 40));

        jLabel18.setText("Jumlah               :");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, 100, 37));

        isiJumlahPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiJumlahPesananActionPerformed(evt);
            }
        });
        jPanel4.add(isiJumlahPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 113, 230, 40));

        tombol_Proses.setText("Proses");
        tombol_Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_ProsesActionPerformed(evt);
            }
        });
        jPanel4.add(tombol_Proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 92, 43));

        tombol_Batal.setText("Batal");
        tombol_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_BatalActionPerformed(evt);
            }
        });
        jPanel4.add(tombol_Batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 168, 104, 43));

        tombol_Keluar.setText("Keluar");
        tombol_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_KeluarActionPerformed(evt);
            }
        });
        jPanel4.add(tombol_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 70, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Total :");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 60, 30));

        kolom_Total.setEditable(false);
        kolom_Total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kolom_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom_TotalActionPerformed(evt);
            }
        });
        jPanel4.add(kolom_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 120, 30));

        kolom_Keterangan.setEditable(false);
        kolom_Keterangan.setColumns(20);
        kolom_Keterangan.setRows(5);
        jScrollPane2.setViewportView(kolom_Keterangan);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 520, 100));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Keterangan :");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Kembalian:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 60, 30));

        kolom_Kembalian.setEditable(false);
        kolom_Kembalian.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kolom_Kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom_KembalianActionPerformed(evt);
            }
        });
        jPanel4.add(kolom_Kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 130, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tunai :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 50, 30));

        kolom_Tunai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kolom_Tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom_TunaiActionPerformed(evt);
            }
        });
        jPanel4.add(kolom_Tunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 130, 30));

        tombol_Bayar.setText("Bayar");
        tombol_Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_BayarActionPerformed(evt);
            }
        });
        jPanel4.add(tombol_Bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 70, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 910, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CB_PilihpesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_PilihpesananActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CB_PilihpesananActionPerformed

    private void isiJumlahPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiJumlahPesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiJumlahPesananActionPerformed

    private void tombol_ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_ProsesActionPerformed
        // TODO add your handling code here:
        String nama = MasukkanNama.getText();
        try{
        int jumlah = Integer.parseInt(isiJumlahPesanan.getText());
        int pilihpesanan = CB_Pilihpesanan.getSelectedIndex();
        int harga = 0;
        
            switch (pilihpesanan){
                case (0):
                    harga = 10000;
                    break;
                case (1):
                    harga = 7000;
                    break;
                case (2):
                    harga = 9000;
                    break;

            }
            total = harga*jumlah;
            kolom_Total.setText(Integer.toString(total));
            kolom_Keterangan.setText("Pesanan atas nama : " +nama+"\nPilihan pesanan : "+CB_Pilihpesanan.getItemAt(pilihpesanan)+"\nSebanyak : "+jumlah+" Porsi" );
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Inputan Salah!", "KESALAHAN", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_tombol_ProsesActionPerformed

    private void MasukkanNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasukkanNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasukkanNamaActionPerformed

    private void kolom_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolom_TotalActionPerformed

    private void tombol_BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_BatalActionPerformed
        // TODO add your handling code here:
        MasukkanNama.setText("");
        CB_Pilihpesanan.setSelectedIndex(-1);
        isiJumlahPesanan.setText("");
    }//GEN-LAST:event_tombol_BatalActionPerformed

    private void CB_PilihpesananItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_PilihpesananItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_PilihpesananItemStateChanged

    private void tombol_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_KeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tombol_KeluarActionPerformed

    private void kolom_KembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom_KembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolom_KembalianActionPerformed

    private void kolom_TunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom_TunaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolom_TunaiActionPerformed

    private void tombol_BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_BayarActionPerformed
        // TODO add your handling code here:
        try{
            int kembalian=Integer.parseInt(kolom_Tunai.getText())-Integer.parseInt(kolom_Total.getText());
            if (kembalian>=0){kolom_Kembalian.setText(Integer.toString(kembalian));}
            else{JOptionPane.showMessageDialog(null, "Maaf Uang Anda Tidak Cukup!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Inputan Salah!", "KESALAHAN", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_tombol_BayarActionPerformed

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
            java.util.logging.Logger.getLogger(form_Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Pilihpesanan;
    private javax.swing.JTextField MasukkanNama;
    private javax.swing.JTextField isiJumlahPesanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel judul_warung;
    private javax.swing.JTextField kolom_Kembalian;
    private javax.swing.JTextArea kolom_Keterangan;
    private javax.swing.JTextField kolom_Total;
    private javax.swing.JTextField kolom_Tunai;
    private javax.swing.JButton tombol_Batal;
    private javax.swing.JButton tombol_Bayar;
    private javax.swing.JButton tombol_Keluar;
    private javax.swing.JButton tombol_Proses;
    // End of variables declaration//GEN-END:variables
}
