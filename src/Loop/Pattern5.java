package Loop;

public class Pattern5 {

	public static void main(String[] args) {
		
		// inverted pyramid or left-aligned inverted triangle pattern using * symbols.
		
		for (int i = 1; i <= 5; i++) {
			
			// print leading spaces
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			
			// print * 
			
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
