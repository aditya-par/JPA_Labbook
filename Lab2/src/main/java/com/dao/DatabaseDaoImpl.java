package com.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.beans.Author;
import com.beans.Book;

public class DatabaseDaoImpl implements IDatabaseDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");
    EntityManager em = factory.createEntityManager();
	
	public void putAuthor(Author a) {
		
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
	}
	
	public List<Author> getAllAuthor() {
		
		List<Author> authors = em.createQuery("FROM Author",Author.class).getResultList();
		return authors;
	}

	public Book getBook(int bid) {
		
		Book book = em.find(Book.class, bid);
		return book;
	}

	public void putBook(Book b) {
		
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
	}

	public List<Book> getAllBooks() {
		
		List<Book> books = em.createQuery("FROM Book",Book.class).getResultList();
		return books;
	}

	public List<Book> getByPrice(int min, int max) {
		
		List<Book> books = em.createQuery("SELECT b FROM Book b WERE b.price BETWEEN "+min+" and "+max).getResultList();
		return books;
	}

	
}
