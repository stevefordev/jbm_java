package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {

		// 컬렉션 클래스들
		// : 객체(의 레퍼런스)를 모으는 객체
		// 객체안에 객체가 들어감
		// (개념으로 보면 배열과 비슷함)
		/*
		 * 1.Set 2.Map 3.List : Vector(동기화 처리, 속도느림), ArrayList(동기화x, 속도빠름)
		 * 
		 * - 인덱스가 있음 - 중복 허용 - 무한 배열이라고 생각하면 편함
		 */

		List list = new ArrayList();

		list.add(new ListEx1());
		list.add(new String("TEST"));
		list.add("TEST");
		list.add(4);

		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		System.out.println(list.get(0));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
