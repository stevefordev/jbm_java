package app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.AuthorsService;
import vo.Author;

public class AuthorApp1 {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		AuthorsService service = (AuthorsService) factory.getBean("authorsService");
		
		
		List<Author> list = service.getAuthors();
		
		for(Author author: list) {
			System.out.println(author.getName());
		}
	}
}
