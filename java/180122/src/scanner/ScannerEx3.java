package scanner;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {

		System.out.println(String.format("%s _ %s", args[0].toString(), args[1]));
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 2개 입력");

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int result = num1 + num2;
		System.out.println(String.format("%d + %d = %d", num1, num2, result));

		result = num1 - num2;
		System.out.println(String.format("%d - %d = %d", num1, num2, result));

		result = num1 * num2;
		System.out.println(String.format("%d * %d = %d", num1, num2, result));

		double resultDouble = num1 / (double) num2;
		System.out.println(String.format("%d / %d = %.2f", num1, num2, resultDouble));

		result = num1 % num2;
		System.out.println(String.format("%d %% %d = %d", num1, num2, result));

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(a + " > " + b + " = " + (a > b));

	
	}// main() end

}// ScannerEx3 end
