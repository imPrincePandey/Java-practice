package UserInput;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Scanner object to take input from keyboard
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter you name: ");
		String name = sc.nextLine(); // Read a full line of text
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your Gender: ");
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter your CGPA:");
		double cgpa= sc.nextDouble();
		
		// Print the collected information
		
		System.out.println("Hello, " + name + "! Welcome to Java.");
		System.out.println("Age: "+ age);
		System.out.println("Gender: " + gender);
		System.out.println("CGPA: " + cgpa);
		
		
		sc.close(); // Close the scanner to free system resources
		

	}

}
