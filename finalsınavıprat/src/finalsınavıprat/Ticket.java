package finalsınavıprat;

public class Ticket {

	public String ticketNumber;
	
	public int seatNumber;
	
	public Passenger passenger;
	
	public Flight flight;
	
	
	public Ticket(String ticketNumber,int seatNumber,Passenger passenger,Flight flight) {
		super();
		this.seatNumber=seatNumber;
		this.ticketNumber=ticketNumber;
		this.passenger=passenger;
		this.flight=flight;
		
	}
	
	public String getticketNumber() {
		return ticketNumber;
		
	}
	public int getseatNumber() {
		return seatNumber;
		
	}
	public Flight getflight() {
		return flight;
		
	}
	
	
	
	
}
