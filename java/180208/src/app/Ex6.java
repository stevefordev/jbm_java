package app;

import java.util.List;

import dao.GroupsDAO;
import vo.Group;

public class Ex6 {

	public static void main(String[] args) {

		List<Group> groupList = GroupsDAO.selectList();

		for (Group group : groupList) {
			System.out.println(group.toString());
		}
	}
}
