
public class method {

	public static void main(String[] args) {
		
		//lets create our own coffee shop
		
		orderCoffee();
		orderCoffee("Espresso ");
		String cookieOrder1 = orderCookie();
		System.out.println(cookieOrder1);
		String cookieOrder2= orderCookie("Chocolate chip ");
		System.out.println(cookieOrder2);
		

	}
	//no parameter method for the coffee
	
	public static void orderCoffee() {
		System.out.println("Ordered a default coffee.");
		
	}
	//parameterized method for coffee
	
	public static void orderCoffee(String type) {
		System.out.println("Ordered a " + type + "coffee.");
	}
	
	//Return type method 
	public static String orderCookie() {
		return "Ordered a default cookie.";
	}
	
	//parameterized return type method
	public static String orderCookie(String type) {
		return "Ordered a " + type + "cookie.";
	}
	
	

}
