package ex02;

public class DeluxeRoom extends HotelRoom {
	private int ratePerSqFeet;

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	/**
	 * @param hotelName
	 * @param numberOfSqFeet
	 * @param hasTV
	 * @param hasWifi
	 */
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
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
