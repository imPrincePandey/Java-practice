package methodOverriding;

public class AnimalTest {

	public static void main(String[] args) {
		
		/*
		 * Type casting means converting one type into another.

              Up casting (safe, automatic):
              Subclass  Superclass.
		 */
		
		Dog d = new Dog(); //Up casting (automatic, safe)
		d.getAnimal().play().eat(); // Method chaining possible
		
		System.out.println("----------------------------");
		
		
		// Even though reference type is Animal,
		// actual object is Dog, so Dog's getAnimal() runs.
		// You can only call methods declared in Animal (but Dog’s overridden version will run at runtime).
		
		Animal a1 = new Dog();   // Upcasting (safe, automatic)
        a1.getAnimal();          // Runs Dog's version at runtime
        a1.eat(); // Dog's overridden eat() runs
     // a1.play(); //  Compile error: play() not in Animal
        
		System.out.println("----------------------------");
		
		Animal a2 = new Cat();
        a2.getAnimal();   // Runs Cat's version
        a2.eat();         // Cat's overridden eat() runs 
        System.out.println("----------------------------");
        
        Animal a3 = new Cow();
        Animal returnedCow = a3.getAnimal(); // Only Animal type
        // If I want Cow-specific behavior, I need casting 
        Cow c = (Cow) returnedCow;   // Downcasting needed
        c.eat();
        System.out.println("----------------------------");
        
     // Upcasting (safe, automatic)
        Animal a4 = new Dog();   // Dog - Animal (no cast needed)

        // Downcasting (explicit, risky)
        Dog d2 = (Dog) a4;       // Animal - Dog (must cast)
        d2.play();               // Safe because object is really a Dog

        // If object is not a Dog, this will throw ClassCastException
        Animal a5 = new Cat();
        // Dog d3 = (Dog) a5;   //  Runtime error: ClassCastException

		



	}

}
