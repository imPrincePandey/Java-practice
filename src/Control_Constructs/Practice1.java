package Control_Constructs;
import java.util.Scanner;

// senior citizen check based on age

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		// take user input
		System.out.println("Please Enter Your Age");
		int age = scan.nextInt();
		checkSeniorCitizen(age);
		
		scan.close();
		

	}
	
	public static void checkSeniorCitizen(int age) {
		if(age>=60) {
			System.out.println("You are Senior Citizen");
		}
		
		else {
			System.out.println("You are not a Senior Citizen");
		}
	}

}
