package app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.GroupsService;
import vo.Group;

public class GroupApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		GroupsService service = (GroupsService) factory.getBean("groupsService");

		List<Group> list = service.getGroups();

		for (Group group : list) {
			System.out.println(group.getName());
		}
	}
}
