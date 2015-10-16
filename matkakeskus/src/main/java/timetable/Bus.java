package timetable;

public class Bus {
private String plateNumber;
private String brand;
private String model;
private int seatCount;



	public Bus() {
		super();
	}
	

	public Bus(String plateNumber, String brand, String model, int seatCount) {
		super();
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.model = model;
		this.seatCount = seatCount;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}


}
