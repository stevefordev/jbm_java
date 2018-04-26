package app;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.AuthorsService;
import vo.Author;

public class AuthorApp3 {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		AuthorsService service = (AuthorsService) factory.getBean("authorsService");

		Author author = new Author();
		author.setName("헤밍웨이");
		author.setNationality("미국");
		Date birthDate = Date.valueOf("1899-07-21");
		author.setBirthDate(birthDate);
		
		int result = service.register(author);
		System.out.println(result + "명 등록!");

	}
}
