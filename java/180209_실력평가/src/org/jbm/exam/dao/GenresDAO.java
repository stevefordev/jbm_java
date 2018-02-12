package org.jbm.exam.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.jbm.exam.util.SqlSessionUtil;
import org.jbm.exam.vo.Genre;

public class GenresDAO {

	/***
	 * 장르 테이블 insert
	 * 
	 * @param genre
	 * @return
	 */
	public static int insert(String genre) {

		int result = 0;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.insert("genres.insert", genre);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return result;
	}

	/**
	 * 장르 테이블 업데이트
	 * 
	 * @param genre
	 * @return
	 */
	public static int update(Genre genre) {

		int result = 0;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.update("genres.update", genre);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return result;
	}

	/**
	 * 장르 테이블 delete
	 * @param genre
	 * @return
	 */
	public static int delete(String genre) {

		int result = 0;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.delete("genres.delete", genre);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return result;
	}

	/**
	 * 장르 테이블 리스트 호출
	 * 
	 * @return
	 */
	public static List<Genre> selectList() {

		List<Genre> result = null;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.selectList("genres.selectList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return result;
	}
}
