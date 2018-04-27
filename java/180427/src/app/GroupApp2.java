package app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.GroupsService;
import vo.Group;

public class GroupApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		GroupsService service = (GroupsService) factory.getBean("groupsService");

		int result = service.dismantle(10000);
		
		System.out.println(result + "개의 그룹이 해체!");
 
	}
}
