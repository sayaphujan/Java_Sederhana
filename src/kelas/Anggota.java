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
public class Anggota extends Konek{
public Anggota(){
    try {
        super.cStatement();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error ==> "+e);
    }
}

public void insert(String no, String nama, String tglLhr, String jnskel, String alamat, String gaji){
    try
    {
        String sql="INSERT INTO anggota (no, nama, tglLhr, jnskel, alamat, gaji)"
                    +"VALUES('"+no+"','"+nama+"','"+tglLhr+"','"+jnskel+"','"+alamat+"','"+gaji+"')";
        //semua perintah QUERY di Java hrus d apit tanda petik agar tidak d exekusi sebagai syntax java
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data BERHASIL di Simpan");
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Data GAGAL di Simpan karena ==> "+ex);
    }
}

public void update(String no, String nama, String tglLhr, String jnskel, String alamat, String gaji){
      try
      {
          String sql="UPDATE anggota SET no='"+no+"',nama='"+nama+"',tglLhr='"+tglLhr+"',jnskel='"+jnskel+"',alamat='"+alamat+"',gaji='"+gaji+"'"
                  + "WHERE no='"+no+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Berhasil di Perbaharui");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Perbaharui karena ==> "+x);
      }
  }

public DefaultTableModel modelAnggota= new DefaultTableModel();
 public void hapus()
 {
     int row = modelAnggota.getRowCount();
     for(int i=0;i<row;i++)
     {
         modelAnggota.removeRow(0);
     }
 }

 public void tampilData()
 {
     //String ID = null;
      hapus();
      try
       {
                String sql="SELECT * FROM anggota ORDER BY no ASC";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"NO","NAMA","TGL_LHR","JKEL","ALAMAT","GAJI"};
                modelAnggota.setColumnIdentifiers(kolom);
                
               while (set.next())
                {
                     String no = set.getString("no");
                     String nama=set.getString("nama");
                     String tglLhr=set.getString("tglLhr");
                     String xtgl = tglLhr.substring(8,10);
                     String xbulan = tglLhr.substring(5,7);
                     String xtahun = tglLhr.substring(0,4);
                     String tanggal = xtgl+"-"+xbulan+"-"+xtahun;
                     String jnskel=set.getString("jnskel");
                     String alamat=set.getString("alamat");
                     String gaji=set.getString("gaji");
                     
                     String[]data={no, nama, tanggal, jnskel, alamat, gaji};
                     modelAnggota.addRow(data);
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
                String sql="SELECT * FROM anggota WHERE no like '"+caridata+"%'"
                        + "and nama like '%"+caridata+"%'";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"NO","NAMA","TGL_LHR","JKEL","ALAMAT","GAJI"};
                modelAnggota.setColumnIdentifiers(kolom);
                while (set.next())
                {
                     String no = set.getString("no");
                     String nama=set.getString("nama");
                     String tglLhr=set.getString("tglLhr");
                     String xtgl = tglLhr.substring(8,10);
                     String xbulan = tglLhr.substring(5,7);
                     String xtahun = tglLhr.substring(0,4);
                     String tanggal = xtgl+"-"+xbulan+"-"+xtahun;
                     String jnskel=set.getString("jnskel");
                     String alamat=set.getString("alamat");
                     String gaji=set.getString("gaji");

                     String[]data={no, nama, tanggal, jnskel, alamat, gaji};
                     modelAnggota.addRow(data);
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
          String sql="DELETE FROM anggota WHERE no='"+delete+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Telah di Hapus");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Hapus karena ==> "+x);
      }
  }

  public void cetakanggota()
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
