package numbers;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            
        }
		
		sc.close();
		
		int first = 0, second = 1;
		
		System.out.print("Fibonacci series: ");
		
		if (n >= 1) {
            System.out.print(first + " ");
        }
        // print second term
        if (n >= 2) {
            System.out.print(second + " ");
        }
		
			for (int i = 3; i <= n; i++) {
				int next = first + second;
				System.out.print(next+" ");
				
				// update values
				
				first = second;
				second = next;
				
			}
			
		
		



	}

}
