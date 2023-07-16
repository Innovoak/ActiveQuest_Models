package com.innovoak.apps.activequest.model.goals;

import java.util.Objects;

// Goal Model
public class Goal extends Achievable {
	private static final long serialVersionUID = 1L;

	// Fields
	private boolean favourite;
	private boolean isComplete;
	private String userID;

	public Goal() {
	}

	public Goal(String name, String occurrence, String goalID, String type, boolean favourite, boolean isComplete,
			String userID) {
		super(name, occurrence, goalID, type);
		this.favourite = favourite;
		this.isComplete = isComplete;
		this.userID = userID;
	}

	public Goal(String id, String name, String occurrence, String goalID, String type, boolean favourite,
			boolean isComplete, String userID) {
		super(id, name, occurrence, goalID, type);
		this.favourite = favourite;
		this.isComplete = isComplete;
		this.userID = userID;
	}

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

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(favourite, isComplete, userID);
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
		return favourite == other.favourite && isComplete == other.isComplete && Objects.equals(userID, other.userID);
	}

}
