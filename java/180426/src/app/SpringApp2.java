package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import util.ActorPrinter;
import vo.Actor;

public class SpringApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		ActorPrinter ap = (ActorPrinter) factory.getBean("actorPrinter");
		ap.print();

	}

}
