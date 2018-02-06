package jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import util.StatementUtil;

public class JDBCEx9 {

  /**
   * 
   * 아이돌 검색
   * 
   * 검색할 이름을 입력하세요
   * 
   * 예를 들면 "유"를 검색하면
   * 
   * 유리, 유노윤호,(즉 like)
   *
   */
  public static void main(String[] args) throws Exception  {

    System.out.println("이름을 입력하세요.");
    Scanner scan = new Scanner(System.in);

    String name = scan.nextLine();
    
    // 구문객체
    Statement stmt = StatementUtil.getStatement();
    
    //SQL  
    String sql = "SELECT no, name FROM idols WHERE name LIKE '%" + name +"%'"
        + "ORDER BY 1";
    
    ResultSet rs = stmt.executeQuery(sql);
    
    while (rs.next()) {
      // int no = rs.getInt("no");
      int no = rs.getInt(1);

      // String name = rs.getString("name");
      String first = rs.getString(2);


      String result = String.format("번호:%s, 성명:%s", no, first);
      System.out.println(result);
    } // while() end
  }
}
