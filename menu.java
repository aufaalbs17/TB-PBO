package OptionMenu;

import PC.PC_view;
import Voucher.voucher_view;
import Stock.stock_view;

/**
 *
 * @author cwr
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logo_ubg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btExit = new javax.swing.JButton();
        btVoucher = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btPC = new javax.swing.JButton();
        btStock = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(65, 99, 136));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo_ubg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OptionMenu/logo unand.png"))); // NOI18N
        jPanel1.add(logo_ubg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PROJECT UAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pemrograman Berorientasi Objek");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 61, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Canggih Wahyu Rinaldi");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("1901050017");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 330));

        jPanel2.setBackground(new java.awt.Color(118, 93, 105));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btExit.setBackground(new java.awt.Color(239, 110, 122));
        btExit.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btExit.setForeground(new java.awt.Color(253, 251, 212));
        btExit.setText("KELUAR");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        jPanel2.add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 198, 184, 41));

        btVoucher.setBackground(new java.awt.Color(65, 99, 136));
        btVoucher.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btVoucher.setForeground(new java.awt.Color(255, 255, 255));
        btVoucher.setText("Voucher Hotspot");
        btVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoucherActionPerformed(evt);
            }
        });
        jPanel2.add(btVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 140, 40));

        jPanel4.setBackground(new java.awt.Color(252, 208, 186));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 10));

        btPC.setBackground(new java.awt.Color(65, 99, 136));
        btPC.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btPC.setForeground(new java.awt.Color(255, 255, 255));
        btPC.setText("Komputer ( PC )");
        btPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPCActionPerformed(evt);
            }
        });
        jPanel2.add(btPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 50, 140, 40));

        btStock.setBackground(new java.awt.Color(65, 99, 136));
        btStock.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btStock.setForeground(new java.awt.Color(255, 255, 255));
        btStock.setText("Stock Barang");
        btStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStockActionPerformed(evt);
            }
        });
        jPanel2.add(btStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 120, 40));

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 400, 250));

        jPanel3.setBackground(new java.awt.Color(239, 110, 122));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 251, 212));
        jLabel1.setText("Canggih WarNET");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 25, -1, -1));

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 400, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoucherActionPerformed
        new voucher_view().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoucherActionPerformed

    private void btPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPCActionPerformed
        new PC_view().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btPCActionPerformed

    private void btStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStockActionPerformed
        new stock_view().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btStockActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btPC;
    private javax.swing.JButton btStock;
    private javax.swing.JButton btVoucher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logo_ubg;
    // End of variables declaration//GEN-END:variables
}
