package app;

import java.sql.Date;

import dao.GroupsDAO;
import vo.Group;

public class Ex3 {

	public static void main(String[] args) {
		
		Group group = new Group();
		group.setName("워너원");
		group.setDebutDate(Date.valueOf("2017-8-7"));
		int result = GroupsDAO.insert(group);

		System.out.println(result + "명 입력");
	}
}
