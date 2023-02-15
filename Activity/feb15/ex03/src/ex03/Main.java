/**
 * 
 */
package ex03;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

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
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of players");
        int n = sc.nextInt();
        sc.nextLine();

        TreeMap<String, Player> players = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the details of the player " + i);
            String capNumber = sc.nextLine();
            String name = sc.nextLine();
            String team = sc.nextLine();
            String skill = sc.nextLine();

            Player player = new Player(name, team, skill);
            players.put(capNumber, player);
        }

        System.out.println("Player Details");

        for (Entry<String, Player> entry : players.entrySet()) {
            String capNumber = entry.getKey();
            Player player = entry.getValue();
            String name = player.getName();
            String team = player.getTeam();
            String skill = player.getSkill();
            System.out.println(capNumber + "--" + name + "--" + team + "--" + skill);
        }
        sc.close();

	}

}
