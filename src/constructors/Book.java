package constructors;

// .............Book Management System..........

public class Book {
	String bookTitle;
	String bookAuthor;
	double bookPrice;
	
	// ................Parameterized Constructor............
	// ................Fundamental concept of Constructor...
	/*
	 * The Constructor name must be the same as the class name.
	 * it has no return type(not even void).
	 * It is called automatically when an object is created.
	 */
	 
	public Book(String bookTitle, String bookAuthor, double bookPrice) {
		// use this keyword to assign the parameter also distinguish between instance variables and constructor parameter.
		
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	
	public void displayResult() {
		System.out.println("Book Title: " + bookTitle);
		System.out.println("Author: " + bookAuthor);
		System.out.println("Price: " +"$" + bookPrice);
	}

}
