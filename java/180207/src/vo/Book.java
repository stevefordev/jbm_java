package vo;

import java.sql.Date;

public class Book {

	private int no;
	private String title;
	private String publisher;
	private Date publicationDate;
	private int authorNo;

	public Book() {

	}

	public Book(String title, String publisher, Date publicationDate, int authorNo) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.authorNo = authorNo;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public int getAuthorNo() {
		return authorNo;
	}

	public void setAuthorNo(int authorNo) {
		this.authorNo = authorNo;
	}

	public String toString() {

		return "번호:" + this.getNo() + " / title:" + this.getTitle();
	}

}
