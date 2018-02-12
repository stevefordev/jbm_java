package collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {

		// Map 은 key, value 형태로 저장됨
		// 자바스크립트의 객체와 비슷함

		// 차이점
		// 자바스크립트의 객체는 name 과 value 형태
		// 그래서 name 은 자료형이 문자열형

		// Map에서 key는 Object, value 도 Object
		// key 는 중복이 없음, value는 중복 가능

		Map<Object, Object> map = new HashMap();
		map.put("fs", "aa");
		map.put("41", "bb");
		map.put(new MapEx1(), "bb");

		System.out.println(map.size());

		Set<Object> keys = map.keySet();

		for (Object key : keys) {
			System.out.print(key + ":");
			System.out.println(map.get(key));
		}

		System.out.println(map.get(new MapEx1()));		

	}
}
