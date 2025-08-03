package UserInput;

import java.util.Scanner;
//  Print Square of a Number

public class Practice2 {
	
	static int printSquare(int num) {
		return num*num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		
		// call the method and print the result
		System.out.println("The square of " + num + " is: " + printSquare(num));
		
		sc.close();

	}

}
