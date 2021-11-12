/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Controller.*;
import Model.*;
/**
 *
 * @author natanael billy
 */
public class Register {

    public Register() {
        Method m=new Method();
        //frame
        JFrame Frame = new JFrame("Instagram");
        Frame.setSize(600, 800);

        //panel
        JPanel panel = new JPanel();
        panel.setSize(600, 800);
        panel.setBackground(new Color(201, 228, 197));

        //text field
        JTextField fieldEmail = new JTextField();
        fieldEmail.setBounds(120, 30, 200, 30);
        panel.add(fieldEmail);
        JTextField fieldNama = new JTextField();
        fieldNama.setBounds(120, 70, 200, 30);
        panel.add(fieldNama);

        //paswrod field
        JPasswordField password = new JPasswordField();
        password.setBounds(120, 110, 200, 30);
        panel.add(password);

        //combobox
        String[] kategori = {"Private Account", "Creator Account", "Business Account"};
        JComboBox cbKategori = new JComboBox(kategori);
        cbKategori.setBounds(120, 140, 100, 30);
        panel.add(cbKategori);

        //label
        JLabel labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(20, 30, 70, 30);
        panel.add(labelEmail);
        JLabel labelNama = new JLabel("Nama : ");
        labelNama.setBounds(20, 70, 70, 30);
        panel.add(labelNama);
        JLabel labelPassword = new JLabel("Password : ");
        labelPassword.setBounds(20, 110, 100, 30);
        panel.add(labelPassword);
        JLabel labelKategori = new JLabel("Kategori : ");
        labelKategori.setBounds(20, 140, 100, 30);
        panel.add(labelKategori);

        //Button
        JButton register = new JButton("Register");
        register.setBounds(30, 300, 150, 30);
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass=new String(password.getPassword());
                m.insertToDB(fieldNama.getText(),fieldEmail.getText(),pass,cbKategori.getSelectedIndex());
            }
        });
        panel.add(register);
        JButton back = new JButton("Back");
        back.setBounds(250, 300, 80, 30);
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
