package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.DBUtil.Db;
import com.cg.entities.Author;
import com.cg.entities.Book;

public class AuthorBookDAOImpl implements AuthorBookDAO {
	
	Db con;
	EntityManager entityManager;
	
	public AuthorBookDAOImpl() {
		con=new Db();
		entityManager=con.getManager();
	}
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		String query= "select b from Book b";
		TypedQuery<Book> t= entityManager.createQuery(query, Book.class);
		return t.getResultList();
	} 

	@Override
	public List<Book> getBooksByAuthor(String author_name) {
		// TODO Auto-generated method stub
	//	Query query=  manager.createQuery("select b from Book b join b.authorList a where a.authorName=:author_name");
	//query.setParameter("author_name",author_name);
		String query= "select b from Book b where b.ISBN in (select bl.ISBN from BookList bl where ID in (select a.ID from Author a where a.name=\'"+author_name+"\'))";
		TypedQuery<Book> t= entityManager.createQuery(query, Book.class);
		return t.getResultList();
	}

	@Override
	public List<Book> getBooksByPriceRange(double min, double max) {
		// TODO Auto-generated method stub
		String query= "select b from Book b where price between "+min+" and "+max;
		TypedQuery<Book> t= entityManager.createQuery(query, Book.class);
		return t.getResultList();
	}

	@Override
	public List<Author> getAuthorName(long b_id) {
		// TODO Auto-generated method stub
		String query= "select a from Author a where a.ID in (select bl.ID from BookList bl where bl.ISBN in (select b.ISBN from Book b where b.ISBN="+b_id+"))";
		TypedQuery<Author> t= entityManager.createQuery(query, Author.class);
		
		return t.getResultList();
	}

}
