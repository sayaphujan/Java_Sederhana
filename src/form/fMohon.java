/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * fMohon.java
 *
 * Created on Nov 5, 2013, 5:37:50 AM
 */

package form;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import kelas.Konek;
import kelas.Mohon;

/**
 *
 * @author Advan
 */
public final class fMohon extends javax.swing.JFrame {
kelas.Mohon moh;
    /** Creates new form fMohon */
    public fMohon() {
        initComponents();
        moh = new Mohon();
        tbl_mohon.setModel(moh.modelMohon);
        //btnJnsKel.setSelected(null);
        moh.tampilData();
        setLocationRelativeTo(null);
        tampilId();
        loadnik();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nm_an2 = new javax.swing.JLabel();
        lbl_nm_an3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_cari = new javax.swing.JTextField();
        lbl_cari_an = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mohon = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_id_an = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lbl_nm_an = new javax.swing.JLabel();
        lbl_tgl_lhr_an = new javax.swing.JLabel();
        lbl_almt_an = new javax.swing.JLabel();
        optKTP = new javax.swing.JCheckBox();
        optKK = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jTglAju = new com.toedter.calendar.JDateChooser();
        lbl_nm_an1 = new javax.swing.JLabel();
        txtusia = new javax.swing.JTextField();
        lbl_nm_an4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSisa = new javax.swing.JTextField();
        txtGaji = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        optSlip = new javax.swing.JCheckBox();
        txtId = new javax.swing.JTextField();
        cmbNik = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_baru = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        lbl_bk = new javax.swing.JLabel();

        lbl_nm_an2.setFont(new java.awt.Font("Tahoma", 1, 12));
        lbl_nm_an2.setForeground(new java.awt.Color(51, 0, 153));
        lbl_nm_an2.setText("Usia");

        lbl_nm_an3.setFont(new java.awt.Font("Tahoma", 1, 12));
        lbl_nm_an3.setForeground(new java.awt.Color(51, 0, 153));
        lbl_nm_an3.setText("Usia");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
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

        tbl_mohon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_mohonMouseClicked(evt);
            }
        });
        tbl_mohon.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tbl_mohonCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbl_mohon);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 370, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 390, 510));

        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(".:: FORM PENGAJUAN PINJAMAN ::.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/label.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addGap(22, 22, 22))
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

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        lbl_id_an.setFont(new java.awt.Font("Tahoma", 1, 12));
        lbl_id_an.setForeground(new java.awt.Color(51, 0, 153));
        lbl_id_an.setText("No Anggota");
        jPanel2.add(lbl_id_an);
        lbl_id_an.setBounds(10, 11, 74, 30);

        txtNama.setEditable(false);
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel2.add(txtNama);
        txtNama.setBounds(131, 55, 203, 30);

        lbl_nm_an.setFont(new java.awt.Font("Tahoma", 1, 12));
        lbl_nm_an.setForeground(new java.awt.Color(51, 0, 153));
        lbl_nm_an.setText("Nama");
        jPanel2.add(lbl_nm_an);
        lbl_nm_an.setBounds(10, 55, 33, 30);

        lbl_tgl_lhr_an.setFont(new java.awt.Font("Tahoma", 1, 12));
        lbl_tgl_lhr_an.setForeground(new java.awt.Color(51, 0, 153));
        lbl_tgl_lhr_an.setText("Tgl Pengajuan");
        jPanel2.add(lbl_tgl_lhr_an);
        lbl_tgl_lhr_an.setBounds(10, 236, 87, 30);

        lbl_almt_an.setFont(new java.awt.Font("Tahoma", 1, 12));
        lbl_almt_an.setForeground(new java.awt.Color(51, 0, 153));
        lbl_almt_an.setText("Syarat");
        lbl_almt_an.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(lbl_almt_an);
        lbl_almt_an.setBounds(10, 347, 40, 75);

        optKTP.setFont(new java.awt.Font("Tahoma", 1, 12));
        optKTP.setForeground(new java.awt.Color(51, 0, 153));
        optKTP.setText("FC. KTP");
        optKTP.setOpaque(false);
        jPanel2.add(optKTP);
        optKTP.setBounds(131, 347, 71, 23);

        optKK.setFont(new java.awt.Font("Tahoma", 1, 12));
        optKK.setForeground(new java.awt.Color(51, 0, 153));
        optKK.setText("FC. KK");
        optKK.setOpaque(false);
        jPanel2.add(optKK);
        optKK.setBounds(131, 373, 63, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setForeground(new java.awt.Color(51, 0, 153));
        jLabel5.setText("Jumlah Pinjaman");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 283, 103, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setForeground(new java.awt.Color(51, 0, 153));
        jLabel6.setText("Rp");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(131, 283, 17, 27);
        jPanel2.add(txtJumlah);
        txtJumlah.setBounds(166, 282, 172, 30);
        jPanel2.add(jTglAju);
        jTglAju.setBounds(131, 232, 81, 30);

        lbl_nm_an1.setFont(new java.awt.Font("Tahoma", 1, 12));
        lbl_nm_an1.setForeground(new java.awt.Color(51, 0, 153));
        lbl_nm_an1.setText("Usia");
        jPanel2.add(lbl_nm_an1);
        lbl_nm_an1.setBounds(131, 110, 24, 30);

        txtusia.setEditable(false);
        txtusia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusiaActionPerformed(evt);
            }
        });
        jPanel2.add(txtusia);
        txtusia.setBounds(220, 104, 31, 30);

        lbl_nm_an4.setFont(new java.awt.Font("Tahoma", 1, 12));
        lbl_nm_an4.setForeground(new java.awt.Color(51, 0, 153));
        lbl_nm_an4.setText("th");
        jPanel2.add(lbl_nm_an4);
        lbl_nm_an4.setBounds(255, 103, 14, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setForeground(new java.awt.Color(51, 0, 153));
        jLabel7.setText("Sisa Gaji");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(131, 183, 50, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setForeground(new java.awt.Color(51, 0, 153));
        jLabel8.setText("Rp");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(199, 183, 17, 30);

        txtSisa.setEditable(false);
        jPanel2.add(txtSisa);
        txtSisa.setBounds(220, 184, 114, 30);

        txtGaji.setEditable(false);
        jPanel2.add(txtGaji);
        txtGaji.setBounds(220, 147, 114, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setForeground(new java.awt.Color(51, 0, 153));
        jLabel9.setText("Gaji");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(131, 147, 22, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setForeground(new java.awt.Color(51, 0, 153));
        jLabel10.setText("Rp");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(199, 146, 17, 30);

        optSlip.setFont(new java.awt.Font("Tahoma", 1, 12));
        optSlip.setForeground(new java.awt.Color(51, 0, 153));
        optSlip.setText("FC. Slip Gaji");
        optSlip.setOpaque(false);
        jPanel2.add(optSlip);
        optSlip.setBounds(131, 399, 95, 23);
        jPanel2.add(txtId);
        txtId.setBounds(131, 440, 6, 20);

        cmbNik.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Pilih Disini -" }));
        cmbNik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNikActionPerformed(evt);
            }
        });
        jPanel2.add(cmbNik);
        cmbNik.setBounds(130, 10, 200, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 350, 430));

        jPanel4.setOpaque(false);

        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kembali.png"))); // NOI18N
        btn_home.setBorder(null);
        btn_home.setContentAreaFilled(false);
        btn_home.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simpan2.png"))); // NOI18N
        btn_simpan.setBorder(null);
        btn_simpan.setContentAreaFilled(false);
        btn_simpan.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_baru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baru.png"))); // NOI18N
        btn_baru.setBorder(null);
        btn_baru.setContentAreaFilled(false);
        btn_baru.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baruActionPerformed(evt);
            }
        });

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        btn_update.setBorder(null);
        btn_update.setContentAreaFilled(false);
        btn_update.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hapus.png"))); // NOI18N
        btn_hapus.setBorderPainted(false);
        btn_hapus.setContentAreaFilled(false);
        btn_hapus.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(btn_baru, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
                .addGap(236, 236, 236))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 330, 70));

        lbl_bk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N
        getContentPane().add(lbl_bk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void loadnik(){
    cmbNik.setSelectedIndex(0);
try
{
    //this.cmbNik.removeAllItems();

    java.sql.Connection con = Mohon.getkonek();
    Statement s = (Statement) con.createStatement();
    String sql ="SELECT * FROM anggota ORDER BY no";
    ResultSet r=s.executeQuery(sql);

    while (r.next()){
        cmbNik.addItem(r.getString("no"));
    }
    r.close();
    s.close();
} catch (SQLException e)
    {
        System.out.println(e);
    }
}
    private void tampilId(){
        int row = tbl_mohon.getRowCount();
        int col = tbl_mohon.getColumnCount();
        if(row==0){
            txtId.setText("1");
        } else {
        Object[] val =new Object[col];
        for (int k = 0; k < val.length - 1; k++) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j <col; j++) {
                    val[k] = tbl_mohon.getValueAt(i, 0);
                    String id = val[k].toString();
                    int ambil = Integer.parseInt(id.substring(0, 1))+1;
                    txtId.setText(String.valueOf(ambil));
                    }
            }
            }
        }
    }
    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed

}//GEN-LAST:event_txtNamaActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        int jawab = JOptionPane.showConfirmDialog(null, "Yakin Akan Menghapus Data?", "HAPUS DATA", JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION){
            moh.hapusdata(txtId.getText());
            moh.tampilData();
            btn_baruActionPerformed(evt);
        } else if (jawab == JOptionPane.NO_OPTION){
            btn_baruActionPerformed(evt);
        }
}//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String tampilan="yyyy-MM-dd";
        SimpleDateFormat df = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(df.format(jTglAju.getDate()));

