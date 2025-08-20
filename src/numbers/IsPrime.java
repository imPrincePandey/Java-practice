package numbers;
import java.util.Scanner;


public class IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		// check if number is prime
		
		if (num <= 1) {
			System.out.println(num+ " is not a prime number.");
		}
		else {
			for (int i = 2; i <=num; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number.");
					return;
				}
				
			}
			System.out.println(num + " is a prime number.");
		}
		
		
		
		

	}

}
