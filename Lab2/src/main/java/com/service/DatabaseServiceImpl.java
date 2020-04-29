package com.service;

import java.util.List;


import com.dao.DatabaseDaoImpl;
import com.beans.Author;
import com.beans.Book;

public class DatabaseServiceImpl implements IDatabaseService {

	DatabaseDaoImpl dao = new DatabaseDaoImpl();
	
	public void putAuthor(Author a) {
		// TODO Auto-generated method stub
		dao.putAuthor(a);
	}

	public List<Author> getAllAuthor() {
		// TODO Auto-generated method stub
		List<Author> authors = dao.getAllAuthor();
		return authors;
	}

	public void putBook(Book b) {
		// TODO Auto-generated method stub
		dao.putBook(b);
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = dao.getAllBooks();
		return books;
	}

	public List<Book> getByPrice(int min, int max) {
		// TODO Auto-generated method stub
		List<Book> books = dao.getByPrice(min, max);
		return books;
	}

	public Book getBook(int bid) {
		// TODO Auto-generated method stub
		return dao.getBook(bid);
	}

}
