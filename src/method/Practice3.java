package method;

public class Practice3 {
	
	//check even and odd 
	// Method to check if number is even or odd
	static void checkEvenOdd(int num) {
		if(num % 2==0) {
			System.out.println("this number is Even:" + num);
		} else {
			System.out.println("this number is Odd:" + num);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEvenOdd(8);
		checkEvenOdd(9);

	}

}
