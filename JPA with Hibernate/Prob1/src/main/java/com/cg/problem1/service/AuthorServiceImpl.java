package com.cg.problem1.service;

import com.cg.problem1.dao.AuthorDao;
import com.cg.problem1.dao.AuthorDaoImpl;
import com.cg.problem1.entities.Author;

public class AuthorServiceImpl implements AuthorService {
	private AuthorDao dao;
	public AuthorServiceImpl() {
		dao=new AuthorDaoImpl();
	}
	@Override
	public void addAuthor(Author author) {
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
	}

	@Override
	public void updateAuthor(Author author) {
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public void removeAuthor(Author author) {
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public Author findAuthorById(int id) {
		Author author=dao.getAuthorById(id);
		return author;
	}

}
