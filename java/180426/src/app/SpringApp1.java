package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.Actor;

public class SpringApp1 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		Actor actor = (Actor) factory.getBean("actor");
		
		/*
		System.out.println(actor.getName());
		Actor actor = new Actor();
		actor.setNo(1);
		actor.setName("김사랑");
		actor.setAge(41);
		*/
		System.out.println(actor.getName());
	}
}
