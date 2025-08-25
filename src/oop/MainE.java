package oop;

public class MainE {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empid = 1;
		emp.name = "Prince";
		emp.salary = 56780.56;
		
		System.out.println(emp.empid);
		System.out.println(emp.name);
		System.out.println(emp.salary);
		emp.work();
		emp.attenMeeting();
		

	}

}
