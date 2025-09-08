package inheritance;

// .............Implementing Inheritance in Java.............

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // Display / toString
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    private String studentId;

    // Constructor with super
    public Student(String name, int age, String studentId) {
        super(name, age); // call Person constructor
        this.studentId = studentId;
    }

    // Getter
    public String getStudentId() {
        return studentId;
    }

    // Overriding display
    @Override
    public void display() {
        super.display(); // reuse Person's display
        System.out.println("Student ID: " + studentId);
    }
}

