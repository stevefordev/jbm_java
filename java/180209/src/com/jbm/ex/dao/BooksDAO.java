package com.jbm.ex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jbm.ex.util.SqlSessionUtil;
import com.jbm.ex.vo.Book;

public class BooksDAO {

	public static int insert(Book book) {
		int result = 0;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.insert("books.insert", book);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return result;
	}

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
