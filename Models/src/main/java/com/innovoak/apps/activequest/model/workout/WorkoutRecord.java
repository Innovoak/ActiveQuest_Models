package com.innovoak.apps.activequest.model.workout;

import java.time.DayOfWeek;
import java.util.Objects;

public class WorkoutRecord extends Workout {
	private static final long serialVersionUID = 1L;
	private DayOfWeek dayOfWeek;
	private String setID;
	private String routineID;
	private String userID;
	private int numberOfCompletion;

	public WorkoutRecord() {
		super();
	}

	public WorkoutRecord(String category, String name, DayOfWeek dayOfWeek, String setID, String routineID,
			String userID, int numberOfCompletion) {
		super(category, name);
		this.dayOfWeek = dayOfWeek;
		this.setID = setID;
		this.routineID = routineID;
		this.userID = userID;
		this.numberOfCompletion = numberOfCompletion;
	}

	public WorkoutRecord(String id, String category, String name, DayOfWeek dayOfWeek, String setID, String routineID,
			String userID, int numberOfCompletion) {
		super(id, category, name);
		this.dayOfWeek = dayOfWeek;
		this.setID = setID;
		this.routineID = routineID;
		this.userID = userID;
		this.numberOfCompletion = numberOfCompletion;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getSetID() {
		return setID;
	}

	public void setSetID(String setID) {
		this.setID = setID;
	}

	public String getRoutineID() {
		return routineID;
	}

	public void setRoutineID(String routineID) {
		this.routineID = routineID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public int getNumberOfCompletion() {
		return numberOfCompletion;
	}

	public void setNumberOfCompletion(int numberOfCompletion) {
		this.numberOfCompletion = numberOfCompletion;
	}

}
