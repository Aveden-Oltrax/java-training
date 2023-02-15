/**
 * 
 */
package threadex01;

import java.util.Arrays;

/**
 * @author 158417
 *
 */
public class SortScore extends Thread {
	private String matchType;
    private String scoreString;
    private Integer[] scores;

    public SortScore(String matchType, String scoreString) {
        this.matchType = matchType;
        this.scoreString = scoreString;
        this.scores = convertToArray();
    }

    private Integer[] convertToArray() {
        String[] scoreArray = scoreString.split(",");
        Integer[] result = new Integer[scoreArray.length];
        for (int i = 0; i < scoreArray.length; i++) {
            result[i] = Integer.parseInt(scoreArray[i]);
        }
        return result;
    }

    @Override
    public void run() {
        Arrays.sort(scores);
    }

    public Integer[] getScores() {
        return scores;
    }
}
