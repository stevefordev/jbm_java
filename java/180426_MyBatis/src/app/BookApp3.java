package app;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.AuthorsService;
import service.BooksService;
import vo.Author;
import vo.Book;

public class BookApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		BooksService service = (BooksService) factory.getBean("booksService");

		int result = service.remove(25);
		System.out.println(result + "명 삭제");
	}

}
