package exception;

public class Ex6 {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			throw new ArithmeticException();
		}catch(ArithmeticException e) {
			System.out.println(5);
		}catch (RuntimeException e) {
			System.out.println(6);
		}catch (Exception e) {
			System.out.println(7);
		} finally {
			System.out.println(8);
		}
		
		System.out.println(9);
		
	}//main() end

}//Ex6 end
