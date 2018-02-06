package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex4 {

	public static void main(String[] args) {

		// Connection,Statement,ResultSet
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT no,name "
				+ "FROM idols";

		try {
			
			con = ConnectionUtil.getConnection("test");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString(2);
				System.out.println("번호 : " +no+" / 이름 : "+name);
			}//while end
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}

			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {

			}
			
			try {
				if(con!=null) {
					con.close();
				}
			} catch (Exception e2) {
				
			}

		} // try~catch~finally end
		
		

	}// main() end

}// Ex4 end
