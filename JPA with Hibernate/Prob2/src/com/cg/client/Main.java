package com.cg.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.cg.entities.Author;
import com.cg.entities.Book;
import com.cg.service.AuthorBookServiceImpl;

public class Main {

	public static void main(String[] args) throws IOException {
		
		AuthorBookServiceImpl service = new AuthorBookServiceImpl();
		List<Book> list;
		List<Author> list1;
		String choice; 
		String authorName;
		double min,max;
		long bId;
		while(true) {
		
			System.out.println("Enter your choice: ");
			System.out.println("1. Get all the books");
			System.out.println("2. Get books by author");
			System.out.println("3. Get books by price range");
			System.out.println("4. Get author name");
			System.out.println("5. Exit");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice=br.readLine();
			switch(choice) {
			
			case "1": list=service.getAllBooks();
						for(Book b: list)
							System.out.println(b.getISBN()+"\t"+b.getPrice()+"\t"+b.getTitle());
					  break;
			
			case "2": System.out.println("Enter the author name");
					  authorName=br.readLine();
					  list=service.getBooksByAuthor(authorName);
						for(Book b: list)
						System.out.println(b.getTitle());
					  break;
			case "3": System.out.println("Enter the price range");
						min=Double.parseDouble(br.readLine());
						max=Double.parseDouble(br.readLine());
						list=service.getBooksByPriceRange(min, max);
						for(Book b: list)
							System.out.println(b.getISBN()+"\t"+b.getPrice()+"\t"+b.getTitle());
						break;
			case "4": 	System.out.println("Enter the book id");
						bId= br.read();
						list1=service.getAuthorName(bId);
						for(Author s: list1)
							System.out.println(s.getName());
						break;
			case "5":   System.exit(0);

			default:    System.out.println("Enter Valid Choice");
			}
			
		}
			
	}

}
