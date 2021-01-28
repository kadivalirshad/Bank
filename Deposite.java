/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Deposite extends JFrame implements ActionListener{
  JLabel l1,l2,l3;
  JTextField t1,t2;
  JButton b1,b2,b3;
  public Deposite()
  {
	  setVisible(true);
	  setSize(600,500);
          setDefaultCloseOperation(3);
	  setTitle("Deposite Balance");
	  setLocation(100,200);
	  getContentPane().setBackground(Color.white);
	  setLayout(null);
	 
	  l1=new JLabel("Pin");
	  l1.setFont(new Font("Couriar",Font.BOLD,16));
	  l1.setBounds(400, 10, 100, 30);
	  add(l1);
	 
	  t1=new JTextField(10);
	  t1.setBounds(450, 10, 100, 30);
	  add(t1);
	  
	  l2=new JLabel("ENTER AMOUNT YOU WANT");
	  l2.setFont(new Font("Couriar",Font.BOLD,25));
	  l2.setBounds(100, 60, 500, 30);
	  add(l2);
	  
	  l3=new JLabel("TO DEPOSITE");
	  l3.setFont(new Font("Couriar",Font.BOLD,25));
	  l3.setBounds(190, 100, 220, 30);
	  add(l3);
	  
	  t2=new JTextField(15);
	  t2.setBounds(150, 180, 250, 30);
	  add(t2);
	  
	  b1=new JButton("DEPOSITE");
	  b1.setBounds(120, 250, 150, 30);
	  b1.setFont(new Font ("Couriar",Font.BOLD,20));
	  b1.setBackground(Color.black);
	  add(b1);
	  
	  b2=new JButton("BACK");
	  b2.setBounds(270, 250, 150, 30);
	  b2.setFont(new Font ("Couriar",Font.BOLD,20));
	  b2.setBackground(Color.black);
	  add(b2);
	  
	  b3=new JButton("EXIT");
	  b3.setBounds(170, 300, 200, 30);
	  b3.setFont(new Font ("Couriar",Font.BOLD,20));
	  b3.setBackground(Color.black);
	  add(b3);
	  
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  b3.addActionListener(this);
	  
  }
	public static void main(String[] args) {
        new Deposite().setVisible(true);		

	}

	
	public void actionPerformed(ActionEvent e) {
		 double Balance =0;

                    
                   
		  String s1=t1.getText();
		  String s2=t2.getText();
		
                  if(e.getSource()==b1)
                  {
                      try{
                            conn c1=new conn();
                            
                            ResultSet rs=c1.s.executeQuery("select *from bank1 where pin="+s1);
                            Balance=rs.getDouble("Balace");
                            if(Balance==0)
                            {
                                c1.s.executeUpdate("insert into bank1 values('"+s1+"','"+s2+"',null,'"+s2+"')");
                            }    
                            if(rs.next())
                            {
                              
                            }    
                         }
                      catch(Exception ef)
                      {
                              
                      }    
                    
                  }
		  else if(e.getSource()==b2)
		  {
			  new Transcations().setVisible(true);
			  setVisible(false);
		  }
		  else if(e.getSource()==b3)
		  {
			  System.exit(0);
		  }
		
		
	}

}
