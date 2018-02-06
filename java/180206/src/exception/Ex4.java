package exception;



public class Ex4 {
	
	private static void test() {
		try {
			return;
		} catch (Exception e) {
			
		} finally {
			System.out.println("여기는 수행!");
		}
	}
	
	public static void main(String[] args) {
		
		//test();
		
		//System.out.println("후후");
		
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		} finally {
			//무조건 수행됨
			System.out.println(6);
			
		}//try~catch~finally end
		
		System.out.println(7);
		
	}//main() end

}//Ex4 end
