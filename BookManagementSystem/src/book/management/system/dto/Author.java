package book.management.system.dto;

public class Author {
	private String authorName;
	private String nationality;
	private int birthdayYear;
	private int authorId;
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getBirthdayYear() {
		return birthdayYear;
	}
	public void setBirthdayYear(int birthdayYear) {
		this.birthdayYear = birthdayYear;
	}
	public void printAuthor() {
		System.out.println(authorId);
		System.out.println(authorName);
		System.out.println(nationality);
		System.out.println(birthdayYear);
	}
}
