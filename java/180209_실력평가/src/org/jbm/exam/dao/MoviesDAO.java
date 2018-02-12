package org.jbm.exam.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.jbm.exam.util.SqlSessionUtil;
import org.jbm.exam.vo.Movie;

public class MoviesDAO {

	public static int insert(Movie movie) {
		int result = 0;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.insert("movies.insert", movie);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return result;
	}

	public static List<Movie> selectList() {

		List<Movie> result = null;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.selectList("movies.selectList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return result;
	}

	public static List<Movie> selectListByName(String name) {

		List<Movie> result = null;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.selectList("movies.selectListByName", name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return result;
	}

	public static int delete(int no) {
		int result = 0;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.delete("movies.delete", no);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return result;
	}
}
