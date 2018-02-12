package org.jbm.exam.ex;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 로또 번호 추첨
 * 
 * @author KUHYUN PARK
 *
 */
public class Ex07 {

	public static void main(String[] args) {

		// 랜덤 숫자의 Order 를 적용 하기 위해 TreeSet 사용
		Set sets = new TreeSet();
		Random random = new Random();

		// 중복 없이 6개 랜덤 숫자가 입력될때 까지 반복
		// sets 사이즈가 6개 이상이면 더이사 랜덤 번호를 호출 하지 않는다.
		while (sets.size() < 6) {
			// random.nextInt(45) -> 0~44
			sets.add(random.nextInt(45) + 1); // 1~45 랜덤숫자 sets 에 add
		} // while end

		// 숫자 셋을 한줄 나열 및 쉼표를 붙이기 위해 수행
		StringBuilder sb = new StringBuilder();
		for (Object object : sets) {
			sb.append(object + ", ");
		}

		System.out.println("★2018년 2월 10일 로또1등★");
		String result = sb.toString();
		// 마지막 쉼표와, 띄어쓰기 삭제하기위해 substring 사용
		System.out.println(result.substring(0, result.length() - 2));

		String lottoNum = sets.toString();
		lottoNum = lottoNum.substring(1, lottoNum.length() - 1);

		System.out.println(lottoNum);

	} // main() end
} // Ex7 end
