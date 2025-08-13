package Loop;

import java.util.Scanner;

  // Print even numbers between 1 and 20 without using an if to check odd numbers for printing.


public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Even numbers are: ");
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				continue;
				
			}
			
			System.out.print(i + " ");
		}
		
		
		
		
		sc.close();
		

	}

}
