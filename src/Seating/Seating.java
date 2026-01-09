package Seating;

public class Seating {
	private int totalSeat;
	
	public  Seating(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	
	public synchronized boolean bookSeat(String passengerName) {
		System.out.println("Still wait ,busy");
		if(totalSeat>0) {
			System.out.println(passengerName+" "+"Seat is booked Now");
			totalSeat--;
			return true;
		}
		else {
			System.out.println("Unfortunetly seats are not available");
			return false;
		}
		
	}
	
	public int availableSeat() {
		return totalSeat;
	}
	 public void setTotalSeat1(int totalSeat) {
	        this.totalSeat = totalSeat;
	    }
	
	

}

