package com.cg.problem1.dao;

import javax.persistence.EntityManager;

import com.cg.problem1.dao.AuthorUtil;
import com.cg.problem1.entities.Author;

public class AuthorDaoImpl implements AuthorDao{
	
	private EntityManager entityManager;
	public AuthorDaoImpl()
	{
		entityManager= AuthorUtil.getEntityManager();
	}

	@Override
	public Author getAuthorById(int id) {
		Author author=entityManager.find(Author.class, id);
		return author;
	}

	@Override
	public void addAuthor(Author author) {
		entityManager.persist(author);
		
	}

	@Override
	public void removeAuthor(Author author) {
		entityManager.remove(author);
		
	}

	@Override
	public void updateAuthor(Author author) {
		entityManager.merge(author);
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

}
