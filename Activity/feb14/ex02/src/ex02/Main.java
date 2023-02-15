/**
 * 
 */
package ex02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		System.out.println("Enter the number of matches");
		int n = sc.nextInt();
		sc.nextLine(); // to consume the newline character left by the previous nextInt()

		List<Match> matchList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter match date in (yyyy-MM-dd)");
			String date = sc.nextLine();
			System.out.println("Enter Team 1");
			String team1 = sc.nextLine();
			System.out.println("Enter Team 2");
			String team2 = sc.nextLine();
			matchList.add(new Match(LocalDate.parse(date), team1, team2));
		}

		Collections.sort(matchList);

		System.out.println("\nMatch Details\n");
		for (Match m : matchList) {
			System.out.println("Team 1 " + m.getTeamOne());
			System.out.println("Team 2: " + m.getTeamTwo());
			System.out.println("Match Held on " + m.getMatchDate().toString() + "\n");
		}
	}

}
