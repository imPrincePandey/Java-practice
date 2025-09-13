package methodOverriding;

public class BaseTest {

	public static void main(String[] args) {
		Base b = new Derived();
        b.displayFinal();   // Output: Final method - cannot override
        b.displayStatic();  // Output: Static method - from Base (method hiding)

	}

}
