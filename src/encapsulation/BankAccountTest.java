package encapsulation;

import java.util.ArrayList;

public class BankAccountTest {
    public static void main(String[] args) {
        // Create accounts
        BankAccount acc1 = new BankAccount("ACC1001", "Amit", 5000);
        BankAccount acc2 = new BankAccount("ACC1002", "Priya", 3000);

        // Store accounts in a list
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);

        // Display initial details
        System.out.println("Initial Accounts:");
        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }

        // Perform transactions
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc2.withdraw(5000); // insufficient balance
        acc2.deposit(-200);  // invalid deposit

        // Display final details
        System.out.println("\nAfter Transactions:");
        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }
    }
}
