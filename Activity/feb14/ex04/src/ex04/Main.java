/**
 * 
 */
package ex04;

import java.util.ArrayList;
import java.util.Collections;
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

        System.out.println("Please provide the number of players to be registered");
        int n = scanner.nextInt();

        ArrayList<Player> playerList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter player name");
            String playerName = scanner.next();

            System.out.println("Please select the skill of the player\n1.All Rounder\n2.Batsman\n3.Bowler");
            int skillChoice = scanner.nextInt();

            String skill = "";
            switch (skillChoice) {
                case 1:
                    skill = "All Rounder";
                    break;
                case 2:
                    skill = "Batsman";
                    break;
                case 3:
                    skill = "Bowler";
                    break;
                default:
                    System.out.println("Invalid skill choice, defaulting to Batsman");
                    skill = "Batsman";
            }

            playerList.add(new Player(playerName, skill));
        }

        Collections.sort(playerList, new PlayerComparator());

        System.out.println("Player Details");
        for (Player player : playerList) {
            System.out.println("Player : " + player.getName() + " Skill : " + player.getSkill());
        }
	}

}
