package com.innovoak.apps.activequest.model.workout;

import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;

public abstract class Workout extends Model {
	private static final long serialVersionUID = 1L;

	private String category;
	private String name;

	public Workout() {
	}

	public Workout(String category, String name) {
		super();
		this.category = category;
		this.name = name;
	}

	public Workout(String id, String category, String name) {
		super(id);
		this.category = category;
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(category, name);
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
		Workout other = (Workout) obj;
		return Objects.equals(category, other.category) && Objects.equals(name, other.name);
	}

}
