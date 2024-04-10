package com.uday.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginTDao {
	public boolean check(String uname,String pass) {
		String sql ="select * from teachers where uname=? and pass=?";
		String url="jdbc:mysql://localhost:3306/attendance";
		String username ="root";
		String password="password";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1,uname);
			st.setString(2, pass);
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		return false;
	}
}
