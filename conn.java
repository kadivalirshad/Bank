
package bank;

import java.sql.*;
public class conn {
Connection c;
Statement s;
conn()
{
  try {
	    Class.forName("com.mysql.jdbc.Driver");
	    c=DriverManager.getConnection("jdbc:mysql:///softtech","root","");
           
	    s=c.createStatement();
	  
      }
  catch(ClassNotFoundException | SQLException e)
  {
	System.out.print(e); 
  }
}
       
}
