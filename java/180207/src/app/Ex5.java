package app;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Book;

public class Ex5 {

	public static void main(String[] args) {
		SqlSession session = SqlSessionUtil.getSession();
		
		//Book객체 생성
		Book book = new Book();
		
		// 78번 no을 호모데우스로 변경
		book.setNo(43);
		book.setTitle("호모데우스");
		
		int result = session.update("books.update", book);
		
		System.out.println(result);
	}
}
