/**
 * 
 */
package com.demo.model;

/**
 * @author 158417
 *
 */
public class Team {
	private int teamId;
	private String teamName;
	private String shortName;
	private String Owner;

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", shortName=" + shortName + ", Owner=" + Owner
				+ ", getTeamId()=" + getTeamId() + ", getTeamName()=" + getTeamName() + ", getShortName()="
				+ getShortName() + ", getOwner()=" + getOwner() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

}
