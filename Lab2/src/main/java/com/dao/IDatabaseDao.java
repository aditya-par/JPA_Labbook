package com.dao;

import java.util.List;


import com.beans.Author;
import com.beans.Book;

public interface IDatabaseDao {
	
	public void putAuthor(Author a);
	public List<Author> getAllAuthor();
	public void putBook(Book b);
	public List<Book> getAllBooks();
	public List<Book> getByPrice(int min, int max);
	public Book getBook(int bid);
}
