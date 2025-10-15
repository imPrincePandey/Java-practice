package polymorphism;

public class CompileTime {

	public static void main(String[] args) {
		Calculator c = new Calculator();
        System.out.println(c.add(2, 3));        // calls int add(int,int)
        System.out.println(c.add(2.5, 3.5));    // calls double add(double,double)
        System.out.println(c.add(1, 2, 3));     // calls int add(int,int,int)

	}

}

/*
 * Compile-time Polymorphism -> Method Overloading
 * When multiple methods have the same name but different parameters, 
 * Java decides which one to call at compile-time.
 *  
 */

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
