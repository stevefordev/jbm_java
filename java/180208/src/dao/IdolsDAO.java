package dao;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Idol;

public class IdolsDAO {	  

	public static int insert(Idol idol) {
		int result = 0;
		SqlSession session = null;

		try {
			session = SqlSessionUtil.getSession();
			System.out.println(idol.getName());
			result = session.insert("idols.insert", idol);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}
 
}
