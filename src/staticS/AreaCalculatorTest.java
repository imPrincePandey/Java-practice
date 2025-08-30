package staticS;
import java.util.Scanner;

public class AreaCalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter shape (Rectangle/Circle): ");
        String shape = sc.nextLine();

        if (shape.equalsIgnoreCase("Rectangle")) {
            System.out.print("Enter length of rectangle: ");
            double length = sc.nextDouble();

            System.out.print("Enter width of rectangle: ");
            double width = sc.nextDouble();

            double rectArea = AreaCalculator.rectangleArea(length, width);
            System.out.println("Area of Rectangle: " + rectArea);

        } else if (shape.equalsIgnoreCase("Circle")) {
            System.out.print("Enter radius of circle: ");
            double radius = sc.nextDouble();

            double circArea = AreaCalculator.circleArea(radius);
            System.out.println("Area of Circle: " + circArea);

        } else {
            System.out.println("Invalid shape. Please enter Rectangle or Circle.");
        }

        sc.close();

	}

}
