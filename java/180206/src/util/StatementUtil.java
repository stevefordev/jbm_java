package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementUtil {

	public static Statement getStatement(String user) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");

		String password = "1111";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = DriverManager.getConnection(url, user, password);

		return con.createStatement();
	}//getStatement(String user) end

	public static Statement getStatement() throws Exception {

		return getStatement("test");
	}//getStatement() end

}
