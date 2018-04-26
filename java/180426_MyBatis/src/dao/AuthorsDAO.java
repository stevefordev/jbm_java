package dao;

import java.util.List;

import vo.Author;

public interface AuthorsDAO {

	public List<Author> selectList();
	
	public int delete(int no);
	
	public int insert(Author author);

}
