package app;

import dao.GroupsDAO;

public class Ex2 {

	public static void main(String[] args) {
		
		int result = GroupsDAO.delete(30);
		
		System.out.println(result + "개 삭제");
	} 
	
}
