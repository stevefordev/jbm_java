package dao;

import java.util.List;

import vo.Group;

public interface GroupsDAO {

	List<Group> selectList();
	
	int delete(int no);

}
