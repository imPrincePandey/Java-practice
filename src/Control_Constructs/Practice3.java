package Control_Constructs;
import java.util.Scanner;

// Find the Largest Number

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1= sc.nextInt();
		
		System.out.println("Enter Second number: ");
		int num2= sc.nextInt();
		
		System.out.println("Enter third number: ");
		int num3= sc.nextInt();
		
		int largest;
		
		if(num1>=num2 && num1>=num3) {
			largest = num1;
		} else if (num2>=num1 && num2>=num3) {
			largest = num2;
		} else {
			largest = num3;
		}
		
		// Output the result
        System.out.println("The largest number is: " + largest);
        sc.close();
		
		

	}

}
