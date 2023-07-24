package com.innovoak.apps.activequest.model.user;

import java.sql.JDBCType;
import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;
import com.innovoak.util.webhelpers.data.annotations.Table;

// Friend Model
@Table(name = "friends")
public class Friend extends Model {
	private static final long serialVersionUID = 1L;

	// Fields
	private String currentUserID;
	private String friendUserID;

	// Constructors
	public Friend() {
		super();
	}

	public Friend(String currentUserID, String friendUserID) {
		super();
		this.currentUserID = currentUserID;
		this.friendUserID = friendUserID;
	}

	public Friend(String id, String currentUserID, String friendUserID) {
		super(id);
		this.currentUserID = currentUserID;
		this.friendUserID = friendUserID;
	}

	// Getters and Setters
	@Column(columnName = "current_user_id")
	public String getCurrentUserID() {
		return currentUserID;
	}

	public void setCurrentUserID(String currentUserID) {
		this.currentUserID = currentUserID;
	}

	@Column(columnName = "friend_user_id")
	public String getFriendUserID() {
		return friendUserID;
	}

	public void setFriendUserID(String friendUserID) {
		this.friendUserID = friendUserID;
	}

	// Utility methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(currentUserID, friendUserID);
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
		Friend other = (Friend) obj;
		return Objects.equals(currentUserID, other.currentUserID) && Objects.equals(friendUserID, other.friendUserID);
	}

}
