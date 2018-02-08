package vo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
 
public class Group {

	private int no;
	private String name;
	private Date debutDate;

	private ArrayList<Idol> idolList;

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
 
	public ArrayList<Idol> getIdolList() {
		return idolList;
	}

	public void setIdolList(ArrayList<Idol> idolList) {
		this.idolList = idolList;
	}

	public String toString() {
		return "no:" + this.getNo() + " / name:" + this.getName();
	}
 
}
