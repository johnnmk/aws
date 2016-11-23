package com.awscontact.controllers.services;

import com.awscontact.model.Contact;

public interface ContactService {

	public long createUser(Contact contact);

	public Contact updateUser(Contact contact);

}
