package exception;

public class Ex7 {

	public static void test() throws Exception {
		
		throw new ClassNotFoundException();
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			test();
			
		} catch (Exception e) {
			
		}
		
	}//main() end
	
}//Ex7 end
