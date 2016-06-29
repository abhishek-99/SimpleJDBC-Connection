package database;
import java.sql.*;
public class Mysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Connection con =null;
	Statement stmt = null;
		ResultSet rs=null;
	try {
		System.out.println("Enter username of database");
		java.util.Scanner input= new java.util.Scanner(System.in);
		String username=input.nextLine();
		System.out.println("Enter password of database");
		java.util.Scanner input1= new java.util.Scanner(System.in);
		String password =input1.nextLine();
		//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiu?user=abhishek&password=abhi");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiu?user="+username+"&password="+password);
		System.out.println("Connected to database successfully");
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from students");
		while(rs.next())
		{
		String id = rs.getString(1);
		String name=rs.getString(2);
		String deptid=rs.getString(3);
		System.out.println(id+" "+name+" "+deptid);
		}//end of while
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
