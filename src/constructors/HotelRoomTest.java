package constructors;

public class HotelRoomTest {

	public static void main(String[] args) {
		HotelRoom r1 = new HotelRoom("Standard");
		HotelRoom r2 = new HotelRoom("Deluxe", 150.0);
		HotelRoom r3 = new HotelRoom("Suite", 300.0, 101);
		
		r1.displayRoomDetails();
		System.out.println("\n..........................");
		r2.displayRoomDetails();
		System.out.println("\n..........................");
		r3.displayRoomDetails();

	}

}
