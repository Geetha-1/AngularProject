package jdbc;

import java.sql.*;

public class JdbcEx 
{
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
		System.out.println("Connected..");
	}

}
