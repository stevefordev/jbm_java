package app;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.GroupsService;
import service.IdolsService;
import vo.Group;
import vo.Idol;

public class IdolApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		IdolsService service = (IdolsService) factory.getBean("idolsService");

		Idol idol = new Idol();
		idol.setName("낸시");
		idol.setHeight(162);
		idol.setWeight(46);
		idol.setGroupNo(6);
		Date birthDate = Date.valueOf("2000-04-13");
		idol.setBirthDate(birthDate);

		int result = service.register(idol);

		System.out.println(result + "명 등록");

	}
}
