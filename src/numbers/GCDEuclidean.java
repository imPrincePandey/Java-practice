package numbers;

// Find GCD Using Euclidean Algorithm

import java.util.Scanner;

public class GCDEuclidean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;  // remainder becomes new b
            a = temp;   // old b becomes new a
        }

        System.out.println("GCD is: " + a);

        sc.close();
		

	}

}
