package Loop;

public class Pattern6 {

	public static void main(String[] args) {
		
		// print full diamond pattern

		// print upper half of diamond
		
		for (int i = 1; i<=5; i++) {
			// print spaces 
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			// print asterisks and spaces
			
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// print lower half of diamond
		
		for (int i = 1; i <= 4; i++) {
		    // spaces
		    for (int j = 1; j <= i; j++) {
		        System.out.print(" ");
		    }
		    // stars
		    for (int k = 4; k >= i; k--) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}

}
