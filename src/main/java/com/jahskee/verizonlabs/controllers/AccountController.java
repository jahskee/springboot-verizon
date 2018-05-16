package com.jahskee.verizonlabs.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AccountController {

	@GetMapping("/account/page1")
    public String acountPage1(Model model) {
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String username = StringUtils.capitalize(auth.getName()); //get logged in username
	      model.addAttribute("username",username);
        return "/account/page1";
    }
	
}