package com.awscontact.controllers.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.awscontact.controllers.services.ContactService;
import com.awscontact.dao.ContactDAO;
import com.awscontact.model.Contact;


@Service
@Transactional
public class ContactServiceImpl implements ContactService{

	@Autowired
    private ContactDAO contactDAO;
	
	@Override
	public long createUser(Contact user) {
		
		return contactDAO.createUser(user);
	}

	@Override
	public Contact updateUser(Contact user) {
		
		return contactDAO.updateUser(user);
	}

}
