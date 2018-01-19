package type;

public class TypeEx3 {

	public static void main(String[] args) {
		/*
		 * 자바의 정수 (기본값은 0)
		 * 1) byte : 1byte (-128 ~ -1, 0 ~ 127)
		 * 2) short : 2byte (-32768 ~ 32767)
		 * 3) int : 4byte - 기본정수 (-214748368 ~ 2147483647)
		 * 4) long : 8byte
		 * 		뒤에 'l' 'L' 을 붙일 수 있음
		 * */
		
		// 기본자료형 byte 형 변수 b 를 선언
		byte b = 127;
		
		// 기본자료형 short 형 변수 s를 선언하고 
		// 값 2000을 대입
		
		short s = 2000;
		
		// 기본 자료형 int 형 변수 i 선언하고 값 102323 eodlq
		int i = 2147483647;
		
		long l = 45456L;
		
		// 21 억 47483647 보다 큰 수 나 -21억 4783638 보다 작은 수를 
		// 표현하려면 무조건 L 을 붙혀줘야 합니다.
		l = 4000000000L;
		
		System.out.println(l);
	}
}
