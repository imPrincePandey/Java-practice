package encapsulation;

// Student information management program with encapsulation
public class Student {
    private int rollNumber;
    private String name;
    private int age;

    // Default constructor
    public Student() {
        // empty constructor
    }

    // Parameterized constructor
    public Student(int rollNumber, String name, int age) {
        setRollNumber(rollNumber);
        setName(name);
        setAge(age); // use setter to apply validation
    }

    // Getters
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters with validation
    public void setRollNumber(int rollN) {
        if (rollN > 0) {
            this.rollNumber = rollN;
        } else {
            System.out.println("Invalid Roll Number. Must be positive.");
        }
    }

    public void setName(String n) {
        if (n != null && !n.trim().isEmpty()) {
            this.name = n;
        } else {
            System.out.println("Invalid Name. Cannot be empty.");
        }
    }

    public void setAge(int a) {
        if (a > 0) {
            this.age = a;
        } else {
            System.out.println("Invalid Age. Must be positive.");
        }
    }

    // Method to update multiple details at once
    public void updateStudent(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Override toString for clean printing
    @Override
    public String toString() {
        return "Roll Number: " + rollNumber +
               ", Name: " + name +
               ", Age: " + age;
    }
}
