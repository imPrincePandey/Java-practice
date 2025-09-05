package constructors;

public class EventTest {

	public static void main(String[] args) {
		Event event1 = new Event();
		Event event2 = new Event("Tech Conference");
		Event event3 = new Event("Charity Run", 300);
		
		event1.displayDetails();
		System.out.println("..................");
		event2.displayDetails();
		System.out.println("..................");
		event3.displayDetails();

	}

}
