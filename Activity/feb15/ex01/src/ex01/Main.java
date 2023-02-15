/**
 * 
 */
package ex01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 158417
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		Map<String, Player> playerMap = new HashMap<String, Player>();
		String input = "";
		do {
			System.out.println("Enter the player name");
			String bowlerName = scanner.nextLine();
			System.out.println("Enter wickets - seperated by \"|\" symbol.");
			String wickets = scanner.nextLine();

			String[] wicketArray = wickets.split("\\|");
			Player player = new Player(bowlerName, wicketArray.length);
			playerMap.put(bowlerName, player);

			System.out.println("Do you want to add another player (yes/no)");
			input = scanner.nextLine().toLowerCase();
		} while (input.equals("yes"));

		do {
			System.out.println("Enter the player name to search");
			String searchName = scanner.nextLine();

			if (playerMap.containsKey(searchName)) {
				System.out.println("Player name : " + playerMap.get(searchName).getBowlerName());
				System.out.println("Wicket Count : " + playerMap.get(searchName).getWicketCount());
			} else {
				System.out.println("No player found with the name " + searchName);
			}

			System.out.println("Do you want to search another player (yes/no)");
			input = scanner.nextLine().toLowerCase();
		} while (input.equals("yes"));
		
		scanner.close();
	}
}
