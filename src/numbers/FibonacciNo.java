package numbers;
import java.util.Scanner;

public class FibonacciNo {
	
	  // The Fibonacci sequence is a special series of numbers where:

      // The first two numbers are 0 and 1.

      // Every number after that is the sum of the previous two numbers.
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        
		sc.close();
		
		int first = 0 , second = 1;
		
		System.out.print("Fibonacci Series: ");
		
		// first two number
		
		if (n >= 1) {
			System.out.print(first + " ");
		}
		if (n >= 2) {
			System.out.print(second+ " ");
		}
		
		 // Generate next terms using loop
		for (int i= 3 ; i <= n; i++) {
			int next = first + second;
			System.out.print(next+ " ");
			
			// update the values
			
			first = second;
			second = next;
		}
		

	}

}
