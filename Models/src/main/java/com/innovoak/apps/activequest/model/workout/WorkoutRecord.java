package com.innovoak.apps.activequest.model.workout;

import java.sql.JDBCType;
import java.time.DayOfWeek;

import com.innovoak.util.webhelpers.data.annotations.Column;
import com.innovoak.util.webhelpers.data.annotations.Table;

@Table(name = "workout_records")
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

	@Column(columnName = "day_of_week")
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Column(columnName = "set_id")
	public String getSetID() {
		return setID;
	}

	public void setSetID(String setID) {
		this.setID = setID;
	}

	@Column(columnName = "routine_id")
	public String getRoutineID() {
		return routineID;
	}

	public void setRoutineID(String routineID) {
		this.routineID = routineID;
	}

	@Column(columnName = "user_id")
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Column(columnName = "num_of_completions", type = JDBCType.INTEGER)
	public int getNumberOfCompletion() {
		return numberOfCompletion;
	}

	public void setNumberOfCompletion(int numberOfCompletion) {
		this.numberOfCompletion = numberOfCompletion;
	}

}
