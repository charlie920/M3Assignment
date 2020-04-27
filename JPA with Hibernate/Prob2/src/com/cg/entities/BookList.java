package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookList")
public class BookList {

	@Id
	private long ISBN;
	private long ID;
	
	public BookList(long iSBN, long iD) {
		super();
		ISBN = iSBN;
		ID = iD;
	}
	
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	
}
