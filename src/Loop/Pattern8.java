package Loop;

public class Pattern8 {

	public static void main(String[] args) {
		
		// _____Print Letter Diamond Half_____
		
		int n= 4;
		
		// print upper half
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) ('A' + i - 1));
			}
			System.out.println();
		}
		
		// print lower half 
		
		for (int i = n-1; i >= 1; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print((char) ('A' + i - 1));
			}
			System.out.println();
		}

	}

}
