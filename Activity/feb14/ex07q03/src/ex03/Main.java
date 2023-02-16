/**
 * 
 */
package ex03;

import java.util.Map;
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
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Team> teamMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.next().split("\\|");
            String teamName = input[0];
            String playerName = input[1];

            if (!teamMap.containsKey(teamName)) {
                teamMap.put(teamName, new Team(teamName));
            }

            teamMap.get(teamName).addPlayer(playerName);
        }

        System.out.println("Team and Players in ascending order");

        for (Map.Entry<String, Team> entry : teamMap.entrySet()) {
            System.out.println(entry.getValue().getName());

            for (Player player : entry.getValue().getPlayerList()) {
                System.out.println("--" + player.getName());
            }
        }
        scanner.close();
	}

}
