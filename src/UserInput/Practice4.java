package UserInput;

import java.util.Scanner;


public class Practice4 {

	public static void main(String[] args) {
		greet();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter loan Amount(Principal): ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter annual interest rate(%): ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the loan tenure(in Month): ");
		int months = sc.nextInt();
		
		double emi = emiCalculator(principal, rate, months);
				System.out.printf("Your Monthly EMI is: %.2f\n", emi);
		
		
		
		
		
		
		
		
		sc.close();

	}
	
	 // Method to calculate EMI
	
	     public static double emiCalculator(double principal, double rate, int months) { 
	    	// Convert annual interest rate to monthly and percentage to decimal
	         double monthlyRate = rate / (12 * 100);
	      // EMI formula: [P × R × (1+R)^N] / [(1+R)^N – 1]
	         double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
	                      (Math.pow(1 + monthlyRate, months) - 1);
	         return emi;
	         
	    	 
	     }
	     public static void greet () {
	    	 System.out.println("Welcome to Loan EMI Calculator!");
	     }

}
