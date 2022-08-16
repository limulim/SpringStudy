package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {

	@RequestMapping("/person/{personName}")
	public String getPerson(@PathVariable String personName, Model model) {
		model.addAttribute("personInfo", personName);
		return("person/personInfo");
	}
}
