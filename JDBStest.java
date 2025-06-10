package xyz;

import java.sql.*;
import java.sql.Connection;

public class JDBStest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {     
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","1106");
			PreparedStatement pstmt=con.prepareStatement("INSERT INTO student (id,name) VALUES (?,?)");
			Object[][] Students= {
					{3301,"harinath"},
					{3302,"subhash"},
					{3303,"hruday"},
					{3304,"teja"},
					{3305,"ameen"},						
					{3306,"hari"}
			};
			for(Object[] student : Students) {
				pstmt.setInt(1,(int) student[0]);
				pstmt.setString(2,(String) student[1]);
				pstmt.executeUpdate();
			}
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM student");
			System.out.println("student list");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name"));
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
