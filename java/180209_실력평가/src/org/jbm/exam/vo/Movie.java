package org.jbm.exam.vo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Movie {

	private int no, audienceNum, genre;
	private String name, director;
	private Date releaseDate, endDate;

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String name, String director, Date releaseDate, Date endDate, int audienceNum, int genre) {
		super();
		this.name = name;
		this.director = director;
		this.releaseDate = releaseDate;
		this.endDate = endDate;
		this.audienceNum = audienceNum;
		this.genre = genre;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAudienceNum() {
		return audienceNum;
	}

	public void setAudienceNum(int audienceNum) {
		this.audienceNum = audienceNum;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {


		/*
		 * Calendar cal = Calendar.getInstance(); cal.setTime(this.releaseDate);
		 * 
		 * String date = cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) +
		 * "월 " + cal.get(Calendar.DATE) + "일";
		 */
		
		// 가산점13-1:개봉일을 년월일 표기하기 위해서
		/*
		 * new SimpleDateFormat("yyyy년 M월 d일") -> ex:2018년 2월 9일
		 * new SimpleDateFormat("yyyy년 MM월 dd일") -> ex:2018년 02월 09일
		 * */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일");
		String date = sdf.format(this.releaseDate);
		
		// 가산점13-1:관색수를 쉼표넣는 포맷으로 (%,d)
		return String.format("%d) %s / 감독 : %s / 개봉일 : %s / 관객수 : %,d명 / 장르 : %d", this.no, this.name, this.director,
				date, this.audienceNum, this.genre);
	}
}
