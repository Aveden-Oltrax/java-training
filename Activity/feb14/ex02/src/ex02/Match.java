/**
 * 
 */
package ex02;

import java.time.LocalDate;

/**
 * @author 158417
 *
 */
public class Match implements Comparable<Match> {

	private LocalDate matchDate;
    private String teamOne, teamTwo;
    
    public Match(LocalDate matchDate, String teamOne, String teamTwo) {
        this.matchDate = matchDate;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
    }
    
    public LocalDate getMatchDate() {
        return matchDate;
    }
    
    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }
    
    public String getTeamOne() {
        return teamOne;
    }
    
    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }
    
    public String getTeamTwo() {
        return teamTwo;
    }
    
    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public int compareTo(Match o) {
        return o.getMatchDate().compareTo(this.getMatchDate());
    }

}
