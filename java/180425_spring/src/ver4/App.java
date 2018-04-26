package ver4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.Actor;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		
		Actor actor = (Actor)context.getBean("actor");
		System.out.println(actor.getName());
	}
}
