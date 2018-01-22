package type;

public class CastingEx {

	public static void main(String[] args) {
		byte b = 1;
		short s = 3;

		s = b; // promotion (자동 형변환, UpCasting)

		System.out.println(s);
		
		b = (byte)s; // demotion (강제 형변환, DownCasting)
		
		System.out.println(b);

	}// main() end

}// CastingEx end
