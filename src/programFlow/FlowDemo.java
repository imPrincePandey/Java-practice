package programFlow;

class FlowDemo {
    // 1. Static variable
    static int staticVar = 100;

    // 2. Instance variable
    int instanceVar = 200;

    // 3. Static block
    static {
        System.out.println("Static block: runs once when class loads");
        System.out.println("Static variable = " + staticVar);
    }

    // 4. Instance block
    {
        System.out.println("Instance block: runs before constructor");
        System.out.println("Instance variable = " + instanceVar);
    }

    // 5. Constructor
    FlowDemo() {
        System.out.println("Constructor: object created successfully");
    }

    // 6. Static method
    static void staticMethod() {
        System.out.println("Static method: can be called without object");
    }

    // 7. Instance method
    void instanceMethod() {
        System.out.println("Instance method: requires object to call");
    }

    // Main method (entry point)
    public static void main(String[] args) {
        System.out.println("Main method starts");

        // Call static method
        FlowDemo.staticMethod();

        // Create first object
        FlowDemo obj1 = new FlowDemo();
        obj1.instanceMethod();

        // Create second object
        FlowDemo obj2 = new FlowDemo();
        obj2.instanceMethod();
    }
}

