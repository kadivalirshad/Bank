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
public class pin extends JFrame implements ActionListener{
  JLabel l1,l2,l3,l4;
  JTextField t1,t2,t3;
  JButton b1,b2;
  pin()
  {
	  setVisible(true);
	  setSize(600,500);
	  setLocation(200,100);
          setDefaultCloseOperation(3);
	  setLayout(null);
	  getContentPane().setBackground(Color.white);
	  
	  l4=new JLabel("CHANGE YOUR PIN");
	  l4.setBounds(100, 50, 300, 30);
	  l4.setFont(new Font("Couriar",Font.BOLD,25));
	  add(l4);
	  
	  l1=new JLabel("CURRENT PIN:");
	  l1.setFont(new Font("Couriar",Font.PLAIN,16));
	  l1.setBounds(50, 100, 150, 30);
	  add(l1);
	  
	  l2=new JLabel("NEW PIN:");
	  l2.setFont(new Font("Couriar",Font.PLAIN,16));
	  l2.setBounds(50, 200, 150, 30);
	  add(l2);
	  
	  l3=new JLabel("RE-ENTER PIN:");
	  l3.setFont(new Font("Couriar",Font.PLAIN,16));
	  l3.setBounds(50, 300, 150, 30);
	  add(l3);
	  
	  t1=new JTextField(10);
	  t1.setBounds(200, 100, 200, 30);
	  add(t1);
	  
	  t2=new JTextField(10);
	  t2.setBounds(200, 200, 200, 30);
	  add(t2);
	  
	  t3=new JTextField(10);
	  t3.setBounds(200, 300, 200, 30);
	  add(t3);
	  
	  b1=new JButton("SUBMIT");
	  b1.setBounds(100, 400, 150, 30);
	  b1.setFont(new Font ("Couriar",Font.BOLD,20));
	  b1.setBackground(Color.black);
	  add(b1);
	  
	  b2=new JButton("BACK");
	  b2.setBounds(270, 400, 150, 30);
	  b2.setFont(new Font ("Couriar",Font.BOLD,20));
	  b2.setBackground(Color.black);
	  add(b2);
	  
	 b1.addActionListener(this);
	 b2.addActionListener(this);
  }
	public static void main(String[] args) {
		new pin().setVisible(true);

	}

	
	public void actionPerformed(ActionEvent e) {
   try { 	
	 String a=t1.getText();
	 String b=t1.getText();
	 String c=t3.getText();
	 
	 if(e.getSource()==b1)
	 {
		 if(t1.getText().equals(""))
		 {
			 JOptionPane.showMessageDialog(null, "Enter Current pin");
		 }
		 if(t2.getText().equals(""))
		 {
			 JOptionPane.showMessageDialog(null, "Enter New pin");
		 }
		 if(t3.getText().equals(""))
		 {
			 JOptionPane.showMessageDialog(null, " Re-Enter new pin");
		 }
		 if(t2.getText().equals(t3.getText()))
		 {
			
			 conn c1=new conn();
			 String q1="update bank set pin ='"+b+"' where pin='"+a+"' ";
			 String q2="update login set pin ='"+b+"' where pin='"+a+"' ";
			 String q3="update Signup3 set pin ='"+b+"' where pin='"+a+"' ";
			 
			 c1.s.executeQuery(q1);
			 c1.s.executeQuery(q2);
			 c1.s.executeQuery(q3);
		     
			 JOptionPane.showMessageDialog(null, "Pin Change Succesfully");
			 new Transcations().setVisible(true);
			 setVisible(false);
		 
		 }	 
			 else
		 {
			 JOptionPane.showMessageDialog(null, "Pin is not Match");
		 }
		 
	}	 

	 if(e.getSource()==b2)
	 {
		 new Transcations().setVisible(true);
		 setVisible(false);
	 } 
} 
 
	 catch(Exception ef)
		{
			
		}	 

	
}

}
