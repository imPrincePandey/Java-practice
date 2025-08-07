package Control_Constructs;
import java.util.Scanner;

// Print Even number from 1 to N

public class PracticeWhileLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n = sc.nextInt();
		
//		int i = 2; //initialization
//		while (i<= n) {
//			System.out.println(i);
//			i = i+2;
//			
//		}
		
		int i = 1;
		while (i <= n) {
			if (i%2 == 0) {
				System.out.println(i);
			}
			i++;
			
		}
		
		
		sc.close();

	}

}
