/**
 * 
 */
package ex02;


import java.util.Scanner;

/**
 * @author 158417
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter the number of overs: ");
			int numOfOvers = input.nextInt();

			if (numOfOvers < 0) {
				throw new NegativeArraySizeException();
			}

			int[] runs = new int[numOfOvers];

			System.out.println("Enter the number of runs for each over: ");
			for (int i = 0; i < numOfOvers; i++) {
				runs[i] = input.nextInt();
			}

			System.out.print("Enter the over number: ");
			int overNumber = input.nextInt();

			if (overNumber < 1 || overNumber > numOfOvers) {
				throw new ArrayIndexOutOfBoundsException();
			}

			System.out.println("Runs scored in this over: " + runs[overNumber - 1]);
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e.getClass().getName());
		} finally {
			input.close();
		}
	}
}
