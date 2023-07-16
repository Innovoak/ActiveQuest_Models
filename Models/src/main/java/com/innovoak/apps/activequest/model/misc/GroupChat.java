package com.innovoak.apps.activequest.model.misc;

import java.util.Objects;

import com.innovoak.util.webhelpers.data.Model;

// Group Chat class
public class GroupChat extends Model {
	private static final long serialVersionUID = 1L;

	// Fields
	private String name;

	// Constructors
	public GroupChat() {
		super();
	}

	public GroupChat(String name) {
		super();
		this.name = name;
	}

	public GroupChat(String id, String name) {
		super(id);
		this.name = name;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Utility methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(name);
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
		GroupChat other = (GroupChat) obj;
		return Objects.equals(name, other.name);
	}

}
