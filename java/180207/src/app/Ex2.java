package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class Ex2 {

	public static void main(String[] args) {

		System.out.println("삭제할 저자 이름을 입력해주세요");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		SqlSession session = SqlSessionUtil.getSession();
		int result = 0;
		try {
			result = session.delete("authors.delete", name);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(result + "명이 삭제 되었습니다.");
	}
}
