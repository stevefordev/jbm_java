package app;

import java.sql.Date;
import java.util.Random;
import java.util.stream.IntStream;

import com.jbm.ex.dao.BooksDAO;
import com.jbm.ex.vo.Book;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * Book book = new Book("신경끄기의 기술", null, Date.valueOf("2017-10-27"), 47);
		 * 
		 * int result = BooksDAO.insert(book);
		 * 
		 * System.out.println(result + "개 입력");
		 */

		int numNum = 0;
		int[] numArray = new int[10];
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = numNum;
			numNum = getRandom(numArray);
			numArray[i] = numNum;
		}

		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i] + 1);
		}
	}

	public static int getRandom(int[] oldNumArray) {

		Random ran = new Random();
		int newNum = ran.nextInt(10);

		if (IntStream.of(oldNumArray).anyMatch(x -> x == newNum) == true) {
			return getRandom(oldNumArray);
		} else {
			return newNum;
		}
	}
}
