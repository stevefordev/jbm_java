package jdbc;

import java.sql.Statement;
import java.util.Scanner;
import util.StatementUtil;

public class JDBCEx4 {
  public static void main(String[] args) throws Exception {
    System.out.println("이름을 수정할 그룹 번호를 입력하세요");
    Scanner scan = new Scanner(System.in);
    int no = scan.nextInt();
    scan.nextLine();

    System.out.println("수정할 이름을 입력하세요");
    String group = scan.nextLine();

    String sql = String.format("UPDATE groups SET name = '%s' WHERE no=%d", group, no);

    System.out.println(sql);

    Statement stmt = StatementUtil.getStatement();
    int result = stmt.executeUpdate(sql);

    if (result == 1) {
      System.out.println("잘 수정되었습니다.");
    } else {
      System.out.println("수정 되지 않았습니다.");
    }
  }
}
