package inheritance;

public class Person1Test {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Mohan", 40);
        Employee e1 = new Employee("Alice", 28, "E101", 50000);
        Manager m1 = new Manager("John", 35, "M201", 80000, "IT");

        System.out.println("--- Person ---");
        p1.display();

        System.out.println("\n--- Employee ---");
        e1.display();

        System.out.println("\n--- Manager ---");
        m1.display();
    }
}

