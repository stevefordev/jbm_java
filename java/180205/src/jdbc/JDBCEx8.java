package jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import util.StatementUtil;

public class JDBCEx8 {

  public static void main(String[] args) throws Exception {

    System.out.println("부서번호를 입력하세요.");

    Scanner scan = new Scanner(System.in);
    
    //만약 10이라고 입력하면
    // 10번 부서 사람들이 전부 출력
    
    int departmentId = scan.nextInt();
    
    String sql = "SELECT employee_id, first_name, last_name FROM employees WHERE department_id=" + departmentId;
    
    Statement stmt = StatementUtil.getStatement("hr");
    ResultSet rs = stmt.executeQuery(sql);
    
    while (rs.next()) {
      // int no = rs.getInt("no");
      int no = rs.getInt(1);

      // String name = rs.getString("name");
      String first = rs.getString(2);

      String last = rs.getString(3);

      String result = String.format("사번:%s, 성명:%s %s", no, first, last);
      System.out.println(result);
    } // while() end
  }
}
