package com.abe.java_basic.text4_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookMain {
	public static void main(String[] args) {
		Set<Book> books = new HashSet<Book>();
		books.add(new Book("AAA", new Date(1000000000), "Note"));
		books.add(new Book("BBB", new Date(22222222), "Note"));
		books.add(new Book("AAA", new Date(300000000), "AAA"));
		books.add(new Book("AAA", new Date(100), "abebe"));
		
		for (Book b : books) {
			System.out.println(b.toString());
		}
		
		List<Book> bookLists = new ArrayList<>();
		bookLists.add(new Book("AAA", new Date(1000000000), "Note"));
		bookLists.add(new Book("BBB", new Date(22222222), "Note"));
		bookLists.add(new Book("AAA", new Date(300000000), "AAA"));
		bookLists.add(new Book("AAA", new Date(100), "abebe"));
		
		for (Book b : bookLists) {
			System.out.println(b);
		}
		
		Collections.sort(bookLists);
		
		for (Book b : bookLists) {
			System.out.println(b);
		}
		
		Book book1 = new Book("A", new Date(), "Note");
		Book book2 = book1.clone();
		System.out.println(book1);
		System.out.println(book2);
		
		book2.setTitle("bbbb");
		System.out.println(book1);
		System.out.println(book2);
				
		
	}

}
