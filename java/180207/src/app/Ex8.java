package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Author;
import vo.Book;

public class Ex8 {

	public static void main(String[] args) {
		SqlSession session = SqlSessionUtil.getSession();
		System.out.println("검색할 번호는??");
		
		Scanner scan = new Scanner(System.in);
		
		int no = scan.nextInt();
		scan.nextLine();
		
		Book book = session.selectOne("books.selectOne",no);
		try {
			System.out.println(book.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
	}
}
