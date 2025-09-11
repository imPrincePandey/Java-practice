package constructors;

// ..............Hotel Room Booking System..............

public class HotelRoom {
	String roomType;
	double roomRate;
	int roomNumber;
	private static String hotelName = "Sunrise Hotel";
	
	// Define the constructor using this
	
	public HotelRoom(String roomType) {
		this(roomType, 100.0, 0); // Default rate and room number
	}
	
	public HotelRoom(String roomType, double roomRate) {
		this(roomType, roomRate, 0); //Default room number
	}
	
	public HotelRoom(String roomType, double roomRate, int roomNumber) {
		this.roomType = roomType;
		this.roomRate = roomRate;
		this.roomNumber = roomNumber;
	}
	
	// create a method display
	
	public void displayRoomDetails() {
		System.out.println("Hotel: " + hotelName);
		System.out.println("Room Type: " + roomType);
		System.out.println("Room Rate: $" + roomRate);
		System.out.println("Room Number: " + roomNumber);
	}

}
