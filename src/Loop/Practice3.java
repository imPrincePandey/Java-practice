package Loop;

import java.util.Random;

public class Practice3 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int num ;
		
		while(true) {
			num = rand.nextInt(20) + 1;
			System.out.println("Generated: " + num);
			
			if (num == 13) {
				System.out.println("Found 13! Stopping...");
				break;
			}
			
			
			
			
		}
		

	}

}
