package app;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.AuthorsService;
import service.BooksService;
import vo.Author;
import vo.Book;

public class BookApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		BooksService service = (BooksService) factory.getBean("booksService");

		Book book = new Book();
		book.setTitle("바람과 함께");
		book.setPublisher("띠로리");
		Date publicationDate = Date.valueOf("1899-07-21");
		book.setPublicationDate(publicationDate);
		book.setAuthorNo(42);
		int result = service.register(book);

		System.out.println(result);
	}

}
