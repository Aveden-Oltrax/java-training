/**
 * 
 */
package ex04;

import java.util.Comparator;

/**
 * @author 158417
 *
 */
public class PlayerComparator implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        if (player1.getSkill().equals(player2.getSkill())) {
            return player1.getName().compareTo(player2.getName());
        } else {
            if (player1.getSkill().equals("All Rounder")) {
                return -1;
            } else if (player2.getSkill().equals("All Rounder")) {
                return 1;
            } else if (player1.getSkill().equals("Batsman")) {
                return -1;
            } else if (player2.getSkill().equals("Batsman")) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
