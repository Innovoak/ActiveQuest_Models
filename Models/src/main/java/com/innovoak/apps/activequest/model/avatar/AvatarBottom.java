package com.innovoak.apps.activequest.model.avatar;

import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;

public class AvatarBottom extends Model {

	private static final long serialVersionUID = 1L;

	private String pantsImage;
	private String shoesImage;

	public AvatarBottom() {
	}

	public AvatarBottom(String pantsImage, String shoesImage) {
		super();
		this.pantsImage = pantsImage;
		this.shoesImage = shoesImage;
	}

	public AvatarBottom(String id, String pantsImage, String shoesImage) {
		super(id);
		this.pantsImage = pantsImage;
		this.shoesImage = shoesImage;
	}

	public String getPantsImage() {
		return pantsImage;
	}

	public void setPantsImage(String pantsImage) {
		this.pantsImage = pantsImage;
	}

	public String getShoesImage() {
		return shoesImage;
	}

	public void setShoesImage(String shoesImage) {
		this.shoesImage = shoesImage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(pantsImage, shoesImage);
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
		AvatarBottom other = (AvatarBottom) obj;
		return Objects.equals(pantsImage, other.pantsImage) && Objects.equals(shoesImage, other.shoesImage);
	}

}
