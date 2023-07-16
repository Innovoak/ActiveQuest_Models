package com.innovoak.apps.activequest.model.avatar;

import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;

public class Avatar extends Model {
	private static final long serialVersionUID = 1L;

	private String avatarTopId;
	private String avatarBottomId;
	private String avatarFaceId;

	public Avatar() {
		super();
	}

	public Avatar(String avatarTopId, String avatarBottomId, String avatarFaceId) {
		super();
		this.avatarTopId = avatarTopId;
		this.avatarBottomId = avatarBottomId;
		this.avatarFaceId = avatarFaceId;
	}

	public Avatar(String id, String avatarTopId, String avatarBottomId, String avatarFaceId) {
		super(id);
		this.avatarTopId = avatarTopId;
		this.avatarBottomId = avatarBottomId;
		this.avatarFaceId = avatarFaceId;
	}

	@Column(columnName = "avatar_top_id")
	public String getAvatarTopId() {
		return avatarTopId;
	}

	public void setAvatarTopId(String avatarTopId) {
		this.avatarTopId = avatarTopId;
	}

	@Column(columnName = "avatar_bottom_id")
	public String getAvatarBottomId() {
		return avatarBottomId;
	}

	public void setAvatarBottomId(String avatarBottomId) {
		this.avatarBottomId = avatarBottomId;
	}

	@Column(columnName = "avatar_face_id")
	public String getAvatarFaceId() {
		return avatarFaceId;
	}

	public void setAvatarFaceId(String avatarFaceId) {
		this.avatarFaceId = avatarFaceId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(avatarBottomId, avatarFaceId, avatarTopId);
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
		Avatar other = (Avatar) obj;
		return Objects.equals(avatarBottomId, other.avatarBottomId) && Objects.equals(avatarFaceId, other.avatarFaceId)
				&& Objects.equals(avatarTopId, other.avatarTopId);
	}

}
