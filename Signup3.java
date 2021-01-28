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
import java.util.*;
public class Signup3 extends JFrame implements ActionListener {
  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
  JRadioButton r1,r2,r3,r4;
  JButton b1,b2;
  JCheckBox c1,c2,c3,c4,c5,c6,c7;
  JTextField t1;
  public Signup3()
  {
	  setVisible(true);
	  setSize(900,800);
          setDefaultCloseOperation(3);
	  setLocation(200,0);
	  setLayout(null);
	  getContentPane().setBackground(Color.white);
	  setTitle("Account Details");
	  
	  l1=new JLabel("Form No:");
		l1.setFont(new Font("Raleway",Font.BOLD,16));
		
		l2=new JLabel("Page 3:Account Details");
		l2.setFont(new Font("Raleway",Font.BOLD,20));
		
		l3=new JLabel("Account Type:");
		l3.setFont(new Font("Raleway",Font.BOLD,16));
		
		l4=new JLabel("Card Number:");
		l4.setFont(new Font("Raleway",Font.BOLD,16));
		
		l5=new JLabel("XXXX-XXXX-XXXX-4184:");
		l5.setFont(new Font("Raleway",Font.BOLD,16));
		
		l6=new JLabel("(Your 16 digit card Number)");
		l6.setFont(new Font("Raleway",Font.BOLD,12));
		
		l7=new JLabel("(It would appear on ATM card Cheque Book and Statement:)");
		l7.setFont(new Font("Raleway",Font.BOLD,12));
		
		l8=new JLabel("PIN:");
		l8.setFont(new Font("Raleway",Font.BOLD,16));
		
		l9=new JLabel("xxxx:");
		l9.setFont(new Font("Raleway",Font.BOLD,16));
		
		l10=new JLabel("(4 digit Password)");
		l10.setFont(new Font("Raleway",Font.BOLD,12));
		
		l11=new JLabel("Service Requared:");
		l11.setFont(new Font("Raleway",Font.BOLD,16));
	
		 b1=new JButton("Submit");
		   b1.setBounds(260, 650, 150, 30);
		   b1.setFont(new Font ("Couriar",Font.BOLD,16));
		   b1.setBackground(Color.black);
		   add(b1);
		 
		   b2=new JButton("Cancel");
		  b2.setBounds(420, 650, 150, 30);
		   b2.setFont(new Font ("Couriar",Font.BOLD,16));
		   b2.setBackground(Color.black);
		   add(b2);   
		   
		 c1=new JCheckBox("ATM CARD");
		 c1.setFont(new Font ("Couriar",Font.BOLD,15));
		 
		 c2=new JCheckBox("Internet Banking");
		 c2.setFont(new Font ("Couriar",Font.BOLD,15));
		 
		 c3=new JCheckBox("Mobile Banking");
		 c3.setFont(new Font ("Couriar",Font.BOLD,15));
		 
		 c4=new JCheckBox("EMAIL Alerts");
		 c4.setFont(new Font ("Couriar",Font.BOLD,15));
		 
		 c5=new JCheckBox("Cheque Book");
		 c5.setFont(new Font ("Couriar",Font.BOLD,15));
		 
		 c6=new JCheckBox("E-Statement");
		 c6.setFont(new Font ("Couriar",Font.BOLD,15));
		 
		 c7=new JCheckBox("I give a all Details are Correct and i accept Your Term And Condition");
		 c7.setFont(new Font ("Couriar",Font.BOLD,12));
		 
		 t1=new JTextField(15);
		 
		 l1.setBounds(700, 0, 100, 30);
		 add(l1);
		 
		 t1.setBounds(780, 0, 100, 30);
		 add(t1);
		 
		 l2.setBounds(360, 50, 600, 30);
		 add(l2);
		 
		 l3.setBounds(100, 100, 150, 30);
		 add(l3);
		 
		 r1=new JRadioButton("Saving Account");
		 r1.setFont(new Font ("Couriar",Font.BOLD,15));
		 r1.setBackground(Color.white);
		 r1.setBounds(105, 150, 200, 30);
		 add(r1);
		 
		 r2=new JRadioButton("Fix Deposite Account");
		 r2.setFont(new Font ("Couriar",Font.BOLD,15));
		 r2.setBackground(Color.white);
		 r2.setBounds(400, 150, 200, 30);
		 add(r2);
		 
		 r3=new JRadioButton("Current Account");
		 r3.setFont(new Font ("Couriar",Font.BOLD,15));
		 r3.setBackground(Color.white);
		 r3.setBounds(105, 200, 200, 30);
		 add(r3);
		 
		 r4=new JRadioButton("Recurring Deposite Account");
		 r4.setFont(new Font ("Couriar",Font.BOLD,15));
		 r4.setBackground(Color.white);
		 r4.setBounds(400, 200, 400, 30);
		 add(r4);
		 
		l4.setBounds(100, 250, 200, 30);
		add(l4);
		
		l5.setBounds(400, 250, 500, 30);
		add(l5);
		
		l6.setBounds(100, 280, 400, 15);
		add(l6);
		
		l7.setBounds(400, 280, 400, 15);
		add(l7);
		
		l8.setBounds(100, 320, 100, 30);
		add(l8);
		
		l9.setBounds(400, 320, 150, 30);
		add(l9);
		
		l10.setBounds(100, 350, 200, 15);
		add(l10);
		
		l11.setBounds(100, 400, 150, 30);
		add(l11);
		
		c1.setBounds(105, 450, 150, 20);
		c1.setBackground(Color.white);
		add(c1);
		
		c2.setBounds(400, 450, 150, 20);
		c2.setBackground(Color.white);
		add(c2);
		
		c3.setBounds(105, 500, 150, 20);
		c3.setBackground(Color.white);
		add(c3);
		
		c4.setBounds(400,500, 150, 20);
		c4.setBackground(Color.white);
		add(c4);
		
		c5.setBounds(105,550, 150, 20);
		c5.setBackground(Color.white);
		add(c5);
		
		c6.setBounds(400,550, 150, 20);
		c6.setBackground(Color.white);
		add(c6);
		
		c7.setBounds(100,600, 1000, 15);
		c7.setBackground(Color.white);
		add(c7);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
  }
	public static void main(String[] args) {
		
      new Signup3().setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
		
		String a="";
		if(r1.isSelected())
		{
			a="Saving Account";
		}
		else if(r2.isSelected())
		{
			a="Fix Deposite Account";
		}
		else if(r3.isSelected())
		{
			a="Current Account";
		}
		else if(r4.isSelected())
		{
			a="Recurring Deposite Account";
		}
		
	 String b=t1.getText();
	 String c="";
	 if(c1.isSelected())
	 {
		 c="ATM CARD";
	 }
	 else if(c2.isSelected())
     {
	   c="Internet Banking";
	 }
	 else if(c3.isSelected())
     {
	   c="Mobile Banking";
	 }
	 else if(c4.isSelected())
     {
	   c="EMAIL Alerts";
	 }
	 else if(c5.isSelected())
     {
	   c="Cheque Book";
	 }
	 else if(c6.isSelected())
     {
	   c="E-Statements";
	 }
	 
	 Random ram=new Random();
	long first=(ram.nextLong()%90000000L)+5040302098745344L;
	 long first1=Math.abs(first);
	 
	 long first2=(ram.nextLong()%90000L)+1000L;
	 long first3=Math.abs(first2); 
	try {
		  if(e.getSource()==b1)
		  {
		  if(b.equals(""))
		  {
			  JOptionPane.showMessageDialog(null, "All the Fields Requared");
		  }
		  else
		  {
			  conn c1=new conn();
			  String q="insert into Signup3 values('"+a+"','"+first1+"','"+first3+"','"+b+"','"+c+"')";
			  String p="insert into login values('"+first1+"','"+first3+"')";
			  c1.s.executeUpdate(q);
			  c1.s.executeUpdate(p);
			  JOptionPane.showMessageDialog(null,"card Number:"+first1+"\n"+"Pin:"+first3);
			  new Deposite().setVisible(true);
			  setVisible(false);
		  }
		 } 
		  else if(e.getSource()==b2)
		  {
			  System.exit(0);
		  }
		  
	    }
	catch(Exception ef)
	{
		System.out.println(ef);
	}
	 
	}

}

