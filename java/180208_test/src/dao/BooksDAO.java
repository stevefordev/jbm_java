package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Book;

public class BooksDAO {

	public static List<Book> selectList() {
		List<Book> bookList = null;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			bookList = session.selectList("books.selectList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return bookList;
	}
}
