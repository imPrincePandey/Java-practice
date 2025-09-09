package numbers;

import java.util.Scanner;

public class AmicablePair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int n = sc.nextInt();
        System.out.println(sumAmicableNum(n));
        sc.close();
    }

    public static int sumAmicableNum(int n) {
        int totalSum = 0;
        
        for (int i = 2; i < n; i++) {
            int sumDiv = sumOfDivisor(i);
            
            // Check amicable condition
            if (sumDiv != i && sumOfDivisor(sumDiv) == i) {
                totalSum += i; 
            }
        }
        return totalSum;
    }

    public static int sumOfDivisor(int num) {
        if (num <= 1) return 0;
        int sum = 1;
        int sqrt = (int) Math.sqrt(num);
        
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum += i;
                int other = num / i;
                if (other != i) sum += other;
            }
        }
        return sum;
    }
}

