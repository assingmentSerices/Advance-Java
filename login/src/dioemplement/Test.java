
package dioemplement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.add.user;
import com.add.util.DB_Connection;
import com.adda.app.dao.DaoInterface;

public class Test implements DaoInterface 
{
	private static final String INSERT_SQL = "INSERT INTO  id_pass(name,email,pass) VALUES(?,?,?)";
	private static final String UPDATE_SQL ="Update id_pass set email=? where id=?";
	private static final String SOFTDELETE_SQL="Update id_pass set status ='Inactive' where email=? and id=?";
	
	
	@Override
	public Boolean login(String email, String pass) 
	{
		final String SELECT_SQL = "SELECT * FROM  id_pass "; 
		Connection con = DB_Connection.getConnection();
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet rs =null;
		try {
			rs = stmt.executeQuery(SELECT_SQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while(rs.next())
			{
				if(rs.getString("email").hashCode()== email.hashCode() && rs.getString("pass").hashCode()== pass.hashCode())
				{
					return true; 	
				}			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
}

@Override
public Boolean Singup(user t1) {
	Connection con = DB_Connection.getConnection();
	PreparedStatement pstmt = null;
	try {
		pstmt = con.prepareStatement(INSERT_SQL);
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	try {
		pstmt.setString(1,t1.getUname());
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	try {
		pstmt.setString(2,t1.getUemail());
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	try {
		pstmt.setString(3,t1.getUpassword());
	} catch (SQLException e1) {
		e1.printStackTrace();
	}

	     try {
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("Duplicate Email....");
//			e.printStackTrace();
		}
	
	     return false;
}

@Override
public Boolean Update(int id, String mail) {
	Connection con = DB_Connection.getConnection();
	PreparedStatement pstmt = null;
	try {
		pstmt = con.prepareStatement(UPDATE_SQL);
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	try {
		pstmt.setString(1,mail);
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	try {
		pstmt.setInt(2,id);
	} catch (SQLException e1) {
		e1.printStackTrace();
		//System.out.println("hii");
	}
		     try {
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Duplicate Email....");
//			e.printStackTrace();
		}
	
	     return false;


	// TODO Auto-generated method stub

}

@Override
public Boolean Soft(int id, String mail) {
	Connection con = DB_Connection.getConnection();
	PreparedStatement pstmt = null;
	try {
		pstmt = con.prepareStatement(SOFTDELETE_SQL);
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	try {
		pstmt.setString(1,mail);
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	try {
		pstmt.setInt(2,id);
	} catch (SQLException e1) {
		e1.printStackTrace();
		//System.out.println("hii");
	}
		     try {
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Duplicate Email....");
//			e.printStackTrace();
		}
	
	     return false;
	

}

}