package constructors;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Prince"); // normal constructor
		s1.displayResult();
		Student s2 = new Student(s1); // copy constructor
		s2.displayResult();
		
		//Changing the Student name 
		
		s2.name = "Pandey";
		s2.roll = 102;
		
		System.out.println("After Modifying the copy");
		s2.displayResult();
		s1.displayResult();
		
		
		
		

	}

}
