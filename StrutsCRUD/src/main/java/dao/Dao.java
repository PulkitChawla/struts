package dao;
import java.sql.*;

import bean.Login;
import bean.Register;

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
	
	public String register(Register reg) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		con = Dao.getConnection();
		int i = 0;
		String sql = "insert into reg(name,email,pwd,cpwd,phone,country,gender) values(?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, reg.getName());
			ps.setString(2, reg.getEmail());
			ps.setString(3, reg.getPwd());
			ps.setString(4, reg.getCpwd());
			ps.setString(5, reg.getPhone());
			ps.setString(6, reg.getCountry());
			ps.setString(7, reg.getGender());
			i = ps.executeUpdate();
			if(i>0) {
				System.out.println("Registration Successfull");
			}
			else {
				System.out.println("Data not inserted");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	public String login(Login login) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		con = Dao.getConnection();
		int i = 0;
		String sql = "select * from reg where email=? and pwd=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, login.getEmail());
			ps.setString(2, login.getPwd());
			rs = ps.executeQuery();
			if (rs.next()) {
				login = new Login();
				login.setEmail(rs.getString("email"));
				login.setPwd(rs.getString("pwd"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	
//	public static void main(String ar[]) {
//		Dao.getConnection();
//	}
}
