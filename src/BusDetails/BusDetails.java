package BusDetails;

public class BusDetails {
	private String NumberPlate;
	private String busName;
	public BusDetails() {}
	public BusDetails(String n,String busName) {
		this.setNumberPlate(n);
		this.setBusName(busName);
	}
	public String getNumberPlate() {
		return NumberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		NumberPlate = numberPlate;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}

}
