package com.innovoak.apps.activequest.model.food;

import java.sql.JDBCType;
import java.time.LocalDate;
import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;
import com.innovoak.util.webhelpers.data.annotations.Table;

// model class for food serving
@Table(name = "food_serving")
public class FoodServing extends Model {
	private static final long serialVersionUID = 1L;
	// fields
	private float servingSize;
	private float number;
	private String meal;
	private LocalDate date;
	private String foodID;
	private String userID;
	private boolean favourite;

	// for serialization
	public FoodServing() {
	}

	public FoodServing(float servingSize, float number, String meal, LocalDate date, String foodID, String userID,
			boolean favourite) {
		super();
		this.servingSize = servingSize;
		this.number = number;
		this.meal = meal;
		this.date = date;
		this.foodID = foodID;
		this.userID = userID;
		this.favourite = favourite;
	}

	public FoodServing(String id, float servingSize, float number, String meal, LocalDate date, String foodID,
			String userID, boolean favourite) {
		super(id);
		this.servingSize = servingSize;
		this.number = number;
		this.meal = meal;
		this.date = date;
		this.foodID = foodID;
		this.userID = userID;
		this.favourite = favourite;
	}

	@Column(columnName = "serving_size", type = JDBCType.FLOAT)
	public float getServingSize() {
		return servingSize;
	}

	public void setServingSize(float servingSize) {
		this.servingSize = servingSize;
	}

	@Column(columnName = "number", type = JDBCType.FLOAT)
	public float getNumber() {
		return number;
	}

	public void setNumber(float number) {
		this.number = number;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	@Column(columnName = "date", type = JDBCType.DATE)
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Column(columnName = "food_id")
	public String getFoodID() {
		return foodID;
	}

	public void setFoodID(String foodID) {
		this.foodID = foodID;
	}

	@Column(columnName = "user_id")
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public boolean isFavourite() {
		return favourite;
	}

	public void setFavourite(boolean favourite) {
		this.favourite = favourite;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(date, favourite, foodID, meal, number, servingSize, userID);
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
		FoodServing other = (FoodServing) obj;
		return Objects.equals(date, other.date) && favourite == other.favourite && Objects.equals(foodID, other.foodID)
				&& Objects.equals(meal, other.meal)
				&& Float.floatToIntBits(number) == Float.floatToIntBits(other.number)
				&& Float.floatToIntBits(servingSize) == Float.floatToIntBits(other.servingSize)
				&& Objects.equals(userID, other.userID);
	}

}