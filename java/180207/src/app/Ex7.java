package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Author;

public class Ex7 {

	public static void main(String[] args) {
		SqlSession session = SqlSessionUtil.getSession();
		System.out.println("검색할 번호는??");
		
		Scanner scan = new Scanner(System.in);
		
		int no = scan.nextInt();
		scan.nextLine();
		
		Author a = session.selectOne("authors.selectOne",no);
		try {
			System.out.println(a.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
