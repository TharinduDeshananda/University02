package com.company;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Frame1 {

    Frame1(){
        JFrame frame1=new JFrame("University Management System");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(480,600);
        frame1.setResizable(false);
        JPanel panel1=(JPanel)frame1.getContentPane();
        frame1.setLayout(null);


        JLabel signin=new JLabel("Sign In");
        JLabel login=new JLabel("Log in");
        JLabel username=new JLabel("User Name");
        JLabel password=new JLabel("Password");
        JLabel username2=new JLabel("User Name");
        JLabel password2=new JLabel("Password");
        JLabel repassword=new JLabel("Re Type Password");

        JButton bsignin=new JButton("Sign In");
        JButton blogin=new JButton("Log In");

        JTextField tusername=new JTextField();
        JTextField tpassword=new JTextField();
        JTextField tusername2=new JTextField();
        JTextField tpassword2=new JTextField();
        JTextField trepassword=new JTextField();

        panel1.add(signin); panel1.add(login); panel1.add(username); panel1.add(password); panel1.add(username2); panel1.add(password2); panel1.add(repassword);
        panel1.add(bsignin); panel1.add(blogin); panel1.add(tusername); panel1.add(tpassword); panel1.add(tusername2); panel1.add(tpassword2); panel1.add(trepassword);

        signin.setBounds(20,200,100,30);
        username.setBounds(30,80,100,30);
        tusername.setBounds(260,80,200,30);
        password.setBounds(30,120,100,30);
        tpassword.setBounds(260,120,200,30);

        login.setBounds(20,40,100,30);
        username2.setBounds(30,240,100,30);
        tusername2.setBounds(260,240,200,30);
        password2.setBounds(30,280,100,30);
        tpassword2.setBounds(260,280,200,30);
        repassword.setBounds(30,320,100,30);
        trepassword.setBounds(260,320,200,30);

        bsignin.setBounds(200,200,80,30);
        blogin.setBounds(200,40,80,30);

        frame1.setVisible(true);

        //log in
        bsignin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                  if(tusername2.getText().equals("")||tpassword2.getText().equals("")||trepassword.getText().equals("")){
                      JFrame tempframe=new JFrame();
                      JOptionPane.showMessageDialog(tempframe,"Enter the values in the fields","Alert",JOptionPane.WARNING_MESSAGE);
                      return;

                  }
            


            }

        });

        blogin.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){


            }

        });




    }

}
