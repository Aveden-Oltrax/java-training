import java.util.Arrays;

class CalculateScores implements Runnable {
    private String matchType;
    private String scoreString;
    private int[] scores;
    private double meanScore;
    private int minScore;
    private int maxScore;

    public CalculateScores(String matchType, String scoreString) {
        this.matchType = matchType;
        this.scoreString = scoreString;
    }

    public double getMeanScore() {
        return meanScore;
    }

    public int getMinScore() {
        return minScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    @Override
    public void run() {
        String[] scoreArr = scoreString.split(",");
        scores = new int[scoreArr.length];
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            scores[i] = Integer.parseInt(scoreArr[i]);
            sum += scores[i];
        }
        meanScore = (double) sum / scores.length;
        Arrays.sort(scores);
        minScore = scores[0];
        maxScore = scores[scores.length - 1];
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CalculateScores[] threads = new CalculateScores[3];
        String[] matchTypes = {"Test", "ODI", "T20"};
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the match : ");
            String matchType = System.console().readLine();
            System.out.println("Enter the scores : ");
            String scoreString = System.console().readLine();
            threads[i] = new CalculateScores(matchType, scoreString);
            new Thread(threads[i]).start();
        }

        for (int i = 0; i < 3; i++) {
            threads[i].join();
        }

        System.out.println("Score Summary");
        for (int i = 0; i < 3; i++) {
            System.out.println("Match : " + matchTypes[i]);
            System.out.println("Mean : " + String.format("%.2f", threads[i].getMeanScore()));
            System.out.println("Min Score : " + threads[i].getMinScore());
            System.out.println("Max Score : " + threads[i].getMaxScore());
        }
    }
}
