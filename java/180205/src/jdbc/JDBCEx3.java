package jdbc;

import java.sql.*;
import java.util.Scanner;
import util.StatementUtil;

public class JDBCEx3 {

  public static void main(String[] args) throws Exception {

    System.out.println("삭제할 그룹 이름을 입력하세요.");

    Scanner scan = new Scanner(System.in);

    String groupName = scan.nextLine();

    Statement stmt = StatementUtil.getStatement();

    String sql = String.format("DELETE FROM groups WHERE name='%s'", groupName);

    int result = stmt.executeUpdate(sql);

    System.out.println(result + "개의 그룹이 삭제되었습니다.");

  }

}
