package org.jbm.exam.vo;

public class Genre implements Comparable<Genre> {

	private int no;
	private String name;

	public Genre() {
		// TODO Auto-generated constructor stub
	}
	
	public Genre(int no, String name) {
		super();
		this.no = no;
		this.name = name;
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

	@Override
	public String toString() {

		return String.format("번호 : %d / 장르명 : %s", this.no, this.name);
	}

	// 번호 순으로 정렬 가능하도록
	@Override
	public int compareTo(Genre genre) {
		// TODO Auto-generated method stub
		Integer number = this.no;
		return number.compareTo(genre.getNo());
	}
}
