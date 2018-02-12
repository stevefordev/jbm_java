package org.jbm.exam.ex;

import java.util.List;

import org.jbm.exam.dao.GenresDAO;
import org.jbm.exam.vo.Genre;

/**
 * 장르 테이블 호출 및 출력
 * 
 * @author KUHYUN PARK
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		
		List<Genre> list = GenresDAO.selectList();
		
		for (Genre genre : list) {
			System.out.println(genre.toString());
		}
	}
}
