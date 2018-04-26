package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.AuthorsDAO;
import vo.Author;

public class AuthorsServiceImpl implements AuthorsService {

	//AuthorsDAO 에 의존적
	private AuthorsDAO dao;
	
	//의존성주입을 위해서
	public void setDao(AuthorsDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Author> getAuthors() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}
	
	@Override
	public int remove(int no) {
		// TODO Auto-generated method stub
		return dao.delete(no);
	}
	
	@Override
	public int register(Author author) {
		// TODO Auto-generated method stub
		return dao.insert(author);
	}

}
