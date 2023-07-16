package com.innovoak.apps.activequest.model.user;

import com.innovoak.util.webhelpers.data.Model;

// User class
public class User extends Model {
	private static final long serialVersionUID = 1L;

	// Fields
	private String email;
	private String phone;
	private String password;
	private String authID;
	private String profileID;
	private String statsID;
//	private List<FoodServing> servings;
//	keep user_id in FoodServing class
}