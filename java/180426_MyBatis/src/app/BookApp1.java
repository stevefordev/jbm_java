package app;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.AuthorsService;
import service.BooksService;
import vo.Author;
import vo.Book;

public class BookApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		BooksService service = (BooksService) factory.getBean("booksService");
		
		List<Book> list =  service.getBooks();
		
		for (Book book : list) {
			System.out.println(book.getTitle());
		}
	}

}
