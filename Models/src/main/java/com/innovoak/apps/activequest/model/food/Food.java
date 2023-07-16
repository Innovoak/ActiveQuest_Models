package com.innovoak.apps.activequest.model.food;

import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;

// model for food
public class Food extends Model {
	private static final long serialVersionUID = 1L;
	// fields
	private String name;
	private String foodStatsID;

	// for serialization
	public Food() {
	}

	// constructor
	public Food(String name, String foodStatsID) {
		super();
		this.name = name;
		this.foodStatsID = foodStatsID;
	}

	public Food(String id, String name, String foodStatsID) {
		super(id);
		this.name = name;
		this.foodStatsID = foodStatsID;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(columnName = "foodstats_id")
	public String getFoodStatsID() {
		return foodStatsID;
	}

	public void setFoodStatsID(String foodStatsID) {
		this.foodStatsID = foodStatsID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(foodStatsID, name);
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
		Food other = (Food) obj;
		return Objects.equals(foodStatsID, other.foodStatsID) && Objects.equals(name, other.name);
	}

}
