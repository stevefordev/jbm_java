package ex;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import util.StatementUtil;

public class Ex2 {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("검색할 아이돌 이름은?");
		
		String query = scan.nextLine();
		
		//구문객체
		Statement stmt = StatementUtil.getStatement();
		
		//SQL구문 작성
		String sql = "SELECT no,name,height,weight"
				+ " FROM idols"
				+ " WHERE name LIKE '%"+query+"%'";
		
		//구문수행후 ResultSet을 리턴받음
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int no = rs.getInt(1);
			String name = rs.getString(2);
			int height = rs.getInt(3);
			int weight = rs.getInt(4);
			
			System.out.println("번호 : " + no + 
					           " / 이름 : " + name +
					           " / 키 : " + height +
					           " / 몸무게 : " + weight);
		}//while end
		
	}//main() end

}//Ex2 end
