package methodOverriding;

public class Animal {
	// Method returning Animal (base type)
	
	Animal getAnimal() {
		System.out.println("Generic Animal created.");
        return  new Animal();
    }
	
	void eat() {
        System.out.println("Animal eats food.");
    }

}

//Subclass 1: Dog (with covariance + method chaining)

class Dog extends Animal {
	
    @Override
    Dog getAnimal() {
    	System.out.println("Dog object returned (covariant).");
        return this;   // return same Dog object for chaining
    }
    
    Dog play() {
        System.out.println("Dog is playing fetch.");
        return this;   // Method chaining enabled
    }
    
    @Override
    void eat() {
        System.out.println("Dog eats bones.");
    }
}

//Subclass 2: Cat (with covariance)

class Cat extends Animal {
    @Override
    Cat getAnimal() {
    	System.out.println("Cat object returned (covariant).");
        return new Cat();
    }
    
    @Override
    void eat() {
        System.out.println("Cat drinks milk.");
    }
}

//Subclass 3: Cow (without covariance for comparison)

class Cow extends Animal {
	@Override
	Animal getAnimal() {   //  No covariance (returns Animal only)
        System.out.println("Cow object returned (non-covariant).");
        return new Cow();
    }
	
	 @Override
	    void eat() {
	        System.out.println("Cow eats grass.");
	    }
}
