import java.util.*;
import java.io.*;
import java.sql.*;
class SelectTest4{
	public static void main(String[] args)throws Exception{
		//Read i/p from keyboard
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Employee Name To Delete From Record");
		String name=scn.nextLine();
		// register & connection
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dugu");
		//statement
		Statement st=con.createStatement();
		//prepared qry
		String qry = "delete from employeerecord where name ="+name;
		System.out.println(qry);
		//execute
		int result=st.executeUpdate(qry);
		if(result==0){
			System.out.println("data is not found");
		}
		else{
			System.out.println("data is deleted");
		}
	}	 
}