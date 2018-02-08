package app;

import dao.GroupsDAO;
import vo.Group;

public class Ex1 {

	public static void main(String[] args) {
		
		Group group = GroupsDAO.selectOne(9);
		
		System.out.println(group.getName());
	} 
	
}
