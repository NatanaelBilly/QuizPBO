/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Method;
import Model.User;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Controller.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author natanael billy
 */
public class UpdateProfil {

    public UpdateProfil(User user) {
        Method m = new Method();
        //frame
        JFrame Frame = new JFrame("Instagram");
        Frame.setSize(600, 800);

        //panel
        JPanel panel = new JPanel();
        panel.setSize(600, 800);
        panel.setBackground(new Color(201, 228, 197));

        //text field
        JTextField fieldEmail = new JTextField(user.getEmail());
        fieldEmail.setBounds(120, 30, 200, 30);
        panel.add(fieldEmail);
        JTextField fieldNama = new JTextField(user.getName());
        fieldNama.setBounds(120, 50, 200, 30);
        panel.add(fieldNama);

        //paswrod field
        JPasswordField password = new JPasswordField(user.getPassword());
        password.setBounds(120, 90, 200, 30);
        panel.add(password);

        //combobox
        String[] kategori = {"Private Account", "Creator Account", "Business Account"};
        JComboBox cbKategori = new JComboBox(kategori);
        cbKategori.setBounds(120, 130, 100, 30);
        panel.add(cbKategori);

        //label
        JLabel labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(20, 30, 70, 30);
        panel.add(labelEmail);
        JLabel labelNama = new JLabel("Nama : ");
        labelNama.setBounds(20, 50, 70, 30);
        panel.add(labelNama);
        JLabel labelPassword = new JLabel("Password : ");
        labelNama.setBounds(20, 90, 100, 30);
        panel.add(labelNama);
        JLabel labelKategori = new JLabel("Kategori : ");
        labelNama.setBounds(20, 130, 100, 30);
        panel.add(labelNama);

        //Button
        JButton update = new JButton("Update");
        update.setBounds(30, 300, 80, 30);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass=new String(password.getPassword());
                User userUpdate = new User(user.getId(), fieldNama.getText(), fieldEmail.getText(),pass, cbKategori.getSelectedIndex());
            }
        });
        panel.add(update);

        JButton delete = new JButton("Delete");
        delete.setBounds(150, 300, 80, 30);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.deleteUser(user);
            }
        });
        panel.add(update);

        JButton back = new JButton("Back");
        back.setBounds(300, 300, 80, 30);
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
