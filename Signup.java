/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;

public  class Signup extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1;
	JComboBox c1,c2,c3;
	JRadioButton r1,r2,r3,r4,r5;
	 
	Random rm=new Random();
	long first4=(rm.nextLong()%9000L)+1000L;
	long first=Math.abs(first4);
	public  Signup()
	{
		setVisible(true);
                setDefaultCloseOperation(3);
		setSize(1000,500);
		getContentPane().setBackground(Color.white);
		setLocation(300,200);
		setLayout(null);
		Font font2=new Font("Courier",Font.BOLD,20);
		
		l1=new JLabel("Registration Application:"+first);
		Font font=new Font("Courier",Font.BOLD,30);
	     l1.setFont(font);
	     l1.setBounds(200, 10, 1000, 30);
	     add(l1);
	     l2=new JLabel("Page 1:Personal Details");
	     l2.setBounds(300, 40, 1000, 30);
	     l2.setFont(font2);
	     add(l2);
	     
	     l3=new JLabel("Name:");
	     l3.setBounds(50,100,200,20);
	     l3.setFont(font2);
	     add(l3);
	     
	     l4=new JLabel("Father Name:");
	     l4.setBounds(50,150,200,20);
	     l4.setFont(font2);
	     add(l4);
	     
	     t1=new JTextField(15);
	     t1.setBounds(300, 100, 500, 30);
	     add(t1);
	     
	     t2=new JTextField(15);
	     t2.setBounds(300, 150, 500, 30);
	     add(t2);
	     
	     l5=new JLabel("Date Of Birth:");
	     l5.setBounds(50,200,200,20);
	     l5.setFont(font2);
	     add(l5);
	     
	     l6=new JLabel("Date");
	     l6.setBounds(300,200,100,20);
	     l6.setFont(font2);
	     add(l6);
	    String date[]= {"1","2","3","4","5","6","7","8","9"};
	    c1=new JComboBox(date);
	    c1.setBackground(Color.white);
	    c1.setBounds(350, 203, 50, 20);
	    add(c1);
	     
	    l7=new JLabel("Month");
	     l7.setBounds(430,200,100,20);
	     l7.setFont(font2);
	     add(l7);
	     
	    String month[]= {"January","Febuary","March","April","June","July","Auguast","September","Octomber","November","December"};
	    c2= new JComboBox(month);
		c2.setBackground(Color.white);
	    c2.setBounds(500, 203, 100, 20);
	    add(c2);
	    
	    l8=new JLabel("Year");
	     l8.setBounds(630,200,100,20);
	     l8.setFont(font2);
	     add(l8);
	    
	    String year[]= {"1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007"};
		    c3= new JComboBox(year);
			c3.setBackground(Color.white);
		    c3.setBounds(700, 203, 100, 20);
		    add(c3); 
		    
		l9=new JLabel("Gender:");
	     l9.setBounds(50,240,100,20);
	     l9.setFont(font2);
	     add(l9);
	    
	    r1=new JRadioButton("Male");
	    r1.setFont(new Font("Couriar",Font.BOLD,14));
	    r1.setBackground(Color.white);
	    r1.setBounds(300, 240, 150, 20);
	    add(r1);
	    
	    r2=new JRadioButton("Female");
	    r2.setFont(new Font("Raleway",Font.BOLD,14));
	    r2.setBackground(Color.white);
	    r2.setBounds(500, 240, 150, 20);
	    add(r2);
	    
	    r3=new JRadioButton("Married");
	    r3.setFont(new Font("Raleway",Font.BOLD,14));
	    r3.setBackground(Color.white);
	    r3.setBounds(300, 330, 150, 20);
	    add(r3);
	    
	    r4=new JRadioButton("Unmarried");
	    r4.setFont(new Font("Raleway",Font.BOLD,14));
	    r4.setBackground(Color.white);
	    r4.setBounds(450, 330, 150, 20);
	    add(r4);
	    
	    r5=new JRadioButton("other");
	    r5.setFont(new Font("Raleway",Font.BOLD,14));
	    r5.setBackground(Color.white);
	    r5.setBounds(600, 330, 150, 20);
	    add(r5);
	    
	    l10=new JLabel("E-Mail:");
	    l10.setBounds(50,280,100,20);
		l10.setFont(font2);
		add(l10);
		
		t3=new JTextField(20);
		t3.setBounds(300, 280, 500, 30);
		add(t3);
		
		 
	    l11=new JLabel("Marital Status:");
	    l11.setBounds(50,330,200,20);
		l11.setFont(font2);
		add(l11);
		
		l12=new JLabel("Address:");
		l12.setBounds(50,370,200,20);
		l12.setFont(font2);
	    add(l12);
		
	    t4=new JTextField(20);
	    t4.setBounds(300, 370, 500, 30);
	    add(t4);
		
	    l13=new JLabel("City:");
		l13.setBounds(50,420,200,30);
		l13.setFont(font2);
	    add(l13); 
	    
	    t5=new JTextField(20);
	    t5.setBounds(300, 420, 500, 30);
	    add(t5);
	    
	    l14=new JLabel("Pin Code:");
		l14.setBounds(50,460,200,20);
		l14.setFont(font2);
	    add(l14);
	    
	    t6=new JTextField(20);
	    t6.setBounds(300, 460, 500, 30);
	    add(t6);
	    
	    l15=new JLabel("State:");
		l15.setBounds(50,500,200,20);
		l15.setFont(font2);
	    add(l15);
		
	    t7=new JTextField(20);
	    t7.setBounds(300, 500, 500, 30);
	    add(t7);
	    
	    b1=new JButton("Next");
	    b1.setBounds(700, 550, 100, 30);
	    b1.setFont(font2);
	    b1.setBackground(Color.black);
	    add(b1);
	    
	    b1.addActionListener(this);
	}

	public static void main(String[] args) {
	 	
       new Signup().setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
		String s1=t1.getText();
		String s2=t2.getText();
       String s3=(String)c1.getSelectedItem();
       String s4=(String)c2.getSelectedItem();
       String s5=(String)c3.getSelectedItem();
       String s6=null;
       if(r1.isSelected())
       {
    	   s6="Male";
       }	
       else  if(r2.isSelected())
       {
    	   s6="Female";
       }
       String s7=t3.getText();
       String s8="";
       if(r3.isSelected())
       {
    	   s8="Married";
       }  
       else if(r4.isSelected())
       {
    	   s8="UnMarried";
       }	   
       else if(r5.isSelected())
       {
    	   s8="Other";
       }	
       String s9=t4.getText();
       String s10=t5.getText();
       String s11=t6.getText();
       String s12=t7.getText();
     
     try {
    	    if(t7.getText().equals(""))
    	    {
    	    	JOptionPane.showMessageDialog(null,"All The fields are must");
    	    }
    	    else
    	    {
    	    	conn c1=new conn();
    	    	String q1;
                    q1 = "insert into Signup values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"')";
                     c1.s.executeUpdate(q1);
    	    	new Signup2().setVisible(true);
    	    	setVisible(false);
    	    }
    	    	
    	    
    	 
         }
     catch(Exception sp)
     {
    	System.out.println(sp); 
     }
	}

}
