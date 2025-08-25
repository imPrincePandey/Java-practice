package oop;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.carId = 101;
		car.make = "Toyota";
		car.model = "Corolla";
		car.price = 20000;
		
		car.displayDetails();
		car.applyDiscount(10);
		
		Car car2 = new Car();
		car2.carId = 102;
		car2.make = "Honda";
		car2.model = "Clasic";
		car2.price = 22000;
		
		car2.displayDetails();
		car2.applyDiscount(15);

	}

}
