package Control_Constructs;

import java.util.Scanner;

// Factorial Calculator

public class PracticeWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		int factorial = 1;
		while (number > 0) {
			factorial = factorial *number;
			
			number--;
		}
		System.out.println("Fcatorial: " + factorial);
		
		
		
		
		
		
		sc.close();

	}

}
