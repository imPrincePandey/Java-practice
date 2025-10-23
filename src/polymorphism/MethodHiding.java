package polymorphism;

public class MethodHiding {

	public static void main(String[] args) {
		Person p1 = new Person();
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		
		Person.work();
		Employee.work();
		Manager.work();
		
		

	}

}

// Method hiding: it is work with static method is based on the reference type.
// when static method of child class has the same name and parameter as static method in the  parent class is method hiding.  
class Person {
	public static void work() {
		System.out.println("Person is working.");
	}
   
}


class Employee extends Person {
	public static void work() {
		System.out.println("Employee is working.");
	}
	
}

class Manager extends Employee {
	public static void work() {
		System.out.println("Manager is working.");
	}
	
}