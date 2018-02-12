package collection;

import java.util.Set;
import java.util.TreeSet;

public class SetEx2 {

	public static void main(String[] args) {

		/*
		 * HashSet은 정렬되지 않음
		 * TreeSet은 정렬됨
		 * */
		Set<String> names  = new TreeSet();
		
		names.add("sadf");
		names.add("1sadf1");
		names.add("sadf2");
		names.add("1sadf1");
		
		for (String s : names) {
			System.out.println(s);
		}
	}
}
