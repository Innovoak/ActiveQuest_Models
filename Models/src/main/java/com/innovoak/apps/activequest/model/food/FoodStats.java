package com.innovoak.apps.activequest.model.food;

import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;

// model for food stats
public class FoodStats extends Model {
	private static final long serialVersionUID = 1L;
	// fields
	private double calsPerUnit;
	private double carbsPerUnit;
	private double proteinPerUnit;
	private double fatPerUnit;

	// for serialization
	public FoodStats() {
	}

	public FoodStats(double calsPerUnit, double carbsPerUnit, double proteinPerUnit, double fatPerUnit) {
		super();
		this.calsPerUnit = calsPerUnit;
		this.carbsPerUnit = carbsPerUnit;
		this.proteinPerUnit = proteinPerUnit;
		this.fatPerUnit = fatPerUnit;
	}

	// arg constructor
	public FoodStats(String id, double calsPerUnit, double carbsPerUnit, double proteinPerUnit, double fatPerUnit) {
		super(id);
		this.calsPerUnit = calsPerUnit;
		this.carbsPerUnit = carbsPerUnit;
		this.proteinPerUnit = proteinPerUnit;
		this.fatPerUnit = fatPerUnit;
	}

	// getters and setters
	public double getCalsPerUnit() {
		return calsPerUnit;
	}

	public void setCalsPerUnit(double calsPerUnit) {
		this.calsPerUnit = calsPerUnit;
	}

	public double getCarbsPerUnit() {
		return carbsPerUnit;
	}

	public void setCarbsPerUnit(double carbsPerUnit) {
		this.carbsPerUnit = carbsPerUnit;
	}

	public double getProteinPerUnit() {
		return proteinPerUnit;
	}

	public void setProteinPerUnit(double proteinPerUnit) {
		this.proteinPerUnit = proteinPerUnit;
	}

	public double getFatPerUnit() {
		return fatPerUnit;
	}

	public void setFatPerUnit(double fatPerUnit) {
		this.fatPerUnit = fatPerUnit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(calsPerUnit, carbsPerUnit, fatPerUnit, proteinPerUnit);
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
		FoodStats other = (FoodStats) obj;
		return Double.doubleToLongBits(calsPerUnit) == Double.doubleToLongBits(other.calsPerUnit)
				&& Double.doubleToLongBits(carbsPerUnit) == Double.doubleToLongBits(other.carbsPerUnit)
				&& Double.doubleToLongBits(fatPerUnit) == Double.doubleToLongBits(other.fatPerUnit)
				&& Double.doubleToLongBits(proteinPerUnit) == Double.doubleToLongBits(other.proteinPerUnit);
	}

}
