/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12siakad;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class DBConnection {
    public Connection getConnection(){
        Connection con =null;
        try {
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_latihan","root","");
            JOptionPane.showMessageDialog(null,"Koneksi sukses");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
        }
        return con;
        
    }
    
}
