package com.example.student;
import java.sql.*;  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Student2Application {

	public static void main(String[] args) {
		/*try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/http://localhost/studentpushpendra","root","");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from admin");  
			while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getInt(2));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  */
			  
		SpringApplication.run(Student2Application.class, args);
	}

}
