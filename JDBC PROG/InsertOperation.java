import java.util.*;
import java.sql.*;
import java.io.*;
class InsertOperation{
	public static void main(String[] args)throws Exception{
		Connection con = null;
		Statement st = null;
		Scanner scn=new Scanner(System.in);
		try{
		System.out.println("Enter employee name");
		String name=scn.next();
		System.out.println("Enter employee id");
		int id=scn.nextInt();
		System.out.println("Enter employee dept");
		String dept=scn.next();
		System.out.println("Enter employee salary");
		int salary=scn.nextInt();
		//connection
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dugu");
	    //statement obj
        st=con.createStatement();
		//prepare qry
		String qry="insert into employee values('"+name+"',"+id+",'"+dept+"',"+salary+")";
		System.out.println(qry);
		//execute the qry
		int result=st.executeUpdate(qry);
		System.out.println(result);
		
		if(result==0){
			System.out.println("RECORD INSERTION FAIL");
		}else{
	
			System.out.println("RECORD INSERTED");
			}
		}//try
		catch(ClassNotFoundException cnf){}
		catch(SQLException sf){}
		catch(Exception e){}
		finally{
		st.close();
		con.close();
		}
	}
}
			
		
		
		