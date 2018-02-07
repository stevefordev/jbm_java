package app;

import java.sql.Date;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Author;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 저자번호 입력");
		int authorNo = scan.nextInt();
		scan.nextLine();
		
		System.out.println("변경할 생일 입력");
		System.out.println("예)2018-2-7");
		String date = scan.nextLine();
		Date birthDate = Date.valueOf(date);
		
		SqlSession session = SqlSessionUtil.getSession();
		Author author =  new Author();
		author.setNo(authorNo);
		author.setBirthDate(birthDate);
		int result = session.update("authors.update", author);
		
		System.out.println(result);
		
	}
}
