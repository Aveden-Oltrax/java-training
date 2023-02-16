/**
 * 
 */
package ex04;

/**
 * @author 158417
 *
 */
public class Match {
	
	private int currentScore;
	private float currentover;
	private int target;
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	
	/**
	 * @param currentScore
	 * @param currentover
	 * @param target
	 */
	public Match(int currentScore, float currentover, int target) {
		super();
		this.currentScore = currentScore;
		this.currentover = currentover;
		this.target = target;
	}
	
	
	

}
