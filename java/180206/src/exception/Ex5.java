package exception;

public class Ex5 {
	
	public static void main(String[] args) {
		
		//throws키워드는 메서드 뒤에
		
		//throw 키워드는 강제로 예외 발생
		throw new RuntimeException();
		
		/* 문법상
		 * RuntimeException의 자손들은
		 * 예외처리 하지 않아도 되고,
		 * 그 나머지는 전부 예외처리가
		 * 반드시 필요함(컴파일 에러)
		 */
		
	}//main end

}//Ex5 end
