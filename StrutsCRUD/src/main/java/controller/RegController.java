package controller;
import dao.Dao;
import java.sql.*;

public class RegController {
	Connection con=Dao.getConnection();
	public int register(String name, String email, String pass,String cpwd, String phone) throws Exception {
		int i = 0;
		try {
			String sql = "INSERT INTO REG VALUES (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, pass);
			ps.setString(4, cpwd);
			ps.setString(5, phone);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return i;
		} finally {
			if (con != null) {
				con.close();
			}
		}
	}
}
