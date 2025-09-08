package inheritance;

public class Person1 {
    private String name;
    private int age;

    // Constructor
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }

    // Display
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
 // First-Level Child (Employee extends Person1)

 class Employee extends Person1 {
    private String employeeId;
    private double salary;

    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age);  // call Person constructor
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }

    @Override
    public void display() {
        super.display();  // reuse Person display
        System.out.println("Employee ID: " + employeeId + ", Salary: " + salary);
    }
}
 
 // Second-Level Child (Manager extends Employee)
 
  class Manager extends Employee {
	    private String department;

	    public Manager(String name, int age, String employeeId, double salary, String department) {
	        super(name, age, employeeId, salary);  // call Employee constructor
	        this.department = department;
	    }

	    public String getDepartment() { return department; }

	    @Override
	    public void display() {
	        super.display();  // reuse Employee (which already reused Person)
	        System.out.println("Department: " + department);
	    }
	}
