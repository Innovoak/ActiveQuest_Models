package com.innovoak.apps.activequest.model.avatar;

import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;

public class AvatarFace extends Model {
	private static final long serialVersionUID = 1L;
	private String faceColor;
	private String faceShape;
	private String eyeColor;
	private String eyeShape;
	private String noseShape;
	private String facialHairColor;
	private String facialHairShape;
	private String hairColor;
	private String hairShape;
	private String lipColor;
	private String lipShape;
	private String earShape;

	public AvatarFace() {
		super();

	}

	public AvatarFace(String faceColor, String faceShape, String eyeColor, String eyeShape, String noseShape,
			String facialHairColor, String facialHairShape, String hairColor, String hairShape, String lipColor,
			String lipShape, String earShape) {
		super();
		this.faceColor = faceColor;
		this.faceShape = faceShape;
		this.eyeColor = eyeColor;
		this.eyeShape = eyeShape;
		this.noseShape = noseShape;
		this.facialHairColor = facialHairColor;
		this.facialHairShape = facialHairShape;
		this.hairColor = hairColor;
		this.hairShape = hairShape;
		this.lipColor = lipColor;
		this.lipShape = lipShape;
		this.earShape = earShape;
	}

	public AvatarFace(String id, String faceColor, String faceShape, String eyeColor, String eyeShape, String noseShape,
			String facialHairColor, String facialHairShape, String hairColor, String hairShape, String lipColor,
			String lipShape, String earShape) {
		super(id);
		this.faceColor = faceColor;
		this.faceShape = faceShape;
		this.eyeColor = eyeColor;
		this.eyeShape = eyeShape;
		this.noseShape = noseShape;
		this.facialHairColor = facialHairColor;
		this.facialHairShape = facialHairShape;
		this.hairColor = hairColor;
		this.hairShape = hairShape;
		this.lipColor = lipColor;
		this.lipShape = lipShape;
		this.earShape = earShape;
	}

	public String getFaceColor() {
		return faceColor;
	}

	public String getFaceShape() {
		return faceShape;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public String getEyeShape() {
		return eyeShape;
	}

	public String getNoseShape() {
		return noseShape;
	}

	public String getFacialHairColor() {
		return facialHairColor;
	}

	public String getFacialHairShape() {
		return facialHairShape;
	}

	public String getHairColor() {
		return hairColor;
	}

	public String getHairShape() {
		return hairShape;
	}

	public String getLipColor() {
		return lipColor;
	}

	public String getLipShape() {
		return lipShape;
	}

	public String getEarShape() {
		return earShape;
	}

	public void setFaceColor(String faceColor) {
		this.faceColor = faceColor;
	}

	public void setFaceShape(String faceShape) {
		this.faceShape = faceShape;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public void setEyeShape(String eyeShape) {
		this.eyeShape = eyeShape;
	}

	public void setNoseShape(String noseShape) {
		this.noseShape = noseShape;
	}

	public void setFacialHairColour(String facialHairColor) {
		this.facialHairColor = facialHairColor;
	}

	public void setFacialHairShape(String facialHairShape) {
		this.facialHairShape = facialHairShape;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public void setHairShape(String hairShape) {
		this.hairShape = hairShape;
	}

	public void setLipColor(String lipColor) {
		this.lipColor = lipColor;
	}

	public void setLipShape(String lipShape) {
		this.lipShape = lipShape;
	}

	public void setEarShape(String earShape) {
		this.earShape = earShape;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(earShape, eyeColor, eyeShape, faceColor, faceShape, facialHairColor,
				facialHairShape, hairColor, hairShape, lipColor, lipShape, noseShape);
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
		AvatarFace other = (AvatarFace) obj;
		return Objects.equals(earShape, other.earShape) && Objects.equals(eyeColor, other.eyeColor)
				&& Objects.equals(eyeShape, other.eyeShape) && Objects.equals(faceColor, other.faceColor)
				&& Objects.equals(faceShape, other.faceShape) && Objects.equals(facialHairColor, other.facialHairColor)
				&& Objects.equals(facialHairShape, other.facialHairShape) && Objects.equals(hairColor, other.hairColor)
				&& Objects.equals(hairShape, other.hairShape) && Objects.equals(lipColor, other.lipColor)
				&& Objects.equals(lipShape, other.lipShape) && Objects.equals(noseShape, other.noseShape);
	}

}
