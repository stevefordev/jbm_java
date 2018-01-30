package app;

import vo.Idol;

public class IdolApp {

	public static void main(String[] args) {

		Idol[] idols = new Idol[5];

		idols[0] = new Idol("나연", "트와이스", 163, 47);

		idols[1] = new Idol("주이", "모모랜드", 164, 48);

		idols[2] = new Idol("카이", "EXO", 180, 63);

		idols[3] = new Idol("아이린", "레드벨벳", 158, 45);

		idols[4] = new Idol("솔라", "마마무", 163, 45);

		for (int i = 0; i < idols.length; i++) {
			System.out.println(idols[i]);
		}
	}
}
