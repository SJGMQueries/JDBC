import java.util.*;
import java.sql.*;
import java.io.*;
class UpdateOperation{
	public static void main(String[] args)throws Exception{
		Connection con = null;
		Statement st = null;
		Scanner scn=new Scanner(System.in);
		try{
		System.out.println("Enter existing employee id");
		int id=scn.nextInt();
		System.out.println("Enter new employee dept");
		String dept=scn.next();
		System.out.println("Enter  new employee salary");
		int salary=scn.nextInt();
		System.out.println("Enter  new employee name");
		String name=scn.next();
		System.out.println("Enter new employee sid");
		int sid=scn.nextInt();
		//connection
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dugu");
	    //statement obj
        st=con.createStatement();
		//prepare qry
		String qry="update employee set name='"+name+"',id="+sid+",dept='"+dept+"',salary="+salary+" where id="+id;
		System.out.println(qry);
		//execute the qry
		int result=st.executeUpdate(qry);
		
		System.out.println(result);
		
		if(result==0){
			System.out.println("RECORD UPDATION FAIL");
		}else{
	
			System.out.println("RECORD UPDATED SUCESSFULLY");
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
			
		
		
		