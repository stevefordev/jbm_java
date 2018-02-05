package jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import util.StatementUtil;

public class JDBCEx7 {

  public static void main(String[] args) throws Exception {
    Statement stmt = StatementUtil.getStatement("hr");

    String sql = "SELECT employee_id, first_name , last_name FROM employees ORDER BY 1";

    /*
     * insert, update, delete : excuteUpdate()
     * select : executeQuery()
     * */
    ResultSet rs = stmt.executeQuery(sql);

    // re 의 주요 메서드
    // rs.next()
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
