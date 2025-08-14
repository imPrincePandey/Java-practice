package Loop;

public class Pattern3 {

	public static void main(String[] args) {
		// use nested For loop to print the given message
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
