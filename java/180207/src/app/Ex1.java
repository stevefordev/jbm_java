package app;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class Ex1 {

	public static void main(String[] args) {

		SqlSession session = SqlSessionUtil.getSession();

		int result = session.delete("books.delete", 300);

		System.out.println(result + "행 삭제");
	}// main() end
}
