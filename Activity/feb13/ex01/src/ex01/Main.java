/**
 * 
 */
package ex01;

import java.util.ArrayList;
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
		Scanner sc = new Scanner(System.in);
        ArrayList<String> playerDetails = new ArrayList<>();

        System.out.println("Enter the player details");
        System.out.println("Enter player name");
        playerDetails.add(sc.nextLine());
        System.out.println("Enter age");
        playerDetails.add(sc.nextLine());
        System.out.println("Enter Country");
        playerDetails.add(sc.nextLine());

        System.out.println("Player Details");
        for (String detail : playerDetails) {
            System.out.println(detail);
        }

        System.out.println("Enter Skill");
        String skill = sc.nextLine();
        System.out.println("Enter the position to add the skill");
        int position = sc.nextInt();
        playerDetails.add(position - 1, skill);

        System.out.println("Player Details:");
        for (String detail : playerDetails) {
            System.out.println(detail);
        }

        System.out.println("Enter the position of the detail to be removed");
        position = sc.nextInt();
        playerDetails.remove(position - 1);

        System.out.println("Player Details");
        for (String detail : playerDetails) {
            System.out.println(detail);
        }
		
		sc.close();
	}

}
