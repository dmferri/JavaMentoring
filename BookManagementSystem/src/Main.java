
public class Main {

	public static void main(String[] args) {
		
		Author author1 = new Author();
		Author author2 = new Author();
		Author author3 = new Author();
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		author1.setAuthorName("Clarisse Lispector");
		author1.setNationality("Brasileira");
		author1.setBirthdayYear(1920);
		
		author2.setAuthorName("Machado de Assis");
		author2.setNationality("Brasileiro");
		author2.setBirthdayYear(1839);
		
		author3.setAuthorName("Stephen King");
		author3.setNationality("Americano");
		author3.setBirthdayYear(1947);
		
		book1.setBookName("A Hora da Estrela");
		book1.setEdition(1);
		book1.setPublishingYear(1977);
		book1.setPublishingCompany("Jos� Olympio");
		book1.setAuthorName(author1.getAuthorName());
		
		book2.setBookName("Dom Casmurro");
		book2.setEdition(1);
		book2.setPublishingYear(1899);
		book2.setPublishingCompany("Martin Claret");
		book2.setAuthorName(author2.getAuthorName());
		
		book3.setBookName("It: a Coisa");
		book3.setEdition(1);
		book3.setPublishingYear(1986);
		book3.setPublishingCompany("Viking Press");
		book3.setAuthorName(author3.getAuthorName());	
	}
}