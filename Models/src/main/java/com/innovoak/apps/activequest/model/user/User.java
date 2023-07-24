package com.innovoak.apps.activequest.model.user;

import java.sql.JDBCType;
import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;
import com.innovoak.util.webhelpers.data.annotations.Table;

// User class
@Table(name = "users")
public class User extends Model {
	private static final long serialVersionUID = 1L;

	// Fields
	private String email;
	private String phone;
	private String authID;
	private String profileID;
	private String statsID;

	public User() {
	}

	public User(String email, String phone, String authID, String profileID, String statsID) {
		super();
		this.email = email;
		this.phone = phone;
		this.authID = authID;
		this.profileID = profileID;
		this.statsID = statsID;
	}

	public User(String id, String email, String phone, String authID, String profileID, String statsID) {
		super(id);
		this.email = email;
		this.phone = phone;
		this.authID = authID;
		this.profileID = profileID;
		this.statsID = statsID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(columnName = "auth_id")
	public String getAuthID() {
		return authID;
	}

	public void setAuthID(String authID) {
		this.authID = authID;
	}

	@Column(columnName = "profile_id")
	public String getProfileID() {
		return profileID;
	}

	public void setProfileID(String profileID) {
		this.profileID = profileID;
	}

	@Column(columnName = "stats_id")
	public String getStatsID() {
		return statsID;
	}

	public void setStatsID(String statsID) {
		this.statsID = statsID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(authID, email, phone, profileID, statsID);
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
		User other = (User) obj;
		return Objects.equals(authID, other.authID) && Objects.equals(email, other.email)
				&& Objects.equals(phone, other.phone) && Objects.equals(profileID, other.profileID)
				&& Objects.equals(statsID, other.statsID);
	}

}