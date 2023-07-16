package com.innovoak.apps.activequest.model.misc;

import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;

public class GroupChatMember extends Model {
	private static final long serialVersionUID = 1L;

	private String userID;
	private String groupChatID;

	public GroupChatMember() {
	}

	public GroupChatMember(String userID, String groupChatID) {
		super();
		this.userID = userID;
		this.groupChatID = groupChatID;
	}

	public GroupChatMember(String id, String userID, String groupChatID) {
		super(id);
		this.userID = userID;
		this.groupChatID = groupChatID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getGroupChatID() {
		return groupChatID;
	}

	public void setGroupChatID(String groupChatID) {
		this.groupChatID = groupChatID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(groupChatID, userID);
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
		GroupChatMember other = (GroupChatMember) obj;
		return Objects.equals(groupChatID, other.groupChatID) && Objects.equals(userID, other.userID);
	}

}
