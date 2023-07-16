package com.innovoak.apps.activequest.model.misc;

import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;

// Message Model
public class Message extends Model {
	private static final long serialVersionUID = 1L;

	// Fields
	private String content;
	private String groupChatID;
	private String senderID;

	// Constructors
	public Message() {
	}

	public Message(String content, String groupChatID, String senderID) {
		this.content = content;
		this.groupChatID = groupChatID;
		this.senderID = senderID;
	}

	public Message(String id, String content, String groupChatID, String senderID) {
		super(id);
		this.content = content;
		this.groupChatID = groupChatID;
		this.senderID = senderID;
	}

	// Getters and Setters
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(columnName = "groupchat_id")
	public String getGroupChatID() {
		return groupChatID;
	}

	public void setGroupChatID(String groupChatID) {
		this.groupChatID = groupChatID;
	}

	@Column(columnName = "user_id")
	public String getSenderID() {
		return senderID;
	}

	public void setSenderID(String senderID) {
		this.senderID = senderID;
	}

	// Utility Methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(content, groupChatID, senderID);
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
		Message other = (Message) obj;
		return Objects.equals(content, other.content) && Objects.equals(groupChatID, other.groupChatID)
				&& Objects.equals(senderID, other.senderID);
	}

}
