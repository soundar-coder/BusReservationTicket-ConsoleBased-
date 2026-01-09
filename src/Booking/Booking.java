package Booking;
import Seating.Seating;

public class Booking  implements Runnable{
	
	private String passengerName;
	private Seating seating;
	
	   public Booking(String passengerName, Seating seating) {
	        this.passengerName = passengerName;
	        this.seating = seating;
	    }

	@Override
	public void run() {
		seating.bookSeat(passengerName);
		
	}



	public String getPassengerName() {
		return passengerName;
	}



	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}



	public Seating getSeating() {
		return seating;
	}



	public void setSeating(Seating seating) {
		this.seating = seating;
	}

}
