package com.fundamentals.constructorsSuperOf;

class Library {
	String libraryName;
	String location;

	Library(String libraryName, String location) {
		this.libraryName = libraryName;
		this.location = location;
	}
}

public class Book extends Library {
	String title;
	String author;
	int pages;

	Book(String libraryName, String location, String title, String author, int pages) {
		super(libraryName, location);
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

	public static void main(String[] args) {
		Book b = new Book("B-Lib","Hyderabad","The wings of fire", "Abdul kalam", 200);
		System.out.println(b.title);
		System.out.println(b.author);
		System.out.println(b.pages);
		System.out.println(b.libraryName);
		System.out.println(b.location); 
		
	}

}
