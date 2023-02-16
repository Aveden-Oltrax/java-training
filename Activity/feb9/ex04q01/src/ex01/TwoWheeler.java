package ex01;

public class TwoWheeler extends Vehicle {
	private boolean kickStartAvailable;

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}
	
	public void displayDetailInfo() {
		System.out.println("Two Wheeler Make : " + getMake());
		System.out.println("Two Wheeler Number : " + getVehicleNumber());
		System.out.println("Two Wheeler Fuel Type : " + getFuelType());
		System.out.println("Two Wheeler Fuel Capacity : " + getFuelCapacity());
		System.out.println("Two Wheeler cc : " + getCc());
		System.out.println("Two Wheeler Kick Start Available  : " + this.kickStartAvailable);
		
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}	

	

}
