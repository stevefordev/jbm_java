package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import util.StatementUtil;

public class JDBCEx6 {

  public static void main(String[] args) throws Exception {

    Statement stmt = StatementUtil.getStatement();

    String sql = "SELECT no, name, debut_date" + " FROM groups ORDER BY 1";

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
      String name = rs.getString(2);
      Date debut_date = rs.getDate(3);
      String result = String.format("no:%d, name:%s, debut_date:%s", no, name, debut_date);
      System.out.println(result);
    } // while() end
  }
}
