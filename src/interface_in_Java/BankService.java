package interface_in_Java;

public interface BankService {
	
	public void deposit(double amount);
	public void withdraw(double amount);
	public double checkBalance();
	public void transfer(double amount, String toAccount);
	

}

class CityBank implements BankService {
	
	double balance;
	public void deposit(double amount) {
		balance += amount;
		System.out.println("CityBank: Deposited $" + amount);
		
		
	}
	
	
	public void withdraw(double amount) {
		
		
		if (balance >= amount) {
			balance -= amount;
			System.out.println("CityBank: Withdraw $" + amount);
		} else {
			System.out.println("CityBank: Insufficient Balance");
		}
	}
	
	public double checkBalance() {
		
		System.out.println("CityBank: The current balance is $" + balance);
		
		return balance;
	}
	
	public void transfer(double amount, String toAccount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("CityBank: Transfered $" + amount + " to " + toAccount);
		}
	}
}


class AxisBank implements BankService {
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("AxisBank: Deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        System.out.println("AxisBank: Withdraw $" + amount);
    }

    public double checkBalance() {
        System.out.println("AxisBank: Current balance $" + balance);
        return balance;
    }

    public void transfer(double amount, String toAccount) {
        System.out.println("AxisBank: Transferred $" + amount + " to " + toAccount);
    }
}


