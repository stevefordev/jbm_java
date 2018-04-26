package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.Book;

public class BooksDAOImpl implements BooksDAO {

	private SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public List<Book> selectList() {
		// TODO Auto-generated method stub
		return session.selectList("books.selectList");
	}

	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return session.insert("books.insert", book);
	}
	
	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return session.delete("books.delete", no);
	}
}
