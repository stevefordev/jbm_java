package control;

public class ForEx4 {

	public static void main(String[] args) {

		for (int i = 2; i < 11; i += 2) {
			System.out.print(i + "\t");
		}

		System.out.println("");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(String.format("%d * %d = %d\t", i, j, i * j));
			} //안쪽 for 문 end
			System.out.println("");
		} //바같for문 end
		System.out.println("--------------------------------------");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(String.format("%d * %d = %d\t", j, i, i * j));
			} //안쪽 for 문 end
			System.out.println("");
		} //바같for문 end

		
	
	}// main() end

}
