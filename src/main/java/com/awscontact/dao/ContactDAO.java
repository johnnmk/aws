package com.awscontact.dao;

import com.awscontact.model.Contact;

public interface ContactDAO {

	public long createUser(Contact contact);

	public Contact updateUser(Contact contact);
}
