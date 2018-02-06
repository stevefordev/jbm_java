package exception;

import java.util.Random;

public class Ex2 {
	
	public static void main(String[] args) {
		
		// try~catch구문 예외처리
		
		// 예외처리를 하는 이유는
		// 비정상종료를 막고 예외발생시
		// 그에 필요한 일을 수행시킬 수 있음
		
		
		//랜덤한 정수 발생
		Random ran = new Random();
		
		for(int i = 1 ; i <= 100 ; i++ ) {
			//0~9까지 난수 발생
			int num = ran.nextInt(5);
			
			try {
				System.out.println(4/num);
			} catch(Exception e) {
				System.out.println("예외발생!");
			}//try~catch end
			
		}//for end
		
	}//main() end

}//Ex2 end
