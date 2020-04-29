package com.jpa.service;

import com.jpa.dao.AuthorDaoImpl;
import com.jpa.entities.Author;

public class AuthorServiceImpl implements IAuthorService{
	
	//Object of DAO
	AuthorDaoImpl authorDao = new AuthorDaoImpl();
	
	//method for adding author
	public String insertAuthor(Author author) 
	{
		String result= authorDao.insertAuthor(author);
		return result;
		
	}

	//method for updating author
	public String updateAuthor(Author author) 
	{
		String result= authorDao.updateAuthor(author);
		return result;
		
	}

	//deleting author
	public String deleteAuthor(int authorId) 
	{
		String result= authorDao.deleteAuthor(authorId);
		return result;
	}

	//fetching author by id
	public Author fetch(int authorId) 
	{
		return authorDao.fetch(authorId);
	}

}
