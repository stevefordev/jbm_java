package jdbc;

import java.sql.Connection;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex2 {
	
	public static void main(String[] args) {
		
		//con,stmt 선언 및 초기화
		Statement stmt = null;
		Connection con = null;
		
		String sql = "INSERT INTO groups(no,name,debut_date)"
				+ " VALUES(groups_seq.nextval,'카라','2007-03-29')";
		
		int result = 0;
		
		try {
			
			con = ConnectionUtil.getConnection("test");
			
			stmt = con.createStatement();
			
			result = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			
			//익셉션 발생을 알 수 있음(개발용)
			e.printStackTrace();
			
		} finally {
			
			try {
				if(stmt!=null) {
					stmt.close();
				}//if end
			} catch (Exception e2) {
				
			}//try~catch end
			
			try {
				if(con!=null) {
					con.close();
				}//if end
			} catch (Exception e2) {
				
			}//try~catch end
			
		}//try~catch~finally end
		
		System.out.println(result+"개 입력");
		
	}//main() end

}//Ex2 end
