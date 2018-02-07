package app;

import java.sql.Date;
import java.sql.ResultSet;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Author;

public class Ex3 {

	public static void main(String[] args) {

		SqlSession session = SqlSessionUtil.getSession();

		// Date 형
		Date birthDate = Date.valueOf("1976-2-24");

		Author author = new Author("유발 하라리", "이스라엘", birthDate);

		/*
		 * author.setName("유발 하라리"); author.setNationality("이스라엘");
		 * author.setBirthDate(birthDate);
		 */
		int result = session.insert("authors.insert", author);

		System.out.println(result + "명 입력 완료");
	}

}
