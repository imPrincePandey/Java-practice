package Loop;
import java.util.Random;


public class Practice1 {

	public static void main(String[] args) {
		
		Random rand = new Random();
        int num;

        while (true) { // infinite loop until condition is met
            num = rand.nextInt(100) + 1; // generates number from 1 to 100
            System.out.println("Generated: " + num);

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Number divisible by both 3 and 5 found: " + num);
                break; // exit the loop
            }
        }
		

	}

}
