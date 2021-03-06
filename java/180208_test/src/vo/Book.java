package vo;

import java.sql.Date;

public class Book {

	private int no, authorNo;
	private String title, publisher;
	private Date publicationDate;

	public Book() {

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAuthorNo() {
		return authorNo;
	}

	public void setAuthorNo(int authorNo) {
		this.authorNo = authorNo;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("title:%s / publisher:%s / publicationDate:%s", this.title, this.publisher,
				this.publicationDate);
	}

}
