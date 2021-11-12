/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author natanael billy
 */
public class Login {
    public Login(){
        //frame
        JFrame Frame = new JFrame("Instagram");
        Frame.setSize(600, 800);

        //panel
        JPanel panel = new JPanel();
        panel.setSize(600, 800);
        panel.setBackground(new Color(201, 228, 197));
        
        //text field
         JTextField fieldEmail = new JTextField();
        fieldEmail.setBounds(100, 30, 200, 30);
        panel.add(fieldEmail);
        JTextField fieldPassword = new JTextField();
        fieldPassword.setBounds(100, 70, 200, 30);
        panel.add(fieldPassword);

        //label
        JLabel labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(20, 30, 70, 30);
        panel.add(labelEmail);
        JLabel labelPassword = new JLabel("Password : ");
        labelPassword.setBounds(20, 70, 70, 30);
        panel.add(labelPassword);
        
        //Button
        JButton login = new JButton("Login");
        login.setBounds(30, 300, 80, 30);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        panel.add(login);
        JButton back = new JButton("Back");
        back.setBounds(150, 300, 80, 30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new MainMenu();
               Frame.dispose();
            }
        });
        panel.add(back);
        
        //initialize panel dan frame
        panel.setLayout(null);
        panel.setVisible(true);
        Frame.add(panel);
        Frame.setLocationRelativeTo(null);
        Frame.setLayout(null);
        Frame.setVisible(true);
    }
    
}
