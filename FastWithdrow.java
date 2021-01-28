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

public class FastWithdrow  extends JFrame implements ActionListener {
 JLabel l1,l2;
 JButton b1,b2,b3,b4,b5,b6,b7;
 JTextField t1;
  public FastWithdrow()
  {
	  setSize(600,500);
	  setLocation(200,100);
          setDefaultCloseOperation(3);
	  getContentPane().setBackground(Color.white);
	  setLayout(null);
	  
	  l1=new JLabel("Enter Pin");
	  l1.setBounds(400, 10, 100, 30);
	  l1.setFont(new Font("Couriar",Font.BOLD,14));
	  add(l1);
	  
	  l2=new JLabel("SELECT WITHDROWL AMOUNT");
	  l2.setBounds(100, 50, 350, 30);
	  l2.setFont(new Font("Couriar",Font.BOLD,20));
	  add(l2);
	  
	  t1=new JTextField(5);
	  t1.setBounds(470, 10, 100, 30);
	  add(t1);
	  
	  
	  b1=new JButton("RS 100");
	  b1.setBounds(50, 150, 150, 30);
	  b1.setFont(new Font ("Couriar",Font.BOLD,20));
	  b1.setBackground(Color.black);
	  add(b1);
	  
	  
	  b2=new JButton("RS 500");
	  b2.setBounds(300, 150, 150, 30);
	  b2.setFont(new Font ("Couriar",Font.BOLD,20));
	  b2.setBackground(Color.black);
	  add(b2);
	  
	  
	  b3=new JButton("RS 1000");
	  b3.setBounds(50, 250, 150, 30);
	  b3.setFont(new Font ("Couriar",Font.BOLD,20));
	  b3.setBackground(Color.black);
	  add(b3);
	  
	  
	  b4=new JButton("RS 2000");
	  b4.setBounds(300, 250, 150, 30);
	  b4.setFont(new Font ("Couriar",Font.BOLD,20));
	  b4.setBackground(Color.black);
	  add(b4);
	  
	  
	  b5=new JButton("5000");
	  b5.setBounds(50, 350, 150, 30);
	  b5.setFont(new Font ("Couriar",Font.BOLD,20));
	  b5.setBackground(Color.black);
	  add(b5);
	  
	  
	  b6=new JButton("10000");
	  b6.setBounds(300, 350, 150, 30);
	  b6.setFont(new Font ("Couriar",Font.BOLD,20));
	  b6.setBackground(Color.black);
	  add(b6);
	  
	  
	  b7=new JButton("EXIT");
	  b7.setBounds(180, 420, 150, 30);
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
		new FastWithdrow().setVisible(true);

	}


	public void actionPerformed(ActionEvent e) {
		String a=t1.getText();
		double balance=0;
                
                     
		try {
		       if(a.equals(""))
                       {
                         JOptionPane.showMessageDialog(null, "Enter pin");
                       }   
                      else {
                       if(e.getSource()==b1)
			 {
				 conn c1=new conn();
				 ResultSet rs=c1.s.executeQuery("select *from bank where pin='"+a+"' ");
				 
				 if(rs.next())
				 {
					 String pin=rs.getString("pin");
					 balance=rs.getDouble("balance");
					 balance-=100;
					 String q1="insert into bank values('"+pin+"',null,100,'"+balance+"')";
					 c1.s.executeQuery(q1);
				 }
				JOptionPane.showMessageDialog(null, "Rs 100 Withdrowl Succesfull");
				new Transcations().setVisible(true);
				setVisible(false);
			 }
			 
			 else if(e.getSource()==b2)
			 {
				 conn c1=new conn();
				 ResultSet rs=c1.s.executeQuery("select *from bank where pin='"+a+"' ");
				 
				 if(rs.next())
				 {
					 String pin=rs.getString("pin");
					 balance=rs.getDouble("balance");
					 balance-=500;
					 String q1="insert into bank values('"+pin+"',null,500,'"+balance+"')";
					 c1.s.executeQuery(q1);
				 }
				JOptionPane.showMessageDialog(null, "Rs 500 Withdrowl Succesfull");
				new Transcations().setVisible(true);
				setVisible(false);
			 } 
			 else if(e.getSource()==b3)
			 {
				 conn c1=new conn();
				 ResultSet rs=c1.s.executeQuery("select *from bank where pin='"+a+"' ");
				 
				 if(rs.next())
				 {
					 String pin=rs.getString("pin");
					 balance=rs.getDouble("balance");
					 balance-=1000;
					 String q1="insert into bank values('"+pin+"',null,1000,'"+balance+"')";
					 c1.s.executeQuery(q1);
				 }
				JOptionPane.showMessageDialog(null, "Rs 1000 Withdrowl Succesfull");
				new Transcations().setVisible(true);
				setVisible(false);
			 }
			 else if(e.getSource()==b4)
			 {
				 conn c1=new conn();
				 ResultSet rs=c1.s.executeQuery("select *from bank where pin='"+a+"' ");
				 
				 if(rs.next())
				 {
					 String pin=rs.getString("pin");
					 balance=rs.getDouble("balance");
					 balance-=2000;
					 String q1="insert into bank values('"+pin+"',null,2000,'"+balance+"')";
					 c1.s.executeQuery(q1);
				 }
				JOptionPane.showMessageDialog(null, "Rs 2000 Withdrowl Succesfull");
				new Transcations().setVisible(true);
				setVisible(false);
			 }
			 else if(e.getSource()==b5)
			 {
				 conn c1=new conn();
				 ResultSet rs=c1.s.executeQuery("select *from bank where pin='"+a+"' ");
				 
				 if(rs.next())
				 {
					 String pin=rs.getString("pin");
					 balance=rs.getDouble("balance");
					 balance-=5000;
					 String q1="insert into bank values('"+pin+"',null,5000,'"+balance+"')";
					 c1.s.executeQuery(q1);
				 }
				JOptionPane.showMessageDialog(null, "Rs 5000 Withdrowl Succesfull");
				new Transcations().setVisible(true);
				setVisible(false);
			 }
			 else if(e.getSource()==b6)
			 {
				 conn c1=new conn();
				 ResultSet rs=c1.s.executeQuery("select *from bank where pin='"+a+"' ");
				 
				 if(rs.next())
				 {
					 String pin=rs.getString("pin");
					 balance=rs.getDouble("balance");
					 balance-=10000;
					 String q1="insert into bank values('"+pin+"',null,10000,'"+balance+"')";
					 c1.s.executeQuery(q1);
				 }
				JOptionPane.showMessageDialog(null, "Rs 10000 Withdrowl Succesfull");
				new Transcations().setVisible(true);
				setVisible(false);
			 }
			 else if(e.getSource()==b7)
			 {
				new Transcations().setVisible(true);
				setVisible(false);
			 }
                       } 
		}
	  catch(Exception ef)
		{
		  System.out.println(ef);
		}
		
		
	}

}
