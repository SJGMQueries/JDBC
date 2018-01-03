import java.util.*;
import java.io.*;
import java.sql.*;
class SelectTest2{
public static void main(String[] args) throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dugu");
	Statement st= con.createStatement();
	ResultSet rs=st.executeQuery("SELECT * FROM EMPLOYEERECORD");
	
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
	}
	rs.close();
	st.close();
	con.close();
  }
}
	

