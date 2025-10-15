package polymorphism;

/*
 * Runtime Polymorphism -> Method Overriding
 * When a subclass provides a new implementation of a method that already exists in its superclass.
 */

public class Main {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();
	    Animal myPig = new Pig(); // Upcasting
	    Animal myDog = new Dog();
	        
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();

	}

}

class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
		@Override
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Animal {
		@Override
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
