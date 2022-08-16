package com.spring.ModelAttr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/form")
	public String userForm() {
		return "user/userForm";
	}

	@RequestMapping("/userInfo")
	public String userInfo(@ModelAttribute("userInfo") UserInformation userInformation) {
		
		return "user/userInfo";
	}
	}
	
