package service;

import java.util.List;

import dao.BooksDAO;
import vo.Book;

public class BooksServiceImpl implements BooksService {

	private BooksDAO dao;

	public void setDao(BooksDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}
	
	@Override
	public int register(Book book) {
		// TODO Auto-generated method stub
		return dao.insert(book);
	}
	
	@Override
	public int remove(int no) {
		// TODO Auto-generated method stub
		return dao.delete(no);
	}
}
