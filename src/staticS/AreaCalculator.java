package staticS;

public class AreaCalculator {
	// Static method to calculate area of rectangle
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Static method to calculate area of circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

}
