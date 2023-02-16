package ex04;

import java.util.Scanner;

class TeamNameNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeamNameNotFoundException(String message) {
		super(message);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the expected winner team of IPL Season 10: ");
		String expectedWinnerTeam = sc.nextLine();
		System.out.print("Enter the expected runner team of IPL Season 10: ");
		String expectedRunnerTeam = sc.nextLine();
		String eligibleTeams[] = { "Chennai Super Kings", "Sun Risers", "Delhi Daredevils", "Kings XI Punjab",
				"Kolkata Knight Riders", "Mumbai Indians", "Rajasthan Royals", "Royal Challengers Bangalore" };
		try {
			boolean winnerTeamExist = false;
			boolean runnerTeamExist = false;
			for (String eligibleTeam : eligibleTeams) {
				if (expectedWinnerTeam.equals(eligibleTeam)) {
					winnerTeamExist = true;
				}
				if (expectedRunnerTeam.equals(eligibleTeam)) {
					runnerTeamExist = true;
				}
			}
			if (!winnerTeamExist) {
				throw new TeamNameNotFoundException(
						"TeamNameNotFoundException: Entered team is not a part of IPL Season 10");
			}
			if (!runnerTeamExist) {
				throw new TeamNameNotFoundException(
						"TeamNameNotFoundException: Entered team is not a part of IPL Season 10");
			}
			System.out.println("Expected IPL Season 10 winner: " + expectedWinnerTeam);
			System.out.println("Expected IPL Season 10 runner: " + expectedRunnerTeam);
		} catch (TeamNameNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}