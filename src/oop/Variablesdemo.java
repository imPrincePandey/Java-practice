package oop;

class Student1 {
    // Instance variable
    String name;
    int age;

    void setStudent(String n, int a) {
        // Local variables
        String course = "Java";  
        name = n;  // assigning to instance variable
        age = a;
        
        System.out.println("Local variable (course): " + course);
    }

    void display() {
        System.out.println("Instance variable (name): " + name);
        System.out.println("Instance variable (age): " + age);
    }
}





public class Variablesdemo {
	 public static void main(String[] args) {
	        Student1 s1 = new Student1();
	        s1.setStudent("Prince", 22);
	        s1.display();
	    }

}
