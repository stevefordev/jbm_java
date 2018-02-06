package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex1 {
	public static void main(String[] args) {
		
		//필요한 객체 선언 및 초기화
		Connection con = null;
		Statement stmt = null;
		
		//SQL구문
		String sql = "DELETE idols WHERE no = 10";
		
		//결과
		int result = 0;
		
		try {
			//try구문은 속도가 느려지기 때문에
			//최소구문만(즉, 예외처리할 부분만)
			//작성합니다.
			
			con = ConnectionUtil.getConnection("test");
			
			stmt = con.createStatement();
			
			result = stmt.executeUpdate(sql);
			
		}catch(Exception e) {
			System.out.println("예외발생!");
		}finally {
			
			try {
				if(stmt!=null) {
					stmt.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}//try~catch 
			
			try {
				if(con!=null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}//try~catch
			
		}//try~catch~finally end
		
		/*
		 * con,rs,stmt은 반드시
		 * close()메서드 호출하여
		 * 반환해줘야 함
		 * 
		 */
		
		
		System.out.println(result+"개 삭제!");
		
	}//main() end
}//Ex1 end
