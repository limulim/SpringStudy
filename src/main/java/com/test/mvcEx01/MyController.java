package com.test.mvcEx01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/memberInput")
	public String memberInput() {
		return "memberRegister";

	}

	@RequestMapping("/post/memberInfo")
	public String memInfo(Model model) {
		model.addAttribute("name", "김말똥");
		return "post/memInfo";
	}

	@RequestMapping("/ut")
	public String ut() {
		return "bye";
	}

	@RequestMapping("/model/ex")
	public String testModel(Model model) {
		model.addAttribute("address", "서울시 강남구");
		return "/model/modelDemo";
	}
	@RequestMapping("/modelAndView/mv")
	public ModelAndView modelAndVeiw() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("email","aaa@naver.com");
		mv.setViewName("/modelAndView/modelView");
		return mv;
		}
	}
	

