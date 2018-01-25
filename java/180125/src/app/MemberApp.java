package app;

import vo.Member;

public class MemberApp {

	public static void main(String[] args) {

		/*
		 * 컴퓨터코딩 동아리 관리프로그램
		 * 
		 * 신규회원이라면 거의 18학번
		 *
		 * */

		Member m = new Member();
		m.setName("하정우");
		m.setCode("18학번");
		m.setGender('M');
		m.setMajor("컴퓨터공학");

		Member m1 = new Member("하정우", "18", "컴공", 'M');

	}//main() end

}
