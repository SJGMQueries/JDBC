import java.util.*;
import java.sql.*;
import java.io.*;
public class SelectTest{
	public static void main(String[] args)throws Exception{
	// Register jdbc driver
   Class.forName("oracle.jdbc.driver.OracleDriver");
	//Estabilsh Connection
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dugu");
	//Create Statement object
   Statement st=con.createStatement();
	//Execute the querry
	ResultSet rs=st.executeQuery("SELECT * FROM EMPLOYEE");
	//Print db table records
	while(rs.next())
	{
		System.out.println("rs executed");
		System.out.println(rs.getString(1)+""+rs.getInt(2)+""+rs.getString(3)+""+rs.getInt(4));
	}
	// close all jdbc object
	rs.close();
	st.close();
	con.close();
	
	}
}
		
