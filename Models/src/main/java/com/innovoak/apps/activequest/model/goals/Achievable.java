package com.innovoak.apps.activequest.model.goals;

import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;

// REFACTOR
public abstract class Achievable extends Model {
	private static final long serialVersionUID = 1L;

	private String name;
	private String occurrence;
	private String goalID;
	private String type;

	public Achievable() {
		super();
	}

	public Achievable(String name, String occurrence, String goalID, String type) {
		super();
		this.name = name;
		this.occurrence = occurrence;
		this.goalID = goalID;
		this.type = type;
	}

	public Achievable(String id, String name, String occurrence, String goalID, String type) {
		super(id);
		this.name = name;
		this.occurrence = occurrence;
		this.goalID = goalID;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(goalID, name, occurrence, type);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Achievable other = (Achievable) obj;
		return Objects.equals(goalID, other.goalID) && Objects.equals(name, other.name)
				&& Objects.equals(occurrence, other.occurrence) && Objects.equals(type, other.type);
	}

}
