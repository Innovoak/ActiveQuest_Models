package com.innovoak.apps.activequest.model.user;

import java.sql.JDBCType;
import java.time.LocalDate;
import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;
import com.innovoak.util.webhelpers.data.annotations.Table;

@Table(name = "user_profiles")
public class UserProfile extends Model {
	private static final long serialVersionUID = 1L;
	private String name;
	private String gender;
	private String language;
	private LocalDate dob;
	private String unitsofMeasure;
	private String bio;
	private String avatarID;

	public UserProfile() {
	}

	public UserProfile(String name, String gender, String language, LocalDate dob, String unitsofMeasure, String bio,
			String avatarID) {
		super();
		this.name = name;
		this.gender = gender;
		this.language = language;
		this.dob = dob;
		this.unitsofMeasure = unitsofMeasure;
		this.bio = bio;
		this.avatarID = avatarID;
	}

	public UserProfile(String id, String name, String gender, String language, LocalDate dob, String unitsofMeasure,
			String bio, String avatarID) {
		super(id);
		this.name = name;
		this.gender = gender;
		this.language = language;
		this.dob = dob;
		this.unitsofMeasure = unitsofMeasure;
		this.bio = bio;
		this.avatarID = avatarID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(columnName = "dob", type = JDBCType.DATE)
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Column(columnName = "units_of_measure")
	public String getUnitsofMeasure() {
		return unitsofMeasure;
	}

	public void setUnitsofMeasure(String unitsofMeasure) {
		this.unitsofMeasure = unitsofMeasure;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	@Column(columnName = "avatar_id")
	public String getAvatarID() {
		return avatarID;
	}

	public void setAvatarID(String avatarID) {
		this.avatarID = avatarID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(avatarID, bio, dob, gender, language, name, unitsofMeasure);
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
		UserProfile other = (UserProfile) obj;
		return Objects.equals(avatarID, other.avatarID) && Objects.equals(bio, other.bio)
				&& Objects.equals(dob, other.dob) && Objects.equals(gender, other.gender)
				&& Objects.equals(language, other.language) && Objects.equals(name, other.name)
				&& Objects.equals(unitsofMeasure, other.unitsofMeasure);
	}

}
