package app.com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.xdevapi.Statement;

public class StudentDao {

	public static boolean insertStudentToDB(Student st) {
		boolean f=false;
		// TODO Auto-generated method stub
		try {
		Connection con=CP.getConnection();
		String q="insert into chetan (Name,phonenumber,City) values (?,?,?)";
		//CallebaleStatement
		java.sql.CallableStatement cstmt= con.prepareCall(q);
		//set values
		//System.out.println(st.getStudentCity());
		cstmt.setString(1,st.getStudentName());
		cstmt.setString(2,st.getStudentPhone());
		 cstmt.setString(3,st.getStudentCity());
		// pstmt.setString(4,st.getStudentEmail());
		// System.out.println("hii");
		 //execute..
		 cstmt.executeUpdate();
		 f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	

	}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		Connection con=CP.getConnection();
		String q="delete from chetan where id=?";
		java.sql.CallableStatement cstmt =null;
		try {
			cstmt = con.prepareCall(q);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
		}
		boolean f=false;
		// TODO Auto-generated method stub
		try {
		cstmt.setInt(1,userId);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		//System.out.println(cstmt);
		try {
			int row= cstmt.executeUpdate();
			//System.out.println(row);
			f=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.getMessage();
		}
		return f;
		
	}

	 

	}
    
