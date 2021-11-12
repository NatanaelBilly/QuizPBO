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
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author natanael billy
 */
public class MainMenu {

    public MainMenu() {
        //frame
        JFrame Frame = new JFrame("Instagram");
        Frame.setSize(600, 800);

        //panel
        JPanel panel = new JPanel();
        panel.setSize(600, 800);
        panel.setBackground(new Color(201, 228, 197));
        
        JButton buttonPerekaman = new JButton("Login");
        buttonPerekaman.setBounds(200, 100, 150, 30);
        buttonPerekaman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                Frame.dispose();
            }
        });
        panel.add(buttonPerekaman);

        JButton buttonPencarian = new JButton("Register");
        buttonPencarian.setBounds(200, 150, 150, 30);
        buttonPencarian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Register();
                Frame.dispose();
            }
        });
        panel.add(buttonPencarian);

        JButton buttonExit = new JButton("Lihat Data");
        buttonExit.setBounds(200, 200, 150, 30);
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Frame.dispose();
            }
        });
        panel.add(buttonExit);
        
        //initialize panel dan frame
        panel.setLayout(null);
        panel.setVisible(true);
        Frame.add(panel);
        Frame.setLocationRelativeTo(null);
        Frame.setLayout(null);
        Frame.setVisible(true);
    }
}
