/**
 * 
 */
package ex03;

/**
 * @author 158417
 *
 */
public class Player {
	private String name, team, skill;

    public Player(String name, String team, String skill) {
        this.name = name;
        this.team = team;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getSkill() {
        return skill;
    }
}
