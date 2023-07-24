package com.innovoak.apps.activequest.model.goals;

import java.sql.JDBCType;
import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;
import com.innovoak.util.webhelpers.data.annotations.Table;

@Table(name = "completed_quests")
public class CompletedQuest extends Model {
	private static final long serialVersionUID = 1L;

	private String userID;
	private String questID;

	public CompletedQuest() {
		super();
	}

	public CompletedQuest(String userID, String questID) {
		super();
		this.userID = userID;
		this.questID = questID;
	}

	public CompletedQuest(String id, String userID, String questID) {
		super(id);
		this.userID = userID;
		this.questID = questID;
	}

	@Column(columnName = "user_id")
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Column(columnName = "quest_id")
	public String getQuestID() {
		return questID;
	}

	public void setQuestID(String questID) {
		this.questID = questID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(questID, userID);
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
		CompletedQuest other = (CompletedQuest) obj;
		return Objects.equals(questID, other.questID) && Objects.equals(userID, other.userID);
	}

}
