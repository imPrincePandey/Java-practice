package numbers;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input decimal number
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        sc.close();

        int original = num;
        String binary = "";

        // Edge case: if number is 0
        if (num == 0) {
            binary = "0";
        } else {
            while (num > 0) {
                int remainder = num % 2;          // get remainder
                binary = remainder + binary;      // append at front
                num = num / 2;                    // reduce number
            }
        }

        System.out.println("Decimal " + original + " in Binary = " + binary);

        

	}

}
