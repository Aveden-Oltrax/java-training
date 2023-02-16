/**
 * 
 */
package ex02;

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
        String[] teams = new String[5];

        System.out.println("Enter the names of top 5 teams of IPL season 15:");
        for (int i = 0; i < 5; i++) {
            teams[i] = sc.nextLine();
        }

        System.out.println("Enter swap positions:");
        int position1 = sc.nextInt();
        int position2 = sc.nextInt();

        // Swap two elements in the array
        String temp = teams[position1 - 1];
        teams[position1 - 1] = teams[position2 - 1];
        teams[position2 - 1] = temp;

        System.out.println("Prediction of rankings of top 5 teams:");
        for (int i = 0; i < 5; i++) {
            System.out.println(teams[i]);
        }
	}

}
