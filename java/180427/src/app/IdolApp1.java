package app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.GroupsService;
import service.IdolsService;
import vo.Group;
import vo.Idol;

public class IdolApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		IdolsService service = (IdolsService) factory.getBean("idolsService");

		List<Idol> list = service.getIdols();

		for (Idol idol : list) {
			System.out.println(idol.getName());
		}
	}
}
