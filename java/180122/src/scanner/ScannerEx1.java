package scanner;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
		System.out.println("당신이 좋아하는 가수는?");
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		System.out.println(String.format("당신은 %s 을(를) 좋아합니다", name));
	}// main() end
	
}// ScannerEx1 end
