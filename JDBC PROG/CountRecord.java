import java.util.*;
import java.io.*;
import java.sql.*;
public class CountRecord{
	public static void main(String[] args)throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dugu");
    Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select count(*) from employee");
	while(rs.next()){
		System.out.println("no of record:"+rs.getInt(1));
	}
	rs.close();
	st.close();
	con.close();
	}
}
