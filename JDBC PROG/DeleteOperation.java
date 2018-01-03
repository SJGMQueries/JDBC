import java.util.*;
import java.sql.*;
import java.io.*;
class DeleteOperation{
	public static void main(String[] args)throws Exception{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter employee id To Delete recors");
		int id=scn.nextInt();
		// connection
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dugu");
		//statement
		Statement st=con.createStatement();
		//prepared qry
		String qry="delete from employee where id="+id;
		//execute qry
		int result=st.executeUpdate(qry);
		if(result==0){
			System.out.println("record not found");
		}
		else{
			System.out.println(result+"no of record delete or found");
		}
		st.close();
		con.close();
	}
}
		