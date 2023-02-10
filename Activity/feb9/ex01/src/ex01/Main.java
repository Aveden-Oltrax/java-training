/**
 * 
 */
package ex01;

/**
 * @author 158417
 *
 */
public class Main {

	/**
	 * 
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle ninja = new TwoWheeler("Steel", "12 5184", "Petrol", 50, 500, true);
		Vehicle Supra = new FourWheeler("Carbon Fiber", "MH 12 AA 0001", "Premium Unleaded Petrol fuel", 1000, 2500, "Bose", 2);
		ninja.displayDetailInfo();
		Supra.displayDetailInfo();
	}

}
