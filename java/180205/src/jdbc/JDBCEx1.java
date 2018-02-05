package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * project right click -> build path -> configure build path -> Java Build Path -> Libraries ->
 * Classpath -> Add External JARs -> ojdbc6.jar
 */
public class JDBCEx1 {
  public static void main(String[] args) throws Exception {

    // 1) 드라이버로딩
    Class.forName("oracle.jdbc.OracleDriver");
    System.out.println("드라이버 로딩 완료");

    // 2) user, password, url 등
    String user = "test";
    String password = "1111";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";

    // 3) Connection 객체 얻기
    Connection con = DriverManager.getConnection(url, user, password);
    System.out.println("connection success");

    // 4) Statement 객체 생성
    Statement stmt = con.createStatement();
    System.out.println("구문 객체 생성 완료!!");

    // 5) SQL 구문 작성
    String sql = "INSERT INTO groups(no, name, debut_date)"
        + "VALUES(groups_seq.nextval, '모모랜드', '2016-11-10')";

    // 6) 결과 후 갯수 얻기
    int result = stmt.executeUpdate(sql);
    System.out.println(result + "개의 그룹 입력 성공");
  }
}
