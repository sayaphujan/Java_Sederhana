/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kelas;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Mohon extends Konek{
public Mohon(){
    try {
        super.cStatement();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error ==> "+e);
    }
}

public void insert(String idMohon, String no, String usia, String sisagaji, String tglAjuan, String jmlPinjam, String fcktp, String fckk, String fcgaji, String status){
    try
    {
        String sql="INSERT INTO mohon (idMohon, no, usia, sisagaji, tglAjuan, jmlPinjam, fcktp, fckk, fcgaji, status)"
                    +"VALUES('"+idMohon+"','"+no+"','"+usia+"','"+sisagaji+"','"+tglAjuan+"','"+jmlPinjam+"','"+fcktp+"','"+fckk+"','"+fcgaji+"','"+status+"')";
        //semua perintah QUERY di Java hrus d apit tanda petik agar tidak d exekusi sebagai syntax java
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data BERHASIL di Simpan");
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Data GAGAL di Simpan karena ==> "+ex);
    }
}

public void update(String idMohon, String no, String usia, String sisagaji, String tglAjuan, String jmlPinjam, String fcktp, String fckk, String fcgaji, String status){
      try
      {
          String sql="UPDATE mohon SET idMohon='"+idMohon+"',no='"+no+"',usia='"+usia+"',sisagaji='"+sisagaji+"',tglAjuan='"+tglAjuan+"',jmlPinjam='"+jmlPinjam+"',fcktp='"+fcktp+"',fckk='"+fckk+"',fcgaji='"+fcgaji+"',status='"+status+"'"
                  + "WHERE idMohon='"+idMohon+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Berhasil di Perbaharui");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Perbaharui karena ==> "+x);
      }
  }

public DefaultTableModel modelMohon= new DefaultTableModel();
 public void hapus()
 {
     int row = modelMohon.getRowCount();
     for(int i=0;i<row;i++)
     {
         modelMohon.removeRow(0);
     }
 }

 public void tampilData()
 {
     //String ID = null;
      hapus();
      try
       {
                String sql="SELECT * FROM mohon ORDER BY idMohon ASC";
                ResultSet set=statement.executeQuery(sql);
                Object[] kolom ={"NO","NIK","USIA","SISA","TGL","JUMLAH","FCKTP","FCKK","FCGAJI","STATUS"};
                modelMohon.setColumnIdentifiers(kolom);
                int id=1;
               while (set.next())
                {
                     int idMohon        = id++;
                     String no          = set.getString("no");
                     String usia        = set.getString("usia");
                     String sisa        = set.getString("sisagaji");
                     String tglAjuan    = set.getString("tglAjuan");
                     String xtgl        = tglAjuan.substring(8,10);
                     String xbulan      = tglAjuan.substring(5,7);
                     String xtahun      = tglAjuan.substring(0,4);
                     String tanggal     = xtgl+"-"+xbulan+"-"+xtahun;
                     String jumlah      = set.getString("jmlPinjam");
                     String ktp         = set.getString("fcktp");
                     String kk          = set.getString("fckk");
                     String slip        = set.getString("fcgaji");
                     String status      = set.getString("status");
                     
                     Object[]data={idMohon, no, usia, sisa, tanggal, jumlah, ktp, kk, slip, status};
                     modelMohon.addRow(data);
                 }
       }
       catch(Exception exc)
       {
           JOptionPane.showMessageDialog(null, "Data GAGAL di Tampilkan karena ==> "+exc);
       }
    }

public void cari(String caridata)
 {
      hapus();
      try
       {
                String sql="SELECT * FROM mohon WHERE no like '"+caridata+"%'"
                        + "and nama like '%"+caridata+"%'";
                ResultSet set=statement.executeQuery(sql);
                Object[] kolom ={"NO","NIK","USIA","SISA","TGL","JUMLAH","FCKTP","FCKK","FCGAJI","STATUS"};
                modelMohon.setColumnIdentifiers(kolom);
                int id=1;
               while (set.next())
                {
                     int idMohon        = id++;
                     String no          = set.getString("no");
                     String usia        = set.getString("usia");
                     String sisa        = set.getString("sisagaji");
                     String tglAjuan    = set.getString("tglAjuan");
                     String xtgl        = tglAjuan.substring(8,10);
                     String xbulan      = tglAjuan.substring(5,7);
                     String xtahun      = tglAjuan.substring(0,4);
                     String tanggal     = xtgl+"-"+xbulan+"-"+xtahun;
                     String jumlah      = set.getString("jmlPinjam");
                     String ktp         = set.getString("fcktp");
                     String kk          = set.getString("fckk");
                     String slip        = set.getString("fcgaji");
                     String status      = set.getString("status");

                     Object[]data={idMohon, no, usia, sisa, tanggal, jumlah, ktp, kk, slip, status};
                     modelMohon.addRow(data);
                 }
       }
       catch(Exception exc)
       {
         JOptionPane.showMessageDialog(null,"Data GAGAL Ditampilkan "+exc);
       }
    }

public void hapusdata(String delete)
  {
      try
      {
          String sql="DELETE FROM mohon WHERE no='"+delete+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Telah di Hapus");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Hapus karena ==> "+x);
      }
  }

  public void cetakmohon()
  {
  /*    try
      {
          HashMap parameters=new HashMap();
          String namafile="report/LaporanAng.jasper";
          JasperPrint JPrint = JasperFillManager.fillReport(namafile, parameters,statement.getConnection());
          JasperViewer.viewReport(JPrint,false);
      }
      catch (Exception e)
      {
          JOptionPane.showMessageDialog(null, "Tidak Dapat Ditampilkan karena "+e);
      }*/
  }
}
