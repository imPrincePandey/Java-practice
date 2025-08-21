package numbers;
import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the digit: ");
		int num = sc.nextInt();
		
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			int digit = temp % 10;
			temp = temp / 10;
			sum += digit;
		}
		System.out.println("Sum of digit: "+ sum);
		
		
		
		sc.close();

	}

}
