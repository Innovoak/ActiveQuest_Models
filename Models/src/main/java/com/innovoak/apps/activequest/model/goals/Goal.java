package com.innovoak.apps.activequest.model.goals;

import java.util.Objects;

import com.innovoak.apps.activequest.model.workout.WorkoutSet;

// Goal Model
public class Goal extends Achievable {
	private static final long serialVersionUID = 1L;

	// Fields
	private boolean favourite;
	private boolean isComplete;

	// Constructors
	public Goal() {
	}

	public Goal(String name, String occurrence, String goalID, boolean favourite, boolean isComplete) {
		super(name, occurrence, goalID);
		this.favourite = favourite;
		this.isComplete = isComplete;
	}

	public Goal(String id, String name, String occurrence, String goalID, boolean favourite, boolean isComplete) {
		super(id, name, occurrence, goalID);
		this.favourite = favourite;
		this.isComplete = isComplete;
	}

	// Getters and Setters
	public boolean isFavourite() {
		return favourite;
	}

	public void setFavourite(boolean favourite) {
		this.favourite = favourite;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	// Utility methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(favourite, isComplete);
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
		Goal other = (Goal) obj;
		return favourite == other.favourite && isComplete == other.isComplete;
	}

}
