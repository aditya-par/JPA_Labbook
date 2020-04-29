package com.jpa.service;

import com.jpa.entities.Author;

public interface IAuthorService 
{
	String insertAuthor(Author author);
	String updateAuthor(Author author);
	String deleteAuthor(int authorId);
	Author fetch(int authorId);
}
