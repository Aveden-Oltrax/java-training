/**
 * 
 */
package ex03;

import java.util.ArrayList;
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
		System.out.println("Enter the top 5 scorers of IPL Season 14");
		List<String> season14 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
		  season14.add(sc.nextLine());
		}

		System.out.println("Enter the top 5 scorers of IPL Season 15");
		List<String> season15 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
		  season15.add(sc.nextLine());
		}

		System.out.println("Consistent Scorer:");
		List<String> common = new ArrayList<>(season14);
		common.retainAll(season15);
		for (String player : common) {
		  System.out.println(player);
		}
	}

}
