package main.java;
import book.management.system.dto.Author;
import book.management.system.dto.Book;
import book.management.system.dto.WriteFile;

public class Main {

	public static void main(String[] args) {
		
		Author author1 = new Author();
		Author author2 = new Author();
		Author author3 = new Author();
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		WriteFile file1 = new WriteFile();
		WriteFile file2 = new WriteFile();
		WriteFile file3 = new WriteFile();
		WriteFile file4 = new WriteFile();
		WriteFile file5 = new WriteFile();
		WriteFile file6 = new WriteFile();
		
		
		author1.setAuthorName("Clarisse Lispector");
		author1.setNationality("Brasileira");
		author1.setBirthdayYear(1920);
		author1.setAuthorId(1);
		file1.content=author1.getAuthorName();
		
		author2.setAuthorName("Machado de Assis");
		author2.setNationality("Brasileiro");
		author2.setBirthdayYear(1839);
		author2.setAuthorId(2);
		file2.content=author2.getAuthorName();
		
		author3.setAuthorName("Stephen King");
		author3.setNationality("Americano");
		author3.setBirthdayYear(1947);
		author3.setAuthorId(3);
		file3.content=author3.getAuthorName();
		
		book1.setBookName("A Hora da Estrela");
		book1.setEdition(1);
		book1.setPublishingYear(1977);
		book1.setPublishingCompany("José Olympio");
		book1.setAuthorName(author1.getAuthorName());
		book1.setBookId(1);
		file4.content=book1.getBookName();
		
		book2.setBookName("Dom Casmurro");
		book2.setEdition(1);
		book2.setPublishingYear(1899);
		book2.setPublishingCompany("Martin Claret");
		book2.setAuthorName(author2.getAuthorName());
		book2.setBookId(2);
		file5.content=book2.getBookName();
		
		book3.setBookName("It: a Coisa");
		book3.setEdition(1);
		book3.setPublishingYear(1986);
		book3.setPublishingCompany("Viking Press");
		book3.setAuthorName(author3.getAuthorName());	
		book3.setBookId(3);
		file6.content=book3.getBookName();		
	}
}