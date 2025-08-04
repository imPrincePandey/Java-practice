package Control_Constructs;
import java.util.Scanner;

// Ticket Pricing Calculator

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your age:");
		int age = scan.nextInt();
		
		scan.close();
		
		// declare integer variable age and assign a value of 12 to the age 
		
		if(age<3) {
			System.out.println("free Pass:");
		} else if (age>=3 && age<=12) {
			System.out.println("Child Ticket: $10");
		} else if (age>=13 && age<=60) {
			System.out.println("Adult Ticket: $15");
		} else {
			System.out.println("Senior Citizen Ticket: $12");
		}
		

	}

}
