package com.controller;

import com.beans.Book;
import java.util.List;

import com.beans.Author;
import com.service.DatabaseServiceImpl;


public class MainController {

	public static void main(String[] args) {
		
		DatabaseServiceImpl service = new DatabaseServiceImpl();
		
		//1 
		List<Book> books = service.getAllBooks();
		for (Book book : books) {
			System.out.println(book.getTitle());
		}
		
		//2.
		String a_name = "";
		List<Author> authors = service.getAllAuthor();
		for (Author author : authors) {
			if(author.getName().equalsIgnoreCase(a_name))
			{
				System.out.println(author.getBooks());
			}
		}
		
		//3
		List<Book> bookss = service.getByPrice(500, 1000);
		for (Book book : bookss) {
			System.out.println(book.getTitle());
		}
		
		//4
		Book b = service.getBook(101);
		System.out.println(b.getAuthors());
	}
}
