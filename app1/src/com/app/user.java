package com.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class user{
	
public user() {
}


private static final String URL="jdbc:mysql://localhost:3306/advdb";
private static final String User_Name="root";
private static final String User_password="chetan@2002";
private static final String INSERT_SQL="INSERT INTO user VALUES(200,'chetan',500)";
public static void main(String[] args) {
	//1 load  driver class
	Connection con=null;
	Statement stmt=null;
	int effectRow=-1;
	//2 get connection from database
	try {
		con=DriverManager.getConnection(URL,User_Name,User_password);
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	//3 Create java statement
	try {
		stmt=con.createStatement();
	}
	catch(SQLException e){
		e.printStackTrace();
	}
	//4 Execute Query
	try {
		effectRow=stmt.executeUpdate(INSERT_SQL);
	}
	catch(SQLException e1)
	{
		e1.printStackTrace();
	}
	//5 process result
	System.out.println("Rows effect"+effectRow);
	//6 close connection
	try
	{
		con.close();
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	System.out.println("chetan");
}
}