/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Signup2 extends JFrame implements ActionListener{
 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
 JTextField t1,t2,t3,t4;
JRadioButton r1,r2,r3,r4;
 JComboBox c1,c2,c3,c4;
 JButton b1;
 public Signup2()
 {
	 setVisible(true);
	 setSize(1000,700);
	 setLocation(200,100);
         setDefaultCloseOperation(3);
	 setTitle("Personal Details");
	 setLayout(null);
	 getContentPane().setBackground(Color.white);
	l1=new JLabel("Form No");
	l1.setFont(new Font("Raleway",Font.BOLD,16));
	
	l2=new JLabel("Page 2:Additional Details");
	l2.setFont(new Font("Raleway",Font.BOLD,16));
	
	l3=new JLabel("Relligion:");
	l3.setFont(new Font("Raleway",Font.BOLD,16));
	
	l4=new JLabel("Category:");
	l4.setFont(new Font("Raleway",Font.BOLD,16));
	
	l5=new JLabel("Income:");
	l5.setFont(new Font("Raleway",Font.BOLD,16));
	
	l6=new JLabel("Educational");
	l6.setFont(new Font("Raleway",Font.BOLD,16));
	
	l7=new JLabel("Qualification:");
	l7.setFont(new Font("Raleway",Font.BOLD,16));
	
	l8=new JLabel("Occupation:");
	l8.setFont(new Font("Raleway",Font.BOLD,16));
	
	l9=new JLabel("PAN Number:");
	l9.setFont(new Font("Raleway",Font.BOLD,16));
	
	l10=new JLabel("Aadhar Number:");
	l10.setFont(new Font("Raleway",Font.BOLD,16));
	
	l11=new JLabel("Senior Citizen:");
	l11.setFont(new Font("Raleway",Font.BOLD,16));
	
	l12=new JLabel("Existing Account:");
	l12.setFont(new Font("Raleway",Font.BOLD,16));
	
    t1=new JTextField(15);
    t2=new JTextField(15);
    t3=new JTextField(15);
    t4=new JTextField(15);
   
   String rg[]= {"muslim","Hindu","sikh","isai"};
   c1= new JComboBox(rg);
   c1.setBackground(Color.white);
	
   String ct[]= {"Jonaral","OBC","SC","ST"};
   c2=new JComboBox(ct);
   c2.setBackground(Color.white);
   
   String eq[]= {"Post Graguate","Graguate","Master","None"};
   c3=new JComboBox(eq);
   c3.setBackground(Color.white);
   
   String op[]= {"Student","Business","Worker","Labour"};
   c4=new JComboBox(op);
   c4.setBackground(Color.white);
   
   r1=new JRadioButton("yes");
   r1.setFont(new Font("Couriar",Font.BOLD,16));
   r1.setBackground(Color.white);

   r2=new JRadioButton("no");
   r2.setFont(new Font("Couriar",Font.BOLD,16));
   r2.setBackground(Color.white);
   
   r3=new JRadioButton("yes");
   r3.setFont(new Font("Couriar",Font.BOLD,16));
   r3.setBackground(Color.white);
   
   r4=new JRadioButton("No");
   r4.setFont(new Font("Couriar",Font.BOLD,16));
   r4.setBackground(Color.white);
   
   b1=new JButton("Next");
   b1.setBounds(700, 550, 100, 30);
   b1.setFont(new Font ("Couriar",Font.BOLD,16));
   b1.setBackground(Color.black);
   add(b1);
   
   l1.setBounds(800, 5, 150, 20);
   add(l1);
   
   t1.setBounds(880, 5, 100, 20);
   add(t1);
   
   l2.setBounds(400, 20, 1000, 30);
   l2.setFont(new Font("Couriar",Font.BOLD,20));
   add(l2);
   
   l3.setBounds(150, 60, 150, 30);
   add(l3);
   
   c1.setBounds(300, 60, 500, 30);
   add(c1);
   
   l4.setBounds(150, 100, 150, 30);
   add(l4);
   
   c2.setBounds(300, 100, 500, 30);
   add(c2);
   
   l5.setBounds(150, 150, 150, 30);
   add(l5);
   
   t2.setBounds(300, 150, 500, 30);
   add(t2);
   
   l6.setBounds(150, 200, 150, 30);
   add(l6);
   l7.setBounds(150, 220, 150, 30);
   add(l7);
   
   c3.setBounds(300, 210, 500, 30);
   add(c3);
   
   l8.setBounds(150, 260, 150, 30);
   add(l8);
   
   
   c4.setBounds(300, 260, 500, 30);
   add(c4);  
   
   l9.setBounds(150, 300, 150, 30);
   add(l9);
   
   t3.setBounds(300, 300, 500, 30);
   add(t3);
   
   l10.setBounds(150, 350, 150, 30);
   add(l10);
   
   t4.setBounds(300, 350, 500, 30);
   add(t4);
   
   l11.setBounds(150, 400, 150, 30);
   add(l11);
   
   r1.setBounds(400, 400, 150, 30);
   add(r1);
   
   r2.setBounds(550, 400, 150, 30);
   add(r2);
   
   l12.setBounds(150, 450, 150, 30);
   add(l12);
   
   r3.setBounds(400,450, 150, 30);
   add(r3);
   
   r4.setBounds(550, 450, 150, 30);
   add(r4);
   getContentPane().setBackground(Color.white);
   b1.addActionListener(this);
 }
	public static void main(String[] args) {
		
		new Signup2().setVisible(true);

	}

	
 @Override
	public void actionPerformed(ActionEvent e) {
		
	   String a=(String)c1.getSelectedItem();
	   String b=(String)c2.getSelectedItem();
	   String c=(String)c3.getSelectedItem();
	   String d=(String)c4.getSelectedItem();
	   String f=t1.getText();
	   String g=t2.getText();
	   String i=t3.getText();
	   String j=t4.getText();
	   String h="";
	   if(r1.isSelected())
	   {
		   h="Yes";
	   }
	   else if(r2.isSelected())
	   {
		   h="no";
	   }
           String k="";
	   if(r3.isSelected())
	   {
		   k="Yes";
	   }	   
	   else if(r4.isSelected())
	   {
		   k="no";
	   }
	  try {
		    if(t4.getText().equals(""))
		    {
		    	JOptionPane.showMessageDialog(null, "All the Fields Be Must");
		    }
		    else
		    {
		    	conn c1=new conn();
		    	String q1="insert into Signup2 values('"+a+"','"+b+"','"+f+"','"+c+"','"+d+"','"+g+"','"+i+"','"+j+"','"+h+"','"+k+"')";
    	    	c1.s.executeUpdate(q1);
    	    	new Signup3().setVisible(true);
    	    	setVisible(false);
    	    	
		    }
	      } 
	  catch(Exception ef)
	  {
		System.out.println(ef);  
	  }
	}

}
