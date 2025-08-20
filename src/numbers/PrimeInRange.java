package numbers;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();

        sc.close();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
	}

	}
	          // create new method for calculation 
	  
	  public static boolean isPrime(int num) {
		  if (num <= 1) return false;   // 0 and 1 are not prime
	        if (num == 2) return true;    // 2 is prime
	        if (num % 2 == 0) return false; // eliminate even 

	        for (int j = 3; j <= Math.sqrt(num); j += 2) { // check only odd divisors
	            if (num % j == 0) return false;
	        }
	        return true;
	        
	  }
}
