package Loop;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 // Get user input
		
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of Columns: ");
		int columns = sc.nextInt();
		
		System.out.println("Enter border character: ");
		char border = sc.next().charAt(0);
		
		for(int i = 1; i<=rows;i++) {
			for (int j=1; j <= columns; j++) {
				
				 // Print star for borders, space inside
				
				if (i == 1 || i ==rows || j ==1 || j == columns) {
					System.out.print(border);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
