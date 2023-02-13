package ex03;

import java.util.Scanner;

class InvalidAgeRangeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 */
	public InvalidAgeRangeException(String message) {
		super(message);
	}
}

/**
 * @author 158417
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the player name: ");
		String playerName = sc.nextLine();
		System.out.print("Enter the player age: ");
		int playerAge = sc.nextInt();
		
		try {
			if (playerAge < 19) {
				throw new InvalidAgeRangeException("InvalidAgeRangeException");
			}
			System.out.println("Player name: " + playerName);
			System.out.println("Player age: " + playerAge);
		} catch (InvalidAgeRangeException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
