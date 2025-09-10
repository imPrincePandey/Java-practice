package constructors;

// ..............Employee Management System ft.super()..........

public class Employee {
	private String name;
	private int id;
	private String department;
	
	// create parameterized constructor
	
	public Employee(String name, int id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}
	
	// // Getters
	public String getName() {
		return name;
	}
	public int getId() { return id; }
	
	public String getDepartment() {
		return department;
	}

}

class Manager extends Employee {
	private int teamSize;
	
	// create Parameterized constructor
	
	public Manager(String name, int id, String department, int teamSize) {
		super(name, id, department); // calls parent constructor
		this.teamSize = teamSize;
	}
	
	// Getters
	
	public int getTeamSize() {
		return teamSize;
	}
	// create method display
	
	public void displayResult() {
		System.out.println("Manager Name: " + getName());
		System.out.println("Manager ID: " + getId());
		System.out.println("Department: " + getDepartment());
		System.out.println("Team Size: " + teamSize);
	}
	
}

// create developer subclass

class Developer extends Employee {
	private String programmingLanguage;
	
	public Developer(String name, int id, String department, String programmingLanguage) {
		super(name, id, department);
		this.programmingLanguage = programmingLanguage;
	}
	
	// Getters
	
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	
	// create method
	
	public void displayResult() {
		System.out.println("Developer name: " + getName());
		System.out.println("Employee ID: " + getId());
		System.out.println("Department: " + getDepartment());
		System.out.println("Programming Language: " + programmingLanguage);
		
	}
}
