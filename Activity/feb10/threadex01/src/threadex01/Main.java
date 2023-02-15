/**
 * 
 */
package threadex01;

import java.util.Arrays;
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
		String testScoreString = null, odiScoreString = null, t20ScoreString = null;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the Match (ODI/Test/T20): ");
			String matchType = sc.nextLine();
			
			switch (matchType) {
			case "ODI":
				System.out.println("Enter score for ODI Match Score");
				odiScoreString = sc.nextLine();
				break;
			case "Test":
				System.out.println("Enter score for Test Match Score");
				testScoreString = sc.nextLine();
				break;
			case "T20":
				System.out.println("Enter score for T20 Match Score");
				t20ScoreString = sc.nextLine();
				break;

			default:
				System.out.println("Unexpected Value");
				break;
			}
		}
		
		SortScore testMatch = new SortScore("Test", testScoreString);
        SortScore odiMatch = new SortScore("ODI", odiScoreString);
        SortScore t20Match = new SortScore("T20", t20ScoreString);

        testMatch.start();
        odiMatch.start();
        t20Match.start();
        
      
        try {
			testMatch.join();
			odiMatch.join();
			t20Match.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("Scores for Test match: " + Arrays.toString(testMatch.getScores()));
        System.out.println("Scores for ODI match: " + Arrays.toString(odiMatch.getScores()));
        System.out.println("Scores for T20 match: " + Arrays.toString(t20Match.getScores()));
	}

}
