package method;

public class Practice1 {
	
	//Calculating Circle Area!!
	
	//"radius" is parameter
	static double calculateArea(double radius) {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4 is the argument passes here
		double area= calculateArea(4);
		System.out.println("the area of the circle is: " + area);
		

	}

}
