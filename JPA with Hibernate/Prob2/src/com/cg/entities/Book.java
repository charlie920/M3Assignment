package com.cg.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {

	@Id
	private long ISBN;
	private String title;
	private double price;
	@ManyToMany(targetEntity=Author.class)
	private List<Author> authorList = new ArrayList<>();
	
	
	public Book() {
		super();
		
	}
	 
	public Book(long ISBN, String title, double price, List<Author> authorList) {
		super();
		this.ISBN = ISBN;
		this.title = title;
		this.price = price;
		this.authorList = authorList;
	}

	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long ISBN) {
		this.ISBN = ISBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<Author> getAuthorList() {
		return authorList;
	}
	public void setAuthorList(List<Author> authList) {
		this.authorList=authList;
	}
	
}
