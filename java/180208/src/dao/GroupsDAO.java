package dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class GroupsDAO {

	/*
	 * DAO 메서드 만드는 규칙
	 * 
	 * 1. 리턴자료형과 동일한 지역변수 선언후 초기화
	 * 
	 * 2. 그 지역변수를 리턴
	 * 
	 * 3. SqlSession 을 선언 및 초기화
	 * 
	 * 4. try~catch~finally
	 * 
	 * 5. finally 블록에서 session.close()
	 * 
	 * 6. try블록에서 session을 얻어옴
	 * 
	 * 7. insert, update, delete, select 수행
	 */
	public static Group selectOne(int no) {
		Group group = null;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			group = session.selectOne("groups.selectByNo", no);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return group;
	}

	public static List<Group> selectList() {
		List<Group> groupList = null;

		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			groupList = session.selectList("groups.selectList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return groupList;
	}

	public static int delete(int no) {
		int result = 0;
		SqlSession session = null;

		try {
			session = SqlSessionUtil.getSession();
			result = session.delete("groups.delete", no);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}

	public static int insert(Group group) {
		int result = 0;
		SqlSession session = null;

		try {
			session = SqlSessionUtil.getSession();
			result = session.insert("groups.insert", group);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}

	public static int update(Group group) {

		int result = 0;
		SqlSession session = null;

		try {
			session = SqlSessionUtil.getSession();
			result = session.update("groups.update", group);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}
}
