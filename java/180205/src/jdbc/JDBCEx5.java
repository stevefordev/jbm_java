package jdbc;

import java.sql.Statement;
import java.util.Scanner;
import util.StatementUtil;

public class JDBCEx5 {
  public static void main(String[] args) throws Exception {
    System.out.println("===아이돌 입력 프로그램===");
    Scanner scan = new Scanner(System.in);

    System.out.println("이름을 입력하세요.");
    String name = scan.nextLine();

    System.out.println("키를 입력하세요.");
    int height = scan.nextInt();
    scan.nextLine();

    System.out.println("몸무게를 입력하세요.");
    int weight = scan.nextInt();
    scan.nextLine();

    System.out.println("생년월일을 다음과 같이 입력하세요.");
    System.out.println("예) 2018-02-05");
    String birth = scan.nextLine();

    System.out.println("그룹 번호를 입력하세요");
    int groupNo = scan.nextInt();

    Statement stmt = StatementUtil.getStatement();

    String sql = String.format(
        "INSERT INTO idols(no, name, height, weight,  birth_date, group_no)"
            + "VALUES(idols_seq.nextval, '%s', %d, %d, '%s', %d)",
        name, height, weight, birth, groupNo);
    System.out.println(sql);

    int result = stmt.executeUpdate(sql);

    if (result == 1) {
      System.out.println("success");
    } else {
      System.out.println("fail");
    }

  }
}
