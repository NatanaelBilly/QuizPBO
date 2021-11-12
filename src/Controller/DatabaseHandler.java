/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.util.TimeZone;
/**
 *
 * @author natanael billy
 */
public class DatabaseHandler {

    public Connection con;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/sosmed";
//    private String url = "jdbc:mysql://localhost/sosmed?serverTimezone=" + TimeZone.getDefault().getID();
    private String username = "root";
    private String password = "";

    public Connection connectDB() {
        try {
            //Load JDBC Driver
            Class.forName(driver).newInstance();
            //Buat Object Connection
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getLocalizedMessage());
            JOptionPane.showMessageDialog(null, "Error Ocurred when connect" + ex);
        }
        return con;
    }

    public Connection disconnectDB() {
        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Ocurred when disconnect" + ex);
        }
        return con;
    }

}
