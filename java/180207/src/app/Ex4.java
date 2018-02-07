package app;

import java.sql.Date;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Author;
import vo.Book;

public class Ex4 {

	public static void main(String[] args) {
		// 책정보를 insert
		SqlSession session = SqlSessionUtil.getSession();

		// Date 형
		Date publicationDate = Date.valueOf("2000-7-1");

		Book book = new Book("내 인생은 내가 만든다", "창해", publicationDate, 9);

		int result = session.insert("books.insert", book);

		System.out.println(result + "명 입력 완료");
	}
}
