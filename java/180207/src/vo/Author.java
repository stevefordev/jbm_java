package vo;

import java.sql.Date;

public class Author {

	private int no;
	private String name;
	private String nationality;
	private Date birthDate;

	public Author() {

	}

	public Author(String name, String nationality, Date birthDate) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.birthDate = birthDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String toString() {

		return "번호:" + this.getNo() + "/ 이름:" + this.getName();
	}

}
