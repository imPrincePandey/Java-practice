package method;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.roll = 11;
		st1.name = "Prince";
		st1.age = 22;
		st1.phone = 9905753345L;
		st1.marks = 88;
		st1.percentage = 88.0;
		
		st1.displayInfo();
		
		System.out.println("---------------------------");

	}

}
