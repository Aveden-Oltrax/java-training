/**
 * 
 */
package ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 158417
 *
 */
public class Team {
	private String name;
	private List<Player> playerList;

	public Team(String name) {
		this.name = name;
		playerList = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addPlayer(String playerName) {
		playerList.add(new Player(playerName));
	}

	public List<Player> getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}
}
