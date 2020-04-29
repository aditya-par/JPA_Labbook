package com.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.entities.Author;

public class AuthorDaoImpl implements IAuthorDao{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("connect");
	EntityManager em ;
	
	public String insertAuthor(Author author) {
		em=emf.createEntityManager();  //creating entity manager
		em.getTransaction().begin();   //transaction begins
		em.persist(author);            //adding instance of author to persistence
		em.getTransaction().commit();  //committing to database 
		em.close();		              //closing entity manager
		return "Inserted Successfully";
	}

	public String updateAuthor(Author author) {
		em = emf.createEntityManager();
		Author auth = em.find(Author.class,author.getAuthorId());
		em.getTransaction().begin();
		auth.setFirstName(author.getFirstName());
		auth.setMiddleName(author.getMiddleName());
		auth.setLastName(author.getLastName());
		auth.setPhoneNo(author.getPhoneNo());
		em.getTransaction().commit();
		em.close();
		return "Updated Successfully";
		
	}

	public String deleteAuthor(int authorId) {
		em=emf.createEntityManager();
		Author delete = em.find(Author.class, authorId);
		em.getTransaction().begin();
		em.remove(delete);
		em.getTransaction().commit();
		em.close();	
		return "Deleted Successfully";
		
	}

	public Author fetch(int authorId) {
		em=emf.createEntityManager();
		Author fetched=em.find(Author.class, authorId);
		return fetched;
	}

}
