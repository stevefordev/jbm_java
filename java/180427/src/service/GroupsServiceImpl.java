package service;

import java.util.List;

import dao.GroupsDAO;
import vo.Group;

public class GroupsServiceImpl implements GroupsService {

	private GroupsDAO dao;

	public void setDao(GroupsDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Group> getGroups() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}
	
	@Override
	public int dismantle(int no) {
		// TODO Auto-generated method stub
		return dao.delete(no);
	}
}
