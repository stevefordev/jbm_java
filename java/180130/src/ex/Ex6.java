package ex;

public class Ex6 {

	public static void main(String[] args) {
		// int 배열형 지역변수 iArr 을 선언합니다.
		int[] iArr;

		//길이가 5인 배열을 생성하여 iArr 변수에 대입
		iArr = new int[5];

		//각 0~4번지에 3,5,7,8,9 숫자를 대입합니다.
		iArr[0] = 3;
		iArr[1] = 5;
		iArr[2] = 7;
		iArr[3] = 8;
		iArr[4] = 9;

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
    }

  }
}
