package vo;

import java.sql.Date;

public class Idol {
	private int idolNo;
	private String idolName;
	private int height, weight;
	private Date birthDate;
	private int groupNo;

	public Idol() {

	}
 
	public int getIdolNo() {
		return idolNo;
	} 

	public void setIdolNo(int idolNo) {
		this.idolNo = idolNo;
	}


	public String getIdolName() {
		return idolName;
	}

	public void setIdolName(String idolName) {
		this.idolName = idolName;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getGroupNo() {
		return groupNo;
	}

	public void setGroupNo(int groupNo) {
		this.groupNo = groupNo;
	}
}
