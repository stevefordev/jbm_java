package app;

import java.util.List;

import dao.BooksDAO;
import vo.Book; 

public class Ex1 {

	public static void main(String[] args) {
		List<Book> bookList = BooksDAO.selectList();

		for (Book book : bookList) {
			System.out.println(book.toString());
		}
	}
}
