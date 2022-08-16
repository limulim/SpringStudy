package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableEx {
	
	@RequestMapping("/page/{var}")
	public String page(@PathVariable String var) {
		String viewName = "";
		if(var.equals("one")) {
			viewName = "page1";
		}else if(var.equals("two")) {
			viewName = "page2";
		}
	return viewName;
	}
	
}
