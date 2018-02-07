package app;

import java.sql.Date;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class Ex1 {

	public static void main(String[] args) {

		SqlSession session = SqlSessionUtil.getSession();

		// Date 형
		Date debutDate = Date.valueOf("1976-2-24");

		Group group = new Group("니나노", debutDate);

		int result = session.insert("groups.insert", group);

		System.out.println(result + "개 그룹 입력 완료");
	}
}
