/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kelas;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Konek {
    protected java.sql.Statement statement;
    protected Connection connection;
    private Properties myPanel;
    private String driver,database,user,password,dbHost,dbPort,dbDatabase;
    //konstruktor
    public Konek()
    {
        try
        {
            myPanel = new Properties();
            myPanel.load(new FileInputStream("konek.txt"));
            driver = myPanel.getProperty("DBDriver");
            dbHost=myPanel.getProperty("DBHost");
            dbPort=myPanel.getProperty("DBPort");
            dbDatabase=myPanel.getProperty("DBDatabase");
            database ="jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbDatabase;
            user = myPanel.getProperty("DBUsername");
            password =myPanel.getProperty("DBPassword");
            Class.forName(driver);
            connection=(Connection)DriverManager.getConnection(database,user,password);
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,"Error"+ e);
        }
    }
    public void cStatement() throws SQLException
    {
         statement = connection.createStatement();
    }

    private static Connection konek;
    public static Connection getkonek()
    {
        if(konek == null){
            try
            {
                String url = new String();
                String user = new String();
                String password = new String();
                url="jdbc:mysql://localhost:3306/kopkar";
                user="root";
                password="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konek = (Connection) DriverManager.getConnection(url,user,password);
            }catch(SQLException k)
                {
                    System.out.println("Gagal Tersambung ke Database");
                }
        }
    return konek;
    }
}
