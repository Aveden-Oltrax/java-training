/**
 * 
 */
package ex01;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author 158417
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Get the number of matches
        int n = scanner.nextInt();	

        // Create a TreeSet to store the distinct player names
        TreeSet<String> players = new TreeSet<>();

        // Get the player names for each match and add them to the set
        for (int i = 0; i < n; i++) {
            String player = scanner.nextLine();
            players.add(player);
        }

        // Display the distinct player names in sorted order
        for (String player : players) {
            System.out.println(player);
        }
        scanner.close();
	}

}
