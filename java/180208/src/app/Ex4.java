package app;

import java.sql.Date;

import org.apache.ibatis.session.SqlSession;

import dao.GroupsDAO;
import util.SqlSessionUtil;
import vo.Group;

public class Ex4 {

	public static void main(String[] args) {
		Group group = new Group();
		group.setNo(32);
		group.setName("워너원");
		group.setDebutDate(Date.valueOf("2017-8-7"));
		
		System.out.println(group.toString());
		
		int result = 0;
		result = GroupsDAO.update(group);
		
	
	 

		System.out.println(result + "개 수정");
	}
}
