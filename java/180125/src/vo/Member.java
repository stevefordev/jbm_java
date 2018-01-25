package vo;

public class Member {

	private String name;
	private String code;
	private String major;
	private char gender;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name) {

		this(name, "18");
		/*this.name = name;
		this.code = "18";
		this.gender = 'M';
		this.major = "컴공";*/

	}

	public Member(String name, String code) {
		this(name, code, 'M');
		/*this.name = name;
			this.code = code;
			this.gender = 'M';
			this.major = "컴공";*/
	}

	public Member(String name, String code, char gender) {
		this(name, code, "컴공", gender);
		/*this.name = name;
		this.code = code;
		this.gender = gender;
		this.major = "컴공";*/

	}

	public Member(String name, String code, String major, char gender) {
		this.name = name;
		this.code = code;
		this.major = major;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
