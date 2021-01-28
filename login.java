
package bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public  class  login extends JFrame  implements ActionListener {
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2,b3;
	 login()
	{
		setSize(500,500);
                setDefaultCloseOperation(3);
		setTitle("ATM SYSTEM");
		setVisible(true);
		setLayout(null);
		 l1=new JLabel("WELCOME TO MK5 ATM");
		 l1.setBounds(100, 0, 300, 50);
	     Font font=new Font("Courier",Font.BOLD,20);
	     l1.setFont(font);
		 add(l1); 
		l2=new JLabel("CARD NUMBER:");
		l2.setBounds(50,50,150,50);
		l2.setFont(font);
		add(l2);
		t1=new JTextField(20);
		t1.setBounds(200, 60, 200, 30);
		add(t1);
		l3=new JLabel("PIN:");
		l3.setBounds(100, 100, 100, 50);
		l3.setFont(font);
		add(l3);
		t2=new JTextField(6);
		t2.setBounds(200, 110, 200, 30);
		add(t2);
		b1=new JButton("Login");
		b2=new JButton("Clear");
		b3=new JButton("Sign Up");
		b1.setBounds(160, 200, 100, 30);
		b2.setBounds(270, 200, 100, 30);
		b3.setBounds(200, 250, 100, 30);
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		getContentPane().setBackground(Color.white);
	}
   public static void main(String[] args) {
		
     new login().setVisible(true);
	}


public void actionPerformed(ActionEvent e) {
	
	try{
		  conn c1=new conn();
		  String a=t1.getText();
		  String b=t2.getText();
		  String q="select *from login where cardno='"+a+"' and pin ='"+b+"' ";
		  ResultSet rs = c1.s.executeQuery(q);  
		  if(e.getSource()==b1)
		  {
			  if(rs.next())
			  {
				  new Transcations().setVisible(true);
				  setVisible(false);
			  }
			  else {
				   JOptionPane.showMessageDialog(null,"Incorrect CardNumber  or Password"); 
			     }
		  }
		  else if(e.getSource()==b2){
			       t1.setText("");
			       t2.setText("");
		         }
		  else if(e.getSource()==b3) {
			    new Signup().setVisible(true);
			    setVisible(false);
		           }
	}  
	catch(Exception ef)
	{
	  System.out.println("not properly Work");
	}
}

}

