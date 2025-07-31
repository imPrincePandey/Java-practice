package method;

public class Practice4 {
	
	//Java Code to Calculate Factorial
	
	//create method for calculate factorial!
	static int factorial(int number) {
		int result=1;
		
		for(int i=1;i<=number; i++) {
			result= result*i;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact= factorial(5);
		System.out.println("the factorial of this number is: " + fact);
		

	}

}
