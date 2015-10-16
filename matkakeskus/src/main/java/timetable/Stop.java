package timetable;

public class Stop {
private String name;
private String streetName;
private String streetNumber;
private String postalCode;
private double latitude;
private double longitude;

	public Stop(String name, String streetName, String streetNumber, String postalCode) {
		super();
		this.name = name;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.postalCode = postalCode;
	}

	public Stop(String name, String streetName, String streetNumber, String postalCode, double latitude,
			double longitude) {
		super();
		this.name = name;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.postalCode = postalCode;
		this.latitude = latitude;
		this.longitude = longitude;
	}



	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getStreetNumber() {
		return streetNumber;
	}
	
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public void setCoordinates(double lat, double lon) {
		this.latitude = lat;
		this.longitude = lon;
	}
	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	

}
