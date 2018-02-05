package util;

import java.sql.*;

public class StatementUtil {

  public static Statement getStatement() throws Exception {
    return getStatement("test");
  }

  public static Statement getStatement(String user) throws Exception {
    // 1) 드라이버로딩
    Class.forName("oracle.jdbc.OracleDriver");
    System.out.println("드라이버 로딩 완료");

    // 2) user, password, url 등
    String password = "1111";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";

    // 3) Connection 객체 얻기
    Connection con = DriverManager.getConnection(url, user, password);
    System.out.println("connection success");

    // 4) Statement 객체 생성
    return con.createStatement();
  }


}
