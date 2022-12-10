package com.training.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.springmvc.model.Course;
import com.training.springmvc.model.Registration;

@Repository
public class HelloDAO {
	public int registration(Registration user) throws ClassNotFoundException {
		String insert = "INSERT INTO USERSINFO" +
				"(USER_NAME,PWD,FIRST_NAME,LAST_NAME,MOBILE_NO,EMAIL_ID,ADDRESS) VALUES" +
				"(?,?,?,?,?,?,?);";
		int result = 0;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try (Connection connection = DriverManager
					.getConnection("jdbc:oracle:thin:@localhost:1522:xe","sys as sysdba","Kumari@1");
			
			PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getFirstName());
			preparedStatement.setString(4, user.getLastName());
			preparedStatement.setLong(5, user.getMobileNo());
			preparedStatement.setString(6, user.getEmailId());
			preparedStatement.setString(7, user.getAddress());
			
//			System.out.println(preparedStatement);
			
			result = preparedStatement.executeUpdate();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	} 
	public boolean getUser(String user, String pwd) {
		
		boolean valid = false;	
	try {
	
		Connection con=getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from userinfo");
		while(rs.next()) {
			if(rs.getString(1).equalsIgnoreCase(user)&& rs.getString(2).equalsIgnoreCase(pwd)) {
				valid = true;
			}
			
		}
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return valid;
	}
	

	private Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1522:xe","sys as sysdba","Kumari@1"); 
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
		
public List<Course> getCourse() {
		
		List<Course> list = new ArrayList<Course>();
	try {
	
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1522:xe","sys as sysdba","Kumari@1"); 
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from course");
		
		while(rs.next()) {
			String id= rs.getString(1);
			String name= rs.getString(2);
			String desp= rs.getString(3);
			String fees = rs.getString(4);
			String res=rs.getString(5);
			Course c =new Course();
			c.setCourse_id(id);
			c.setC_name(name);
			c.setC_desp(desp);
			c.setC_fees(fees);
			c.setC_resource(res);
			list.add(c);

			}
		

		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return list;
	}
	
}
