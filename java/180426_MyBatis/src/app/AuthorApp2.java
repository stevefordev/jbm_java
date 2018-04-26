package app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.AuthorsService;
import vo.Author;

public class AuthorApp2 {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		AuthorsService service = (AuthorsService) factory.getBean("authorsService");

		int result = service.remove(43);
		System.out.println(result + "명 삭제");

	}
}
