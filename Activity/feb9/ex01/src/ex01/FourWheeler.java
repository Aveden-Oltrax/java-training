/**
 * 
 */
package ex01;

/**
 * @author 158417
 *
 */
public class FourWheeler extends Vehicle {
	private String audioSystem;
	private int numberOfDoors;
	

	public String getAudioSystem() {
		return audioSystem;
	}


	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}


	public int getNumberOfDoors() {
		return numberOfDoors;
	}


	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}


	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem, int numberOfSystem) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfSystem;
	}

	public void displayDetailInfo() {
		System.out.println("Four Wheeler Make : " + getMake());
		System.out.println("Four Wheeler Number : " + getVehicleNumber());
		System.out.println("Four Wheeler Fuel Type : " + getFuelType());
		System.out.println("Four Wheeler Fuel Capacity : " + getFuelCapacity());
		System.out.println("Four Wheeler cc : " + getCc());
		System.out.println("Four Wheeler Audion System : " + getAudioSystem());
		System.out.println("Four Wheeler Doors : " + getNumberOfDoors());
		
	}

}
