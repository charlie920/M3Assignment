package com.cg.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Author")
public class Author {

	@Id
	private long ID;
	private String name;
	@ManyToMany(targetEntity=Book.class)
	private List<Book> bookList = new ArrayList<>();



	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public Author(long ID, String name, List<Book> bookList) {
		super();
		this.ID = ID;
		this.name = name;
		this.bookList = bookList;
	}

	public long getID() {
		return ID;
	}

	public void setID(long ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList2) {
		this.bookList=bookList2;
	}
	
	
}
