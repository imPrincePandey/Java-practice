package staticS;
import java.util.Scanner;

public class TemperatureTest {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Choose conversion: ");
	        System.out.println("1. Celsius to Fahrenheit");
	        System.out.println("2. Fahrenheit to Celsius");
	        int choice = sc.nextInt();

	        if (choice == 1) {
	            System.out.print("Enter temperature in Celsius: ");
	            double celsius = sc.nextDouble();
	            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
	            System.out.println(celsius + "°C = " + fahrenheit + "°F");
	        } 
	        else if (choice == 2) {
	            System.out.print("Enter temperature in Fahrenheit: ");
	            double fahrenheit = sc.nextDouble();
	            double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
	            System.out.println(fahrenheit + "°F = " + celsius + "°C");
	        } 
	        else {
	            System.out.println("Invalid choice!");
	        }

	        sc.close();
	    

	}

}
