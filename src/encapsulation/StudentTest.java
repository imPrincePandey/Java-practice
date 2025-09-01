package encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		// set the value using setter method
		s1.setRollNumber(101);
		s1.setName("Amit");
		s1.setAge(20);
		
		// display the student details
		System.out.println("Initial Student Details:");
		System.out.println("Roll Number: " + s1.getRollNumber());
		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
		
		// change some details
		s1.setName("Prince");
		s1.setAge(-5);
		s1.setAge(21);
		
		// display final result 
		System.out.println("Final Student Details:");
		System.out.println("Roll Number: " + s1.getRollNumber());
		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
		
		



	}

}
