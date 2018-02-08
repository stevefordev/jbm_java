package app;

import java.sql.Date;
import java.util.Scanner;

import dao.IdolsDAO;
import vo.Idol;

public class Ex5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이돌 이름을 입력하세요");
		String name = scan.nextLine();
		System.out.println("키를 입력하세요");
		String height = scan.nextLine();
		System.out.println("몸무게를 입력하세요");
		String weight = scan.nextLine();
		System.out.println("생일을 입력하세요 예)2018-1-1");
		String date = scan.nextLine();
		System.out.println("그룹 아이디를 입력하세요");
		String groupNo = scan.nextLine();
		Idol idol = new Idol(name, Integer.parseInt(height), Integer.parseInt(weight), 
				Date.valueOf(date), Integer.parseInt(groupNo));

		int result = IdolsDAO.insert(idol);

		System.out.println(result + "명 입력");
	}
}
