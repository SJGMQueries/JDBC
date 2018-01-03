import java.util.*;
import java.io.*;
import java.sql.*;
class EmployeeTest{
	public static void main(String[] args)throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dugu");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next()){
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
		}
	rs.close();
	st.close();
	con.close();
	}
}	