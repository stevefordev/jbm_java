package type;

public class TypeEx2 {

	/**
	 * 
	 * @param args
	 * @Method Name: main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  
		 *  char 형 (기본자료형) 
		 * 1. 문자 한 글자를 의미 
		 * 2. 내부적으로 정수처리 
		 * 3. 크기 : 2byte (16 bit / 0~65535)
		 *  	-초창기 유니코드 2byte였음
		 * 4. ''  
		 * 5. \', \", \t 
		 * 6. 유니코드 16진수 :'\u00ff'
		 * 7. 기본값 : '\u0000' 
		 * 
		 * 주요 키코드
		 *
		 */

		/*
		 * 0과 1 = 1 비트
		 * 
		 * 1 바이트 : 8 비트 
		 * 1 킬로 바이트 : 1024 바이트 
		 * 1 메가 바이트 : 1024 킬로 바이트 
		 * 1 기가 바이트 : 1024 메가 바이트 
		 * 1 테라 바이트 : 1024 기가 바이트 
		 * 1 페타 바이트 : 1024 테라 바이트
		 */

		// 기본자료형 char 형 변수 a 를 선언
		char a;

		// a = 'a';
		a = '쮋';

		// 기본 자료형 char 형 변수 b를 선언
		char b = 'B';

		b = '\'';
		b = 97;
		b = '\u0000';
		b = 0; //'\u0000'
		System.out.println(b);
		System.out.println(a);

	}

}
