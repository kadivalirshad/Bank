/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;
import java.awt.event.*;
public class Transcations extends JFrame implements ActionListener {
  JLabel l1;
  JButton b1,b2,b3,b4,b5,b6,b7;
  public Transcations()
  {
	  setVisible(true);
	  setSize(600,600); 
          setDefaultCloseOperation(3);
	  setLayout(null);
	  setLocation(200,100);
	  getContentPane().setBackground(Color.white);
	  setTitle("Transaction");
	  
	  l1=new JLabel("Select Your Transaction");
	  l1.setFont(new Font("Couriar",Font.BOLD,25));
	  l1.setBounds(150, 50, 500, 40);
	  add(l1);
	  
	  b1=new JButton("DEPOSITE");
	  b1.setBounds(50, 150, 200, 30);
	  b1.setFont(new Font ("Couriar",Font.BOLD,20));
	  b1.setBackground(Color.black);
	  add(b1);
	  
	  b2=new JButton("CASH WITHDRAWL");
	  b2.setBounds(300, 150, 200, 30);
	  b2.setFont(new Font ("Couriar",Font.BOLD,20));
	  b2.setBackground(Color.black);
	  add(b2);  
	  
	  b3=new JButton("FAST CASH");
	  b3.setBounds(50, 250, 200, 30);
	  b3.setFont(new Font ("Couriar",Font.BOLD,20));
	  b3.setBackground(Color.black);
	  add(b3);
	  
	  b4=new JButton("MINI STATEMENT");
	  b4.setBounds(300, 250, 200, 30);
	  b4.setFont(new Font ("Couriar",Font.BOLD,20));
	  b4.setBackground(Color.black);
	  add(b4);
	  
	  b5=new JButton("PIN CHANGE");
	  b5.setBounds(50, 350, 200, 30);
	  b5.setFont(new Font ("Couriar",Font.BOLD,20));
	  b5.setBackground(Color.black);
	  add(b5);
	  
	  b6=new JButton("BALANCE ENQUIRY");
	  b6.setBounds(300, 350, 200, 30);
	  b6.setFont(new Font ("Couriar",Font.BOLD,20));
	  b6.setBackground(Color.black);
	  add(b6);
	  
	  b7=new JButton("EXIT");
	  b7.setBounds(170, 450, 200, 30);
	  b7.setFont(new Font ("Couriar",Font.BOLD,20));
	  b7.setBackground(Color.black);
	  add(b7);
	  
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  b3.addActionListener(this);
	  b4.addActionListener(this);
	  b5.addActionListener(this);
	  b6.addActionListener(this);
	  b7.addActionListener(this);
  }
  
	public static void main(String[] args) {
		
       new Transcations().setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			new Deposite().setVisible(true);
			setVisible(false);
		}	
		else if(e.getSource()==b2)
		{
			new Withdrow().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==b3)
		{
			new FastWithdrow().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==b4)
		{
			new login().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==b5)
		{
			new pin().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==b6)
		{
			String pinn=JOptionPane.showInputDialog("Enter pin");
			conn c1=new conn();
			try {
				 ResultSet rs=c1.s.executeQuery("SELECT balance FROM BANK1 ORDER BY pin='"+pinn+"' Desc limit 1");
				 if(rs.next())
				 {
					 String balance=rs.getNString("balance");
					 JOptionPane.showMessageDialog(null,"your Account Balance is:"+balance);
				 }
			}
			catch(Exception ef)
			{
				System.out.println(ef);
			}
		}
		else if(e.getSource()==b7)
		{
			System.exit(0);
		}
		
	}

}
