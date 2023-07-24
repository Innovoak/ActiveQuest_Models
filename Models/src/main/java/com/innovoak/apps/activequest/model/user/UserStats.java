package com.innovoak.apps.activequest.model.user;

import java.sql.JDBCType;
import java.time.Instant;
import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;
import com.innovoak.util.webhelpers.data.annotations.Table;

@Table(name = "user_stats")
public class UserStats extends Model {
	private static final long serialVersionUID = 1L;
	private int trophies;
	private int height;
	private int weight;
	private Instant creationTime;

	public UserStats() {
	}

	public UserStats(int trophies, int height, int weight, Instant creationTime) {
		super();
		this.trophies = trophies;
		this.height = height;
		this.weight = weight;
		this.creationTime = creationTime;
	}

	public UserStats(String id, int trophies, int height, int weight, Instant creationTime) {
		super(id);
		this.trophies = trophies;
		this.height = height;
		this.weight = weight;
		this.creationTime = creationTime;
	}

	public int getTrophies() {
		return trophies;
	}

	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Column(columnName = "creation_time", type = JDBCType.TIMESTAMP)
	public Instant getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Instant creationTime) {
		this.creationTime = creationTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(creationTime, height, trophies, weight);
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
		UserStats other = (UserStats) obj;
		return Objects.equals(creationTime, other.creationTime) && height == other.height && trophies == other.trophies
				&& weight == other.weight;
	}

}
