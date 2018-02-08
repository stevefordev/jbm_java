package app;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;
import vo.Idol;

public class Ex1 {

	public static void main(String[] args) {

		SqlSession session = SqlSessionUtil.getSession();

		// Date 형
		Date debutDate = Date.valueOf("1976-2-24");

		Group group = new Group("니나노", debutDate);

		// int result = session.insert("groups.insert", group);
		// System.out.println(result + "개 그룹 입력 완료");

		List<Group> groupList = session.selectList("groups.selectList");

		for (Group g : groupList) {
			System.out.println(g.getNo() + "/" + g.getName());
			for (Idol i : g.getIdolList()) {
				System.out.println("\t" + i.getIdolName());
			}
		}

		List<HashMap<String, Object>> d = session.selectList("groups.selectListJoin");

		for (HashMap<String, Object> hashMap : d) {
			System.out.println(hashMap.get("idolName"));
		}

	}
}
