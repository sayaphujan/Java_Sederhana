/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * fTblPinjam.java
 *
 * Created on Nov 5, 2013, 6:22:27 AM
 */

package form;

/**
 *
 * @author Advan
 */
public class fTblPinjam extends javax.swing.JFrame {

    /** Creates new form fTblPinjam */
    public fTblPinjam() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_cari = new javax.swing.JTextField();
        lbl_cari_an = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_an = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_bk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cari.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_cariCaretUpdate(evt);
            }
        });
        jPanel1.add(txt_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 260, -1));

        lbl_cari_an.setFont(new java.awt.Font("Tahoma", 1, 12));
        lbl_cari_an.setForeground(new java.awt.Color(51, 0, 153));
        lbl_cari_an.setText("PENCARIAN");
        jPanel1.add(lbl_cari_an, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tbl_an.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_anMouseClicked(evt);
            }
        });
        tbl_an.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tbl_anCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbl_an);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 750, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 780, 330));

        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(".:: DATA PINJAMAN ::.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/label.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 130));

        lbl_bk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N
        getContentPane().add(lbl_bk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cariCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_cariCaretUpdate
        // TODO add your handling code here:
        //angg.cari(txt_cari.getText());
}//GEN-LAST:event_txt_cariCaretUpdate

    private void tbl_anMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_anMouseClicked
        // TODO add your handling code here:
        
        int row=tbl_an.getSelectedRow();
        String Id = tbl_an.getValueAt(row, 0).toString();
        String Nama=tbl_an.getValueAt(row, 1).toString();
        String TempatLahir=tbl_an.getValueAt(row, 2).toString();
        String TglLahir=tbl_an.getValueAt(row, 3).toString();
        String Jnskel=tbl_an.getValueAt(row, 4).toString();
        String Alamat=tbl_an.getValueAt(row, 5).toString();
        String Kerja=tbl_an.getValueAt(row, 6).toString();


       
        int iTahun = Integer.parseInt(TglLahir.substring(6,10));
        int iBulan = Integer.parseInt(TglLahir.substring(3,5))-1;
        int iTgl = Integer.parseInt(TglLahir.substring(0,2));

        
}//GEN-LAST:event_tbl_anMouseClicked

    private void tbl_anCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbl_anCaretPositionChanged
        // TODO add your handling code here:
}//GEN-LAST:event_tbl_anCaretPositionChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fTblPinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_bk;
    private javax.swing.JLabel lbl_cari_an;
    private javax.swing.JTable tbl_an;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables

}
