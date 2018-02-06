package exception;

public class Ex1 {
	
	public static void main(String[] args) {
		
		/*
		 * 예외가 발생하는 상황들
		 * NullPointerException
		 * IndexOfOutBoundException
		 * NumberFormatException
		 * ClassCastException
		 * ClassNotFoundException
		 * SQLException...
		 * ArithmeticException
		 * 
		 */
		
		
		//0으로 수를 나누면 ArithmeticException이 발생함
		System.out.println(5/0);
		
		//String s = null;

		//s.substring(0);
		
		//int i = Integer.parseInt("A");
		
		//Object o = "TESt";
		
		//Ex1 e = (Ex1)o;
		
		//String s = "TEST";
		
		//s.substring(0,10);
		
		//System.out.println(s);
		
		
		
	}//main() end

}//Ex1 end
