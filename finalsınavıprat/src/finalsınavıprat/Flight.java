package finalsınavıprat;

public class Flight {

	
	public String flightNumber;

	public String origin;

	public String destination;

	public String departuretime;

	public int totalseats;
	
	public boolean bookseat;
	

	public Flight(String flightNumber, String origin, String destination, String departuretime, int totalseats,boolean bookseat) {
		this.departuretime = departuretime;
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.totalseats = totalseats;
		this.bookseat=bookseat;
		
	}

	public String getflightNumber() {
		return flightNumber;

	}

	public String getorigin() {
		return origin;

	}

	public String getdestination() {
		return destination;

	}

	public int gettotalseats() {
		return totalseats;

	}

	public String getdeparturetime() {
		return departuretime;

	}

	public boolean getbookseat() {
		return bookseat;
		
	}
	
	public int getAvailableSeats() {
		return AvailableSeats();
		
	}
	public int AvailableSeats(){
		return 0;
		
	}
	
	
	
	
}
