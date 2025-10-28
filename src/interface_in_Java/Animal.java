package interface_in_Java;

public interface Animal {
	
	void sound();
    void eat();

}

class Dog implements Animal {
	 public void sound() {
	        System.out.println("Dog barks: Woof Woof");
	    }
	    public void eat() {
	        System.out.println("Dog eats bones");
	    }
}

class Cat implements Animal {
	public void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
    public void eat() {
        System.out.println("Cat drinks milk");
    }
}


