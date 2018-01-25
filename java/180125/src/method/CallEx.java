package method;

public class CallEx {

	private int a;

	// 인스턴스 멤버들은 객체가 생성 되어야만 그 객체안에 존재 한다.
	private void callByValue(int a) {
		a += 5;
	}

	private void callByReference(CallEx a) {
		a.a += 5;
	}

	public static void main(String[] args) {

		CallEx callEx = new CallEx();
		callEx.a = 10;
		callEx.callByReference(callEx);

		System.out.println(callEx.a);
	}

}
