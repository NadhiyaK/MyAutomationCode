package Selenium.testng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sql {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		//connection URL
		 // "jdbc:mysql://"+host+":"+port+"/databasename";
		
		
		// jdbc:mysql://+localhost+:+3306+"/qaclickacademy";
		
		//here qaclickacademy is the db name in mysql server - check mysql
		
		String host = "localhost";
		String port = "3306";
	Connection conn =	DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qaclickacademy", "root", "AyuAru@2410");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM EXAM_RESULTS WHERE STUDENT_ID <= 12 AND EXAM_SCORE > 80;");
		while(rs.next())
		{
			String name = rs.getString("first_name");
			int id =rs.getInt("student_id");
			int score = rs.getInt("exam_score");
			System.out.println(name);
			System.out.println(id);
			System.out.println(score);
		}
		
}
}
