package Loop;

public class Pattern1 {

	public static void main(String[] args) {
		
		// use nested For loop to print the given message
		
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
