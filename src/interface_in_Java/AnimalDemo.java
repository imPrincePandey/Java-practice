package interface_in_Java;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal a1 = new Dog(); // interface reference -> Dog object
		Animal a2 = new Cat();
		
		a1.sound();
        a1.eat();
        a2.sound();
        a2.eat();
		

	}

}
