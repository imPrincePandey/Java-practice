package Control_Constructs;
import java.util.Scanner;


public class Project4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Nationality: ");
		String nationality = sc.next();
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		
		if (nationality.equals("Indian")) {
			if(age>=18) {
				System.out.println("You are eligible to vote in India.");
			} else {
				System.out.println("You are not eligible to vote");
			}
		} else {
			System.out.println("You are not Indain");
		}
		
		sc.close();

	}

}
