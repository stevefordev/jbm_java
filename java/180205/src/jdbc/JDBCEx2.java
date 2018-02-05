package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import util.StatementUtil;

public class JDBCEx2 {

  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub

    System.out.println("===== 그룹입력 프로그램 ver0.99 =====");

    Scanner scan = new Scanner(System.in);
    System.out.println("그룹명을 입력하세요~");
    String group = scan.nextLine();

    // 데뷔일 입력받음
    System.out.println("데뷔일을 입력하세요. 예) 2015-10-10");
    String inputDate = scan.nextLine();

    /*
    Date debutDate = new SimpleDateFormat("yyyy-MM-dd").parse(inputDate);
    DateFormat date = new SimpleDateFormat("yyyy-MM-dd");    
    System.out.println(date.format(debutDate));
      */

    // DB에 입력
    Statement stmt = StatementUtil.getStatement();
    String sql = String.format(
        "INSERT INTO groups(no, name, debut_date)" + "VALUES(groups_seq.nextval, '%s', '%s')",
        group, inputDate);
    System.out.println(sql);
    int result = stmt.executeUpdate(sql);

    if (result == 1) {
      System.out.println(String.format("%s 그룹이 잘 입력되었습니다.", group));
    } else {
      System.out.println(String.format("%s 그룹이 입력되지 않았습니다.", group));
    } //

  }
}
