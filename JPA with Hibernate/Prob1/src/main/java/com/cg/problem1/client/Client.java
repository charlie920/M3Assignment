package com.cg.problem1.client;

import com.cg.problem1.entities.Author;
import com.cg.problem1.service.AuthorService;
import com.cg.problem1.service.AuthorServiceImpl;

public class Client {

	public static void main(String[] args) {
		AuthorService authorService=new AuthorServiceImpl();
		Author author=new Author();
		author.setAuthorId(100);
		author.setFirstName("Amar");
		author.setMiddleName("kr");
		author.setLastName("Upadhyaya");
		author.setPhoneNo(809015);
		authorService.addAuthor(author);
		Author author1=authorService.findAuthorById(100);
		System.out.println("ID: "+author1.getAuthorId()+" Name: "+author1.getFirstName()+author1.getMiddleName()+author1.getLastName());
	}

}
