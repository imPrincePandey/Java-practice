package constructors;

public class BookTest {

	public static void main(String[] args) {
		
		// Creating objects with constructor
		
		Book b1 = new Book("Word Power Made Easy", "Norman Lewish", 179.99);
		Book b2 = new Book("Pride & Prejudice", "Jane Austen", 233.59);
		Book b3 = new Book("You Become What You Think", "Shubham Kumar Sinhg", 147.00);
		
		// call the method 
		// Display details
		
		b1.displayResult();
		System.out.println("--------------------------");
		b2.displayResult();
		System.out.println("--------------------------");
		b3.displayResult();


	}

}
