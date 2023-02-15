/**
 * 
 */
package ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		Scanner scanner = new Scanner(System.in);
        Map<String, List<Wicket>> wickets = new HashMap<>();
        String choice = "yes";

        while (choice.equals("yes")) {
            System.out.print("Enter the player name: ");
            String name = scanner.nextLine();

            System.out.print("Enter wickets - separated by '|' symbol: ");
            String[] wicketNames = scanner.nextLine().split("\\|");

            Bowler bowler = new Bowler(name);
            for (String wicketName : wicketNames) {
                Wicket wicket = new Wicket(wicketName, bowler);
                List<Wicket> wicketList = wickets.getOrDefault(name, new ArrayList<>());
                wicketList.add(wicket);
                wickets.put(name, wicketList);
            }

            System.out.print("Do you want to add another player (yes/no): ");
            choice = scanner.nextLine().toLowerCase();
        }

        choice = "yes";
        while (choice.equals("yes")) {
            System.out.print("Enter the player name to search: ");
            String name = scanner.nextLine();
            List<Wicket> wicketList = wickets.getOrDefault(name, null);

            if (wicketList == null) {
                System.out.println("No player found with the name " + name);
            } else {
                System.out.println("Player Name: " + name);
                System.out.println("Wickets:");
                for (Wicket wicket : wicketList) {
                    System.out.println(wicket.getDescription());
                }
            }

            System.out.print("Do you want to search another player (yes/no): ");
            choice = scanner.nextLine().toLowerCase();
        }
        scanner.close();
	}

}
