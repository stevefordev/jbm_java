package dao;

import java.util.List;

import vo.Book;

public interface BooksDAO {

	public List<Book> selectList();
	
	public int insert(Book book);
	
	public int delete(int no);
}
