package com.innovoak.apps.activequest.model.workout;

import java.sql.JDBCType;
import java.util.Objects;

import com.innovoak.util.webhelpers.data.annotations.Column;
import com.innovoak.util.webhelpers.data.annotations.Table;

@Table(name = "exercises")
public class Exercise extends Workout {
	private static final long serialVersionUID = 1L;

	private String instruction;
	private int recommendedReps;

	public Exercise() {
		super();
	}

	public Exercise(String category, String name, String instruction, int recommendedReps) {
		super(category, name);
		this.instruction = instruction;
		this.recommendedReps = recommendedReps;
	}

	public Exercise(String id, String category, String name, String instruction, int recommendedReps) {
		super(id, category, name);
		this.instruction = instruction;
		this.recommendedReps = recommendedReps;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	@Column(columnName = "reps", type = JDBCType.INTEGER)
	public int getRecommendedReps() {
		return recommendedReps;
	}

	public void setRecommendedReps(int recommendedReps) {
		this.recommendedReps = recommendedReps;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(instruction, recommendedReps);
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
		Exercise other = (Exercise) obj;
		return Objects.equals(instruction, other.instruction) && recommendedReps == other.recommendedReps;
	}

}
