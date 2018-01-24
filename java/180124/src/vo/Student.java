package vo;

/*
 * VO 는 Value Object 의 줄임말
 * 
 * 데이터를 저장하는데 특화된 객체
 * 
 * VO 규칙
 * 1) 멤버 필드를 private 으로 선언하여 
 *	 외부에서 접근 불가능하게 한다 (은닉화)
 * 
 * 2) setter, getter 로 접근
 * 
 * */
public class Student {
	
	public Student() {
		super();
	}

	public Student(String string, int i) {
		
	}

	private String name;
	private int age;
	private String major;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
