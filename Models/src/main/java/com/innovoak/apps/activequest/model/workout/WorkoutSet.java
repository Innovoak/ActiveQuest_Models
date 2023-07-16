package com.innovoak.apps.activequest.model.workout;

import java.util.Objects;

public class WorkoutSet extends Workout {
	private static final long serialVersionUID = 1L;

	private int reps;
	private int sets;
	private int weight;
	private int calories;
	private String exerciseID;

	public WorkoutSet() {
	}

	public WorkoutSet(String category, String name, int reps, int sets, int weight, int calories, String exerciseID) {
		super(category, name);
		this.reps = reps;
		this.sets = sets;
		this.weight = weight;
		this.calories = calories;
		this.exerciseID = exerciseID;
	}

	public WorkoutSet(String id, String category, String name, int reps, int sets, int weight, int calories,
			String exerciseID) {
		super(id, category, name);
		this.reps = reps;
		this.sets = sets;
		this.weight = weight;
		this.calories = calories;
		this.exerciseID = exerciseID;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getExerciseID() {
		return exerciseID;
	}

	public void setExerciseID(String exerciseID) {
		this.exerciseID = exerciseID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(calories, exerciseID, reps, sets, weight);
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
		WorkoutSet other = (WorkoutSet) obj;
		return calories == other.calories && Objects.equals(exerciseID, other.exerciseID) && reps == other.reps
				&& sets == other.sets && weight == other.weight;
	}

}
