package com.awscontact.controllers;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.awscontact.model.User;


@Controller
public class UserController {

    @RequestMapping("/readcontact")
    public String readApplicationForm(@ModelAttribute("user") User user, ModelMap map, HttpServletRequest request) {

        return "applicationForm";
    }

    @RequestMapping("/createcontact")
    public String createApplicationForm(ModelMap map, @ModelAttribute("user") User user, HttpServletRequest request) {

        //Using request.getParameter()
        System.out.println("User Name :: " + user.getEmail());
     

        return "applicationFormData";
    }

}
