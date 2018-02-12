package org.jbm.exam.util;

import java.sql.Date;
import java.util.Scanner;

public class ScannerUtil {

	/**
	 * 
	 * scanner 사용시 인풋 형식을 정의 하기 위해서 사용
	 * 
	 * @author KUHYUN PARK
	 *
	 */
	public enum InputType {
		STRING, NUMBER, DATE
	}

	/**
	 **
	 * 가산점 (14-2, 14-3, 14-4)
	 * 
	 * scanner 로 인풋 데이터를 받을때 Null값 여부나, 유효한 인풋 형식인지 체크하여 조건에 맞는 적절한 답을 찾을때 까지 반복 하여
	 * 수행한다.
	 * 
	 * Date 와 Number는 빈값(null) 값을 허용 하는 경우 기본 값으로 반환 한다. (Date 는 null, Number 는 0)
	 * 
	 * @param inputType
	 *            인풋 형식에 맞는 타입 입력
	 * @param msg
	 *            인풋 요청 메시지
	 * @param isCanNull
	 *            인풋에 빈값(null)을 허용하지 않는지 체크를 위한 인자
	 * @return 리턴을 Object로 하여 메서드 호출한 곳에서 강제 형변환하여 적절한 자료형을 사용하도록 한다.
	 */
	public static Object getInputData(InputType inputType, String msg, boolean isCanNull) {
		System.out.println(msg);
		Scanner scan = new Scanner(System.in);
		String input = "";
		while (true) {
			try {

				if (inputType == InputType.NUMBER) {
					// 허용 인풋 형식이 숫자인 경우
					input = scan.nextLine();

					if (isCanNull == true && input.equals("")) {
						// 빈값을 허용하면서 실제 인풋이 빈값인 경우 기본값 0 반환
						return 0;
					} else {
						return Integer.parseInt(input);
					}

				} else if (inputType == InputType.DATE) {
					// 허용 인풋 형식이 날짜가 아닌경우
					input = scan.nextLine();

					if (isCanNull == true && input.equals("")) {
						// 빈값을 허용하면서 실제 인풋이 빈값인 경우 기본값 null 반환
						return null;
					} else {
						return Date.valueOf(input);
					}

				} else {
					// 허용 인풋 형식이 숫자나, 날짜가 아닌경우
					input = scan.nextLine();
					if (isCanNull == true && input.equals("")) {
						// 빈값을 허용하면서 실제 인풋이 빈값인 경우 기본값 null 반환
						return null;
					} else {
						if (input.equals("")) {
							throw new Exception("빈값이 입력 되었습니다.");
						} else {
							return input;
						}
					}
				}

			} catch (Exception e) {
				// 형식에 맞지 않는 입력 값일 경우 재입력 가능하도록 메시지 호출
				// System.err.println("error:" + e.getLocalizedMessage());
				System.err.println("입력 형식에 맞지 않습니다." + msg);
			} finally {
				if (scan != null) {
					scan.close();
				}
			} // try~catch~finally end
		} // while end

	} // getInputData() end

	/**
	 * scanner 로 인풋 데이터를 받을때 Null값 여부나, 유효한 인풋 형식인지 체크하여 조건에 맞는 적절한 답을 찾을때 까지 반복 하여
	 * 수행한다.
	 * 
	 * @param inputType
	 *            인풋 형식에 맞는 타입 입력
	 * @param msg
	 *            인풋 요청 메시지
	 * @return
	 */
	public static Object getInputData(InputType inputType, String msg) {
		return getInputData(inputType, msg, false);
	} // getInputData() end
}
