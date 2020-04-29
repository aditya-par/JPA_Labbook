package com.jpa.dao;

import com.jpa.entities.Author;

public interface IAuthorDao {

	String insertAuthor(Author author);
	String updateAuthor(Author author);
	String deleteAuthor(int authorId);
	Author fetch(int authorId);
}
