package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.Author;

public class AuthorsDAOImpl implements AuthorsDAO {

	// DAO 는 SqlSession에 의존적 그래서 멤버필드로 선언
	private SqlSession session;

	// 의존성 주입 받기 위해서 setter
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public List<Author> selectList() {

		return session.selectList("authors.selectList");
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return session.delete("authors.delete", no);
	}
	
	@Override
	public int insert(Author author) {
		// TODO Auto-generated method stub
		return session.insert("authors.insert", author);
	}
}
