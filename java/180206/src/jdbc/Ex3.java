package jdbc;

import java.sql.Connection;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex3 {
	
	public static void main(String[] args) {
		
		//idols테이블에 UPDATE
		//3번 아이돌의 이름을 ''로 변경
		
		//Connection, Statement 선언 및 초기화
		Connection con = null;
		Statement stmt = null;
		
		String sql = "UPDATE idols"
				+ " SET name='선미' "
				+ " WHERE no = 20";
		
		//try~catch~finally
		try {
			
			con = ConnectionUtil.getConnection("test");
			stmt = con.createStatement();
			
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result+"행 수정");
			
		} catch (Exception e) {
			//예외 발생 추적
			e.printStackTrace();
		} finally {
			
			try {
				if(stmt!=null) {
					stmt.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			try {
				if(con!=null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}//try~catch~finally end
		
		
	}//main() end

}//Ex3 end
