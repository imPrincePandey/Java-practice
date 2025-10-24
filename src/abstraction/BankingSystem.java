package abstraction;

public class BankingSystem {

	public static void main(String[] args) {
		Bank bank1 = new SBI();
		bank1.welcomeMessage();
        bank1.rateOfInterest();
        
        Bank bank2 = new HDFC();
        bank2.welcomeMessage();
        bank2.rateOfInterest();

	}

}

// Abstract class

abstract class Bank {
    abstract void rateOfInterest(); // abstract method

    void welcomeMessage() { // concrete method
        System.out.println("Welcome to the Bank");
    }
}

// Subclass
class SBI extends Bank {
    void rateOfInterest() {
        System.out.println("SBI Interest Rate: 7%");
    }
}

class HDFC extends Bank {
    void rateOfInterest() {
        System.out.println("HDFC Interest Rate: 8%");
    }
}

