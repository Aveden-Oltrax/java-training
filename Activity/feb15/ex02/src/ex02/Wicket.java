/**
 * 
 */
package ex02;

/**
 * @author 158417
 *
 */
public class Wicket {
	private String playerName;
    private Bowler bowler;

    public Wicket(String playerName, Bowler bowler) {
        this.playerName = playerName;
        this.bowler = bowler;
    }

    public String getDescription() {
        return playerName;
    }

    public Bowler getBowler() {
        return bowler;
    }

    public void setBowler(Bowler bowler) {
        this.bowler = bowler;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
