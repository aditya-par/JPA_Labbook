package com.jpa.controller;

import java.util.Scanner;

import javax.persistence.Persistence;

import com.jpa.entities.Author;
import com.jpa.service.AuthorServiceImpl;

public class MainController {
	
	static Scanner scn = new Scanner(System.in);
	static AuthorServiceImpl authorService = new AuthorServiceImpl();
	
	public static void main(String[] args) {
		int choice = 0;
		do {
			System.out.println("Enter your choice :");
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Fetch");
			System.out.println("5. Exit");
			choice = scn.nextInt();
			switch(choice) 
			{
			case 1: insert();
					break;
			case 2: update();
					break;
			case 3: delete();
					break;
			case 4: fetch();
					break;
			case 5: System.out.println("Exit"); 
				    System.exit(0);
			default: System.out.println("Wrong choice");
			}
		}
		while(choice!=5);
		
		
	}
	static void insert() 
	{
		System.out.println("Enter the Author Id:");
		int id=scn.nextInt();
		System.out.println("Enter the Author FirstName:");
		String firstName=scn.next();
		System.out.println("Enter the Author MiddleName:");
		String middleName=scn.next();
		System.out.println("Enter the Author LastName:");
		String lastName=scn.next();
		System.out.println("Enter the Author Phone Number:");
		String phone=scn.next();
		
		Author author= new Author();
		author.setAuthorId(id);
		author.setFirstName(firstName);
		author.setMiddleName(middleName);
		author.setLastName(lastName);
		author.setPhoneNo(phone);
		System.out.println(authorService.insertAuthor(author));
	}
	 static void update() 
	 {
		System.out.println("Enter the Author Id:");
		int id=scn.nextInt();
		System.out.println("Enter the Author FirstName to update:");
		String firstName=scn.next();
		System.out.println("Enter the Author MiddleName to update:");
		String middleName=scn.next();
		System.out.println("Enter the Author LastName to update:");
		String lastName=scn.next();
		System.out.println("Enter the Author Phone Number to update:");
		String phone=scn.next();
		
		Author author= new Author();
		author.setAuthorId(id);
		author.setFirstName(firstName);
		author.setMiddleName(middleName);
		author.setLastName(lastName);
		author.setPhoneNo(phone);
		System.out.println(authorService.updateAuthor(author));

	}
	
	static void delete() {
		System.out.println("Enter the Author Id:");
		int id=scn.nextInt();
		
		System.out.println(authorService.deleteAuthor(id));

		
	}
	static void fetch() {
		System.out.println("Enter the Author Id:");
		int id=scn.nextInt();
		System.out.println(authorService.fetch(id));
	}
}
