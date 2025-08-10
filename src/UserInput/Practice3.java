package UserInput;
import java.util.Scanner;

//Simple Interest Calculator

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Principal Amount: ");
		double principal = sc.nextDouble();
		
		
		System.out.println("Enter the rate interest: ");
		double rate = sc.nextDouble();
		
		
		System.out.println("Enter time (in year): ");
		double time = sc.nextDouble();
		
		// // Calling static method
				double interest = calculateSimpleInterest(principal,rate,time);
				
				// print the result 
				
				System.out.println("Simple Interest = " + interest);
				
				
	sc.close();

	}
	  
	// / Static method to calculate simple interest
	 
		public static double calculateSimpleInterest(double principal, double rate, double time) {
			return (principal*rate*time)/100;
		}

}
