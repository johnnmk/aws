package com.awscontact.model;

public class User {

	private int contactId;
	private String name;
	private String email;
	private String profession;

	public User() {

	}

	public User(int contactId, String name, String email, String profession) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.email = email;
		this.profession = profession;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
