package Control_Constructs;
import java.util.Scanner;

// Factorial fun with user input magic

public class PracticeDoWhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No: ");
		int a = sc.nextInt();
		System.out.println("Enter Second No: ");
		int b = sc.nextInt();
		
		int factA = 1;
		int i = a;
		do {
			factA = factA*i;
			i--;
		} while (i>0);
		
		int factB= 1;
		int j= b;
		do {
			factB *=j;
			j--;
		} while (j>0);
		
		System.out.println("Factorial of " + a+ " is "+ factA);
		System.out.println("Factorial of " + b+ " is "+ factB);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
