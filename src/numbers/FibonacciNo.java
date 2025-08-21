package numbers;
import java.util.Scanner;

public class FibonacciNo {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        sc.close();

        int first = 0, second = 1;

        System.out.print("Prime Fibonacci Numbers: ");

        for (int i = 1; i <= n; i++) {
            int next;
            if (i == 1) {
                next = first;
            } else if (i == 2) {
                next = second;
            } else {
                next = first + second;
                first = second;
                second = next;
            }

            // check prime and print
            if (isPrime(next)) {
                System.out.print(next + " ");
            }
        }
    }
}
