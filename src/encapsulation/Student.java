package encapsulation;

// student information management program

public class Student {
	private int rollNumber;
	private String name;
	private int age;
	
	// public getter method for all fields.
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// create public setter method for name and age.
	
	public void setRollNumber(int rollN) {
		rollNumber = rollN;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	// ensure that the age is not set to a negative value.
	
	public void setAge(int a) {
		if (a > 0) {
		age = a;
	} else {
		System.out.println("Invalid age. Age must be positive.");
	}
	}
	
	
	

}
