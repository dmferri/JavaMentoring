import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Author author1 = new Author();
		Book book1 = new Book();
		
		System.out.printf("Author Name: ");
		author1.setAuthorName(sc.next());
		System.out.printf("Author Nationality: ");
		author1.setNationality(sc.next());
		System.out.printf("Author Birthday Year: ");
		author1.setBirthdayYear(sc.nextInt());
		
		System.out.printf("Book Name: ");
		book1.setBookName(sc.next());
		System.out.printf("Book Edition: ");
		book1.setEdition(sc.nextInt());
		System.out.printf("Book Publishing Year: ");
		book1.setPublishingYear(sc.nextInt());
		System.out.printf("Name of the Publishing Company: ");
		book1.setPublishingCompany(sc.next());
		System.out.printf("Book Author: ");
	}

}
