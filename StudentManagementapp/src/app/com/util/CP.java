package app.com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	private static final String DB_URL="jdbc:mysql://localhost:3306/student";
	private static final String DB_UNAME="root";
	private static final String DB_PWD="chetan@2002";
	private static Connection con = null;
	
	public static Connection getConnection()
	{
		if(con==null)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 con = (Connection) DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}
	
}
