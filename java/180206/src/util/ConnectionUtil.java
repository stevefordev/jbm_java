package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getConnection(String user) throws ClassNotFoundException, SQLException {
		
		String password = "1111";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		return DriverManager.getConnection(url,user,password);
	}//getConnection() end

}//ConnectionUtil end