String ktp = null,kk = null,slip = null;
if(optKTP.isSelected()){
    ktp ="Y";
}else{
    ktp="T";
}
if(optKK.isSelected()){
    kk ="Y";
}else{
    kk="T";
}
if(optSlip.isSelected()){
    slip ="Y";
}else{
    slip="T";
}

String stat=null;
if (optKK.isSelected() && optKTP.isSelected() && optSlip.isSelected()){
    stat = "Lengkap";
} else {
    stat="Pending";
}

String nik=null;
        int jawab = JOptionPane.showConfirmDialog(null, "Yakin Data Akan Diperbaharui?", "PERBAHARUI DATA", JOptionPane.YES_NO_OPTION);
        if(jawab == JOptionPane.YES_OPTION){
            moh.update(txtId.getText(), cmbNik.getSelectedItem().toString(), txtusia.getText(), txtSisa.getText(),
                tanggal, txtJumlah.getText(), ktp, kk, slip, stat);
            moh.tampilData();
            btn_baruActionPerformed(evt);
        } else if (jawab == JOptionPane.NO_OPTION){
            btn_baruActionPerformed(evt);
        }
}//GEN-LAST:event_btn_updateActionPerformed

    private void btn_baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baruActionPerformed
        // TODO add your handling code here:
        cmbNik.setSelectedItem(false);
        txtNama.setText("");
        txtusia.setText("");
        txtGaji.setText("");
        txtSisa.setText("");
        jTglAju.setCalendar(null);
        txtJumlah.setText("");
        optKK.setSelected(false);
        optKTP.setSelected(false);
        optSlip.setSelected(false);
        moh.tampilData();
        tampilId();
        loadnik();
}//GEN-LAST:event_btn_baruActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String tampilan="yyyy-MM-dd";
        SimpleDateFormat df = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(df.format(jTglAju.getDate()));

