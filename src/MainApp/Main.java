package MainApp;
import Booking.Booking;
import BusDetails.BusDetails;
import Seating.Seating;
import Jdbc.DbConnection;
import Jdbc.BusDb;
public class Main {
public static void main(String[] args) {
	Seating seating=new Seating(2);
	DbConnection.getConnection();
	BusDb.getConnection();
	Thread t1=new Thread(new Booking("Soundar",seating));
	Thread t2=new Thread(new Booking("Kavin",seating));
	Thread t3=new Thread(new Booking("yokesh",seating));
	t1.start();
	t2.start();
	t3.start(); 
	
	
}
}
