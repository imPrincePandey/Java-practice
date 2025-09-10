package constructors;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager m1 = new Manager("Sumit Patha", 101, "Finance", 5);
		Developer d1 = new Developer("Prince Pandey", 102, "IT", "Java");
		
		m1.displayResult();
		System.out.println("\n--------------------------");
		d1.displayResult();

	}

}
