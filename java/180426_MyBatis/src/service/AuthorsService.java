package service;

import java.util.List;

import vo.Author;

public interface AuthorsService {

	//일반적인 이름을 추상 메서드
	public List<Author> getAuthors();
	
	public int remove(int no);
	
	public int register(Author author);
}
