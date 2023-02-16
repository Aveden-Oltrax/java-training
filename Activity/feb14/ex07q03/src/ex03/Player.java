/**
 * 
 */
package ex03;

/**
 * @author 158417
 *
 */
public class Player implements Comparable<Player> {
	private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Player other) {
        return this.getName().compareTo(other.getName());
    }

}
