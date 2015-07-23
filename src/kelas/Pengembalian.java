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
 * @author owner
 */
public class Pengembalian extends Konek {

public Pengembalian(){
    try {
        super.cStatement();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error ==> "+e);
    }
}

public void otomatis(){
        String sql = "SELECT * FROM tbl_pinjam order by id_pinjam desc";
        try{
            ResultSet set = statement.executeQuery(sql);
            if (set.next()){
               int id_pinjam = Integer.parseInt(set.getString("id_pinjam"))+1;
            }
            else{
                int id_pinjam = 1;
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "error auto");
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
        JOptionPane.showMessageDialog(null, "Data GAGAL di Input karena ==> "+ex);
    }
    }

public void update(String id_angg, String nama_angg, String tempat_lahir_angg,
        String tanggal_lahir_angg, String jns_kel_angg, String almt_angg,
        String kerja_angg)
  {
      try
      {
          String sql="UPDATE tbl_daftarkembali SET id_pinjam='"+id_angg+"',"
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
                String sql="SELECT * FROM tbl_pinjam";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"id_pinjam","id_angg","id_buku","tgl_pinjam",""
                                + "tgl_hrus_kembali","tgl_kembali","denda"};
                modelPinjam.setColumnIdentifiers(kolom);


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
                String sql="SELECT * FROM tbl_pinjam WHERE id_angg like '"+caridata+"%'"
                        + "and id_buku like '%"+caridata+"%'";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"ID","NAMA","TMPT_LHR","TGL_LHR",""
                                + "JKEL","ALAMAT","PEKERJAAN"};
                modelPinjam.setColumnIdentifiers(kolom);
                while (set.next())
                {
                     //int id =set.getInt("id_angg");
                     String Id = set.getString("id_angg");
                     String Nm=set.getString("nama_angg");
                     String Tmpt_lhr=set.getString("tempat_lahir_angg");
                     String Tgl_lhr=set.getString("tanggal_lahir_angg");
                     String JKel=set.getString("jns_kel_angg");
                     String Almt=set.getString("almt_angg");
                     String kerja=set.getString("kerja_angg");

                     //id = Integer.parseInt(ID);
                     String[]data={Id,Nm,Tmpt_lhr,Tgl_lhr,JKel,Almt,kerja};
                     modelPinjam.addRow(data);
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
     public void cetakanggota()
  {
      try
      {
          HashMap parameters=new HashMap();
          String namafile="report/LaporanTransaksi.jasper";
          JasperPrint JPrint = JasperFillManager.fillReport(namafile, parameters,statement.getConnection());
          JasperViewer.viewReport(JPrint,false);
      }
      catch (Exception e)
      {
          JOptionPane.showMessageDialog(null, "Tidak Dapat Ditampilkan karena "+e);
      }
  }






}
