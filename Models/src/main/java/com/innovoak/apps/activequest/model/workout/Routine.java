package com.innovoak.apps.activequest.model.workout;

import java.util.Objects;

public class Routine extends Workout {
	private static final long serialVersionUID = 1L;

	private String userID;

	public Routine() {
	}

	public Routine(String category, String name, String userID) {
		super(category, name);
		this.userID = userID;
	}

	public Routine(String id, String category, String name, String userID) {
		super(id, category, name);
		this.userID = userID;
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
		result = prime * result + Objects.hash(userID);
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
		Routine other = (Routine) obj;
		return Objects.equals(userID, other.userID);
	}

}
