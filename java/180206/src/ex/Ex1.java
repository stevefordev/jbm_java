package ex;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import util.StatementUtil;

public class Ex1 {
	
	public static void main(String[] args) throws Exception {
		
		//스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("검색할 부서번호?");
		
		//부서번호 입력받음
		String departmentId = scan.nextLine();
		
		//구문객체
		Statement stmt = StatementUtil.getStatement("hr");
		
		//SQL구문 작성
		String sql = "SELECT employee_id, first_name, last_name"
				+ " FROM employees"
				+ " WHERE department_id = "+departmentId;
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int no = rs.getInt("employee_id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			
			System.out.println("사번 : " + no +" / 성명 : "
			                    + firstName +" " + lastName);
			
		}//while end
		
	}//main() end

}//Ex1 end
