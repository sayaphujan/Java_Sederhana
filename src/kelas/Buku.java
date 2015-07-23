/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kelas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Administrator
 */
public class Buku extends Konek{
public Buku(){
    try {
        super.cStatement();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error ==> "+e);
    }
    }

public void insert(String id_buku, String kategori, String no_buku, String judul_buku,
        String pengarang, String penerbit, String thn_terbit,
        String juml_buku, String sumber){
    try
    {
        String sql="INSERT INTO tbl_buku (id_buku, kategori, no_buku, judul_buku,"
                + "pengarang, penerbit, thn_terbit, juml_buku, sumber)"
                    +"VALUES('"+id_buku+"','"+kategori+"','"+no_buku+"','"+judul_buku+"',"
                    + "'"+pengarang+"','"+penerbit+"','"+thn_terbit+"',"
                    + "'"+juml_buku+"','"+sumber+"')";
        //semua perintah QUERY di Java hrus d apit tanda petik agar tidak d exekusi sebagai syntax java
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data BERHASIL di Simpan");
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Data GAGAL di Simpan karena ==> "+ex);
    }
}

public void update(String id_buku, String kategori, String no_buku, String judul_buku,
        String pengarang, String penerbit, String thn_terbit,
        String juml_buku, String sumber)
  {
      try
      {
          String sql="UPDATE tbl_buku SET id_buku='"+id_buku+"',kategori='"+kategori+"',no_buku='"+no_buku+"',judul_buku='"+judul_buku+"',pengarang='"+pengarang+"',penerbit='"+penerbit+"',thn_terbit='"+thn_terbit+"',juml_buku='"+juml_buku+"',sumber='"+sumber+"' WHERE id_buku='"+id_buku+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Berhasil di Perbaharui");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Perbaharui karena ==> "+x);
      }
  }

public DefaultTableModel modelBuku= new DefaultTableModel();
 public void hapus()
 {
     int row = modelBuku.getRowCount();
     for(int i=0;i<row;i++)
     {
         modelBuku.removeRow(0);
     }
 }

 public void tampilData()
 {
     //String ID = null;
      hapus();
      try
       {
                String sql="SELECT * FROM tbl_buku ORDER BY id_buku ASC";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"KODE","KATEGORI","NO","JUDUL","PENGARANG",""
                                + "PENERBIT","TAHUN","JUML","SUMBER"};
                modelBuku.setColumnIdentifiers(kolom);


               while (set.next())
                {
                  /*ResultSet a = statement.getGeneratedKeys();
                  if (a.next()){
                  ResultSetMetaData rsmd = (ResultSetMetaData) a.getMetaData();
                  int colCount = rsmd.getColumnCount();
                  do{
                    for (int i=1;i<=colCount; i++){
                    String key = set.getString(i);
                    }
                  }
                    while (set.next());
                  } else {
                        JOptionPane.showMessageDialog(null, set);
                   }*/

                     //int id =set.getInt("id_angg");
                     String Id = set.getString("id_buku");
                     String Kat = set.getString("kategori");
                     String No=set.getString("no_buku");
                     String Judul=set.getString("judul_buku");
                     String Pengarang=set.getString("pengarang");
                     String Penerbit=set.getString("penerbit");
                     String Tahun=set.getString("thn_terbit");
                     String Jumlah=set.getString("juml_buku");
                     String Sumber=set.getString("sumber");

                     //id = Integer.parseInt(ID);
                     String[]data={Id, Kat, No, Judul, Pengarang, Penerbit, Tahun, Jumlah, Sumber};
                     modelBuku.addRow(data);
                 }
       }
       catch(Exception exc)
       {
         JOptionPane.showMessageDialog(null,"Data GAGAL Ditampilkan ==> "+exc);
       }
    }

 public void cari(String caridata)
 {
      hapus();
      try
       {
                String sql="SELECT * FROM tbl_buku WHERE judul_buku like '"+caridata+"%'"
                        + "&& judul_buku like '%"+caridata+"%'";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"KODE","KATEGORI","NO","JUDUL","PENGARANG",""
                                + "PENERBIT","TAHUN","JUML","SUMBER"};
                modelBuku.setColumnIdentifiers(kolom);
                while (set.next())
                {
                     //int id =set.getInt("id_angg");
                     String Id = set.getString("id_buku");
                     String Kat = set.getString("kategori");
                     String No=set.getString("no_buku");
                     String Judul=set.getString("judul_buku");
                     String Pengarang=set.getString("pengarang");
                     String Penerbit=set.getString("penerbit");
                     String Tahun=set.getString("thn_terbit");
                     String Jumlah=set.getString("juml_buku");
                     String Sumber=set.getString("sumber");

                     //id = Integer.parseInt(ID);
                     String[]data={Id, Kat, No, Judul, Pengarang, Penerbit, Tahun, Jumlah, Sumber};
                     modelBuku.addRow(data);
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
          String sql="DELETE FROM tbl_buku WHERE id_buku='"+delete+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Telah di Hapus");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Hapus karena ==> "+x);
      }
  }
 public void cetakbuku()
  {
      try
      {
          HashMap parameters=new HashMap();
          String namafile="report/LaporanBuku.jasper";
          JasperPrint JPrint = JasperFillManager.fillReport(namafile, parameters,statement.getConnection());
          JasperViewer.viewReport(JPrint,false);
      }
      catch (Exception e)
      {
          JOptionPane.showMessageDialog(null, "Tidak Dapat Ditampilkan karena "+e);
      }
  }

}