String ktp = null,kk = null,slip = null;
if(optKTP.isSelected()){
    ktp ="Y";
}else{
    ktp="T";
}
if(optKK.isSelected()){
    kk ="Y";
}else{
    kk="T";
}
if(optSlip.isSelected()){
    slip ="Y";
}else{
    slip="T";
}

String stat=null;
if (optKK.isSelected() && optKTP.isSelected() && optSlip.isSelected()){
    stat = "Lengkap";
} else {
    stat="Pending";
}
        moh.insert(txtId.getText(), cmbNik.getSelectedItem().toString(), txtusia.getText(), txtSisa.getText(),
                tanggal, txtJumlah.getText(), ktp, kk, slip, stat);
        btn_baruActionPerformed(evt);
}//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        dispose();
        //dashboard frm = new dashboard();
        //frm.setVisible(true);
}//GEN-LAST:event_btn_homeActionPerformed

    private void txtusiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusiaActionPerformed

    private void txt_cariCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_cariCaretUpdate
        // TODO add your handling code here:
        moh.cari(txt_cari.getText());
}//GEN-LAST:event_txt_cariCaretUpdate

    private void tbl_mohonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_mohonMouseClicked
        // TODO add your handling code here:
        int row         = tbl_mohon.getSelectedRow();
        String id       = tbl_mohon.getValueAt(row, 0).toString();
        String no       = tbl_mohon.getValueAt(row, 1).toString();
        String usia     = tbl_mohon.getValueAt(row, 2).toString();
        String sisa     = tbl_mohon.getValueAt(row, 3).toString();
        String tgl      = tbl_mohon.getValueAt(row, 4).toString();
        String jml      = tbl_mohon.getValueAt(row, 5).toString();
        String fcktp    = tbl_mohon.getValueAt(row, 6).toString();
        String fckk     = tbl_mohon.getValueAt(row, 7).toString();
        String fcslip   = tbl_mohon.getValueAt(row, 8).toString();
        String status   = tbl_mohon.getValueAt(row, 9).toString();


        txtId.setText(id);
        cmbNik.setSelectedItem(no);
        txtusia.setText(usia);
        int sisagaji = Integer.parseInt(sisa);
        int gaji = (int) (sisagaji / (2.5 / 100));
        txtGaji.setText(String.valueOf(gaji));
        txtSisa.setText(sisa);
        int iTahun = Integer.parseInt(tgl.substring(6,10));
        int iBulan = Integer.parseInt(tgl.substring(3,5))-1;
        int iTgl = Integer.parseInt(tgl.substring(0,2));

        Calendar cal = Calendar.getInstance();
        cal.set(iTahun,iBulan,iTgl);
        jTglAju.setDate(cal.getTime());
        txtJumlah.setText(jml);
        
        if (fcktp.equalsIgnoreCase("y")){
            optKTP.setSelected(true);
        }else{
            optKTP.setSelected(false);
        }
        if (fckk.equalsIgnoreCase("y")){
            optKK.setSelected(true);
        }else{
            optKK.setSelected(false);
        }
        if (fcslip.equalsIgnoreCase("y")){
            optSlip.setSelected(true);
        }else{
            optSlip.setSelected(false);
        }
        
}//GEN-LAST:event_tbl_mohonMouseClicked

    private void tbl_mohonCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbl_mohonCaretPositionChanged
        // TODO add your handling code here:
}//GEN-LAST:event_tbl_mohonCaretPositionChanged

    private void cmbNikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNikActionPerformed
        // TODO add your handling code here:
        
        int i=cmbNik.getSelectedIndex();
        if(i==-1){
            return;
        }
        try{
            String nama=(String) cmbNik.getSelectedItem();
            Connection c = (Connection) Konek.getkonek();
            Statement s=(Statement) c.createStatement();
            String sql="SELECT * FROM anggota WHERE no=?";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);
            p.setString(1, nama);
            ResultSet r=p.executeQuery();
            r.next();

            this.txtNama.setText(r.getString("nama"));
        String tgl = r.getString("tglLhr");
        int iTahun = Integer.parseInt(tgl.substring(0,4));
     
        Calendar cal = Calendar.getInstance();
        int now = cal.get(Calendar.YEAR);
        int usia = now - iTahun;
        txtusia.setText(String.valueOf(usia));

            this.txtGaji.setText(r.getString("gaji"));

            int gaji = Integer.parseInt(txtGaji.getText());
            int sisa = (int) (2.5 / 100 * gaji);
            txtSisa.setText(String.valueOf(sisa));
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cmbNikActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fMohon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_baru;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox cmbNik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jTglAju;
    private javax.swing.JLabel lbl_almt_an;
    private javax.swing.JLabel lbl_bk;
    private javax.swing.JLabel lbl_cari_an;
    private javax.swing.JLabel lbl_id_an;
    private javax.swing.JLabel lbl_nm_an;
    private javax.swing.JLabel lbl_nm_an1;
    private javax.swing.JLabel lbl_nm_an2;
    private javax.swing.JLabel lbl_nm_an3;
    private javax.swing.JLabel lbl_nm_an4;
    private javax.swing.JLabel lbl_tgl_lhr_an;
    private javax.swing.JCheckBox optKK;
    private javax.swing.JCheckBox optKTP;
    private javax.swing.JCheckBox optSlip;
    private javax.swing.JTable tbl_mohon;
    private javax.swing.JTextField txtGaji;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSisa;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txtusia;
    // End of variables declaration//GEN-END:variables

}
