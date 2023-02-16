package ex01;

class Player {
	private String bowlerName;
	private Integer wicketCount;

	public Player(String bowlerName, Integer wicketCount) {
		this.bowlerName = bowlerName;
		this.wicketCount = wicketCount;
	}

	public String getBowlerName() {
		return bowlerName;
	}

	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}

	public Integer getWicketCount() {
		return wicketCount;
	}

	public void setWicketCount(Integer wicketCount) {
		this.wicketCount = wicketCount;
	}
}
