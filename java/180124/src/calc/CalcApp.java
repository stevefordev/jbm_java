package calc;

public class CalcApp {

	public static void main(String[] args) {

		/*
		 * Calculator 클래스를 가지고 만들어진
		 * 객체의 레퍼런스를 담을 수 있는
		 * 객체자료형 지역변수 calc를 선언하고 
		 * new 라는 키워드를 통해서 heap 메모리에 영역을 할당받고
		 * Calculator 클래스의 기본생성자를 호출하여
		 * 객체를 생성후 그 객체의 레퍼런스를
		 * calc에 대입
		 * */
		Calculator calc = new Calculator();

		int result = calc.sum(5, 6);

		System.out.println(result);

		System.out.println(calc.subtract(9, 1));
		System.out.println(calc.multiply(8, 2));
		System.out.println(calc.divide(6, 31));

	}

}
