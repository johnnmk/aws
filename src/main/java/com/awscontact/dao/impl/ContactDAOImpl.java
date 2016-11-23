package com.awscontact.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.awscontact.dao.ContactDAO;
import com.awscontact.model.Contact;
import com.awscontact.util.HibernateUtil;

@Repository
public class ContactDAOImpl implements ContactDAO {

	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public long createUser(Contact contact) {

		return (Long) hibernateUtil.create(contact);
	}

	@Override
	public Contact updateUser(Contact contact) {
		return hibernateUtil.update(contact);

	}

}
