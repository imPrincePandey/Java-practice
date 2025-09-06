package constructors;

//................copy constructor.............

public class Student {
	int roll;
	String name;
	
	// Regular Constructor
	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
		
	}
	
	// Copy Constructor
	// In a copy constructor, the parameter is always an object of the same class.
	Student(Student other) {
		this.roll = other.roll;
		this.name = other.name;
	}
	
	public void displayResult() {
		System.out.println("Roll: "+ roll + " Name: " + name);
	}

}
