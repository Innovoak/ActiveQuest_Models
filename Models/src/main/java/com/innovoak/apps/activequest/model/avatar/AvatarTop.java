package com.innovoak.apps.activequest.model.avatar;

import java.sql.JDBCType;
import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;
import com.innovoak.util.webhelpers.data.annotations.Column;
import com.innovoak.util.webhelpers.data.annotations.Table;

@Table(name = "avatar_top")
public class AvatarTop extends Model {

	private static final long serialVersionUID = 1L;

	private String accessoriesFace;
	private String accessoriesEar;
	private String accessoriesNeck;
	private String accessoriesHead;
	private String accessoriesEyes;
	private String shirtImage;

	public AvatarTop() {
	}

	public AvatarTop(String accessoriesFace, String accessoriesEar, String accessoriesNeck, String accessoriesHead,
			String accessoriesEyes, String shirtImage) {
		this.accessoriesFace = accessoriesFace;
		this.accessoriesEar = accessoriesEar;
		this.accessoriesNeck = accessoriesNeck;
		this.accessoriesHead = accessoriesHead;
		this.accessoriesEyes = accessoriesEyes;
		this.shirtImage = shirtImage;
	}

	public AvatarTop(String id, String accessoriesFace, String accessoriesEar, String accessoriesNeck,
			String accessoriesHead, String accessoriesEyes, String shirtImage) {
		super(id);
		this.accessoriesFace = accessoriesFace;
		this.accessoriesEar = accessoriesEar;
		this.accessoriesNeck = accessoriesNeck;
		this.accessoriesHead = accessoriesHead;
		this.accessoriesEyes = accessoriesEyes;
		this.shirtImage = shirtImage;
	}


	@Column(columnName = "accessories_face")
	public String getAccessoriesFace() {
		return accessoriesFace;
	}

	@Column(columnName = "accessories_ear")
	public String getAccessoriesEar() {
		return accessoriesEar;
	}

	@Column(columnName = "accessories_neck")
	public String getAccessoriesNeck() {
		return accessoriesNeck;
	}

	@Column(columnName = "accessories_head")
	public String getAccessoriesHead() {
		return accessoriesHead;
	}

	@Column(columnName = "accessories_eyes")
	public String getAccessoriesEyes() {
		return accessoriesEyes;
	}

	@Column(columnName = "shirt_image")
	public String getShirtImage() {
		return shirtImage;
	}

	public void setAccessoriesFace(String accessoriesFace) {
		this.accessoriesFace = accessoriesFace;
	}

	public void setAccessoriesEar(String accessoriesEar) {
		this.accessoriesEar = accessoriesEar;
	}

	public void setAccessoriesNeck(String accessoriesNeck) {
		this.accessoriesNeck = accessoriesNeck;
	}

	public void setAccessoriesHead(String accessoriesHead) {
		this.accessoriesHead = accessoriesHead;
	}

	public void setAccessoriesEyes(String accessoriesEyes) {
		this.accessoriesEyes = accessoriesEyes;
	}

	public void setShirtImage(String shirtImage) {
		this.shirtImage = shirtImage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(accessoriesEar, accessoriesEyes, accessoriesFace, accessoriesHead,
				accessoriesNeck, shirtImage);
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
		AvatarTop other = (AvatarTop) obj;
		return Objects.equals(accessoriesEar, other.accessoriesEar)
				&& Objects.equals(accessoriesEyes, other.accessoriesEyes)
				&& Objects.equals(accessoriesFace, other.accessoriesFace)
				&& Objects.equals(accessoriesHead, other.accessoriesHead)
				&& Objects.equals(accessoriesNeck, other.accessoriesNeck)
				&& Objects.equals(shirtImage, other.shirtImage);
	}

}
