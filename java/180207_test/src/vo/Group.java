package vo;

import java.sql.Date;

public class Group {

	private int no;
	private String name;
	private Date debutDate;

	public Group() {

	}

	public Group(String name, Date debutDate) {
		super();
		this.name = name;
		this.debutDate = debutDate;
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

	public Date getDebutDate() {
		return debutDate;
	}

	public void setDebutDate(Date debutDate) {
		this.debutDate = debutDate;
	}

	public String toString() {
		return "no:" + this.getNo() + " / name:" + this.getName();
	}
}
