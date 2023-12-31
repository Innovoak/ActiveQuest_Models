package com.innovoak.apps.activequest.model.goals;

import java.sql.JDBCType;
import java.util.Objects;

import com.innovoak.apps.activequest.model.workout.WorkoutSet;
import com.innovoak.util.webhelpers.data.annotations.Column;
import com.innovoak.util.webhelpers.data.annotations.Table;

// Quest Model
@Table(name = "quests")
public class Quest extends Achievable {
	private static final long serialVersionUID = 1L;

	// Fields
	private int trophyReward;

	// Constructor
	public Quest() {
	}

	public Quest(String name, String occurrence, String goalID, String type, int trophyReward) {
		super(name, occurrence, goalID, type);
		this.trophyReward = trophyReward;
	}

	public Quest(String id, String name, String occurrence, String goalID, String type, int trophyReward) {
		super(id, name, occurrence, goalID, type);
		this.trophyReward = trophyReward;
	}

	// Getters and Setters
	@Column(columnName = "trophy_reward", type = JDBCType.INTEGER)
	public int getTrophyReward() {
		return trophyReward;
	}

	public void setTrophyReward(int trophyReward) {
		this.trophyReward = trophyReward;
	}

	// Utility methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(trophyReward);
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
		Quest other = (Quest) obj;
		return trophyReward == other.trophyReward;
	}

}
