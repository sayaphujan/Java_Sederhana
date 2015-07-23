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
public class Kriteria extends Konek{
public Kriteria(){
    try {
        super.cStatement();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error ==> "+e);
    }
}

public void insert(String id, String kriteria){
    try
    {
        String sql="INSERT INTO kriteria (id, kriteria)"
                    +"VALUES('"+id+"','"+kriteria+"')";
        //semua perintah QUERY di Java hrus d apit tanda petik agar tidak d exekusi sebagai syntax java
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data BERHASIL di Simpan");
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Data GAGAL di Simpan karena ==> "+ex);
    }
}

public void update(String id, String kriteria){
      try
      {
          String sql="UPDATE kriteria SET id='"+id+"',kriteria='"+kriteria+"'"
                  + "WHERE id='"+id+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Berhasil di Perbaharui");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Perbaharui karena ==> "+x);
      }
  }

public DefaultTableModel modelKriteria= new DefaultTableModel();
 public void hapus()
 {
     int row = modelKriteria.getRowCount();
     for(int i=0;i<row;i++)
     {
         modelKriteria.removeRow(0);
     }
 }

 public void tampilData()
 {
     //String ID = null;
      hapus();
      try
       {
                String sql="SELECT mohon.no, mohon.usia, mohon.sisagaji, mohon.tglAjuan, mohon.jmlPinjam, mohon.status, anggota.gaji FROM  `mohon` , anggota WHERE anggota.no = mohon.no AND mohon.status!='Pending'";
                ResultSet set=statement.executeQuery(sql);
                Object[] kolom ={"NO","NIK","USIA","GAJI","SISA","TGL","JUMLAH","STATUS"};
                modelKriteria.setColumnIdentifiers(kolom);
                int id=1;

               while (set.next())
                {
                     int idMohon        = id++;
                     String no          = set.getString("no");
                     String usia        = set.getString("usia");
                     String gaji        = set.getString("gaji");
                     String sisa        = set.getString("sisagaji");
                     String tglAjuan    = set.getString("tglAjuan");
                     String xtgl        = tglAjuan.substring(8,10);
                     String xbulan      = tglAjuan.substring(5,7);
                     String xtahun      = tglAjuan.substring(0,4);
                     String tanggal     = xtgl+"-"+xbulan+"-"+xtahun;
                     String jumlah      = set.getString("jmlPinjam");
                     /*String ktp         = set.getString("fcktp");
                     String kk          = set.getString("fckk");
                     String slip        = set.getString("fcgaji");*/
                     String status      = set.getString("status");

                     Object[]data={idMohon, no, usia, gaji, sisa, tanggal, jumlah, status};
                     modelKriteria.addRow(data);
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
                String sql="SELECT * FROM mohon, anggota WHERE anggota.no=mohon.no AND mohon.no like '"+caridata+"%' and mohon.no like '%"+caridata+"%'";
                ResultSet set=statement.executeQuery(sql);
                Object[] kolom ={"NO","NIK","USIA","GAJI","SISA","TGL","JUMLAH","STATUS"};
                modelKriteria.setColumnIdentifiers(kolom);
                int id=1;

               while (set.next())
                {
                     int idMohon        = id++;
                     String no          = set.getString("no");
                     String usia        = set.getString("usia");
                     String gaji        = set.getString("gaji");
                     String sisa        = set.getString("sisagaji");
                     String tglAjuan    = set.getString("tglAjuan");
                     String xtgl        = tglAjuan.substring(8,10);
                     String xbulan      = tglAjuan.substring(5,7);
                     String xtahun      = tglAjuan.substring(0,4);
                     String tanggal     = xtgl+"-"+xbulan+"-"+xtahun;
                     String jumlah      = set.getString("jmlPinjam");
                     /*String ktp         = set.getString("fcktp");
                     String kk          = set.getString("fckk");
                     String slip        = set.getString("fcgaji");*/
                     String status      = set.getString("status");

                     Object[]data={idMohon, no, usia, gaji, sisa, tanggal, jumlah, status};
                     modelKriteria.addRow(data);
                 }
       }
       catch(Exception exc)
       {
         JOptionPane.showMessageDialog(null,"Data GAGAL Ditampilkan "+exc);
       }
    }

  public void cetakkriteria()
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
