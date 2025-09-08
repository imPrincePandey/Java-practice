package inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Mohan", 22);
        Student s1 = new Student("Alice", 23, "S12345");

        p1.display();
        s1.display();
    }
}

