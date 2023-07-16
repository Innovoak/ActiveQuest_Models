package com.innovoak.apps.activequest.model.goals;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;

// REFACTOR
public abstract class Achievable extends Model {
	private static final long serialVersionUID = 1L;

	private String name;
	private String occurrence;
	private String goalID;

	public Achievable() {
		super();
	}

	public Achievable(String name, String occurrence, String goalID) {
		super();
		this.name = name;
		this.occurrence = occurrence;
		this.goalID = goalID;
	}

	public Achievable(String id, String name, String occurrence, String goalID) {
		super(id);
		this.name = name;
		this.occurrence = occurrence;
		this.goalID = goalID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccurrence() {
		return occurrence;
	}

	public void setOccurrence(String occurrence) {
		this.occurrence = occurrence;
	}

	@Column(columnName = "goal_id")
	public String getGoalID() {
		return goalID;
	}

	public void setGoalID(String goalID) {
		this.goalID = goalID;
	}

}
