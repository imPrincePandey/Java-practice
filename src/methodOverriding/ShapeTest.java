package methodOverriding;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());

	}

}
