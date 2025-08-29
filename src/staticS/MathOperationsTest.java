package staticS;
import java.util.Scanner;

public class MathOperationsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the operation (Addition / Subtraction / Multiplication / Division): ");
		String operation = sc.next();
		
		
		System.out.print("Enter the first no: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the second no: ");
		int b = sc.nextInt();
		
		sc.close();
		
		switch(operation) {
		case "Addition":
			int addR = MathOperations.addition(a, b);
			System.out.println("The result of Addition is: "+addR);
			break;
		case "Subtraction":
			int subR = MathOperations.subtraction(a, b);
			System.out.println("The result of Subtraction is: "+subR);
			break;
		case "Multiplication":
			int multR = MathOperations.multiplication(a, b);
			System.out.println("The result of Multiplication is: "+multR);
			break;
		case "Division":
			if (b == 0) {
			    System.out.println("Division by zero not allowed!");
			} else {
			int divR = MathOperations.division(a, b);
			System.out.println("The result of Subtraction is: "+divR);
			break;
		}
		default:
            System.out.println("Invalid operation entered!");
		}

	}

}
