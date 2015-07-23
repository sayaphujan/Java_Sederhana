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
 * @author Advan
 */
public class Kembali extends Konek{
public Kembali(){
    try {
        super.cStatement();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error ==> "+e);
    }
}

public void insert(String id_peminjaman, String Id_angg, String Id_Buku1,
         String Tanggal_Pinjam, String Tanggal_Harus_Kembali, String Tanggal_Kembali, String Denda)
    {
    try
    {
        String sql="INSERT INTO tbl_daftarkembali (id_pinjam, id_angg, id_buku, "
                    +"tgl_pinjam, tgl_hrus_kembali, tgl_kembali, denda)"
                    +"VALUES('"+id_peminjaman+"','"+Id_angg+"','"+Id_Buku1+"','"
                    + ""+Tanggal_Pinjam+"','"+Tanggal_Harus_Kembali+"','"+Tanggal_Kembali+"','"+Denda+"')";
                    //+ ""+kerja_angg+"')";
        //semua perintah QUERY di Java hrus d apit tanda petik agar tidak d exekusi sebagai syntax java
        statement.executeUpdate(sql);
        //JOptionPane.showMessageDialog(null, "Data BERHASIL Disimpan");
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Data GAGAL di Simpan karena ==> "+ex);
    }
    }

public void update(String id_angg, String nama_angg, String tempat_lahir_angg,
        String tanggal_lahir_angg, String jns_kel_angg, String almt_angg,
        String kerja_angg)
  {
      try
      {
          String sql="UPDATE tbl_kembali SET id_pinjam='"+id_angg+"',"
                  + "id_angg='"+nama_angg+"',id_buku='"+tempat_lahir_angg+"',"
                  + "tgl_pinjam='"+tanggal_lahir_angg+"',tgl_hrus_kembali='"+jns_kel_angg+"',"
                  + "tgl_kembali='"+almt_angg+"',denda='"+kerja_angg+"'"
                  + "WHERE id_pinjam='"+id_angg+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Berhasil di Perbaharui");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Perbaharui karena ==> "+x);
      }
  }

public DefaultTableModel modelKembali= new DefaultTableModel();
 public void hapus()
 {
     int row = modelKembali.getRowCount();
     for(int i=0;i<row;i++)
     {
         modelKembali.removeRow(0);
     }
 }

 public void tampilData()
 {
     //String ID = null;
      hapus();
      try
       {
                String sql="SELECT * FROM tbl_pinjam ORDER BY id_pinjam ASC";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"ID","ID_ANGG","ID_BUKU","TGL_PINJAM","TGL_HRUS_KEMB"};
                modelKembali.setColumnIdentifiers(kolom);

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
                     String Id = set.getString("id_pinjam");
                     String Angg = set.getString("id_angg");
                     String Buku=set.getString("id_buku");
                     String Pinjam =set.getString("tgl_pinjam");
                     String ztgl = Pinjam.substring(8,10);
                     String zbulan = Pinjam.substring(5,7);
                     String ztahun = Pinjam.substring(0,4);
                     String tPinjam = ztgl+"-"+zbulan+"-"+ztahun;
                     String HarusKembali=set.getString("tgl_hrus_kembali");
                     String ytgl = HarusKembali.substring(8,10);
                     String ybulan = HarusKembali.substring(5,7);
                     String ytahun = HarusKembali.substring(0,4);
                     String tHarus = ytgl+"-"+ybulan+"-"+ytahun;
                     //String Kembali=set.getString("tgl_kembali");
                     //String xtgl = Kembali.substring(8,10);
                     //String xbulan = Kembali.substring(5,7);
                     //String xtahun = Kembali.substring(0,4);
                     //String tKembali = xtgl+"-"+xbulan+"-"+xtahun;
                     

                     //id = Integer.parseInt(ID);
                     String[]data={Id, Angg, Buku, tPinjam, tHarus};
                     modelKembali.addRow(data);
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
                String sql="SELECT * FROM tbl_pinjam WHERE id_pinjam like '%"+caridata+"'"
                        + "&& id_pinjam like '%"+caridata+"%'";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"id_pinjam","id_angg","id_buku","tgl_pinjam",""
                                + "tgl_hrus_kembali"};
                modelKembali.setColumnIdentifiers(kolom);
                while (set.next())
                {
                      String Id = set.getString("id_pinjam");
                     String Angg = set.getString("id_angg");
                     String Buku=set.getString("id_buku");
                     String Pinjam =set.getString("tgl_pinjam");
                     String ztgl = Pinjam.substring(8,10);
                     String zbulan = Pinjam.substring(5,7);
                     String ztahun = Pinjam.substring(0,4);
                     String tPinjam = ztgl+"-"+zbulan+"-"+ztahun;
                     String HarusKembali=set.getString("tgl_hrus_kembali");
                     String ytgl = HarusKembali.substring(8,10);
                     String ybulan = HarusKembali.substring(5,7);
                     String ytahun = HarusKembali.substring(0,4);
                     String tHarus = ytgl+"-"+ybulan+"-"+ytahun;
                     //id = Integer.parseInt(ID);
                      String[]data={Id, Angg, Buku, tPinjam, tHarus};
                     modelKembali.addRow(data);
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
          String sql="DELETE FROM tbl_pinjam WHERE id_pinjam='"+delete+"'";
          statement.executeUpdate(sql);
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL Ditampilkan karena ==> "+x);
      }
  }

public DefaultTableModel LaporPinjam= new DefaultTableModel();
 public void laporhapus()
 {
     int row = LaporPinjam.getRowCount();
     for(int i=0;i<row;i++)
     {
         LaporPinjam.removeRow(0);
     }
}
     public void LaporData()
 {
     //String ID = null;
      laporhapus();
      try
       {
                String sql="SELECT * FROM tbl_daftarkembali";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"id_pinjam","id_angg","id_buku","tgl_pinjam",""
                                + "tgl_hrus_kembali","tgl_kembali","denda"};
                LaporPinjam.setColumnIdentifiers(kolom);


               while (set.next())
                {

                     String Id = set.getString("id_pinjam");
                     String Nm=set.getString("id_angg");
                     String Tmpt_lhr=set.getString("id_buku");
                     String Tgl_lhr=set.getString("tgl_pinjam");
                     String JKel=set.getString("tgl_hrus_kembali");
                     String Almt=set.getString("tgl_kembali");
                        String kerja=set.getString("denda");

                     //id = Integer.parseInt(ID);
                     String[]data={Id,Nm,Tmpt_lhr,Tgl_lhr,JKel,Almt, kerja};
                     LaporPinjam.addRow(data);
                 }
       }
       catch(Exception exc)
       {
         JOptionPane.showMessageDialog(null,"Data GAGAL Ditampilkan ==> "+exc);
       }
    }
}
