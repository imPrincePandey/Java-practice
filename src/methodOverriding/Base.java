package methodOverriding;

public class Base {
    final void displayFinal() {
        System.out.println("Final method - cannot override");
    }
    
    static void displayStatic() {
        System.out.println("Static method - hidden, not overridden");
    }
    
    private void displayPrivate() {
        System.out.println("Private method - not visible outside");
    }
}

class Derived extends Base {
    //  Compile error if you try:
    // void displayFinal() { ... } 
    
    static void displayStatic() {
        System.out.println("Static method in Derived - method hiding");
    }
    
    // This is a new method, not overriding
    private void displayPrivate() {
        System.out.println("Private method in Derived");
    }
}
