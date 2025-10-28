package interface_in_Java;

public class BankServiceDemo {

	public static void main(String[] args) {
		BankService cityBank = new CityBank();
		BankService axis = new AxisBank();
		
		System.out.println("=== CityBank Transactions ===");
		testBankOperations(cityBank, 500, 300, 100, "12345ABC");
		
		System.out.println("\n=== AxisBank Transactions ===");
		testBankOperations(axis, 800, 200, 150, "67890XYZ");
		

	}
	
	public static void testBankOperations(BankService bank, double deposit, double withdraw, double transfer, String transferTo) {
		bank.deposit(deposit);
		bank.withdraw(withdraw);
		bank.checkBalance();
		bank.transfer(transfer, transferTo);
	}

}
