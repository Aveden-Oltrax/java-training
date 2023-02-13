/**
 *
 */
package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 158417
 *
 */
public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int runsScored ;
		int oversFaced ;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Enter the total runs scored: ");
			runsScored = Integer.parseInt(reader.readLine().trim());

			System.out.print("Enter the total overs faced: ");
			oversFaced = Integer.parseInt(reader.readLine().trim());

			double runRate = (double) runsScored / oversFaced;
//			double runRate =  runsScored / oversFaced;
//			System.out.println("Current Run Rate: " + String.format("%.2f", runRate));
			System.out.println("Current Run Rate: " + runRate);
		}
		catch (Exception e) {
//			System.out.println("Exception thrown: " + e.getClass().getName());
			System.out.println(e);
		}
		finally {
			try {
				reader.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
