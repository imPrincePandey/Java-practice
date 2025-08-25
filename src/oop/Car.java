package oop;

public class Car {
int carId;
String make;
String model;
double price;

public void displayDetails() {
	System.out.println("Car ID: " + carId);
	System.out.println("Make: " + make);
	System.out.println("Model: " + model);
	System.out.println("Price: $" + price);
}
public void applyDiscount(double percentage) {
	price -= price * (percentage / 100);
	System.out.println("New Price after Discount: $" + price);
}
}
