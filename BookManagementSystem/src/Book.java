
public class Book {
	private String bookName;
	private String publishingCompany;
	private int edition;
	private int publishingYear;
	private Author authorName;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}
	public Author getAuthorName() {
		return authorName;
	}
	public void setAuthorName(Author authorName) {
		this.authorName = authorName;
	}
	
}