package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {

		/*
		 * collection 객체들은 객체들의 레퍼런스를 모으는 객체
		 * 
		 * List : 인덱스 있음 / 중복허용, Set : 인덱스 인덱스 없음 / 중복X (equals()) HashSet, TreeSet
		 */

		// .equals 메서드가 true 이면 두번 이상 안들어간다
		Set names = new HashSet();
		
		names.add("박정민");
		names.add("연상호");
		names.add("박정민");
		names.add(new String("박정민"));
		names.add(4); // 숫자4 가 아니고, Integer 객체가 들어간다
		System.out.println(names.size());
		
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
