/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kelas;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Login extends Konek{
public Login()
{
        try
        {
            super.cStatement();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
}

 public int login(String password,String user)
 {
       String passwordmd5="";
       int cekLogin=0;
       try
       {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(password.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            passwordmd5 = number.toString(16);
            while (passwordmd5.length() < 32)
            {
                passwordmd5 = "0" + passwordmd5;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try
        {
               String sql="SELECT * FROM tbl_login WHERE passwd='"+passwordmd5+"' AND usr='"+user+"'";
               ResultSet set=statement.executeQuery(sql);
               if(set.next())
               {
                 cekLogin=1;
               }
        }
        catch(Exception exc)
        {
            System.err.println("gagal"+exc);
            System.exit(0);
        }
       return cekLogin;
  }
}
