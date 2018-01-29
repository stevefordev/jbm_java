package string;

import java.util.StringTokenizer;

public class STOKEx2 {

	public static void main(String[] args) {

		String str = "땅§불§바람§물§마음";
		StringTokenizer stok = new StringTokenizer(str, "§");

		while (stok.hasMoreElements()) {
			System.out.println(stok.nextToken());
		} //while stok.hasMoreElements end

	}//main() end
}
