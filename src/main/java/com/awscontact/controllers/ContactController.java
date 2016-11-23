package com.awscontact.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.awscontact.controllers.services.ContactService;
import com.awscontact.model.Contact;


@Controller
public class ContactController {

	@Autowired
	private ContactService userService;

	private static Logger LOGGER = Logger.getLogger(ContactController.class);

	@RequestMapping("/readcontact")
	public String readApplicationForm(@ModelAttribute("contact") Contact contact, ModelMap map, HttpServletRequest request) {

		LOGGER.info("Entered UserController::readApplicationForm");
		return "applicationForm";
	}

	@RequestMapping("/createcontact")
	public String createApplicationForm(ModelMap map, @ModelAttribute("contact") Contact contact, HttpServletRequest request) {

		
		LOGGER.info("Saving the Contact. Data : "+contact);
        if(contact.getId() == 0){ // if contact id is 0 then creating the contact other updating the contact
        	userService.createUser(contact);
        } else {
        	userService.updateUser(contact);
        }
		return "applicationFormData";
	}

}
