package service;

import java.util.List;

import vo.Book;

public interface BooksService {

	public List<Book> getBooks();
	
	public int register(Book book);
	
	public int remove(int no);
}
