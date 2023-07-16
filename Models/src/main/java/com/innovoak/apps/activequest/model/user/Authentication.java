package com.innovoak.apps.activequest.model.user;

import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;

// Authentication class
public class Authentication extends Model {
	private static final long serialVersionUID = 1L;
	// Fields
	private String authenticationType;
	private String token;

	// Constructors
	public Authentication() {
		super();
	}

	public Authentication(String authenticationType, String token) {
		super();
		this.authenticationType = authenticationType;
		this.token = token;
	}

	public Authentication(String id, String authenticationType, String token) {
		super(id);
		this.authenticationType = authenticationType;
		this.token = token;
	}

	// Getters and Setters
	public String getAuthenticationType() {
		return authenticationType;
	}

	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	// Utility method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(authenticationType, token);
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
		Authentication other = (Authentication) obj;
		return Objects.equals(authenticationType, other.authenticationType) && Objects.equals(token, other.token);
	}

}