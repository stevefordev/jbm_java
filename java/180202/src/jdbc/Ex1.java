package jdbc;

import java.sql.*;
/*
 * import java.sql.Connection; import java.sql.DriverManager; import java.sql.Statement;
 */

public class Ex1 {
  public static void main(String[] args) throws Exception {
    // 1) jdbc 드라이버를 메모리에 로딩
    Class.forName("oracle.jdbc.OracleDriver");
    System.out.println("드라이버 로딩 완료!");
    // 2) 유저, 비밀번호, url 등 설정
    String user = "test";
    String password = "1111";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    // 3) 커넥션(connection) 객체 생성
    Connection con = DriverManager.getConnection(url, user, password);
    System.out.println("커넥션 연결 성공!!");
    // 4) 구문(statement) 객체 생성
    Statement stmt = con.createStatement();
    System.out.println("구문객체 생성 성공!");

    // 5) 수행 할 SQL 을 작성
    String sql = "DELETE idols WHERE no = 500";

    // 6) 실행 후 결과 실행 및 갯수 얻기
    int result = stmt.executeUpdate(sql);
    
    System.out.println(result + "행 삭제완료");
    
  }
}
