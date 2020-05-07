package main.java;
import java.util.Scanner;

import book.management.system.dto.Author;
import book.management.system.dto.Book;
import util.Menu;
import util.WriteFile;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Author[] author = new Author[10];
		Book[] book = new Book[10];
		
		Menu.showMenu();
		
		int index=sc.nextInt();
		switch(index) {
			case 1:
				int i;
				for (i = 0; i <author.length; i++) {
				      if (author[i] == null) {
				        break;
				      }
				    }
				author[i].setAuthorId(i);
				System.out.print("Nome do Autor: ");
				author[i].setAuthorName(sc.next());
				System.out.print("Nacionalidade do author: ");
				author[i].setNationality(sc.next());
				System.out.print("Ano de Nascimento do author: ");
				author[i].setBirthdayYear(sc.nextInt());
				System.out.println("");
				System.out.println("|||Cadastro Realizado com Sucesso|||");
				System.out.println("");
			
			case 2:
				int j;
				for (j = 0; j <book.length; j++) {
				      if (book[j] == null) {
				        break;
				      }
				    }
				book[j].setBookId(j+1);
				System.out.print("Nome do Livro: ");
				book[j].setBookName(sc.next());
				System.out.print("Nome do Autor: ");
				book[j].setAuthorName(sc.next());
				System.out.print("Nome da Editora: ");
				book[j].setPublishingCompany(sc.next());
				System.out.print("Edição: ");
				book[j].setEdition(sc.nextInt());
				System.out.print("Ano de Publicação ");
				book[j].setPublishingYear(sc.nextInt());
				System.out.println("");
				System.out.println("|||Cadastro Realizado com Sucesso|||");
				System.out.println("");
	
			case 3:
			
			case 4:
			
			case 5:
				
			default:
				System.out.println("");
				System.out.println("selecione uma opção válida");
		}


//		author1.setAuthorName("Clarisse Lispector");
//		author1.setNationality("Brasileira");
//		author1.setBirthdayYear(1920);
//		author1.setAuthorId(1);
//		
//		author2.setAuthorName("Machado de Assis");
//		author2.setNationality("Brasileiro");
//		author2.setBirthdayYear(1839);
//		author2.setAuthorId(2);
//		
//		author3.setAuthorName("Stephen King");
//		author3.setNationality("Americano");
//		author3.setBirthdayYear(1947);
//		author3.setAuthorId(3);
//		
//		book1.setBookName("A Hora da Estrela");
//		book1.setEdition(1);
//		book1.setPublishingYear(1977);
//		book1.setPublishingCompany("José Olympio");
//		book1.setAuthorName(author1.getAuthorName());
//		book1.setBookId(1);
//		
//		book2.setBookName("Dom Casmurro");
//		book2.setEdition(1);
//		book2.setPublishingYear(1899);
//		book2.setPublishingCompany("Martin Claret");
//		book2.setAuthorName(author2.getAuthorName());
//		book2.setBookId(2);
//		
//		book3.setBookName("It: a Coisa");
//		book3.setEdition(1);
//		book3.setPublishingYear(1986);
//		book3.setPublishingCompany("Viking Press");
//		book3.setAuthorName(author3.getAuthorName());	
//		book3.setBookId(3);	
	}
}