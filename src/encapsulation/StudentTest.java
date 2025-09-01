package encapsulation;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        // Create students using constructor and setters
        Student s1 = new Student(101, "Amit", 20);
        Student s2 = new Student();
        s2.setRollNumber(102);
        s2.setName("Priya");
        s2.setAge(19);

        // Store in a list (managing multiple students)
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        // Display initial details
        System.out.println("Initial Students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Update student details
        s1.updateStudent("Prince", 21);
        s2.setAge(-5); // will show validation message

        // Display after update
        System.out.println("\nAfter Update:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
