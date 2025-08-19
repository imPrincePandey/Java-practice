package numbers;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Input from user
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		int reversed = 0;
		int original = number;
		
		while (number != 0) {
			int digit = number % 10; 
			// Multiply reversed by 10 shifts all digits left.
			reversed = reversed * 10 + digit;
			
			number = number / 10; // chops off the last digit.
		}
		
		System.out.println("Original number is: " + original);
		System.out.println("Reversed Number is: " + reversed);
		
		
		
		
		
		
		sc.close();

	}

}
