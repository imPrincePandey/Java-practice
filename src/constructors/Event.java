package constructors;

//..............Constructor overloading..................
//................Event Management System................

public class Event {
	String eventName;
	int participants;
	boolean hasCustomName;
	
	public Event() {
		eventName = "General Assembly";
		participants = 50;
		hasCustomName = false;
	}
	
	public Event(String eventName) {
		this.eventName = eventName;
		participants = 50;
		hasCustomName = true;
	}
	
	public Event(String eventName, int participants) {
		this.eventName = eventName;
		this.participants = participants;
		hasCustomName = true;
	}
	
	public void displayDetails() {
		System.out.println("Event: " + eventName);
		System.out.println("Participants: " + participants);
	}

}
