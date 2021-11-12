/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.sql.Statement;
import Model.*;
import java.sql.Types;

/**
 *
 * @author natanael billy
 */
public class Method {

    DatabaseHandler con = new DatabaseHandler();

    public void insertToDB(String nama,String email,String password, int idKategori) {
        con.connectDB();
        String query = "INSERT INTO user VALUES (?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.con.prepareStatement(query);
            stmt.setNull(1, Types.INTEGER);
            stmt.setString(2, nama);
            stmt.setString(3,email);
            stmt.setString(4,password);
            stmt.setInt(5, idKategori);
            stmt.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Ocurred when insert" + ex);
        }
    }
    
    public void updateDB(User user){
        con.connectDB();
        String query= "UPDATE user SET nama='"+user.getName()+"',"
                +"email='"+user.getEmail()+"',"
                +"password='"+user.getPassword()+"',"
                +"idCategory='"+user.getId_category()+"',"
                +"WHERE id='" + user.getId() + "'";
         try {
            Statement stmt = con.con.createStatement();
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Update success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update Failed");
            e.printStackTrace();
        }
    }
    
    public void deleteUser(User user){
         con.connectDB();
         String query="DELETE from user WHERE id = '"+user.getId()+"';";
          try {
            Statement stmt = con.con.createStatement();
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "delete success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "delete Failed");
            e.printStackTrace();
        }
    }
}
