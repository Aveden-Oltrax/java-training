/**
 * 
 */
package ex02;

/**
 * @author 158417
 *
 */
public class SuiteACRoom extends HotelRoom {

	private int ratePerSqFeet;

	/**
	 * @param hotelName
	 * @param numberOfSqFeet
	 * @param hasTV
	 * @param hasWifi
	 */
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);	
		this.ratePerSqFeet = 10;
	}
	
	public int getRatePerSqFeet() {
		if (isHasWifi() == true) {
			return this.ratePerSqFeet += 2;
		}
		return this.ratePerSqFeet;
	}
	
	
	
	
	

}
