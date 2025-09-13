package methodOverriding;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Manager();
        e.work(); // Output: Manager is managing

	}

}
