package dao;
import java.sql.*;

public class Dao {
	
	public static Connection getConnection()  {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/struts", "root", "a3spl");
			 System.out.println("Connection Successfull");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		 return con;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dao.getConnection();
	}
}
