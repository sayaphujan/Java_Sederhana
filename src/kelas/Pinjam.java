/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kelas;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Pinjam extends Konek{
public Pinjam(){
    try {
        super.cStatement();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error ==> "+e);
    }
}

public void insert(String id_pinjam, String id_angg, String id_buku,
        String tgl_pinjam, String tgl_hrus_kembali){
    try
    {
        String sql="INSERT INTO tbl_pinjam (id_pinjam, id_angg, id_buku, tgl_pinjam, "
                    +"tgl_hrus_kembali)"
                    +"VALUES('"+id_pinjam+"','"+id_angg+"','"+id_buku+"','"+tgl_pinjam+"','"
                    + ""+tgl_hrus_kembali+"')";
        //semua perintah QUERY di Java hrus d apit tanda petik agar tidak d exekusi sebagai syntax java
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data BERHASIL di Simpan");
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Data GAGAL di Simpan karena ==> "+ex);
    }
}

public void update(String id_pinjam, String id_angg, String id_buku,
        String tgl_pinjam, String tgl_hrus_kembali){
    try
    {
          String sql="UPDATE tbl_pinjam SET id_pinjam='"+id_pinjam+"',"
                  + "id_angg='"+id_angg+"',id_buku='"+id_buku+"',"
                  + "tgl_pinjam='"+tgl_pinjam+"',tgl_hrus_kembali='"+tgl_hrus_kembali+"' "
                  + "WHERE id_pinjam='"+id_pinjam+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Berhasil di Perbaharui");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Perbaharui karena ==> "+x);
      }
}

public DefaultTableModel modelPinjam= new DefaultTableModel();
 public void hapus()
 {
     int row = modelPinjam.getRowCount();
     for(int i=0;i<row;i++)
     {
         modelPinjam.removeRow(0);
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
                String[] kolom ={"ID","ID_ANG","ID_BUKU","TGL_PINJAM","TGL_HRUS_KEMBALI"};
                modelPinjam.setColumnIdentifiers(kolom);


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
                     String Pinjam=set.getString("tgl_pinjam");
                     String xtgl = Pinjam.substring(8,10);
                     String xbulan = Pinjam.substring(5,7);
                     String xtahun = Pinjam.substring(0,4);
                     String tPinjam = xtgl+"-"+xbulan+"-"+xtahun;
                     String HarusKembali=set.getString("tgl_hrus_kembali");
                     String ytgl = HarusKembali.substring(8,10);
                     String ybulan = HarusKembali.substring(5,7);
                     String ytahun = HarusKembali.substring(0,4);
                     String tHarus = ytgl+"-"+ybulan+"-"+ytahun;

                     //id = Integer.parseInt(ID);
                     String[]data={Id, Angg, Buku, tPinjam, tHarus};
                     modelPinjam.addRow(data);
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
                String sql="SELECT * FROM tbl_pinjam WHERE id_pinjam like '%"+caridata+"%'"
                        + "or id_pinjam like '"+caridata+"&'";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"ID","ID_ANG","ID_BUKU","TGL_PINJAM","TGL_HRUS_KEMBALI"};
                modelPinjam.setColumnIdentifiers(kolom);


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
                     String Pinjam=set.getString("tgl_pinjam");
                     String xtgl = Pinjam.substring(8,10);
                     String xbulan = Pinjam.substring(5,7);
                     String xtahun = Pinjam.substring(0,4);
                     String tPinjam = xtgl+"-"+xbulan+"-"+xtahun;
                     String HarusKembali=set.getString("tgl_hrus_kembali");
                     String ytgl = HarusKembali.substring(8,10);
                     String ybulan = HarusKembali.substring(5,7);
                     String ytahun = HarusKembali.substring(0,4);
                     String tHarus = ytgl+"-"+ybulan+"-"+ytahun;

                     //id = Integer.parseInt(ID);
                     String[]data={Id, Angg, Buku, tPinjam, tHarus};
                     modelPinjam.addRow(data);
                 }
       }
       catch(Exception exc)
       {
         JOptionPane.showMessageDialog(null,"Data GAGAL Ditampilkan ==> "+exc);
       }
    }

public void hapusdata(String delete)
  {
      try
      {
          String sql="DELETE FROM tbl_pinjam WHERE id_pinjam='"+delete+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Telah di Hapus");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Hapus karena ==> "+x);
      }
  }

public void tampil_username() {
         //jComboBox1.addItem("");
     try {
            String sql = "select id_angg from tbl_pinjam";
            ResultSet set=statement.executeQuery(sql);
            while (set.next()) {
                 String Id = set.getString(1);
            }

        } catch (Exception x) {
             JOptionPane.showMessageDialog(null,"Data GAGAL di Hapus karena ==> "+x);
        }
    }
}

